USE [SerwisRowerowyAplikacja]
GO

/****** Object:  Table [dbo].[Pracownik]    Script Date: 09.02.2019 14:22:24 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Pracownik](
	[pracownik_id] [int] NOT NULL,
	[imie_pracownika] [varchar](15) NOT NULL,
	[nazwisko_pracownika] [varchar](25) NOT NULL,
	[data_zatrudnienia] [date] NOT NULL,
	[etat_id] [int] NOT NULL,
 CONSTRAINT [PK_Pracownik] PRIMARY KEY CLUSTERED 
(
	[pracownik_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[Pracownik]  WITH CHECK ADD  CONSTRAINT [FK_Pracownik_Etat] FOREIGN KEY([etat_id])
REFERENCES [dbo].[Etat] ([etat_id])
GO

ALTER TABLE [dbo].[Pracownik] CHECK CONSTRAINT [FK_Pracownik_Etat]
GO


