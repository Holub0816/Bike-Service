USE [SerwisRowerowyAplikacja]
GO

/****** Object:  View [dbo].[vImiona]    Script Date: 09.02.2019 14:37:36 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO



CREATE View [dbo].[vImiona]
AS 
Select * FROM (VALUES('Marcin'),('Anna'),('Micha�'),('Krzysztof'),
('Maria'),('Klaudia'),('Daria'),('Iwona'),('Adam'),
('Grzegorz'),('Rafa�'),('Konstantyn'),('Alicja'),('Barbara')) Imie(imie)
GO


