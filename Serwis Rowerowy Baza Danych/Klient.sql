USE [SerwisRowerowyAplikacja]
GO

/****** Object:  Table [dbo].[Klient]    Script Date: 09.02.2019 14:21:57 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Klient](
	[klient_id] [int] NOT NULL,
	[imie_klienta] [varchar](20) NOT NULL,
	[nazwisko_klienta] [varchar](25) NOT NULL,
	[nr_telefonu] [numeric](9, 0) NOT NULL,
	[mail] [varchar](50) NULL,
	[rower_id] [int] NULL,
 CONSTRAINT [PK_Klient] PRIMARY KEY CLUSTERED 
(
	[klient_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[Klient]  WITH CHECK ADD  CONSTRAINT [FK_Klient_Rower] FOREIGN KEY([rower_id])
REFERENCES [dbo].[Rower] ([rower_id])
GO

ALTER TABLE [dbo].[Klient] CHECK CONSTRAINT [FK_Klient_Rower]
GO


