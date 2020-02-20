USE [SerwisRowerowyAplikacja]
GO

/****** Object:  UserDefinedFunction [dbo].[RandomImie]    Script Date: 09.02.2019 14:33:05 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO



CREATE FUNCTION [dbo].[RandomImie]()
RETURNS VARCHAR(20)
AS
BEGIN
    DECLARE @imie VARCHAR(20)

    SELECT TOP 1 @imie = imie FROM dbo.vImiona order by (SELECT id FROM [dbo].[VNoweId])
	

    RETURN @imie
END
GO


