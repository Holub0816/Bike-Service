USE [SerwisRowerowyAplikacja]
GO

/****** Object:  View [dbo].[vKolory]    Script Date: 09.02.2019 14:37:48 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO


CREATE View [dbo].[vKolory]
AS 
Select * FROM (VALUES('Czarny'),('zielony'),('Czerwony'),('Niebieski'),
('��ty'),('Br�zowy'),('Bia�y'),('Z�oty'),('Czarno-niebieski'),
('Czarno-czerowny'),('Fioletowy'),('Seledynowy')) KOLOR(kolor)
GO


