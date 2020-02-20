USE [SerwisRowerowyAplikacja]
GO

/****** Object:  StoredProcedure [dbo].[UsuñProdukt]    Script Date: 09.02.2019 14:31:04 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO



CREATE PROCEDURE [dbo].[UsuñProdukt]
(
@produkt_id int
)
AS
BEGIN 
DELETE FROM Produkt WHERE @produkt_id=produkt_id
END
GO


