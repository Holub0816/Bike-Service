package sample;

import javafx.beans.property.*;

import java.sql.Date;


/**
 * Klasa przechwujaca informacje o obiekcie typu Pracownik.
 * @author Maciej Hołub, holubmaciek@gmail.com
 */
public class Pracownik {

    private IntegerProperty pracownik_id;
    private StringProperty imie_pracownika;
    private StringProperty nazwisko_pracownika;
    private ObjectProperty<Date> data_zatrudnienia;
    private IntegerProperty etat_id;

    public Pracownik() {
        this.pracownik_id = new SimpleIntegerProperty();
        this.imie_pracownika = new SimpleStringProperty();
        this.nazwisko_pracownika = new SimpleStringProperty();
        this.data_zatrudnienia = new SimpleObjectProperty<>();
        this.etat_id = new SimpleIntegerProperty();

    }


    public int getPracownik_id() {
        return pracownik_id.get();
    }

    public String getImie_pracownika_id() {
        return imie_pracownika.get();
    }

    public String getNazwisko_pracownika() {
        return nazwisko_pracownika.get();
    }

    public Object getData_zatrudnienia() {
        return data_zatrudnienia.get();
    }

    public int getEtat_id() {
        return etat_id.get();
    }


    public void setPracownik_id(int pracownik_id) {
        this.pracownik_id.set(pracownik_id);
    }

    public void setImie_pracownika(String imie_pracownika) {
        this.imie_pracownika.set(imie_pracownika);
    }

    public void setNazwisko_pracownika(String nazwisko_pracownika) {
        this.nazwisko_pracownika.set(nazwisko_pracownika);
    }

    public void setData_zatrudnienia(Date data_zatrudnienia) {
        this.data_zatrudnienia.set(data_zatrudnienia);
    }

    public void setEtat_id(int etat_id) {
        this.etat_id.set(etat_id);
    }


    public IntegerProperty pracownik_idProperty() {
        return pracownik_id;
    }

    public StringProperty imie_pracownikaProperty() {
        return imie_pracownika;

    }

    public StringProperty nazwisko_pracownikaProperty() {
        return nazwisko_pracownika;
    }

    public ObjectProperty data_zatrudnieniaProperty() {
        return data_zatrudnienia;
    }

    public IntegerProperty etat_idProperty() {
        return etat_id;
    }


}


