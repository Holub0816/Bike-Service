USE [SerwisRowerowyAplikacja]
GO

/****** Object:  StoredProcedure [dbo].[aktualizujEtat]    Script Date: 09.02.2019 14:26:10 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO


create procedure [dbo].[aktualizujEtat]
(
@id int,
@nazwa_etatu varchar(50),
@stawka float
)
as
begin
UPDATE Etat
SET nazwa_etatu=@nazwa_etatu,stawka=@stawka
WHERE etat_id=@id
end
GO


