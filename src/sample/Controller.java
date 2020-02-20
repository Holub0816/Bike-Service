package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Klasa, ktora umozliwia projektowanie interfejsu graficznego dla ekranu logowania.
 * @author Maciej Holub, holubmaciek@gmail.com
 */

public class Controller {

    @FXML
    private TextField login;

    @FXML
    private TextField password;

    @FXML
    private Button btnSignUp;

    @FXML
    private Label labelLogin;


    /**
     * Metoda umozliwiajaca wyswietlenie odpowiedniego okna po podaniu jednego z 3 wariantów loginu i hasla.
     * @param event
     * @throws IOException
     */
    @FXML
    void signUp(ActionEvent event) throws IOException {
        if (login.getText().equals("serwisant") && password.getText().equals("serwisant1")) {
            Parent sprzedawca_stage = FXMLLoader.load(getClass().getResource("sampleSprzedawca.fxml"));
            Stage app_stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            app_stage.hide();
            app_stage.setTitle("Serwisant");
            Scene scene = new Scene(sprzedawca_stage, 1000, 600);
            app_stage.setScene(scene);
            scene.getStylesheets().add
                    (getClass().getResource("style.css").toExternalForm());
            app_stage.setResizable(false);
            app_stage.show();
        } else if (login.getText().equals("sprzedawca") && password.getText().equals("sprzedawca1")) {
            Parent serwisant_stage = FXMLLoader.load(getClass().getResource("sampleSerwisant.fxml"));
            Stage app_stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            app_stage.hide();
            app_stage.setTitle("Sprzedawca");
            Scene scene = new Scene(serwisant_stage, 1000, 600);
            app_stage.setScene(scene);
            scene.getStylesheets().add
                    (getClass().getResource("style.css").toExternalForm());
            app_stage.setResizable(false);
            app_stage.show();
        } else if (login.getText().equals("manager") && password.getText().equals("manager1")) {
            Parent manager_stage = FXMLLoader.load(getClass().getResource("sampleManager.fxml"));
            Stage app_stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            app_stage.hide();
            app_stage.setTitle("Manager");
            Scene scene = new Scene(manager_stage, 1000, 600);
            app_stage.setScene(scene);
            scene.getStylesheets().add
                    (getClass().getResource("style.css").toExternalForm());
            app_stage.setResizable(false);
            app_stage.show();
        } else {
            labelLogin.setText("Błędny login lub hasło. Spróbuj jeszcze raz.");
            login.clear();
            password.clear();
        }


    }

}
