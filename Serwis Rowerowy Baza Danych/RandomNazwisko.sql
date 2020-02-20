USE [SerwisRowerowyAplikacja]
GO

/****** Object:  UserDefinedFunction [dbo].[RandomNazwisko]    Script Date: 09.02.2019 14:33:44 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO



CREATE FUNCTION [dbo].[RandomNazwisko]()
RETURNS VARCHAR(25)
AS
BEGIN
    DECLARE @nazwisko VARCHAR(25)

    SELECT TOP 1 @nazwisko = nazwisko FROM dbo.vNazwiska order by (SELECT id FROM [dbo].[VNoweId])
	

    RETURN @nazwisko
END
GO


