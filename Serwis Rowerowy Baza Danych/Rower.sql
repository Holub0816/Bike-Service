USE [SerwisRowerowyAplikacja]
GO

/****** Object:  Table [dbo].[Rower]    Script Date: 09.02.2019 14:23:13 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Rower](
	[rower_id] [int] NOT NULL,
	[typ_roweru] [varchar](20) NULL,
	[marka_roweru] [varchar](30) NULL,
	[kolor] [varchar](20) NULL,
	[rodzaj_serwisu] [varchar](50) NULL,
 CONSTRAINT [PK_Rower] PRIMARY KEY CLUSTERED 
(
	[rower_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[Rower]  WITH CHECK ADD  CONSTRAINT [FK_Rower_Serwis] FOREIGN KEY([rodzaj_serwisu])
REFERENCES [dbo].[Serwis] ([rodzaj_serwisu])
GO

ALTER TABLE [dbo].[Rower] CHECK CONSTRAINT [FK_Rower_Serwis]
GO


