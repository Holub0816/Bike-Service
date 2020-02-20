USE [SerwisRowerowyAplikacja]
GO

/****** Object:  Table [dbo].[Serwis]    Script Date: 09.02.2019 14:23:31 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Serwis](
	[rodzaj_serwisu] [varchar](50) NOT NULL,
	[cena] [float] NOT NULL,
 CONSTRAINT [PK_Serwis] PRIMARY KEY CLUSTERED 
(
	[rodzaj_serwisu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO


