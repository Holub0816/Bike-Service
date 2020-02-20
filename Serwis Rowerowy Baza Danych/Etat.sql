USE [SerwisRowerowyAplikacja]
GO

/****** Object:  Table [dbo].[Etat]    Script Date: 09.02.2019 14:21:35 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Etat](
	[etat_id] [int] NOT NULL,
	[nazwa_etatu] [varchar](50) NOT NULL,
	[stawka] [float] NULL,
 CONSTRAINT [PK_Etat] PRIMARY KEY CLUSTERED 
(
	[etat_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO


