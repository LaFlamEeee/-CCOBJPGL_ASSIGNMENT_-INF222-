package controller;

import javax.swing.text.html.ImageView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class FruitController {

    

    @FXML
    Button btn1, btn2,btn3,btn4,btn5;

    Coke coke = new Coke();
    Spite spite = new Spite();
    Mountaindew mountaindew = new Mountaindew();
    Icedtea icedtea = new Icedtea();
    Coffee coffee = new Coffee();


    public void initialize() {

        coke.setTaste("Sweet");
        coke.setPrice("60");

        spite.setTaste("Sweet & bitter after taste");
        spite.setPrice("60");
        
        mountaindew.setTaste("sweet & slighly sour");
        mountaindew.setPrice("60");

        icedtea.setTaste("Sweet & refreshing");
        icedtea.setPrice("60");

        coffee.setTaste("sweet & milky");
        coffee.setPrice("80");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("I taste " + coke.getTaste() + " and my price is  " + coke.getPrice() + " pesos");
        }

        if (sourceButton == btn2) {
            alert.setContentText("I taste " + spite.getTaste() + " and my price is  " + spite.getPrice() + " pesos");
        }
        if (sourceButton.equals(btn3)) {
            alert.setContentText("I taste " + mountaindew.getTaste() + " and my price is  " + mountaindew.getPrice() + " pesos");
        }

        if (sourceButton == btn4) {
            alert.setContentText("I taste " + icedtea.getTaste() + " and my price is  " + icedtea.getPrice() + " pesos");
        }
        if (sourceButton == btn5) {
            alert.setContentText("I taste " + coffee.getTaste() + " and my price is  " + coffee.getPrice() + " pesos");
        }


        alert.showAndWait();

    }
}
