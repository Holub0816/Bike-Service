USE [SerwisRowerowyAplikacja]
GO

/****** Object:  View [dbo].[vTypy]    Script Date: 09.02.2019 14:38:46 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO


CREATE View [dbo].[vTypy]
AS 
Select * FROM (VALUES('Downhill'),('Miejski'),('MTB'),('Szosowy'),
('Cruiser'),('Torowy'),('BMX'),('Enduro'),('Monocykl'),
('Bicykl'),('Elektryczny')) TYP(typ_roweru)
GO


