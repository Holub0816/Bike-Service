USE [SerwisRowerowyAplikacja]
GO

/****** Object:  Table [dbo].[Usluga_do_realizacji]    Script Date: 09.02.2019 14:23:47 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Usluga_do_realizacji](
	[usluga_id] [int] NOT NULL,
	[pracownik_id] [int] NULL,
	[klient_id] [int] NOT NULL,
	[rower_id] [int] NULL,
	[produkt_id] [int] NULL,
	[data_przyjêcia_zlecenia] [date] NOT NULL,
	[data_rozpoczêcia_zlecenia] [date] NULL,
	[data_zakoñczenia_zlecenia] [date] NULL,
	[cena] [float] NULL,
	[stan_realizacji] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Usluga_do_realizacji] PRIMARY KEY CLUSTERED 
(
	[usluga_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[Usluga_do_realizacji]  WITH CHECK ADD  CONSTRAINT [FK_Usluga_do_realizacji_Klient] FOREIGN KEY([klient_id])
REFERENCES [dbo].[Klient] ([klient_id])
GO

ALTER TABLE [dbo].[Usluga_do_realizacji] CHECK CONSTRAINT [FK_Usluga_do_realizacji_Klient]
GO

ALTER TABLE [dbo].[Usluga_do_realizacji]  WITH CHECK ADD  CONSTRAINT [FK_Usluga_do_realizacji_Pracownik] FOREIGN KEY([pracownik_id])
REFERENCES [dbo].[Pracownik] ([pracownik_id])
GO

ALTER TABLE [dbo].[Usluga_do_realizacji] CHECK CONSTRAINT [FK_Usluga_do_realizacji_Pracownik]
GO

ALTER TABLE [dbo].[Usluga_do_realizacji]  WITH CHECK ADD  CONSTRAINT [FK_Usluga_do_realizacji_Produkt] FOREIGN KEY([produkt_id])
REFERENCES [dbo].[Produkt] ([produkt_id])
GO

ALTER TABLE [dbo].[Usluga_do_realizacji] CHECK CONSTRAINT [FK_Usluga_do_realizacji_Produkt]
GO


