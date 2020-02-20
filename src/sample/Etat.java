package sample;

import javafx.beans.property.*;

/**
 * Klasa przechwujaca informacje o obiekcie typu Etat.
 * @author Maciej Holub, holubmaciek@gmail.com
 */
public class Etat {

    private IntegerProperty etat_id;   //Property notifies us when any variable such as name, last name, etc. is changed
    private StringProperty nazwa_etatu;  //This helps us keep the view in sync with the data.
    private FloatProperty stawka;


    public Etat() {
        this.etat_id = new SimpleIntegerProperty();
        this.nazwa_etatu = new SimpleStringProperty();
        this.stawka = new SimpleFloatProperty();
    }


    public int getEtat_id() {
        return etat_id.get();
    }

    public String getNazwa_etatu() {
        return nazwa_etatu.get();
    }

    public float getStawka() {
        return stawka.get();
    }

    public void setEtat_id(int etat_id) {
        this.etat_id.set(etat_id);
    }

    public void setNazwa_etatu(String nazwa_etatu) {
        this.nazwa_etatu.set(nazwa_etatu);
    }

    public void setStawka(float stawka) {
        this.stawka.set(stawka);
    }

    public IntegerProperty etat_idProperty() {
        return etat_id;
    }

    public StringProperty nazwa_etatuProperty() {
        return nazwa_etatu;
    }

    public FloatProperty stawkaProperty() {
        return stawka;
    }

}
