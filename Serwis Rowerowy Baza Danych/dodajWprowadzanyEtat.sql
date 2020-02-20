USE [SerwisRowerowyAplikacja]
GO

/****** Object:  StoredProcedure [dbo].[dodajWprowadzanyEtat]    Script Date: 09.02.2019 14:30:17 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO









CREATE procedure [dbo].[dodajWprowadzanyEtat]
(
@nazwa_etatu varchar(50)
)
as 
begin 
insert into Wprowadzane_etaty(nazwa_etatu,id_wprowadzanego_etatu)
values(@nazwa_etatu,(select max(id_wprowadzanego_etatu) from Wprowadzane_etaty)+1)
end
GO


