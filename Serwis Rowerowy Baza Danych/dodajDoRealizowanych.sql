USE [SerwisRowerowyAplikacja]
GO

/****** Object:  StoredProcedure [dbo].[dodajDoRealizowanych]    Script Date: 09.02.2019 14:28:23 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO









CREATE procedure [dbo].[dodajDoRealizowanych]
(
@usluga_id int,
@pracownik_id int
)
as 
BEGIN 
insert into Usluga_w_realizacji(usluga_id,pracownik_id,klient_id,rower_id,produkt_id,data_przyjêcia_zlecenia,data_rozpoczêcia_zlecenia,data_zakoñczenia_zlecenia,cena,stan_realizacji)
values(@usluga_id,@pracownik_id,(SELECT klient_id FROM Usluga_do_realizacji WHERE usluga_id=@usluga_id),(SELECT rower_id FROM Usluga_do_realizacji WHERE usluga_id=@usluga_id),
(SELECT produkt_id FROM Usluga_do_realizacji WHERE usluga_id=@usluga_id),(SELECT data_przyjêcia_zlecenia FROM Usluga_do_realizacji WHERE usluga_id=@usluga_id),GETDATE(),null,(SELECT cena FROM Usluga_do_realizacji WHERE @usluga_id=usluga_id),'W REALIZACJI');





END
GO


