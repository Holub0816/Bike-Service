USE [SerwisRowerowyAplikacja]
GO

/****** Object:  UserDefinedFunction [dbo].[RandomDate]    Script Date: 09.02.2019 14:32:51 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO


CREATE FUNCTION [dbo].[RandomDate]()
RETURNS date
AS
BEGIN
    DECLARE @data date


    SELECT TOP 1 @data=nowa_data FROM dbo.VNewDate
	

    RETURN @data
END
GO


