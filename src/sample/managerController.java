package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Klasa, ktora umozliwia projektowanie interfejsu graficznego dla sprzedawcy.
 *
 * @author Maciej Holub, holubmaciek@gmail.com
 */

public class managerController {

    Operations operations = new Operations();
    ArrayList<String> wprowadzaneEtatyValues = new ArrayList<>();

    @FXML
    private TableView pracownikTable;

    @FXML
    private TableColumn<Pracownik, Integer> pracownikidColumn;

    @FXML
    private TableColumn<Pracownik, String> imiePracownikaColumn;

    @FXML
    private TableColumn<Pracownik, String> nazwiskoPracownikaColumn;

    @FXML
    private TableColumn<Pracownik, Date> dataZatrudnieniaColumn;

    @FXML
    private TableColumn<Pracownik, Integer> etatidPracownikColumn;

    @FXML
    private TextField imiePracownikaTxtfield;

    @FXML
    private TextField nazwiskoPracownikaTxtfield;

    @FXML
    private ChoiceBox<String> etatChoicebox;

    @FXML
    private Button dodajPracownika;

    @FXML
    private TextField idPracownikaTxtfield;

    @FXML
    private TextField polePracownikTxtfield;

    @FXML
    private TextField nowaWartoscPracownikTxtfield;

    @FXML
    private Button szukajPracownika;

    @FXML
    private Button aktualizujPracownika;

    @FXML
    private Button pokazPracownika;

    @FXML
    private Button usunPracownika;

    @FXML
    private TableView etatTable;

    @FXML
    private TableColumn<Etat, Integer> etatidColumn;

    @FXML
    private TableColumn<Etat, String> nazwaEtatuColumn;

    @FXML
    private TableColumn<Etat, Float> stawkaColumn;

    @FXML
    private TextField idEtatuTxtfield;

    @FXML
    private TextField poleEtatTxtfield;

    @FXML
    private TextField nowaWartoscEtatTxtfield;

    @FXML
    private Button szukajEtat;

    @FXML
    private Button aktualizujEtat;

    @FXML
    private Button pokazEtat;

    @FXML
    private Button usunEtat;

    @FXML
    private TableView produktTable;

    @FXML
    private TableColumn<Produkt, Integer> produktidColumn;

    @FXML
    private TableColumn<Produkt, String> nazwaProduktuColumn;

    @FXML
    private TableColumn<Produkt, Float> cenaColumn;

    @FXML
    private TableColumn<Produkt, String> producentColumn;

    @FXML
    private TextField produktidTxtfield;

    @FXML
    private TextField poleProduktTxtfield;

    @FXML
    private TextField nowaWartoscProduktTxtfield;

    @FXML
    private Button szukajProdukt;

    @FXML
    private Button aktualizujProdukt;

    @FXML
    private Button pokazProdukt;

    @FXML
    private Button usunProdukt;

    @FXML
    private TextField nazwaProduktTxtfield;

    @FXML
    private TextField cenProduktuTxtfield;

    @FXML
    private TextField producentTxtfield;

    @FXML
    private Button dodajProdukt;

    @FXML
    private Button produktChart;

    @FXML
    private TableView rowerTable;

    @FXML
    private TableColumn<Rower, Integer> roweridColumn;

    @FXML
    private TableColumn<Rower, String> typRoweruColumn;

    @FXML
    private TableColumn<Rower, String> markaRoweruColumn;

    @FXML
    private TableColumn<Rower, String> kolorRoweruColumn;

    @FXML
    private TableColumn<Rower, String> rodzajUsterkiColumn;

    @FXML
    private TableView klientTable;

    @FXML
    private TableColumn<Klient, Integer> klientIdColumn;

    @FXML
    private TableColumn<Klient, String> imieColumn;

    @FXML
    private TableColumn<Klient, String> nazwiskoColumn;

    @FXML
    private TableColumn<Klient, Integer> nrTelefonuColumn;

    @FXML
    private TableColumn<Klient, String> mailColumn;

    @FXML
    private TableColumn<Klient, Integer> rowerIdColumn;

    @FXML
    private TextField id_klient;

    @FXML
    private TextField poleKlientTxtfield;

    @FXML
    private TextField nowaWartoscKlientTxtfield;

    @FXML
    private Button szukajKlient;

    @FXML
    private Button aktualizujKlient;

    @FXML
    private Button pokazKlient;

    @FXML
    private Button usunKlient;

    @FXML
    private TextField roweridTxtfield;

    @FXML
    private TextField poleRowerTxtfield;

    @FXML
    private TextField nowaWartoscRowerTxtfield;

    @FXML
    private Button szukajRower;

    @FXML
    private Button pokazRower;

    @FXML
    private Button usunRower;

    @FXML
    private TableView serwisTable;

    @FXML
    private TableColumn<Serwis, String> nazwaSerwisColumn;

    @FXML
    private TableColumn<Serwis, Float> cenaSerwisuColumn;

    @FXML
    private TextField nazwaSerwisuTxtfield;

    @FXML
    private TextField poleSerwisTxtfield;

    @FXML
    private TextField nowaWartoscSerwisTxtfield;

    @FXML
    private Button szukajSerwis;

    @FXML
    private Button aktualizujSerwis;

    @FXML
    private Button pokazSerwis;

    @FXML
    private Button usunSerwis;

    @FXML
    private TextField dodajNazweUslugiTxtfield;

    @FXML
    private TextField cenaSerwisTxtfield;

    @FXML
    private Button DodajSerwis;

    @FXML
    private Button serwisChart;

    @FXML
    private TableView uslugaZrealizowanaTable;

    @FXML
    private TableColumn<UslugaZrealizowana, Integer> uzUslugaIdColumn;

    @FXML
    private TableColumn<UslugaZrealizowana, Integer> uzPracownikIdColumn;

    @FXML
    private TableColumn<UslugaZrealizowana, Integer> uzKlientIdColumn;

    @FXML
    private TableColumn<UslugaZrealizowana, Integer> uzRowerIdColumn;

    @FXML
    private TableColumn<UslugaZrealizowana, Integer> uzProduktIdColumn;

    @FXML
    private TableColumn<UslugaZrealizowana, Date> uzPrzyjecieColumn;

    @FXML
    private TableColumn<UslugaZrealizowana, Date> uzRozpoczecieColumn;

    @FXML
    private TableColumn<UslugaZrealizowana, Date> uzZakonczenieColumn;

    @FXML
    private TableColumn<UslugaZrealizowana, Float> uzCenaColumn;

    @FXML
    private TableColumn<UslugaZrealizowana, String> uzStanColumn;

    @FXML
    private TextField id_uslugaZrealizowana;

    @FXML
    private TextField pole;

    @FXML
    private Button szukajUslugaZrealizowana;

    @FXML
    private Button aktualizujUslugaZrealizowana;

    @FXML
    private Button pokazUslugaZrealizowana;

    @FXML
    private Button usunUslugaZrealizowana;

    @FXML
    private Button wyczyscUslugaZrealizowana;

    @FXML
    private Button policzDochodZDnia;

    @FXML
    private Button policzProdukty;

    @FXML
    private Button policzSerwisy;

    @FXML
    private TextField dataTxtfield;

    @FXML
    private Label dochodWynik;

    @FXML
    private Label produktyWynik;

    @FXML
    private Label uslugiWynik;

    @FXML
    private Button przelogujBtn;


    /**
     * Metoda inicjalizujaca zadania dla roznych obiektow i zmiennych.
     */
    public void initialize() {
        pracownikidColumn.setCellValueFactory(cellData -> cellData.getValue().pracownik_idProperty().asObject());
        imiePracownikaColumn.setCellValueFactory(cellData -> cellData.getValue().imie_pracownikaProperty());
        nazwiskoPracownikaColumn.setCellValueFactory(cellData -> cellData.getValue().nazwisko_pracownikaProperty());
        dataZatrudnieniaColumn.setCellValueFactory((cellData -> cellData.getValue().data_zatrudnieniaProperty()));
        etatidPracownikColumn.setCellValueFactory(cellData -> cellData.getValue().etat_idProperty().asObject());

        etatidColumn.setCellValueFactory(cellData -> cellData.getValue().etat_idProperty().asObject());
        nazwaEtatuColumn.setCellValueFactory(cellData -> cellData.getValue().nazwa_etatuProperty());
        stawkaColumn.setCellValueFactory(cellData -> cellData.getValue().stawkaProperty().asObject());


        produktidColumn.setCellValueFactory(cellData -> cellData.getValue().produkt_idProperty().asObject());
        nazwaProduktuColumn.setCellValueFactory(cellData -> cellData.getValue().nazwa_produktuProperty());
        cenaColumn.setCellValueFactory(cellData -> cellData.getValue().cenaProperty().asObject());
        producentColumn.setCellValueFactory(cellData -> cellData.getValue().producentProperty());


        klientIdColumn.setCellValueFactory(cellData -> cellData.getValue().klient_idProperty().asObject());
        imieColumn.setCellValueFactory(cellData -> cellData.getValue().imie_klientaProperty());
        nazwiskoColumn.setCellValueFactory(cellData -> cellData.getValue().nazwisko_klientaProperty());
        nrTelefonuColumn.setCellValueFactory(cellData -> cellData.getValue().nr_telefonyProperty().asObject());
        mailColumn.setCellValueFactory(cellData -> cellData.getValue().mailProperty());
        rowerIdColumn.setCellValueFactory(cellData -> cellData.getValue().rower_idProperty().asObject());


        roweridColumn.setCellValueFactory(cellData -> cellData.getValue().rower_idProperty().asObject());
        typRoweruColumn.setCellValueFactory(cellData -> cellData.getValue().typ_roweruProperty());
        markaRoweruColumn.setCellValueFactory(cellData -> cellData.getValue().marka_roweruProperty());
        kolorRoweruColumn.setCellValueFactory(cellData -> cellData.getValue().kolor_roweruProperty());
        rodzajUsterkiColumn.setCellValueFactory(cellData -> cellData.getValue().rodzaj_serwisuProperty());


        nazwaSerwisColumn.setCellValueFactory(cellData -> cellData.getValue().rodzaj_serwisuProperty());
        cenaSerwisuColumn.setCellValueFactory(cellData -> cellData.getValue().cena_serwisuProperty().asObject());


        uzUslugaIdColumn.setCellValueFactory(cellData -> cellData.getValue().zusluga_idProperty().asObject());
        uzPracownikIdColumn.setCellValueFactory(cellData -> cellData.getValue().zpracownik_idProperty().asObject());
        uzKlientIdColumn.setCellValueFactory(cellData -> cellData.getValue().zklient_idProperty().asObject());
        uzRowerIdColumn.setCellValueFactory(cellData -> cellData.getValue().zrower_idProperty().asObject());
        uzProduktIdColumn.setCellValueFactory(cellData -> cellData.getValue().zprodukt_idProperty().asObject());
        uzPrzyjecieColumn.setCellValueFactory(cellData -> cellData.getValue().zdata_przyjecia_zleceniaProperty());
        uzRozpoczecieColumn.setCellValueFactory(cellData -> cellData.getValue().zdata_rozpoczecia_zleceniaProperty());
        uzZakonczenieColumn.setCellValueFactory(cellData -> cellData.getValue().zdata_zakonczenia_zleceniaProperty());
        uzCenaColumn.setCellValueFactory(cellData -> cellData.getValue().zcenaProperty().asObject());
        uzStanColumn.setCellValueFactory(cellData -> cellData.getValue().zstan_realizacjiProperty());


        try {
            operations.addToChoiceBox(etatChoicebox, wprowadzaneEtatyValues, "nazwa_etatu", "Etat");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    @FXML
    void aktualizujEtatAction(ActionEvent event) throws SQLException {
        operations.updateValue(String.valueOf(idEtatuTxtfield.getText()), String.valueOf(nowaWartoscEtatTxtfield.getText()),
                "etat_id", String.valueOf(poleEtatTxtfield.getText()), "Etat");
    }

    @FXML
    void aktualizujPracownikaAction(ActionEvent event) throws SQLException {

        operations.updateValue(String.valueOf(idPracownikaTxtfield.getText()), String.valueOf(nowaWartoscPracownikTxtfield.getText()),
                "pracownik_id", String.valueOf(polePracownikTxtfield.getText()), "Pracownik");
    }

    @FXML
    void aktualizujProduktAction(ActionEvent event) throws SQLException {

        operations.updateValue(String.valueOf(produktidTxtfield.getText()), String.valueOf(nowaWartoscProduktTxtfield.getText()),
                "produkt_id", String.valueOf(poleProduktTxtfield.getText()), "Produkt");

    }

    @FXML
    void aktualizujKlientAction(ActionEvent event) throws SQLException {
        operations.updateValue(String.valueOf(id_klient.getText()), String.valueOf(nowaWartoscKlientTxtfield.getText()), "klient_id", String.valueOf(poleKlientTxtfield.getText()), "Klient");
    }


    @FXML
    void aktualizujSerwisAction(ActionEvent event) throws SQLException {
        operations.updateValue(String.valueOf(nazwaSerwisuTxtfield.getText()), String.valueOf(nowaWartoscSerwisTxtfield.getText()), "rodzaj_serwisu", String.valueOf(poleSerwisTxtfield.getText()), "Serwis");

    }


    @FXML
    void dodajPracownikaAction(ActionEvent event) throws SQLException {
        String choice = etatChoicebox.getValue();
        operations.insertValueForWprowadzanyEtat(choice);
        operations.insertValuesForPracownik(String.valueOf(imiePracownikaTxtfield.getText()), String.valueOf(nazwiskoPracownikaTxtfield.getText()));

    }

    @FXML
    void dodajProduktAction(ActionEvent event) throws SQLException {

        operations.insertValuesForNowyProdukt(String.valueOf(nazwaProduktTxtfield.getText()), Float.valueOf(cenProduktuTxtfield.getText()), String.valueOf(producentTxtfield.getText()));


    }

    @FXML
    void dodajSerwisAction(ActionEvent event) throws SQLException {
        operations.insertValuesForSerwis(String.valueOf(dodajNazweUslugiTxtfield.getText()), Float.valueOf(cenaSerwisTxtfield.getText()));

    }


    @FXML
    void pokazEtatAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        ObservableList etatObservableList = operations.searchAll("Etat", "Etat");

        populateValues(etatTable, etatObservableList);
    }

    @FXML
    void pokazPracownikaAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        ObservableList pracownikObservableList = operations.searchAll("Pracownik", "Pracownik");

        populateValues(pracownikTable, pracownikObservableList);

    }


    @FXML
    void pokazProduktAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        ObservableList produktObservableList = operations.searchAll("Produkt", "Produkt");

        populateValues(produktTable, produktObservableList);
    }


    @FXML
    void pokazKlientAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        ObservableList klientObservableList = operations.searchAll("Klient", "Klient");

        populateValues(klientTable, klientObservableList);

    }

    @FXML
    void pokazRowerAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        ObservableList rowerObservableList = operations.searchAll("Rower", "Rower");

        populateValues(rowerTable, rowerObservableList);

    }


    @FXML
    void pokazSerwisAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        ObservableList serwisObservableList = operations.searchAll("Serwis", "Serwis");

        populateValues(serwisTable, serwisObservableList);

    }

    @FXML
    void pokazUslugaZrealizowanaAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        ObservableList uslugaObservableList = operations.searchAll("Usluga_zrealizowana", "Usluga_zrealizowana");

        populateValues(uslugaZrealizowanaTable, uslugaObservableList);

    }


    @FXML
    void szukajEtatAction(ActionEvent event) throws SQLException, ClassNotFoundException {

        Etat etat = (Etat) operations.search(String.valueOf(idEtatuTxtfield.getText()), "Etat", "etat_id", "Etat");


        populateValue(etatTable, (Etat) etat, "Etat");

    }

    @FXML
    void szukajPracownikaAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        Pracownik pracownik = (Pracownik) operations.search(String.valueOf(idPracownikaTxtfield.getText()), "Pracownik", "pracownik_id", "Pracownik");


        populateValue(pracownikTable, (Pracownik) pracownik, "Pracownik");

    }

    @FXML
    void szukajProduktAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        Produkt produkt = (Produkt) operations.search(String.valueOf(produktidTxtfield.getText()), "Produkt", "produkt_id", "Produkt");


        populateValue(produktTable, (Produkt) produkt, "Produkt");

    }

    @FXML
    void szukajKlientAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        Klient klient = (Klient) operations.search(String.valueOf(id_klient.getText()), "Klient", "klient_id", "Klient");


        populateValue(klientTable, (Klient) klient, "Klient");


    }

    @FXML
    void szukajRowerAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        Rower rower = (Rower) operations.search(String.valueOf(roweridTxtfield.getText()), "Rower", "rower_id", "Rower");


        populateValue(rowerTable, (Rower) rower, "Rower");


    }

    @FXML
    void szukajSerwisAction(ActionEvent event) throws SQLException, ClassNotFoundException {

        System.out.println(String.valueOf(nazwaSerwisuTxtfield.getText()));
        Serwis serwis = (Serwis) operations.search(nazwaSerwisuTxtfield.getText(), "Serwis", "rodzaj_serwisu", "Serwis");


        populateValue(serwisTable, (Serwis) serwis, "Serwis");

    }

    @FXML
    void szukajUslugaZrealizowanaAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        UslugaZrealizowana usluga = (UslugaZrealizowana) operations.search(String.valueOf(id_uslugaZrealizowana.getText()), "Usluga_zrealizowana", "usluga_id", "Usluga_zrealizowana");


        populateValue(uslugaZrealizowanaTable, (UslugaZrealizowana) usluga, "Usluga_zrealizowana");

    }


    @FXML
    void usunEtatAction(ActionEvent event) throws SQLException {
        operations.deleteValue(String.valueOf(idEtatuTxtfield.getText()), "etat_id", "Etat");
    }

    @FXML
    void usunPracownikaAction(ActionEvent event) throws SQLException {
        operations.deleteValue(String.valueOf(idPracownikaTxtfield.getText()), "pracownik_id", "Pracownik");
    }


    @FXML
    void usunProduktAction(ActionEvent event) throws SQLException {
        operations.deleteValue(String.valueOf(produktidTxtfield.getText()), "produkt_id", "Produkt");

    }

    @FXML
    void usunKlientAction(ActionEvent event) throws SQLException {
        operations.deleteValue(String.valueOf(id_klient.getText()), "klient_id", "Klient");

    }

    @FXML
    void usunRowerAction(ActionEvent event) throws SQLException {
        operations.deleteValue(String.valueOf(roweridTxtfield.getText()), "rower_id", "Rower");


    }

    @FXML
    void usunSerwisAction(ActionEvent event) throws SQLException {
        operations.deleteValue(String.valueOf(nazwaSerwisuTxtfield.getText()), "rodzaj_serwisu", "Serwis");


    }


    @FXML
    void usunUslugaZrealizowanaAction(ActionEvent event) throws SQLException {
        operations.deleteValue(String.valueOf(id_uslugaZrealizowana.getText()), "usluga_id", "Usluga_zrealizowana");


    }


    @FXML
    void wyczyscUslugaZrealizowanaAction(ActionEvent event) throws SQLException {

        operations.wyczyscUslugiZrealizowane();

    }


    /**
     * Metoda umozliwiajaca wyswietlenie wszystkich danych z wybranej tabeli bazy danych w Obiekcie typu TableView.
     *
     * @param tableView
     * @param value
     * @param objectName
     */
    private void populateValue(TableView tableView, Object value, String objectName) {
        if (objectName.equals("Usluga")) {
            ObservableList<Usluga> observableList = FXCollections.observableArrayList();
            observableList.add((Usluga) value);
            tableView.setItems(observableList);
        }

        if (objectName.equals("Usluga_w_realizacji")) {
            ObservableList<UslugWRealizacji> observableList = FXCollections.observableArrayList();
            observableList.add((UslugWRealizacji) value);
            tableView.setItems(observableList);
        }
        if (objectName.equals("Usluga_zrealizowana")) {
            ObservableList<UslugaZrealizowana> observableList = FXCollections.observableArrayList();
            observableList.add((UslugaZrealizowana) value);
            tableView.setItems(observableList);
        }

        if (objectName.equals("Klient")) {
            ObservableList<Klient> observableList = FXCollections.observableArrayList();
            observableList.add((Klient) value);
            tableView.setItems(observableList);

        }
        if (objectName.equals("Produkt")) {
            ObservableList<Produkt> observableList = FXCollections.observableArrayList();
            observableList.add((Produkt) value);
            tableView.setItems(observableList);
        }

        if (objectName.equals("Pracownik")) {
            ObservableList<Pracownik> observableList = FXCollections.observableArrayList();
            observableList.add((Pracownik) value);
            tableView.setItems(observableList);
        }

        if (objectName.equals("Etat")) {
            ObservableList<Etat> observableList = FXCollections.observableArrayList();
            observableList.add((Etat) value);
            tableView.setItems(observableList);
        }

        if (objectName.equals("Rower")) {
            ObservableList<Rower> observableList = FXCollections.observableArrayList();
            observableList.add((Rower) value);
            tableView.setItems(observableList);
        }

        if (objectName.equals("Serwis")) {
            ObservableList<Serwis> observableList = FXCollections.observableArrayList();
            observableList.add((Serwis) value);
            tableView.setItems(observableList);
        }
    }


    /**
     * Metoda umozliwiajaca wyswietlenie konkretnego wiersza z wybranej tabeli bazy danych w Obiekcie typu TableView.
     *
     * @param tableView
     * @param observableList
     */
    private void populateValues(TableView tableView, ObservableList<Object> observableList) {
        tableView.setItems(observableList);
    }


    @FXML
    public void policzDochódZDniaAction(ActionEvent event) {
        dochodWynik.setText(String.valueOf(operations.policzDochod(String.valueOf(dataTxtfield.getText()))) + " zł");
    }

    @FXML
    void policzProduktyAction(ActionEvent event) throws SQLException {


        produktyWynik.setText(String.valueOf(operations.policzIlosc("produkt_id")));


    }

    @FXML
    void policzSerwisyAction(ActionEvent event) throws SQLException {
        uslugiWynik.setText(String.valueOf(operations.policzIlosc("data_zakonczenia_zlecenia")));

    }

    /**
     * Umozliwia powrot do ekranu logowania.
     *
     * @param event
     * @throws IOException
     */
    @FXML
    void przeloguj(ActionEvent event) throws IOException {
        Parent sprzedawca_stage = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Stage app_stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setTitle("Login window");
        Scene scene = new Scene(sprzedawca_stage, 1000, 600);
        app_stage.setScene(scene);
        scene.getStylesheets().add
                (getClass().getResource("style.css").toExternalForm());
        app_stage.setResizable(false);
        app_stage.show();
    }


}
