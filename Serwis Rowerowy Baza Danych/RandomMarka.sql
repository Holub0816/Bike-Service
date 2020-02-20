USE [SerwisRowerowyAplikacja]
GO

/****** Object:  UserDefinedFunction [dbo].[RandomMarka]    Script Date: 09.02.2019 14:33:30 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO


create FUNCTION [dbo].[RandomMarka]()
RETURNS VARCHAR(30)
AS
BEGIN
    DECLARE @marka VARCHAR(30)

    SELECT TOP 1 @marka = marka_roweru FROM dbo.vMarki order by (SELECT id FROM [dbo].[VNoweId])
	

    RETURN @marka
END
GO


