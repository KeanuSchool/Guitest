package com.example.guitest1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BattGekochtController {
    @FXML
    Label Label1;

    public void  HoeveelGekocht(String aantal){
        Label1.setText("U wilt : " + aantal);


    }
}
