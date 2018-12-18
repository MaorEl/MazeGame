package View;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;


public class AboutViewController implements IView, Initializable {

    @FXML
    public Button close_button;
    public Label label_anael;
    public Label label_maor;
    public Button button_send;
    public Label label_application;

    @Override
    public void exitCorrectly() {
        //nothing
    }


    public void closeWindow(ActionEvent actionEvent) {
        Stage s  = (Stage)close_button.getScene().getWindow();
        s.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        label_anael.setWrapText(true);
        label_maor.setWrapText(true);
        label_application.setWrapText(true);

        //set the text
        label_anael.setText("Anael Gorfinkel, 24 years old second year student of Information Systems and Software Engineering in Ben Gurion University, BeerSheva.\n" +
                "\n" +
                "Developed this game by the last year.\n" +
                "for more information, feel free to contact Anael:\n" +
                "Phone number: +972 50-575-7766\n" +
                "Email address: AnaelleGorfinkel@gmail.com");

        label_maor.setText("Maor Elfassy, 25 years old second year student of Information Systems and Software Engineering in Ben Gurion University, BeerSheva.\n" +
                "\n" +
                "Developed this game by the last year.\n" +
                "for more information, feel free to contact Maor:\n" +
                "Phone number: +972 54-223-7709\n" +
                "Email address: MaorElfassy@gmail.com");
        label_application.setText("Version: 1.00\n" +
                "\n" +
                "this game is a just one part of 3 parts who implement a various tools of java developing.\n" +
                "we hope you will enjoy this!\n" +
                "feel free to send us some feedback from \"Help\" section.");

    }

}
