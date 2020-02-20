USE [SerwisRowerowyAplikacja]
GO

/****** Object:  Table [dbo].[Wprowadzane_produkty]    Script Date: 09.02.2019 14:25:11 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Wprowadzane_produkty](
	[nazwa_produktu] [varchar](50) NULL,
	[id_wprowadzanego_produktu] [int] NOT NULL
) ON [PRIMARY]
GO


