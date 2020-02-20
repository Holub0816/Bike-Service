package sample;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Klasa przechwujaca informacje o obiekcie typu Rower.
 * @author Maciej Hołub, holubmaciek@gmail.com
 */

public class Rower {

    private IntegerProperty rower_id;
    private StringProperty typ_roweru;
    private StringProperty marka_roweru;
    private StringProperty kolor_roweru;
    private StringProperty rodzaj_serwisu;


    public Rower() {

        this.rower_id = new SimpleIntegerProperty();
        this.typ_roweru = new SimpleStringProperty();
        this.marka_roweru = new SimpleStringProperty();
        this.kolor_roweru = new SimpleStringProperty();
        this.rodzaj_serwisu = new SimpleStringProperty();
    }

    public int getRower_id(){
        return rower_id.get();
    }

    public String getTyp_roweru(){
        return typ_roweru.get();
    }

    public String getMarka_roweru(){
        return marka_roweru.get();
    }

    public String getKolor_roweru(){
        return kolor_roweru.get();
    }

    public String getRodzaj_serwisu(){
        return rodzaj_serwisu.get();
    }

    public void setRower_id(int rower_id){
        this.rower_id.set(rower_id);
    }

    public void setMarka_roweru(String marka_roweru){
        this.marka_roweru.set(marka_roweru);
    }

    public void setTyp_roweru(String typ_roweru){
        this.typ_roweru.set(typ_roweru);
    }

    public void setKolor_roweru(String kolor_roweru){
        this.kolor_roweru.set(kolor_roweru);
    }

    public void setRodzaj_serwisu(String rodzaj_serwisu){
        this.rodzaj_serwisu.set(rodzaj_serwisu);
    }

    public IntegerProperty rower_idProperty() {
        return rower_id;
    }

    public StringProperty typ_roweruProperty(){
        return typ_roweru;
    }

    public StringProperty marka_roweruProperty(){
        return marka_roweru;
    }

    public StringProperty kolor_roweruProperty(){
        return kolor_roweru;
    }

    public StringProperty rodzaj_serwisuProperty(){
        return rodzaj_serwisu;
    }
}
