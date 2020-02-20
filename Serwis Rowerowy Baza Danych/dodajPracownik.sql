USE [SerwisRowerowyAplikacja]
GO

/****** Object:  StoredProcedure [dbo].[dodajPracownik]    Script Date: 09.02.2019 14:29:33 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO






CREATE procedure [dbo].[dodajPracownik]
(
@imie_pracownika varchar(15),
@nazwisko_pracownika varchar(25)
)
as 
begin 
insert into Pracownik(pracownik_id,imie_pracownika,nazwisko_pracownika,data_zatrudnienia,etat_id)
values((Select max(pracownik_id) from Pracownik)+1,@imie_pracownika,@nazwisko_pracownika,GETDATE(),(SELECT etat_id FROM Etat WHERE nazwa_etatu=(SELECT TOP 1 nazwa_etatu FROM Wprowadzane_etaty order by id_wprowadzanego_etatu desc)))
end
GO


