USE [SerwisRowerowyAplikacja]
GO

/****** Object:  StoredProcedure [dbo].[dodajProdukt]    Script Date: 09.02.2019 14:29:44 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO




CREATE procedure [dbo].[dodajProdukt]
(
@nazwa_produktu varchar(50),
@cena float,
@producent varchar(50)
)
as 
begin 
insert into Produkt(produkt_id,nazwa_produktu,cena,producent)
values((SELECT MAX(produkt_id) FROM Produkt)+1,@nazwa_produktu,@cena,@producent)
end
GO


