package sample;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Klasa przechwujaca informacje o obiekcie typu Serwis.
 * author Maciej Holub, holubmaciek@gmail.com
 */

public class Serwis {

    private StringProperty rodzaj_serwisu;
    private FloatProperty cena_serwisu;

    public Serwis() {
        this.rodzaj_serwisu = new SimpleStringProperty();
        this.cena_serwisu = new SimpleFloatProperty();
    }

    public String getRodzaj_serwisu() {
        return rodzaj_serwisu.get();
    }

    public float getCena_serwisu() {
        return cena_serwisu.get();
    }

    public void setRodzajSerwisu(String rodzaj_serwisu) {
        this.rodzaj_serwisu.set(rodzaj_serwisu);
    }

    public void setCena_serwisu(float cena_serwisu) {
        this.cena_serwisu.set(cena_serwisu);
    }

    public StringProperty rodzaj_serwisuProperty() {
        return rodzaj_serwisu;
    }

    public FloatProperty cena_serwisuProperty() {
        return cena_serwisu;
    }

}
