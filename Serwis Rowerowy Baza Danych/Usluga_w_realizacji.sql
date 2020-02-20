USE [SerwisRowerowyAplikacja]
GO

/****** Object:  Table [dbo].[Usluga_w_realizacji]    Script Date: 09.02.2019 14:24:09 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Usluga_w_realizacji](
	[usluga_id] [int] NOT NULL,
	[pracownik_id] [int] NOT NULL,
	[klient_id] [int] NOT NULL,
	[rower_id] [int] NULL,
	[produkt_id] [int] NULL,
	[data_przyjêcia_zlecenia] [date] NOT NULL,
	[data_rozpoczêcia_zlecenia] [date] NOT NULL,
	[data_zakoñczenia_zlecenia] [date] NULL,
	[cena] [float] NULL,
	[stan_realizacji] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Usluga_w_realizacji] PRIMARY KEY CLUSTERED 
(
	[usluga_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[Usluga_w_realizacji]  WITH CHECK ADD  CONSTRAINT [FK_Usluga_w_realizacji_Klient1] FOREIGN KEY([klient_id])
REFERENCES [dbo].[Klient] ([klient_id])
GO

ALTER TABLE [dbo].[Usluga_w_realizacji] CHECK CONSTRAINT [FK_Usluga_w_realizacji_Klient1]
GO

ALTER TABLE [dbo].[Usluga_w_realizacji]  WITH CHECK ADD  CONSTRAINT [FK_Usluga_w_realizacji_Pracownik] FOREIGN KEY([pracownik_id])
REFERENCES [dbo].[Pracownik] ([pracownik_id])
GO

ALTER TABLE [dbo].[Usluga_w_realizacji] CHECK CONSTRAINT [FK_Usluga_w_realizacji_Pracownik]
GO

ALTER TABLE [dbo].[Usluga_w_realizacji]  WITH CHECK ADD  CONSTRAINT [FK_Usluga_w_realizacji_Produkt] FOREIGN KEY([produkt_id])
REFERENCES [dbo].[Produkt] ([produkt_id])
GO

ALTER TABLE [dbo].[Usluga_w_realizacji] CHECK CONSTRAINT [FK_Usluga_w_realizacji_Produkt]
GO


