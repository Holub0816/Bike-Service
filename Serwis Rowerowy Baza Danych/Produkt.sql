USE [SerwisRowerowyAplikacja]
GO

/****** Object:  Table [dbo].[Produkt]    Script Date: 09.02.2019 14:22:58 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Produkt](
	[produkt_id] [int] NOT NULL,
	[nazwa_produktu] [varchar](50) NOT NULL,
	[cena] [float] NOT NULL,
	[producent] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Produkt] PRIMARY KEY CLUSTERED 
(
	[produkt_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO


