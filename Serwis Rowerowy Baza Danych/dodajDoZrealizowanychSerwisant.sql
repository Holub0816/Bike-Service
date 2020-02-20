USE [SerwisRowerowyAplikacja]
GO

/****** Object:  StoredProcedure [dbo].[dodajDoZrealizowanychSerwisant]    Script Date: 09.02.2019 14:28:56 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO













CREATE procedure [dbo].[dodajDoZrealizowanychSerwisant]
(
@usluga_id int

)
as 
begin 
insert into Usluga_zrealizowana(usluga_id,pracownik_id,klient_id,rower_id,produkt_id,data_przyj�cia_zlecenia,data_rozpocz�cia_zlecenia,data_zako�czenia_zlecenia,cena,stan_realizacji)
values(@usluga_id,(select pracownik_id from Usluga_w_realizacji where usluga_id=@usluga_id),(SELECT klient_id FROM Usluga_w_realizacji WHERE usluga_id=@usluga_id),
(SELECT rower_id FROM Usluga_w_realizacji WHERE usluga_id=@usluga_id),(SELECT produkt_id FROM Usluga_w_realizacji WHERE usluga_id=@usluga_id),(SELECT data_przyj�cia_zlecenia FROM Usluga_w_realizacji WHERE usluga_id=@usluga_id),
GETDATE(),GETDATE(),(SELECT cena FROM Usluga_w_realizacji WHERE @usluga_id=usluga_id),'ZREALIZOWANA')



end
GO


