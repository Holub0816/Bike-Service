USE [SerwisRowerowyAplikacja]
GO

/****** Object:  StoredProcedure [dbo].[aktualizujSerwis]    Script Date: 09.02.2019 14:26:59 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO


create procedure [dbo].[aktualizujSerwis]
(
@serwis varchar (50),
@cena float
)
as
begin
UPDATE Serwis
SET cena=@cena
WHERE @serwis=rodzaj_serwisu
end
GO


