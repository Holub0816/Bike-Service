USE [SerwisRowerowyAplikacja]
GO

/****** Object:  StoredProcedure [dbo].[UsuñUs³uge_w_realizacji]    Script Date: 09.02.2019 14:31:46 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO



CREATE PROCEDURE [dbo].[UsuñUs³uge_w_realizacji]
(
@usluga_id int
)
AS
BEGIN 
DELETE FROM Usluga_w_realizacji WHERE @usluga_id=usluga_id
END
GO


