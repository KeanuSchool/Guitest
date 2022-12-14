package com.example.guitest1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Node;

import java.io.IOException;

public class SceneController {
    @FXML
    TextField TextField1;
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void SwitchToScene2(ActionEvent event) throws IOException {
         root =  FXMLLoader.load(getClass().getResource("test.fxml"));
         stage = (Stage)((Node)event.getSource()).getScene().getWindow();
         scene = new Scene(root);
         stage.setScene(scene);
         stage.show();
    }

    public void SwitchToScene1(ActionEvent event)throws IOException{
        root =  FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void BatterijKopenScherm(ActionEvent event)throws IOException{
        root =  FXMLLoader.load(getClass().getResource("BattKopen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }



}
