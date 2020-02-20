package sample;

import javafx.beans.property.*;

/**
 * Klasa przechwujaca informacje o obiekcie typu Produkt.
 * @author Maciej Hołub, holubmaciek@gmail.com
 */

public class Produkt {

    private IntegerProperty produkt_id;
    private StringProperty nazwa_produktu;
    private FloatProperty cena;
    private StringProperty producent;

    public Produkt() {
        this.produkt_id = new SimpleIntegerProperty();
        this.nazwa_produktu = new SimpleStringProperty();
        this.cena = new SimpleFloatProperty();
        this.producent = new SimpleStringProperty();
    }

    public int getProdukt_id() {
        return produkt_id.get();
    }

    public String getNazwa_produktu() {
        return nazwa_produktu.get();
    }

    public float getCena() {
        return cena.get();
    }

    public String getProducent() {
        return producent.get();
    }


    public void setProdukt_id(int produkt_id) {
        this.produkt_id.set(produkt_id);
    }

    public void setNazwa_produktu(String nazwa_produktu) {
        this.nazwa_produktu.set(nazwa_produktu);
    }

    public void setCena(float cena) {
        this.cena.set(cena);
    }

    public void setProducent(String producent) {
        this.producent.set(producent);
    }

    public IntegerProperty produkt_idProperty() {
        return produkt_id;
    }

    public StringProperty nazwa_produktuProperty() {
        return nazwa_produktu;
    }

    public FloatProperty cenaProperty() {
        return cena;
    }

    public StringProperty producentProperty() {
        return producent;
    }
}
