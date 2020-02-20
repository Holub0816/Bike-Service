package sample;

import javafx.beans.property.*;

import java.sql.Date;

/**
 * Klasa przechwujaca informacje o obiekcie typu UslugaWRealizacji.
 * @author Maciej Holub, holubmaciek@gmail.com
 */

public class UslugWRealizacji {

    private IntegerProperty rusluga_id;
    private IntegerProperty rpracownik_id;
    private IntegerProperty rklient_id;
    private IntegerProperty rrower_id;
    private IntegerProperty rprodukt_id;
    private SimpleObjectProperty<Date> rdata_przyjecia_zlecenia;
    private SimpleObjectProperty<Date> rdata_rozpoczecia_zlecenia;
    private SimpleObjectProperty<Date> rdata_zakonczenia_zlecenia;
    private FloatProperty rcena;
    private StringProperty rstan_realizacji;


    public UslugWRealizacji() {
        this.rusluga_id = new SimpleIntegerProperty();
        this.rpracownik_id = new SimpleIntegerProperty();
        this.rklient_id = new SimpleIntegerProperty();
        this.rrower_id = new SimpleIntegerProperty();
        this.rprodukt_id = new SimpleIntegerProperty();
        this.rdata_przyjecia_zlecenia = new SimpleObjectProperty<Date>();
        this.rdata_rozpoczecia_zlecenia = new SimpleObjectProperty<Date>();
        this.rdata_zakonczenia_zlecenia = new SimpleObjectProperty<Date>();
        this.rcena = new SimpleFloatProperty();
        this.rstan_realizacji = new SimpleStringProperty();
    }


    public int getrUsluga_id() {
        return rusluga_id.get();
    }

    public int getrPracownik_id() {
        return rpracownik_id.get();
    }

    public int getrKlient_id() {
        return rklient_id.get();
    }

    public int getrRower_id() {
        return rrower_id.get();
    }

    public int getrProdukt_id() {
        return rprodukt_id.get();
    }

    public Object getrData_rozpoczecia_zlecenia() {
        return rdata_rozpoczecia_zlecenia.get();
    }

    public Object getrData_przyjecia_zlecenia() {
        return rdata_przyjecia_zlecenia.get();
    }

    public Object getrData_zakonczenia_zlecenia() {
        return rdata_zakonczenia_zlecenia.get();
    }

    public float getrCena() {
        return rcena.get();
    }

    public String getrStan_realizacji() {
        return rstan_realizacji.get();
    }


    public void setrUsluga_id(int rusluga_id) {
        this.rusluga_id.set(rusluga_id);

    }

    public void setrPracownik_id(int rpracownik_id) {
        this.rpracownik_id.set(rpracownik_id);
    }

    public void setrKlient_id(int rklient_id) {
        this.rklient_id.set(rklient_id);
    }

    public void setrRower_id(int rrower_id) {
        this.rrower_id.set(rrower_id);
    }

    public void setrProdukt_id(int rprodukt_id) {
        this.rprodukt_id.set(rprodukt_id);
    }

    public void setrData_rozpoczecia_zlecenia(Date rdata_rozpoczecia_zlecenia) {
        this.rdata_rozpoczecia_zlecenia.set(rdata_rozpoczecia_zlecenia);
    }

    public void setrData_przyjecia_zlecenia(Date rdata_przyjecia_zlecenia) {
        this.rdata_przyjecia_zlecenia.set(rdata_przyjecia_zlecenia);
    }

    public void setrData_zakonczenia_zlecenia(Date rdata_zakonczenia_zlecenia) {
        this.rdata_zakonczenia_zlecenia.set(rdata_zakonczenia_zlecenia);
    }

    public void setrCena(float rcena) {
        this.rcena.set(rcena);
    }

    public void setrStan_realizacji(String rstan_realizacji) {
        this.rstan_realizacji.set(rstan_realizacji);
    }


    public IntegerProperty rusluga_idProperty() {
        return rusluga_id;
    }

    public IntegerProperty rpracownik_idProperty() {
        return rpracownik_id;
    }

    public IntegerProperty rklient_idProperty() {
        return rklient_id;
    }

    public IntegerProperty rrower_idProperty() {
        return rrower_id;
    }

    public IntegerProperty rprodukt_idProperty() {
        return rprodukt_id;
    }

    public SimpleObjectProperty<Date> rdata_przyjecia_zleceniaProperty() {
        return rdata_przyjecia_zlecenia;
    }

    public SimpleObjectProperty<Date> rdata_rozpoczecia_zleceniaProperty() {
        return rdata_rozpoczecia_zlecenia;
    }

    public SimpleObjectProperty<Date> rdata_zakonczenia_zleceniaProperty() {
        return rdata_zakonczenia_zlecenia;
    }

    public FloatProperty rcenaProperty() {
        return rcena;
    }

    public StringProperty rstan_realizacjiProperty() {
        return rstan_realizacji;
    }

}
