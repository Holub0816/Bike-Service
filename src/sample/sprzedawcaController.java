package sample;

import javafx.beans.property.IntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Klasa, ktora umozliwia projektowanie interfejsu graficznego dla sprzedawcy.
 * @author Maciej Holub, holubmaciek@gmail.com
 */

public class sprzedawcaController {


    Operations operations = new Operations();
    ArrayList<String> rodzajSerwisuValues = new ArrayList<>();
    ArrayList<String> wprowadzaneProduktyValues = new ArrayList<>();


    @FXML
    private TextField imieTxtfield;

    @FXML
    private TextField nazwiskoTxtfield;

    @FXML
    private TextField nrTelefonuTxtfield;

    @FXML
    private TextField mailTxtfield;

    @FXML
    private TextField klient_idTxtfield;

    @FXML
    private TextField idRoweruTxtfield;

    @FXML
    private TextField typTxtfield;

    @FXML
    private TextField markaTxtfield;

    @FXML
    private TextField kolorTxtfield;

    @FXML
    private ChoiceBox<String> rodzajUsterkiChoice;

    @FXML
    private ChoiceBox<String> nazwaProduktuChoice;

    @FXML
    private Button dodajButton;

    @FXML
    private Label cenaLabel;

    @FXML
    private TableView uslugaDoRealizacjiTable;

    @FXML
    private TableColumn<Usluga, Integer> udrUslugaIdColumn;

    @FXML
    private TableColumn<Usluga, Integer> udrPracownikIdColumn;

    @FXML
    private TableColumn<Usluga, Integer> udrKlientIdColumn;

    @FXML
    private TableColumn<Usluga, Integer> udrRowerIdColumn;

    @FXML
    private TableColumn<Usluga, Integer> udrProduktIdColumn;

    @FXML
    private TableColumn<Usluga, Date> udrPrzyjecieColumn;

    @FXML
    private TableColumn<Usluga, Date> udrRozpoczecieColumn;

    @FXML
    private TableColumn<Usluga, Date> udrZakonczenieColumn;

    @FXML
    private TableColumn<Usluga, Float> udrCenaColumn;

    @FXML
    private TableColumn<Usluga, String> udrStanColumn;

    @FXML
    private TextField id_uslugaDoRealizacji;

    @FXML
    private Button szukajUslugaDoRealizacji;

    @FXML
    private Button usunUslugaDoRealizacji;

    @FXML
    private Button pokazUslugaDoRealizacji;

    @FXML
    private Button dodajUslugaDoZrealizowanych;

    @FXML
    private TableView uslugaWRealizacjiTable;

    @FXML
    private TableColumn<UslugWRealizacji, Integer> urUslugaIdColumn;

    @FXML
    private TableColumn<UslugWRealizacji, Integer> urPracownikIdColumn;

    @FXML
    private TableColumn<UslugWRealizacji, Integer> urKlientIdColumn;

    @FXML
    private TableColumn<UslugWRealizacji, Integer> urRowerIdColumn;

    @FXML
    private TableColumn<UslugWRealizacji, Integer> urProduktIdColumn;

    @FXML
    private TableColumn<UslugWRealizacji, Date> urPrzyjecieColumn;

    @FXML
    private TableColumn<UslugWRealizacji, Date> urRozpoczecieColumn;

    @FXML
    private TableColumn<UslugWRealizacji, Date> urZakonczenieColumn;

    @FXML
    private TableColumn<UslugWRealizacji, Float> urCenaColumn;

    @FXML
    private TableColumn<UslugWRealizacji, String> urStanColumn;

    @FXML
    private TextField id_uslugaWRealizacji;

    @FXML
    private Button szukajUslugaWRealizacji;

    @FXML
    private Button pokazUslugaWRealizacji;

    @FXML
    private Button usunUslugaWRealizacji;

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
    private TableColumn<UslugaZrealizowana, String> uzStanColumn;

    @FXML
    private TableColumn<UslugaZrealizowana, Float> uzCenaColumn;

    @FXML
    private TextField id_uslugaZrealizowana;

    @FXML
    private Button szukajUslugaZrealizowana;

    @FXML
    private Button pokazUslugaZrealizowana;

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
    private TextField nazwiskoKlient;

    @FXML
    private Button szukajKlient;

    @FXML
    private Button pokazKlient;

    @FXML
    private Button aktualizujKlient;

    @FXML
    private Tab nazwaProdukt;

    @FXML
    private TableView produktTable;

    @FXML
    private TableColumn<Produkt, Integer> produktIdColumn;

    @FXML
    private TableColumn<Produkt, String> nazwaProduktuColumn;

    @FXML
    private TableColumn<Produkt, Float> cenaProduktuColumn;

    @FXML
    private TableColumn<Produkt, String> producentColumn;

    @FXML
    private TextField id_produkt;

    @FXML
    private Button szukajProdukt;

    @FXML
    private Button pokazProdukt;

    @FXML
    private Button aktualizujProdukt;

    @FXML
    private Button dodajProdukt;

    @FXML
    private Button usunProdukt;

    @FXML
    private Button dodajRowerButton;

    @FXML
    private Button dodajProduktButton;

    @FXML
    private TextField poleKlientTxtfield;

    @FXML
    private TextField nowaWartoscKlientTxtfield;

    @FXML
    private TextField poleProduktTxtfield;

    @FXML
    private TextField wartoscProduktTxtfield;

    @FXML
    private TextField wpiszSwojeId;

    @FXML
    private Button przelogujBtn;


    /**
     *Metoda inicjalizująca zadania dla różnych obiektów i zmiennych.
     */
    public void initialize() {
        udrUslugaIdColumn.setCellValueFactory(cellData -> cellData.getValue().usluga_idProperty().asObject());   // Można by było użyć PropertyValueFactory, ja używam lambd
        // informacja, które pole konkretnego objektu powinno być użyte w kolumnie
        udrPracownikIdColumn.setCellValueFactory(cellData -> cellData.getValue().pracownik_idProperty().asObject());
        udrKlientIdColumn.setCellValueFactory(cellData -> cellData.getValue().klient_idProperty().asObject());
        udrRowerIdColumn.setCellValueFactory(cellData -> cellData.getValue().rower_idProperty().asObject());
        udrProduktIdColumn.setCellValueFactory(cellData -> cellData.getValue().produkt_idProperty().asObject());
        udrPrzyjecieColumn.setCellValueFactory(cellData -> cellData.getValue().data_przyjecia_zleceniaProperty());
        udrRozpoczecieColumn.setCellValueFactory(cellData -> cellData.getValue().data_rozpoczecia_zleceniaProperty());
        udrZakonczenieColumn.setCellValueFactory(cellData -> cellData.getValue().data_zakonczenia_zleceniaProperty());
        udrCenaColumn.setCellValueFactory(cellData -> cellData.getValue().cenaProperty().asObject());
        udrStanColumn.setCellValueFactory(cellData -> cellData.getValue().stan_realizacjiProperty());

        urUslugaIdColumn.setCellValueFactory(cellData -> cellData.getValue().rusluga_idProperty().asObject());
        urPracownikIdColumn.setCellValueFactory(cellData -> cellData.getValue().rpracownik_idProperty().asObject());
        urKlientIdColumn.setCellValueFactory(cellData -> cellData.getValue().rklient_idProperty().asObject());
        urRowerIdColumn.setCellValueFactory(cellData -> cellData.getValue().rrower_idProperty().asObject());
        urProduktIdColumn.setCellValueFactory(cellData -> cellData.getValue().rprodukt_idProperty().asObject());
        urPrzyjecieColumn.setCellValueFactory(cellData -> cellData.getValue().rdata_przyjecia_zleceniaProperty());
        urRozpoczecieColumn.setCellValueFactory(cellData -> cellData.getValue().rdata_rozpoczecia_zleceniaProperty());
        urZakonczenieColumn.setCellValueFactory(cellData -> cellData.getValue().rdata_zakonczenia_zleceniaProperty());
        urCenaColumn.setCellValueFactory(cellData -> cellData.getValue().rcenaProperty().asObject());
        urStanColumn.setCellValueFactory(cellData -> cellData.getValue().rstan_realizacjiProperty());

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

        klientIdColumn.setCellValueFactory(cellData -> cellData.getValue().klient_idProperty().asObject());
        imieColumn.setCellValueFactory(cellData -> cellData.getValue().imie_klientaProperty());
        nazwiskoColumn.setCellValueFactory(cellData -> cellData.getValue().nazwisko_klientaProperty());
        nrTelefonuColumn.setCellValueFactory(cellData -> cellData.getValue().nr_telefonyProperty().asObject());
        mailColumn.setCellValueFactory(cellData -> cellData.getValue().mailProperty());
        rowerIdColumn.setCellValueFactory(cellData -> cellData.getValue().rower_idProperty().asObject());

        produktIdColumn.setCellValueFactory(cellData -> cellData.getValue().produkt_idProperty().asObject());
        nazwaProduktuColumn.setCellValueFactory(cellData -> cellData.getValue().nazwa_produktuProperty());
        cenaProduktuColumn.setCellValueFactory(cellData -> cellData.getValue().cenaProperty().asObject());
        producentColumn.setCellValueFactory(cellData -> cellData.getValue().producentProperty());

        try {
            operations.addToChoiceBox(rodzajUsterkiChoice, rodzajSerwisuValues, "rodzaj_serwisu", "Serwis");
            operations.addToChoiceBox(nazwaProduktuChoice, wprowadzaneProduktyValues, "nazwa_produktu", "Produkt");

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * Metoda dodająca nowego klienta i zarazem nową usługę do realizacji dla tego klienta. Usuwa również tekst z pól tekstowych po lewej stronie okna.
     * @param event
     * @throws SQLException
     */
    @FXML
    void dodaj(ActionEvent event) throws SQLException {

        if (String.valueOf(idRoweruTxtfield.getText()) == "") {
            operations.insertValuesForKlient(Integer.valueOf(klient_idTxtfield.getText()), imieTxtfield.getText(), nazwiskoTxtfield.getText(), Integer.valueOf(nrTelefonuTxtfield.getText()),
                    mailTxtfield.getText(), "NULL");
            operations.dodajDoDoRealizacji(Integer.valueOf(klient_idTxtfield.getText()), "NULL",Integer.valueOf(wpiszSwojeId.getText()));
        } else {
            operations.insertValuesForKlient(Integer.valueOf(klient_idTxtfield.getText()), imieTxtfield.getText(), nazwiskoTxtfield.getText(), Integer.valueOf(nrTelefonuTxtfield.getText()),
                    mailTxtfield.getText(), String.valueOf(idRoweruTxtfield.getText()));

        }


        operations.dodajDoDoRealizacji(Integer.valueOf(klient_idTxtfield.getText()), String.valueOf(idRoweruTxtfield.getText()),Integer.valueOf(wpiszSwojeId.getText()));
        imieTxtfield.clear();
        nazwiskoTxtfield.clear();
        nrTelefonuTxtfield.clear();
        mailTxtfield.clear();
        idRoweruTxtfield.clear();
        klient_idTxtfield.clear();
        markaTxtfield.clear();
        typTxtfield.clear();
        kolorTxtfield.clear();


    }

    @FXML
    void dodajProdukt(ActionEvent event) throws SQLException {
        String choice = nazwaProduktuChoice.getValue();
        if (choice != "") {
            operations.insertValuesForWprowadzaneProdukty(choice);
        } else {
            operations.insertValuesForWprowadzaneProdukty("NULL");
        }
    }

    @FXML
    void dodajRower(ActionEvent event) throws SQLException {
        String choice = rodzajUsterkiChoice.getValue();
        operations.insertValuesForRower(Integer.valueOf(idRoweruTxtfield.getText()), typTxtfield.getText(), markaTxtfield.getText(), kolorTxtfield.getText(),
                choice);

    }


    @FXML
    void dodajUslugaDoZrealizowanychAction(ActionEvent event) throws SQLException {
        operations.dodajDozRealizowanych(Integer.valueOf(id_uslugaDoRealizacji.getText()));
        operations.usunUslugeDoRealizacji(Integer.valueOf(id_uslugaDoRealizacji.getText()));

    }

    @FXML
    void pokazUslugaDoRealizacjiAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        ObservableList uslugaObservableList = operations.searchAll("Usluga_do_realizacji", "Usluga_do_realizacji");

        populateValues(uslugaDoRealizacjiTable, uslugaObservableList);
    }

    @FXML
    void szukajUslugaDoRealizacjiAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        Usluga usluga = (Usluga) operations.search(String.valueOf(id_uslugaDoRealizacji.getText()), "Usluga_do_realizacji", "usluga_id", "Usluga_do_realizacji");


        populateValue(uslugaDoRealizacjiTable, (Usluga) usluga, "Usluga");


    }

    @FXML
    void usunUslugaDoRealizacjiAction(ActionEvent event) throws SQLException {
        operations.deleteValue(String.valueOf(id_uslugaDoRealizacji.getText()), "usluga_id", "Usluga_do_realizacji");


    }

    @FXML
    void pokazUslugaWRealizacjiAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        ObservableList uslugaObservableList = operations.searchAll("Usluga_w_realizacji", "Usluga_w_realizacji");

        populateValues(uslugaWRealizacjiTable, uslugaObservableList);
    }


    @FXML
    void szukajUslugaWRealizacjiAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        UslugWRealizacji usluga = (UslugWRealizacji) operations.search(String.valueOf(id_uslugaWRealizacji.getText()), "Usluga_w_realizacji", "usluga_id", "Usluga_w_realizacji");


        populateValue(uslugaWRealizacjiTable, (UslugWRealizacji) usluga, "Usluga_w_realizacji");

    }


    @FXML
    void usunUslugaWRealizacjiAction(ActionEvent event) throws SQLException {
        operations.deleteValue(String.valueOf(id_uslugaWRealizacji.getText()), "usluga_id", "Usluga_w_realizacji");
    }


    @FXML
    void pokazKlientAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        ObservableList klientObservableList = operations.searchAll("Klient", "Klient");

        populateValues(klientTable, klientObservableList);

    }


    @FXML
    void szukajKlientAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        Klient klient = (Klient) operations.search(String.valueOf(id_klient.getText()), "Klient", "klient_id", "Klient");


        populateValue(klientTable, (Klient) klient, "Klient");


    }


    @FXML
    void aktualizujKlientAction(ActionEvent event) throws SQLException {
        operations.updateValue(String.valueOf(klient_idTxtfield.getText()), String.valueOf(nowaWartoscKlientTxtfield.getText()), "klient_id", String.valueOf(poleKlientTxtfield.getText()), "Klient");
    }


    @FXML
    void szukajUslugaZrealizowanaAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        UslugaZrealizowana usluga = (UslugaZrealizowana) operations.search(String.valueOf(id_uslugaZrealizowana.getText()), "Usluga_zrealizowana", "usluga_id", "Usluga_zrealizowana");


        populateValue(uslugaZrealizowanaTable, (UslugaZrealizowana) usluga, "Usluga_zrealizowana");

    }


    @FXML
    void pokazUslugaZrealizowana(ActionEvent event) throws SQLException, ClassNotFoundException {
        ObservableList uslugaObservableList = operations.searchAll("Usluga_zrealizowana", "Usluga_zrealizowana");

        populateValues(uslugaZrealizowanaTable, uslugaObservableList);

    }


    @FXML
    void aktualizujProduktAction(ActionEvent event) throws SQLException {
        operations.updateValue(String.valueOf(id_produkt.getText()), String.valueOf(wartoscProduktTxtfield.getText()), "produkt_id", String.valueOf(poleProduktTxtfield.getText()), "Produkt");


    }

    @FXML
    void pokazProduktAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        ObservableList produktObservableList = operations.searchAll("Produkt", "Produkt");

        populateValues(produktTable, produktObservableList);


    }

    @FXML
    void szukajProduktAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        Produkt produkt = (Produkt) operations.search(String.valueOf(id_produkt.getText()), "Produkt", "produkt_id", "Produkt");


        populateValue(produktTable, (Produkt) produkt, "Produkt");
    }


    @FXML
    void usunProduktAction(ActionEvent event) throws SQLException {
        operations.deleteValue(String.valueOf(id_produkt.getText()), "produkt_id", "Produkt");
    }


    /**
     * Metoda umożliwiająca wyświetlenie wszystkich danych z wybranej tabeli bazy danych w Obiekcie typu TableView.
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

    }


    /**
     * Metoda umożliwiająca wyświetlenie konkretnego wiersza z wybranej tabeli bazy danych w Obiekcie typu TableView.
     * @param tableView
     * @param observableList
     */
    private void populateValues(TableView tableView, ObservableList<Object> observableList) {
        tableView.setItems(observableList);
    }
    /**
     * Umożliwia powrót do ekranu logowania.
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
