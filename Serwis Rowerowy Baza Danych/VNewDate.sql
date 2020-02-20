USE [SerwisRowerowyAplikacja]
GO

/****** Object:  View [dbo].[VNewDate]    Script Date: 09.02.2019 14:38:23 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO



create view [dbo].[VNewDate] as SELECT DATEADD(DAY, ABS(CHECKSUM(NEWID()) % 365), '2018-01-01') as nowa_data	
GO


