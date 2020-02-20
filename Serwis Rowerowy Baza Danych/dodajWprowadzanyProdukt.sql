USE [SerwisRowerowyAplikacja]
GO

/****** Object:  StoredProcedure [dbo].[dodajWprowadzanyProdukt]    Script Date: 09.02.2019 14:30:30 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO









CREATE procedure [dbo].[dodajWprowadzanyProdukt]
(
@nazwa_produktu varchar(50)
)
as 
begin 
insert into Wprowadzane_produkty(nazwa_produktu,id_wprowadzanego_produktu)
values(@nazwa_produktu,(select max(id_wprowadzanego_produktu) from Wprowadzane_produkty)+1)
end
GO


