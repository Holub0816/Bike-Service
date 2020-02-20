package sample;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Klasa przechwujaca informacje o obiekcie typu Klient.
 * @author Maciej Hołub, holubmaciek@gmail.com
 */

public class Klient {

    private IntegerProperty klient_id;
    private StringProperty imie_klienta;
    private StringProperty nazwisko_klienta;
    private IntegerProperty nr_telefonu;
    private StringProperty mail;
    private IntegerProperty rower_id;


    public Klient() {
        this.klient_id = new SimpleIntegerProperty();
        this.imie_klienta = new SimpleStringProperty();
        this.nazwisko_klienta = new SimpleStringProperty();
        this.nr_telefonu = new SimpleIntegerProperty();
        this.rower_id = new SimpleIntegerProperty();
        this.mail = new SimpleStringProperty();
    }


    public int getRower_id() {
        return rower_id.get();
    }

    public int getKlient_id() {
        return klient_id.get();
    }

    public String getImie_klienta() {
        return imie_klienta.get();
    }

    public String getNazwisko_klienta() {
        return nazwisko_klienta.get();
    }

    public Integer getNr_telefonu() {
        return nr_telefonu.get();
    }

    public String getMail() {
        return mail.get();
    }

    public void setImie_klienta(String imie_klienta) {
        this.imie_klienta.set(imie_klienta);
    }

    public void setNazwisko_klienta(String nazwisko_klienta) {
        this.nazwisko_klienta.set(nazwisko_klienta);
    }

    public void setNr_telefonu(int nr_telefonu) {
        this.nr_telefonu.set(nr_telefonu);
    }

    public void setMail(String mail) {
        this.mail.set(mail);
    }

    public void setKlient_id(int klient_id) {
        this.klient_id.set(klient_id);
    }

    public void setRower_id(int rower_id) {
        this.rower_id.set(rower_id);
    }


    public IntegerProperty rower_idProperty() {
        return rower_id;
    }

    public IntegerProperty klient_idProperty() {
        return klient_id;
    }

    public StringProperty imie_klientaProperty() {
        return imie_klienta;
    }

    public StringProperty nazwisko_klientaProperty() {
        return nazwisko_klienta;
    }

    public IntegerProperty nr_telefonyProperty() {
        return nr_telefonu;
    }

    public StringProperty mailProperty() {
        return mail;
    }


}
