USE [SerwisRowerowyAplikacja]
GO

/****** Object:  StoredProcedure [dbo].[aktualizujProdukt]    Script Date: 09.02.2019 14:26:44 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO


create procedure [dbo].[aktualizujProdukt]
(
@produkt_id int,
@nazwa varchar (30),
@cena float,
@producent varchar(50)
)
as
begin
UPDATE Produkt
SET cena = @cena,nazwa_produktu=@nazwa,@producent=producent
WHERE produkt_id=@produkt_id
end
GO


