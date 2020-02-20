USE [SerwisRowerowyAplikacja]
GO

/****** Object:  StoredProcedure [dbo].[aktualizujKlienta]    Script Date: 09.02.2019 14:26:25 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO


create procedure [dbo].[aktualizujKlienta]
(
@rower_id int,
@klient_id int,
@telefon numeric(9,0),
@mail varchar(50)
)
as
begin
UPDATE Klient
SET nr_telefonu=@telefon,mail=@mail
WHERE @klient_id=klient_id
end
GO


