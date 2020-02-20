USE [SerwisRowerowyAplikacja]
GO

/****** Object:  StoredProcedure [dbo].[dodajRower]    Script Date: 09.02.2019 14:29:56 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO


create procedure [dbo].[dodajRower]
(
@rower_id int,
@typ_roweru varchar(20),
@marka_roweru varchar (30),
@kolor varchar(20),
@rodzaj_usterki varchar(50)
)

as 
begin
insert into Rower(rower_id, typ_roweru, marka_roweru, kolor, rodzaj_serwisu)
values(@rower_id,@typ_roweru,@marka_roweru,@kolor,@rodzaj_usterki)
end
GO


