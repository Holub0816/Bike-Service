USE [SerwisRowerowyAplikacja]
GO

/****** Object:  StoredProcedure [dbo].[nowyRower]    Script Date: 09.02.2019 14:30:53 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO





CREATE procedure [dbo].[nowyRower]
(
@iloœæ_danych int
)
as
DECLARE @licznik int 
SET @licznik=0 
WHILE @licznik<@iloœæ_danych
BEGIN 
INSERT INTO Rower(rower_id,typ_roweru,marka_roweru,kolor,rodzaj_serwisu) 
VALUES(ROUND(10+CONVERT(INT,(99999-10000+1)*RAND()),0),dbo.RandomTyp(),dbo.RandomMarka(),dbo.RandomKolor(),DBO.RandomUsterka())

SET @licznik = @licznik +1
END
GO


