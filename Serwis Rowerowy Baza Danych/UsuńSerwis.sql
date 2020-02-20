USE [SerwisRowerowyAplikacja]
GO

/****** Object:  StoredProcedure [dbo].[UsuñSerwis]    Script Date: 09.02.2019 14:31:17 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO



CREATE PROCEDURE [dbo].[UsuñSerwis]
(
@usterka int
)
AS
BEGIN 
DELETE FROM Serwis WHERE @usterka=rodzaj_serwisu
END
GO


