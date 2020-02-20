USE [SerwisRowerowyAplikacja]
GO

/****** Object:  StoredProcedure [dbo].[dodajKlienta]    Script Date: 09.02.2019 14:29:08 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO





CREATE procedure [dbo].[dodajKlienta]
(
@klient_id int,
@imie_klienta varchar(20),
@nazwisko_klienta varchar(25),
@numer_telefonu numeric(9,0),
@mail varchar(50),
@rower_id int
)
as 
begin 
insert into Klient(klient_id,imie_klienta,nazwisko_klienta,nr_telefonu,mail,rower_id)
values(@klient_id,@imie_klienta,@nazwisko_klienta,@numer_telefonu,@mail,@rower_id)
end
GO


