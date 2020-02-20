package sample;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

/**
 * Klasa, ktora umozliwia projektowanie interfejsu graficznego dla sprzedawcy.
 * @author Maciej Holub, holubmaciek@gmail.com
 */

public class serwisantController {

    Operations operations = new Operations();

    @FXML
    private TextField idUslugiZlecenia;

    @FXML
    private Button szukajZlecenia;

    @FXML
    private Button pokazZlecenia;

    @FXML
    private Button przyjmijZlecenia;


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
    private TextField idUslugiWRealizacji;

    @FXML
    private Button szukajWRealizacji;

    @FXML
    private Button pokazWRealizacji;

    @FXML
    private Button koniecSerwisu;

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
    private TextField idRowery;

    @FXML
    private TextField poleRoweryTxtfield;

    @FXML
    private TextField nowaWartoscRoweryTxtfield;

    @FXML
    private Button szukajRowery;

    @FXML
    private Button pokazRowery;

    @FXML
    private Button usunRowery;

    @FXML
    private Button aktualizujRowery;


    @FXML
    private TextField wpiszSwojeId;

    @FXML
    private Button przelogujBtn;

    /**
     *Metoda inicjalizujaca zadania dla roznych obiektow i zmiennych.
     */

    public void initialize() {
        udrUslugaIdColumn.setCellValueFactory(cellData -> cellData.getValue().usluga_idProperty().asObject());
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

        roweridColumn.setCellValueFactory(cellData -> cellData.getValue().rower_idProperty().asObject());
        typRoweruColumn.setCellValueFactory(cellData -> cellData.getValue().typ_roweruProperty());
        markaRoweruColumn.setCellValueFactory(cellData -> cellData.getValue().marka_roweruProperty());
        kolorRoweruColumn.setCellValueFactory(cellData -> cellData.getValue().kolor_roweruProperty());
        rodzajUsterkiColumn.setCellValueFactory(cellData -> cellData.getValue().rodzaj_serwisuProperty());


    }



    @FXML
    void aktualizujRoweryAction(ActionEvent event) throws SQLException {
        operations.updateValue(String.valueOf(idRowery.getText()), String.valueOf(nowaWartoscRoweryTxtfield.getText()), "rower_id", String.valueOf(poleRoweryTxtfield.getText()), "Rower");

    }

    @FXML
    void koniecSerwisuAction(ActionEvent event) throws SQLException {

        operations.dodajDoZrealizowanychSerwisant(Integer.valueOf(idUslugiWRealizacji.getText()));
        operations.usunUslugeWRealizacji(Integer.valueOf(idUslugiWRealizacji.getText()));

    }

    @FXML
    void pokazRoweryAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        ObservableList rowerObservableList = operations.searchAll("Rower", "Rower");

        populateValues(rowerTable, rowerObservableList);

    }

    @FXML
    void pokazWRealizacjiAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        ObservableList uslugaObservableList = operations.searchAll("Usluga_w_realizacji", "Usluga_w_realizacji");

        populateValues(uslugaWRealizacjiTable, uslugaObservableList);

    }

    @FXML
    void pokazZleceniaAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        ObservableList uslugaObservableList = operations.searchAll("Usluga_do_realizacji", "Usluga_do_realizacji");

        populateValues(uslugaDoRealizacjiTable, uslugaObservableList);

    }

    @FXML
    void przyjmijZleceniaAction(ActionEvent event) throws SQLException {
        operations.dodajDorealizowanych(Integer.valueOf(idUslugiZlecenia.getText()),Integer.valueOf(wpiszSwojeId.getText()));
        operations.usunUslugeDoRealizacji(Integer.valueOf(idUslugiZlecenia.getText()));

    }

    @FXML
    void szukajRoweryAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        Rower rower = (Rower) operations.search(String.valueOf(idRowery.getText()), "Rower", "rower_id", "Rower");


        populateValue(rowerTable, (Rower) rower, "Rower");


    }

    @FXML
    void szukajWRealizacjiAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        UslugWRealizacji usluga = (UslugWRealizacji) operations.search(String.valueOf(idUslugiZlecenia.getText()), "Usluga_w_realizacji", "usluga_id", "Usluga_w_realizacji");


        populateValue(uslugaWRealizacjiTable, (UslugWRealizacji) usluga, "Usluga_w_realizacji");

    }

    @FXML
    void szukajZleceniaAction(ActionEvent event) throws SQLException, ClassNotFoundException {

        Usluga usluga = (Usluga) operations.search(String.valueOf(idUslugiZlecenia.getText()), "Usluga_do_realizacji", "usluga_id", "Usluga_do_realizacji");


        populateValue(uslugaDoRealizacjiTable, (Usluga) usluga, "Usluga");


    }

    @FXML
    void usunRoweryAction(ActionEvent event) throws SQLException {
        operations.deleteValue(String.valueOf(idRowery.getText()), "rower_id", "Rower");


    }
    /**
     * Metoda umozliwiajaca wyswietlenie wszystkich danych z wybranej tabeli bazy danych w Obiekcie typu TableView.
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

        if (objectName.equals("Rower")) {
            ObservableList<Rower> observableList = FXCollections.observableArrayList();
            observableList.add((Rower) value);
            tableView.setItems(observableList);
        }

    }
    /**
     * Metoda umożliwiajaca wyswietlenie konkretnego wiersza z wybranej tabeli bazy danych w Obiekcie typu TableView.
     * @param tableView
     * @param observableList
     */
    private void populateValues(TableView tableView, ObservableList<Object> observableList) {
        tableView.setItems(observableList);
    }
    /**
     * Umozliwia powrot do ekranu logowania.
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
