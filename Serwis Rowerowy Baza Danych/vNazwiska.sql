USE [SerwisRowerowyAplikacja]
GO

/****** Object:  View [dbo].[vNazwiska]    Script Date: 09.02.2019 14:38:12 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO



CREATE View [dbo].[vNazwiska]
AS 
Select * FROM (VALUES('Krok'),('Go��b'),('Siekacz'),('Krasi�ski'),
('Pstryk'),('Niedzielan'),('Pi�tek'),('Kotlet'),('Mickiewicz'),
('Grzelak'),('Poter'),('Murarz'),('Grom'),('Weiss'),('Nosacz'),('Malinowski'),('Gmina'),('Gol')) Nazwisko(nazwisko)
GO


