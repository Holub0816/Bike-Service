USE [SerwisRowerowyAplikacja]
GO

/****** Object:  UserDefinedFunction [dbo].[RandomKolor]    Script Date: 09.02.2019 14:33:16 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO


create FUNCTION [dbo].[RandomKolor]()
RETURNS VARCHAR(20)
AS
BEGIN
    DECLARE @kolor VARCHAR(20)

    SELECT TOP 1 @kolor = kolor FROM dbo.vKolory order by (SELECT id FROM [dbo].[VNoweId])
	

    RETURN @kolor
END
GO


