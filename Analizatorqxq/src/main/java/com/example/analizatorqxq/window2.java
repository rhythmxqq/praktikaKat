package com.example.analizatorqxq;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class window2 {

    @FXML
    private Label adres_24;

    @FXML
    private Label adres_aprel;

    @FXML
    private Label adres_health;

    @FXML
    private Label adres_vita;

    @FXML
    private Label aprel_col;


    @FXML
    private Button buttonAnaliz;

    @FXML
    private Label col24;

    @FXML
    private Label colHeath;

    @FXML
    private Label coll;

    @FXML
    private Label vita_col;
    String name = "парацетамол";
    String name2 = "уголь";
    @FXML
    private Button back_button;
    @FXML
    void BackClick(ActionEvent event) {
        back_button.getScene().getWindow().hide();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("window1.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }

    @FXML
    void AnalizClikc(ActionEvent event) {
        int first = Integer.parseInt(aprel_col.getText());
        int [] analiz  = {Integer.parseInt(aprel_col.getText()),
        Integer.parseInt(vita_col.getText()),
        Integer.parseInt(colHeath.getText()),
        Integer.parseInt(col24.getText())};
        for (int i = 0; i <= 3; i++){
            if(first > analiz[i]){
                first = analiz[i];
                i = 0;
            }
        }
      if(first == Integer.parseInt(vita_col.getText())){
          adres_vita.setText("Московская 23Б");
          vita_col.setTextFill(Color.color(1, 0, 0));
          adres_vita.setTextFill(Color.color(1, 0, 0));
        }
        if(first == Integer.parseInt(aprel_col.getText())){
            adres_aprel.setText("Карпинского 10А");
            aprel_col.setTextFill(Color.color(1, 0, 0));
            adres_aprel.setTextFill(Color.color(1, 0, 0));
        }
        if(first == Integer.parseInt(colHeath.getText())){
            adres_health.setText("Строителя 8");
            colHeath.setTextFill(Color.color(1, 0, 0));
            adres_health.setTextFill(Color.color(1, 0, 0));
        }
        if(first == Integer.parseInt(col24.getText())){
            adres_24.setText("Замечево 2");
            col24.setTextFill(Color.color(1, 0, 0));
            adres_24.setTextFill(Color.color(1, 0, 0));
        }
    }


}
