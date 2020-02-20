USE [SerwisRowerowyAplikacja]
GO

/****** Object:  UserDefinedFunction [dbo].[zwrocProdukt]    Script Date: 09.02.2019 14:34:20 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO


create FUNCTION [dbo].[zwrocProdukt](
@produkt varchar (50)
)
RETURNS VARCHAR(50)
AS
BEGIN
    
	

    RETURN @produkt
END
GO


