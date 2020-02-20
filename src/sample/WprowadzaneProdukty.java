package sample;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Klasa przechwujaca informacje o obiekcie typu WprowadzaneProdukty.
 * @author Maciej Holub, holubmaciek@gmail.com
 */

public class WprowadzaneProdukty {

    private StringProperty nazwa_produktu;
    private IntegerProperty id_wprowadzanego_produktu;

    public WprowadzaneProdukty() {
        this.nazwa_produktu = new SimpleStringProperty();
        this.id_wprowadzanego_produktu = new SimpleIntegerProperty();
    }

    public String getNazwa_produktu() {
        return nazwa_produktu.get();
    }

    public Integer getId_wprowadzanego_produktu() {
        return id_wprowadzanego_produktu.get();
    }

    public void setNazwa_produktu(String nazwa_produktu) {
        this.nazwa_produktu.set(nazwa_produktu);
    }

    public void setId_wprowadzanego_produktu(int id_wprowadzanego_produktu) {
        this.id_wprowadzanego_produktu.set(id_wprowadzanego_produktu);
    }

    public StringProperty nazwa_produktuProperty() {
        return nazwa_produktu;
    }

    public IntegerProperty id_wprowadzanego_produktuProperty() {
        return id_wprowadzanego_produktu;
    }
}
