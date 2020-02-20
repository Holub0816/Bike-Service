USE [SerwisRowerowyAplikacja]
GO

/****** Object:  View [dbo].[vMarki]    Script Date: 09.02.2019 14:38:01 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO


CREATE View [dbo].[vMarki]
AS 
Select * FROM (VALUES('Fiji'),('Le Grand'),('Trek'),('KTM'),
('Electra'),('Focus'),('Specialized'),('Hercules'),('Giant'),
('Scott'),('Cube'),('Author'),('Merida'),('Romet'),('Kross'),('Cannondale')) MARKA(marka_roweru)
GO


