USE [SerwisRowerowyAplikacja]
GO

/****** Object:  StoredProcedure [dbo].[Usu�Us�uge_do_realizacji]    Script Date: 09.02.2019 14:31:30 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO



CREATE PROCEDURE [dbo].[Usu�Us�uge_do_realizacji]
(
@usluga_id int
)
AS
BEGIN 
DELETE FROM Usluga_do_realizacji WHERE @usluga_id=usluga_id
END
GO


