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
        String tmp = userName.getText();
        //checkUser(tmp);
    }

    @FXML
    protected void onCancelButtonClick() {
        Stage stage = (Stage) userName.getScene().getWindow();
        stage.close();
    }

    public void checkUser() {
    }
}