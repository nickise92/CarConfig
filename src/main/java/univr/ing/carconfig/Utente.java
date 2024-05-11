package univr.ing.carconfig;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;
import org.json.*;

public class Utente {

    private final String path = "database/users.json";          // Path to user.json file
    private String userName;
    private String userPsw;
    private String userID;
    private boolean admin;                                      // settiamo a true se l'utente è admin

    // Costruttore
    public Utente(String name) {
        getUserInfo(name);
    }

    private void getUserInfo(String username) {

        File file = new File(path);                         // Open file

        try {
            String content = new String(Files.readAllBytes(Paths.get(file.toURI())));
            JSONObject obj = new JSONObject(content);
            this.admin = "A".equals(obj.getJSONObject(username).getString("TYPE"));
            this.userPsw = obj.getJSONObject(username).getString("PSW");
            this.userName = username;
        }
        catch (IOException | JSONException e) {
            e.printStackTrace();
        }

    }

    public boolean authentication(String username, String password) {
        return username.equals(this.userName) && password.equals(this.userPsw);
    }
}
