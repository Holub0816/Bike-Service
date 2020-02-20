USE [SerwisRowerowyAplikacja]
GO

/****** Object:  StoredProcedure [dbo].[dodajDoDoRealizacji]    Script Date: 09.02.2019 14:28:11 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO





CREATE procedure [dbo].[dodajDoDoRealizacji]
(
@klient_id int,
@rower_id int,
@pracownik_id int
)
as 
begin 
insert into Usluga_do_realizacji(usluga_id,pracownik_id,klient_id,rower_id,produkt_id,data_przyjêcia_zlecenia,data_rozpoczêcia_zlecenia,data_zakoñczenia_zlecenia,cena,stan_realizacji)
values(ROUND(10+CONVERT(INT,(99999-10000+1)*RAND()),0),@pracownik_id,@klient_id,@rower_id,
(SELECT produkt_id FROM Produkt WHERE nazwa_produktu=(SELECT TOP 1 nazwa_produktu FROM Wprowadzane_produkty order by id_wprowadzanego_produktu desc)),GETDATE(),null,null,((SELECT isnull(cena,0) FROM Produkt WHERE produkt_id=(SELECT produkt_id FROM Produkt WHERE nazwa_produktu=(SELECT TOP 1 nazwa_produktu FROM Wprowadzane_produkty order by id_wprowadzanego_produktu desc)))
+(SELECT cena FROM Rower R join Serwis s on r.rodzaj_serwisu=s.rodzaj_serwisu where rower_id=@rower_id)),'DO REALIZACJI')


end
GO


