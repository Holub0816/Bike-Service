USE [SerwisRowerowyAplikacja]
GO

/****** Object:  View [dbo].[VNoweId]    Script Date: 09.02.2019 14:38:36 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO


create view [dbo].[VNoweId] as Select NEWID() as id
GO


