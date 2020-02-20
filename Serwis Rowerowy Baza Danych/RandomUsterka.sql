USE [SerwisRowerowyAplikacja]
GO

/****** Object:  UserDefinedFunction [dbo].[RandomUsterka]    Script Date: 09.02.2019 14:34:08 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO



CREATE FUNCTION [dbo].[RandomUsterka]()
RETURNS VARCHAR(50)
AS
BEGIN
    DECLARE @usterka VARCHAR(50)

    SELECT TOP 1 @usterka = rodzaj_serwisu FROM Serwis order by (SELECT id FROM [dbo].[VNoweId])
	

    RETURN @usterka
END
GO


