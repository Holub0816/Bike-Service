USE [SerwisRowerowyAplikacja]
GO

/****** Object:  StoredProcedure [dbo].[aktualizujUsluge_do_realizacji]    Script Date: 09.02.2019 14:27:22 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO





CREATE procedure [dbo].[aktualizujUsluge_do_realizacji]
(
@usluga_id int,
@stan varchar(50)
)
as
begin
UPDATE Usluga_do_realizacji
SET @stan=stan_realizacji
WHERE @usluga_id=usluga_id
end
GO


