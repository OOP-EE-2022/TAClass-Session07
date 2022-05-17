package sample;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;

public class Controller {
    // singleton:
//    private static Controller instance;
//
//    private Controller() {
//    }
//
//    public static Controller getController() {
//        if (instance == null) {
//            return new Controller();
//        } else {
//            return instance;
//        }
//    }


    @FXML
    Button submitButton;
    @FXML
    Label label;
    @FXML
    TextField textField;
    @FXML
    PasswordField passwordField;


    HashMap<String, String> hashMap = new HashMap<String, String>() {
        {
        put("ali1", "ali1");
        put("ali2", "ali2");
    }
    };

    public void submit() {
        if (label.getText().equals("Hello")) {
            label.setText("Hi");
        } else {
            label.setText("Hello");
        }

        String username = textField.getText();
        String password = passwordField.getText();

        if (hashMap.containsKey(username)) {
            if (hashMap.get(username).equals(password)) {
                label.setText("Entered");
                newPage();
            } else {
                label.setText("password not matched!");
                passwordField.setText("");
            }
        } else {
            label.setText("username invalid!");
            passwordField.setText("");
        }

    }

    public void newPage() {
//        Main.mainStage.close();

//        Stage primaryStage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = Main.mainStage;
        stage.setTitle("Page2");
        stage.setScene(new Scene(root, 600, 400));
        stage.show();
    }

}
