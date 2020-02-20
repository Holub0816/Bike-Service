USE [SerwisRowerowyAplikacja]
GO

/****** Object:  StoredProcedure [dbo].[dodajSerwis]    Script Date: 09.02.2019 14:30:07 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO



CREATE procedure [dbo].[dodajSerwis]
(
@rodzaj_serwisu varchar(50),
@cena float

)

as 
begin
insert into Serwis(rodzaj_serwisu,cena)
values(@rodzaj_serwisu,@cena)
end
GO


