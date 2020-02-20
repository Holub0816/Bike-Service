package sample;

import javafx.beans.property.*;

import java.sql.Date;

/**
 * Klasa przechwujaca informacje o obiekcie typu UslugaZrealizowana.
 * author Maciej Holub, holubmaciek@gmail.com
 */

public class UslugaZrealizowana {

    private IntegerProperty zusluga_id;
    private IntegerProperty zpracownik_id;
    private IntegerProperty zklient_id;
    private IntegerProperty zrower_id;
    private IntegerProperty zprodukt_id;
    private SimpleObjectProperty<Date> zdata_przyjecia_zlecenia;
    private SimpleObjectProperty<Date> zdata_rozpoczecia_zlecenia;
    private SimpleObjectProperty<Date> zdata_zakonczenia_zlecenia;
    private FloatProperty zcena;
    private StringProperty zstan_realizacji;


    public UslugaZrealizowana() {
        this.zusluga_id = new SimpleIntegerProperty();
        this.zpracownik_id = new SimpleIntegerProperty();
        this.zklient_id = new SimpleIntegerProperty();
        this.zrower_id = new SimpleIntegerProperty();
        this.zprodukt_id = new SimpleIntegerProperty();
        this.zdata_przyjecia_zlecenia = new SimpleObjectProperty<Date>();
        this.zdata_rozpoczecia_zlecenia = new SimpleObjectProperty<Date>();
        this.zdata_zakonczenia_zlecenia = new SimpleObjectProperty<Date>();
        this.zcena = new SimpleFloatProperty();
        this.zstan_realizacji = new SimpleStringProperty();
    }


    public int getzUsluga_id() {
        return zusluga_id.get();
    }

    public int getzPracownik_id() {
        return zpracownik_id.get();
    }

    public int getzKlient_id() {
        return zklient_id.get();
    }

    public int getzRower_id() {
        return zrower_id.get();
    }

    public int getzProdukt_id() {
        return zprodukt_id.get();
    }

    public Object getzData_rozpoczecia_zlecenia() {
        return zdata_rozpoczecia_zlecenia.get();
    }

    public Object getzData_przyjecia_zlecenia() {
        return zdata_przyjecia_zlecenia.get();
    }

    public Object getzData_zakonczenia_zlecenia() {
        return zdata_zakonczenia_zlecenia.get();
    }

    public float getzCena() {
        return zcena.get();
    }

    public String getzStan_realizacji() {
        return zstan_realizacji.get();
    }


    public void setzUsluga_id(int zusluga_id) {
        this.zusluga_id.set(zusluga_id);

    }

    public void setzPracownik_id(int zpracownik_id) {
        this.zpracownik_id.set(zpracownik_id);
    }

    public void setzKlient_id(int zklient_id) {
        this.zklient_id.set(zklient_id);
    }

    public void setzRower_id(int zrower_id) {
        this.zrower_id.set(zrower_id);
    }

    public void setzProdukt_id(int zprodukt_id) {
        this.zprodukt_id.set(zprodukt_id);
    }

    public void setzData_rozpoczecia_zlecenia(Date zdata_rozpoczecia_zlecenia) {
        this.zdata_rozpoczecia_zlecenia.set(zdata_rozpoczecia_zlecenia);
    }

    public void setzData_przyjecia_zlecenia(Date zdata_przyjecia_zlecenia) {
        this.zdata_przyjecia_zlecenia.set(zdata_przyjecia_zlecenia);
    }

    public void setzData_zakonczenia_zlecenia(Date zdata_zakonczenia_zlecenia) {
        this.zdata_zakonczenia_zlecenia.set(zdata_zakonczenia_zlecenia);
    }

    public void setzCena(float zcena) {
        this.zcena.set(zcena);
    }

    public void setzStan_realizacji(String zstan_realizacji) {
        this.zstan_realizacji.set(zstan_realizacji);
    }


    public IntegerProperty zusluga_idProperty() {
        return zusluga_id;
    }

    public IntegerProperty zpracownik_idProperty() {
        return zpracownik_id;
    }

    public IntegerProperty zklient_idProperty() {
        return zklient_id;
    }

    public IntegerProperty zrower_idProperty() {
        return zrower_id;
    }

    public IntegerProperty zprodukt_idProperty() {
        return zprodukt_id;
    }

    public SimpleObjectProperty<Date> zdata_przyjecia_zleceniaProperty() {
        return zdata_przyjecia_zlecenia;
    }

    public SimpleObjectProperty<Date> zdata_rozpoczecia_zleceniaProperty() {
        return zdata_rozpoczecia_zlecenia;
    }

    public SimpleObjectProperty<Date> zdata_zakonczenia_zleceniaProperty() {
        return zdata_zakonczenia_zlecenia;
    }

    public FloatProperty zcenaProperty() {
        return zcena;
    }

    public StringProperty zstan_realizacjiProperty() {
        return zstan_realizacji;
    }

}
