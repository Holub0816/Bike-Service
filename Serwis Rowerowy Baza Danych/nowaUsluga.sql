USE [SerwisRowerowyAplikacja]
GO

/****** Object:  StoredProcedure [dbo].[nowaUsluga]    Script Date: 09.02.2019 14:30:43 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO







CREATE procedure [dbo].[nowaUsluga]
(
@ilo��_danych int
)
as
DECLARE @licznik int 
SET @licznik=0 
WHILE @licznik<@ilo��_danych
BEGIN 
INSERT INTO Us�uga(us�uga_id,pracownik_id,produkt_id,data_rozpocz�cia_zlecenia,klient_id) 
VALUES((Select MAX(us�uga_id)FROM Us�uga)+1,(SELECT TOP 1 pracownik_id FROM Pracownik WHERE etat_id='301' OR etat_id='302' ORDER BY(SELECT id FROM [dbo].[VNoweId]))
,(SELECT TOP 1 produkt_id FROM Produkt ORDER BY(SELECT id FROM [dbo].[VNoweId])),dbo.RandomDate(),(SELECT TOP 1 klient_id FROM Klient ORDER BY(SELECT id FROM [dbo].[VNoweId])))

SET @licznik = @licznik +1
END
GO


