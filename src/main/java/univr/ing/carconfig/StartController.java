package univr.ing.carconfig;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



import java.io.File;

public class StartController {
    @FXML private TextField userName;
    @FXML private TextField userPassword;

    @FXML private Button loginButton;

    @FXML
    protected void onLoginButtonClick() {
        checkUser(userName.getText(), userPassword.getText());
    }

    @FXML
    protected void onCancelButtonClick() {
        Stage stage = (Stage) userName.getScene().getWindow();
        stage.close();
    }

    public void checkUser(String user, String psw) {
        // Creo un oggetto utente generico temporaneo per verificare l'identità
        Utente utente = new Utente(user);
        boolean canAccess = utente.authentication(user, psw);

        System.out.println(canAccess);

    }

    @FXML
    protected void openRegistrationForm() {
        // Imposto una nuova finestra

    }
}