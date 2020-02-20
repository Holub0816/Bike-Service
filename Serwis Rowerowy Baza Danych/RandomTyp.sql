USE [SerwisRowerowyAplikacja]
GO

/****** Object:  UserDefinedFunction [dbo].[RandomTyp]    Script Date: 09.02.2019 14:33:55 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO


CREATE FUNCTION [dbo].[RandomTyp]()
RETURNS VARCHAR(20)
AS
BEGIN
    DECLARE @typ VARCHAR(20)

    SELECT TOP 1 @typ = typ_roweru FROM dbo.vTypy order by (SELECT id FROM [dbo].[VNoweId])
	

    RETURN @typ
END
GO


