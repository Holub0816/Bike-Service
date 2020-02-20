package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ChoiceBox;


import java.sql.*;
import java.util.ArrayList;

/**
 *Klasa umozliwiajaca wykonywanie operacji na bazie danych.
 * @author Maciej Hołub, holubmaciek@gmail.com
 * @param <T> Parametr typu generycznego umożliwiający wybór typu zwracanego obiektu.
 */

public class Operations<T> { // Używam typu genaerycznego szczególnie dla list przechowujących dane z bazy danych


    /**
     * Metoda umozliwiajaca wyszukiwanie danych z bazy.
     * @param id Parametr po ktorym wyszukiwany jest rekord.
     * @param tableName Nazwa tabeli.
     * @param columnName Nazwa kolumny.
     * @param nazwaKlasy Nazwa klasy dla ktorej chcemy pobrac informacje.
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public T search(String id, String tableName, String columnName, String nazwaKlasy) throws SQLException, ClassNotFoundException { // T, ponieważ nie określam jaki typ jest zwracamy przy tworzeniu klasy
        String selectStatement = "SELECT * FROM " + tableName + " WHERE " + columnName + "=" + "'" + id + "'";

        try {
            ResultSet resultSet = DBOperations.dbExecuteQuerry(selectStatement);

            T we = getFromResultSet(resultSet, nazwaKlasy);

            return we;

        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }


    /**
     * Metoda dodajaca opcje wyboru do obiektu typu ChoiceBox.
     * @param choiceBox
     * @param arrayList Lista obiektów typu String.
     * @param columnName Nazwa kolumny, z ktorej maja byc pobierane rekordy.
     * @param tableName Tabela w ktorej znajduje sie tabela.
     * @throws SQLException
     */
    public void addToChoiceBox(ChoiceBox<String> choiceBox, ArrayList<String> arrayList, String columnName, String tableName) throws SQLException {

        String selectStatement = "SELECT " + columnName + " FROM " + tableName;

        ResultSet resultSet = DBOperations.dbExecuteQuerry(selectStatement);

        while (resultSet.next()) {
            choiceBox.getItems().add(resultSet.getString(1));
        }

    }


    /**
     * Metoda pobierajaca informacje z danej tabeli.
     * @param resultSet Obiekt typu ResultSet, przechowujacy wynik zapytania.
     * @param nazwaKlasy Nazwa klasy dla ktorej maja byc pobierane informacje.
     * @return Obiekt konkretnego typu z ustawionymi zmiennymi instancji.
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    private T getFromResultSet(ResultSet resultSet, String nazwaKlasy) throws SQLException, ClassNotFoundException { //

        if (nazwaKlasy.equals("Usluga_do_realizacji")) {
            Usluga usluga = null;
            if (resultSet.next()) {
                usluga = new Usluga();
                usluga.setUsluga_id(resultSet.getInt("usluga_id"));
                usluga.setPracownik_id(resultSet.getInt("pracownik_id"));
                usluga.setKlient_id(resultSet.getInt("klient_id"));
                usluga.setRower_id(resultSet.getInt("rower_id"));
                usluga.setProdukt_id(resultSet.getInt("produkt_id"));
                usluga.setData_przyjecia_zlecenia(resultSet.getDate("data_przyjęcia_zlecenia"));
                usluga.setData_rozpoczecia_zlecenia(resultSet.getDate("data_rozpoczęcia_zlecenia"));
                usluga.setData_zakonczenia_zlecenia(resultSet.getDate("data_zakończenia_zlecenia"));
                usluga.setCena(resultSet.getFloat("cena"));
                usluga.setStan_realizacji(resultSet.getString("stan_realizacji"));

            }
            return (T) usluga;
        } else if (nazwaKlasy.equals("Usluga_w_realizacji")) {
            UslugWRealizacji uslugaWRealizacji = null;
            if (resultSet.next()) {
                uslugaWRealizacji = new UslugWRealizacji();
                uslugaWRealizacji.setrUsluga_id(resultSet.getInt("usluga_id"));
                uslugaWRealizacji.setrPracownik_id(resultSet.getInt("pracownik_id"));
                uslugaWRealizacji.setrKlient_id(resultSet.getInt("klient_id"));
                uslugaWRealizacji.setrRower_id(resultSet.getInt("rower_id"));
                uslugaWRealizacji.setrProdukt_id(resultSet.getInt("produkt_id"));
                uslugaWRealizacji.setrData_przyjecia_zlecenia(resultSet.getDate("data_przyjęcia_zlecenia"));
                uslugaWRealizacji.setrData_rozpoczecia_zlecenia(resultSet.getDate("data_rozpoczęcia_zlecenia"));
                uslugaWRealizacji.setrData_zakonczenia_zlecenia(resultSet.getDate("data_zakończenia_zlecenia"));
                uslugaWRealizacji.setrCena(resultSet.getFloat("cena"));
                uslugaWRealizacji.setrStan_realizacji(resultSet.getString("stan_realizacji"));
            }

            return (T) uslugaWRealizacji;
        } else if (nazwaKlasy.equals("Usluga_zrealizowana")) {
            UslugaZrealizowana uslugaZrealizowana = null;
            if (resultSet.next()) {
                uslugaZrealizowana = new UslugaZrealizowana();
                uslugaZrealizowana.setzUsluga_id(resultSet.getInt("usluga_id"));
                uslugaZrealizowana.setzPracownik_id(resultSet.getInt("pracownik_id"));
                uslugaZrealizowana.setzKlient_id(resultSet.getInt("klient_id"));
                uslugaZrealizowana.setzRower_id(resultSet.getInt("rower_id"));
                uslugaZrealizowana.setzProdukt_id(resultSet.getInt("produkt_id"));
                uslugaZrealizowana.setzData_przyjecia_zlecenia(resultSet.getDate("data_przyjęcia_zlecenia"));
                uslugaZrealizowana.setzData_rozpoczecia_zlecenia(resultSet.getDate("data_rozpoczęcia_zlecenia"));
                uslugaZrealizowana.setzData_zakonczenia_zlecenia(resultSet.getDate("data_zakończenia_zlecenia"));
                uslugaZrealizowana.setzCena(resultSet.getFloat("cena"));
                uslugaZrealizowana.setzStan_realizacji(resultSet.getString("stan_realizacji"));
            }

            return (T) uslugaZrealizowana;
        } else if (nazwaKlasy.equals("Rower")) {
            Rower rower = null;
            if (resultSet.next()) {
                rower = new Rower();
                rower.setRower_id(resultSet.getInt("rower_id"));
                rower.setTyp_roweru(resultSet.getString("typ_roweru"));
                rower.setMarka_roweru(resultSet.getString("marka_roweru"));
                rower.setKolor_roweru(resultSet.getString("kolor"));
                rower.setRodzaj_serwisu(resultSet.getString("rodzaj_serwisu"));

            }
            return (T) rower;
        } else if (nazwaKlasy.equals("Produkt")) {
            Produkt produkt = null;
            if (resultSet.next()) {
                produkt = new Produkt();
                produkt.setProdukt_id(resultSet.getInt("produkt_id"));
                produkt.setNazwa_produktu(resultSet.getString("nazwa_produktu"));
                produkt.setCena(resultSet.getFloat("cena"));
                produkt.setProducent(resultSet.getString("producent"));
            }
            return (T) produkt;
        } else if (nazwaKlasy.equals("Klient")) {
            Klient klient = null;
            if (resultSet.next()) {
                klient = new Klient();
                klient.setKlient_id(resultSet.getInt("klient_id"));
                klient.setImie_klienta(resultSet.getString("imie_klienta"));
                klient.setNazwisko_klienta(resultSet.getString("nazwisko_klienta"));
                klient.setNr_telefonu(resultSet.getInt("nr_telefonu"));
                klient.setMail(resultSet.getString("mail"));
                klient.setRower_id(resultSet.getInt("rower_id"));
            }
            return (T) klient;
        } else if (nazwaKlasy.equals("Pracownik")) {
            Pracownik pracownik = null;
            if (resultSet.next()) {
                pracownik = new Pracownik();
                pracownik.setPracownik_id(resultSet.getInt("pracownik_id"));
                pracownik.setImie_pracownika(resultSet.getString("imie_pracownika"));
                pracownik.setNazwisko_pracownika(resultSet.getString("nazwisko_pracownika"));
                pracownik.setData_zatrudnienia(resultSet.getDate("data_zatrudnienia"));
                pracownik.setEtat_id(resultSet.getInt("etat_id"));
            }
            return (T) pracownik;
        } else if (nazwaKlasy.equals("Serwis")) {
            Serwis serwis = null;
            if (resultSet.next()) {
                serwis = new Serwis();
                serwis.setRodzajSerwisu(resultSet.getString("rodzaj_serwisu"));
                serwis.setCena_serwisu(resultSet.getFloat("cena"));
            }
            return (T) serwis;
        } else if (nazwaKlasy.equals("Etat")) {
            Etat etat = null;
            if (resultSet.next()) {
                etat = new Etat();
                etat.setEtat_id(resultSet.getInt("etat_id"));
                etat.setNazwa_etatu(resultSet.getString("nazwa_etatu"));
                etat.setStawka(resultSet.getFloat("stawka"));
            }
            return (T) etat;
        }
        return null;
    }

    /**
     * Metoda umozliwiajaca pobranie wszystkich danych z konkretnej tabeli.
     * @param tableName Nazwa tabeli.
     * @param nazwaKlasy Nazwa klasy do ktorej chcemy pobrac informacje.
     * @return Lista tablicowa ze wszystkimi danymi z tabeli.
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public ObservableList<T> searchAll(String tableName, String nazwaKlasy) throws SQLException, ClassNotFoundException {
        String selectStatement = "SELECT * FROM " + tableName;

        try {
            ResultSet resultSet = DBOperations.dbExecuteQuerry(selectStatement);

            ObservableList<T> list = getValuesList(resultSet, nazwaKlasy);

            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }

    }


    /**
     * Metoda zwracajaca lite tabelaryczna zawierajaca informacje o kazdym rekordzie z tabeli.
     * @param resultSet Obiekt typu ResultSet, przechowujacy wynik zapytania.
     * @param nazwaKlasy Nazwa klasy.
     * @return
     * @throws SQLException
     */

    public ObservableList<T> getValuesList(ResultSet resultSet, String nazwaKlasy) throws SQLException {
        if (nazwaKlasy.equals("Usluga_do_realizacji")) {
            ObservableList<Usluga> uslugaObservableList = FXCollections.observableArrayList();  //Utility class that consists of static methods that are 1:1 copies of java.util.Collections methods.

            while (resultSet.next()) {
                Usluga usluga = new Usluga();
                usluga.setUsluga_id(resultSet.getInt("usluga_id"));
                usluga.setPracownik_id(resultSet.getInt("pracownik_id"));
                usluga.setKlient_id(resultSet.getInt("klient_id"));
                usluga.setRower_id(resultSet.getInt("rower_id"));
                usluga.setProdukt_id(resultSet.getInt("produkt_id"));
                usluga.setData_przyjecia_zlecenia(resultSet.getDate("data_przyjęcia_zlecenia"));
                usluga.setData_rozpoczecia_zlecenia(resultSet.getDate("data_rozpoczęcia_zlecenia"));
                usluga.setData_zakonczenia_zlecenia(resultSet.getDate("data_zakończenia_zlecenia"));
                usluga.setCena(resultSet.getFloat("cena"));
                usluga.setStan_realizacji(resultSet.getString("stan_realizacji"));

                uslugaObservableList.add(usluga);

            }
            return (ObservableList<T>) uslugaObservableList;
        }
        if (nazwaKlasy.equals("Usluga_w_realizacji")) {
            ObservableList<UslugWRealizacji> uslugWRealizacjiObservableList = FXCollections.observableArrayList();

            while (resultSet.next()) {
                UslugWRealizacji uslugWRealizacji = new UslugWRealizacji();
                uslugWRealizacji.setrUsluga_id(resultSet.getInt("usluga_id"));
                uslugWRealizacji.setrPracownik_id(resultSet.getInt("pracownik_id"));
                uslugWRealizacji.setrKlient_id(resultSet.getInt("klient_id"));
                uslugWRealizacji.setrRower_id(resultSet.getInt("rower_id"));
                uslugWRealizacji.setrProdukt_id(resultSet.getInt("produkt_id"));
                uslugWRealizacji.setrData_przyjecia_zlecenia(resultSet.getDate("data_przyjęcia_zlecenia"));
                uslugWRealizacji.setrData_rozpoczecia_zlecenia(resultSet.getDate("data_rozpoczęcia_zlecenia"));
                uslugWRealizacji.setrData_zakonczenia_zlecenia(resultSet.getDate("data_zakończenia_zlecenia"));
                uslugWRealizacji.setrCena(resultSet.getFloat("cena"));
                uslugWRealizacji.setrStan_realizacji(resultSet.getString("stan_realizacji"));

                uslugWRealizacjiObservableList.add(uslugWRealizacji);
            }
            return (ObservableList<T>) uslugWRealizacjiObservableList;
        }
        if (nazwaKlasy.equals("Usluga_zrealizowana")) {
            ObservableList<UslugaZrealizowana> uslugaZrealizowanaObservableList = FXCollections.observableArrayList();

            while (resultSet.next()) {
                UslugaZrealizowana uslugaZrealizowana = new UslugaZrealizowana();
                uslugaZrealizowana.setzUsluga_id(resultSet.getInt("usluga_id"));
                uslugaZrealizowana.setzPracownik_id(resultSet.getInt("pracownik_id"));
                uslugaZrealizowana.setzKlient_id(resultSet.getInt("klient_id"));
                uslugaZrealizowana.setzRower_id(resultSet.getInt("rower_id"));
                uslugaZrealizowana.setzProdukt_id(resultSet.getInt("produkt_id"));
                uslugaZrealizowana.setzData_przyjecia_zlecenia(resultSet.getDate("data_przyjęcia_zlecenia"));
                uslugaZrealizowana.setzData_rozpoczecia_zlecenia(resultSet.getDate("data_rozpoczęcia_zlecenia"));
                uslugaZrealizowana.setzData_zakonczenia_zlecenia(resultSet.getDate("data_zakończenia_zlecenia"));
                uslugaZrealizowana.setzCena(resultSet.getFloat("cena"));
                uslugaZrealizowana.setzStan_realizacji(resultSet.getString("stan_realizacji"));

                uslugaZrealizowanaObservableList.add(uslugaZrealizowana);
            }
            return (ObservableList<T>) uslugaZrealizowanaObservableList;
        }


        if (nazwaKlasy.equals("Rower")) {
            ObservableList<Rower> rowerObservableList = FXCollections.observableArrayList();

            while (resultSet.next()) {
                Rower rower = new Rower();
                rower.setRower_id(resultSet.getInt("rower_id"));
                rower.setTyp_roweru(resultSet.getString("typ_roweru"));
                rower.setMarka_roweru(resultSet.getString("marka_roweru"));
                rower.setKolor_roweru(resultSet.getString("kolor"));
                rower.setRodzaj_serwisu(resultSet.getString("rodzaj_serwisu"));

                rowerObservableList.add(rower);
            }
            return (ObservableList<T>) rowerObservableList;
        }

        if (nazwaKlasy.equals("Produkt")) {
            ObservableList<Produkt> produktObservableList = FXCollections.observableArrayList();

            while (resultSet.next()) {
                Produkt produkt = new Produkt();
                produkt.setProdukt_id(resultSet.getInt("produkt_id"));
                produkt.setNazwa_produktu(resultSet.getString("nazwa_produktu"));
                produkt.setCena(resultSet.getFloat("cena"));
                produkt.setProducent(resultSet.getString("producent"));

                produktObservableList.add(produkt);
            }
            return (ObservableList<T>) produktObservableList;
        }

        if (nazwaKlasy.equals("Klient")) {
            ObservableList<Klient> klientObservableList = FXCollections.observableArrayList();

            while (resultSet.next()) {
                Klient klient = new Klient();
                klient.setKlient_id(resultSet.getInt("klient_id"));
                klient.setImie_klienta(resultSet.getString("imie_klienta"));
                klient.setNazwisko_klienta(resultSet.getString("nazwisko_klienta"));
                klient.setNr_telefonu(resultSet.getInt("nr_telefonu"));
                klient.setMail(resultSet.getString("mail"));
                klient.setRower_id(resultSet.getInt("rower_id"));

                klientObservableList.add(klient);
            }
            return (ObservableList<T>) klientObservableList;
        }


        if (nazwaKlasy.equals("Pracownik")) {
            ObservableList<Pracownik> pracownikObservableList = FXCollections.observableArrayList();

            while (resultSet.next()) {
                Pracownik pracownik = new Pracownik();
                pracownik.setPracownik_id(resultSet.getInt("pracownik_id"));
                pracownik.setImie_pracownika(resultSet.getString("imie_pracownika"));
                pracownik.setNazwisko_pracownika(resultSet.getString("nazwisko_pracownika"));
                pracownik.setData_zatrudnienia(resultSet.getDate("data_zatrudnienia"));
                pracownik.setEtat_id(resultSet.getInt("etat_id"));

                pracownikObservableList.add(pracownik);
            }
            return (ObservableList<T>) pracownikObservableList;
        }
        if (nazwaKlasy.equals("Serwis")) {
            ObservableList<Serwis> serwisObservableList = FXCollections.observableArrayList();

            while (resultSet.next()) {
                Serwis serwis = new Serwis();
                serwis.setRodzajSerwisu(resultSet.getString("rodzaj_serwisu"));
                serwis.setCena_serwisu(resultSet.getFloat("cena"));

                serwisObservableList.add(serwis);
            }
            return (ObservableList<T>) serwisObservableList;
        }

        if (nazwaKlasy.equals("Etat")) {
            ObservableList<Etat> etatObservableList = FXCollections.observableArrayList();

            while (resultSet.next()) {
                Etat etat = new Etat();
                etat.setEtat_id(resultSet.getInt("etat_id"));
                etat.setNazwa_etatu(resultSet.getString("nazwa_etatu"));
                etat.setStawka(resultSet.getFloat("stawka"));

                etatObservableList.add(etat);
            }
            return (ObservableList<T>) etatObservableList;
        }


        return null;
    }


    /**
     * Metoda pozwalajaca na zaktualizowanie rekordu dowolnej Klasy.
     * @param id Parametr po ktorym mozemy dotrzec do okreslonej danej.
     * @param value Wartosc, ktora jest wstawiana do tabeli.
     * @param columnName1 Nazwa kolumny po ktorej wyszukiwany bedzie rekord.
     * @param columnName2 Nazwa kolumny dla ktorej zmieniany jest rekord.
     * @param tableName
     */
    public void updateValue(String id, String value, String columnName1, String columnName2, String tableName) {
        String updateStatement =
                "BEGIN\n" +
                        "   UPDATE " + tableName + "\n" +
                        "      SET " + columnName2 + "= '" + value + "'\n" +
                        "    WHERE " + columnName1 + "= " + "'" + id + "';\n" +
                        "   COMMIT;\n" +
                        "END;";

        try {
            DBOperations.dbExecuteUpdate(updateStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    /**
     * Metoda pozwalajaca na usuniecie wybranego wiersza z bazy.
     * @param id Parametr po ktorym mozemy dotrzec do okreslonej danej.
     * @param columnName1 Nazwa kolumny po ktorej wyszukiwany będzie wiersz.
     * @param tableName Nazwa tabeli.
     */

    public void deleteValue(String id, String columnName1, String tableName) {
        String updateStatement =
                "BEGIN\n" +
                        "   DELETE FROM " + tableName + "\n" +
                        "         WHERE " + columnName1 + "=" + "'" + id + "';\n" +
                        "   COMMIT;\n" +
                        "END;";

        try {
            DBOperations.dbExecuteUpdate(updateStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    /**
     * Metoda pozwalajaca na dodanie wiersza do tablicy Klient (czyli dodanie nowego klienta do bazy).
     * @param klient_id
     * @param imie
     * @param nazwisko
     * @param nr_telefonu
     * @param mail
     * @param rower_id
     * @throws SQLException
     */
    public void insertValuesForKlient(int klient_id, String imie, String nazwisko, int nr_telefonu, String mail, String rower_id) throws SQLException {
        String updateStatement =
                "exec dodajKlienta '" + klient_id + "','" + imie + "','" + nazwisko + "','" + nr_telefonu + "','" + mail + "','" + rower_id + "' ";

        try {
            DBOperations.dbExecuteUpdate(updateStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * Metoda pozwalajaca na dodanie wiersza do tablicy Wprowadzane_produkty (czyli dodanie nowego wprowadzonego produktu do bazy).
     * @param nazwa_produktu
     */
    public void insertValuesForWprowadzaneProdukty(String nazwa_produktu) {

        String updateStatement = null;
        if(nazwa_produktu.equals("NULL")){
            updateStatement =
                    "exec dodajWprowadzanyProdukt "+nazwa_produktu;
        }
        else{ updateStatement =
                "exec dodajWprowadzanyProdukt '" + nazwa_produktu + "'";}

        try {
            DBOperations.dbExecuteUpdate(updateStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * Metoda pozwalajaca na dodanie wiersza do tablicy Rower (czyli dodanie nowego roweru do bazy).
     * @param rower_id
     * @param typ_roweru
     * @param marka_roweru
     * @param kolor_roweru
     * @param rodzaj_serwisu
     * @throws SQLException
     */
    public void insertValuesForRower(int rower_id, String typ_roweru, String marka_roweru, String kolor_roweru, String rodzaj_serwisu) throws SQLException {
        String updateStatement =
                "exec dodajRower '" + rower_id + "','" + typ_roweru + "','" + marka_roweru + "','" + kolor_roweru + "','" + rodzaj_serwisu + "' ";

        try {
            DBOperations.dbExecuteUpdate(updateStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * Metoda pozwalajaca na dodanie wiersza do tablicy Pracownik (czyli dodanie nowego pracownika do bazy).
     * @param imie_pracownika
     * @param nazwisko_pracownika
     */
    public void insertValuesForPracownik(String imie_pracownika, String nazwisko_pracownika) {
        String updateStatement =
                "exec dodajPracownik '" + imie_pracownika + "','" + nazwisko_pracownika + "'";
        try {
            DBOperations.dbExecuteUpdate(updateStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }



    /**
     * Metoda pozwalajaca na dodanie wiersza do tablicy Serwis (czyli dodanie nowej usługi serwisowej do bazy).
     * @param rodzaj_serwisu
     * @param cena
     */
    public void insertValuesForSerwis(String rodzaj_serwisu, float cena) {
        String updateStatement =
                "exec dodajSerwis '" + rodzaj_serwisu + "','" + cena + "'";

        try {
            DBOperations.dbExecuteUpdate(updateStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    /**
     *  Metoda pozwalajaca na dodanie wiersza do tablicy Wprowadzany_etat (czyli dodanie nowego wprowadzanego etatu do bazy).
     * @param nazwa_etatu
     */
    public void insertValueForWprowadzanyEtat(String nazwa_etatu) {
        String updateStatement =
                "exec dodajWprowadzanyEtat '" + nazwa_etatu + "'";

        try {
            DBOperations.dbExecuteUpdate(updateStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    /**
     * Metoda pozwalajaca na dodanie wiersza do tablicy Produkt (czyli dodanie nowego produktu do bazy).
     * @param nazwa_produktu
     * @param cena
     * @param producent
     */
    public void insertValuesForNowyProdukt(String nazwa_produktu, float cena, String producent) {
        String updateStatement =
                "exec dodajProdukt '" + nazwa_produktu + "','" + cena + "','" + producent + "'";

        try {
            DBOperations.dbExecuteUpdate(updateStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Metoda pozwalajaca na dodanie wiersza do tablicy Usluga_w_realizacji (czyli dodanie nowej uslugi w realizacji do bazy).
     * @param usluga_id
     * @param pracownik_id
     */
    public void dodajDorealizowanych(int usluga_id,int pracownik_id) {
        String updateStatement =
                "exec dodajDoRealizowanych '" + usluga_id + "','"+pracownik_id+"'";

        try {
            DBOperations.dbExecuteUpdate(updateStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * Metoda pozwalajaca na dodanie wiersza do tablicy Usluga_zrealizowana przez sprzedawcę (czyli dodanie nowej zrealizowanej uslugi do bazy).
     * @param usluga_id
     */
    public void dodajDozRealizowanych(int usluga_id) {
        String updateStatement =
                "exec dodajDoZrealizowanych '" + usluga_id + "'";


        try {
            DBOperations.dbExecuteUpdate(updateStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     *Metoda pozwalajaca na dodanie wiersza do tablicy Usluga_zrealizowana prez serwisanta (czyli dodanie nowej zrealizowanej uslugi do bazy).
     * @param usluga_id
     * @throws SQLException
     */
    public void dodajDoZrealizowanychSerwisant(int usluga_id) throws SQLException {
        String updateStatement =
                "exec dodajDoZrealizowanychSerwisant '" + usluga_id + "'";

        try {
            DBOperations.dbExecuteUpdate(updateStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    /**
     *  Metoda pozwalajaca na dodanie wiersza do tablicy Usluga_do_realizacji (czyli dodanie nowej uslugi do realizacji do bazy).
     * @param klient_id
     * @param rower_id
     * @param pracownik_id
     * @throws SQLException
     */
    public void dodajDoDoRealizacji(int klient_id, String rower_id, int pracownik_id) throws SQLException {
        String updateStatement =
                "exec dodajDoDoRealizacji '" + klient_id + "','" + rower_id + "','"+pracownik_id+"'";
        try {
            DBOperations.dbExecuteUpdate(updateStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    /**
     * Metoda pozwalajaca na usuniecie wiersza z tablicy Usluga_do_realizacji (czyli usuniecie uslugi oczekujacych na realizacje z bazy).
     * @param usluga_id
     * @throws SQLException
     */
    public void usunUslugeDoRealizacji(int usluga_id) throws SQLException {
        String updateStatement =
                "exec UsuńUsługe_do_realizacji '" + usluga_id + "'";


        try {
            DBOperations.dbExecuteUpdate(updateStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * Metoda pozwalajaca na usuniecie wiersza z tablicy Usluga_w_realizacji (czyli usuniecie uslugi w realizacji z bazy).
     * @param usluga_id
     * @throws SQLException
     */
    public void usunUslugeWRealizacji(int usluga_id) throws SQLException {
        String updateStatement =
                "exec UsuńUsługe_w_realizacji '" + usluga_id + "'";

        try {
            DBOperations.dbExecuteUpdate(updateStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * Metoda usuwajaca wszystkie wiersze z tablicy Usluga_zrealizowana (czyli usuniecie wszystkich uslug zrealizowanych z bazy).
     * @throws SQLException
     */
    public void wyczyscUslugiZrealizowane() throws SQLException {
        String updateStatement =
                "DELETE FROM Usluga_zrealizowana";

        try {
            DBOperations.dbExecuteUpdate(updateStatement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    /**
     * Metoda liczaca dochod pochodzacy z wykonanych uslug serwisowych oraz sprzedanych produktow z wybranego dnia.
     * @param data
     * @return
     */
    public float policzDochod(String data) {
        float wynik = 0;
        String conect = "jdbc:sqlserver://localhost:1433;databaseName=SerwisRowerowyAplikacja;user=Maciej;password=Maciej";
        try (Connection con = DriverManager.getConnection(conect); Statement statement = con.createStatement();) {
            String updateStatement =
                    "SELECT SUM(cena) as suma_operacji FROM Usluga_zrealizowana WHERE data_zakończenia_zlecenia = '" + data + "'";
            ResultSet resultSet = statement.executeQuery(updateStatement);
            while (resultSet.next()) {
                wynik = resultSet.getInt("suma_operacji");
            }
            return wynik;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return wynik;
    }

    /**
     * Metoda liczaca ilosc rekordow w danej kolumnie w tabeli Usluga_zrealizowana.
     * @param columnName
     * @return
     */
    public int policzIlosc(String columnName) {
        int wynik = 0;
        String conect = "jdbc:sqlserver://localhost:1433;databaseName=SerwisRowerowyAplikacja;user=Maciej;password=Maciej";

        try (Connection con = DriverManager.getConnection(conect); Statement statement = con.createStatement();) {
            String updateStatement =
                    "SELECT COUNT(" + columnName + ") as suma_operacjii FROM Usluga_zrealizowana";
            ResultSet resultSet = statement.executeQuery(updateStatement);
            while (resultSet.next()) {
                wynik = resultSet.getInt("suma_operacjii");
            }
            return wynik;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return wynik;


    }
}

