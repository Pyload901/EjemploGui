package com.pyload.cafeteriauca;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private TextField txtEdad;
    @FXML
    private RadioButton rdrYes;
    @FXML
    private RadioButton rdrNo;

    @FXML
    protected void onEnterButtonClick() {
        int edad = Integer.parseInt(txtEdad.getText());
        System.out.println(edad);
        if (edad >= 18 && rdrYes.isSelected()) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setContentText("Puede pasar");
            alert.showAndWait();
        } else if (edad >= 18 && rdrNo.isSelected()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("No concuerda");
            alert.showAndWait();
            // lanzar alerta que no concuerda
        } else if (edad < 18) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("No puede pasar");
            alert.showAndWait();
        }
    }
    // posible implementacion de funci'on para borrar todos los campos
    // esta funci'on est'a incompleta, se deben setear todos los campos con un valor vac'io
    @FXML
    protected void onClearClick() {
        txtEdad.setText("");
        rdrYes.setSelected(false);
        rdrNo.setSelected(false);
    }
}