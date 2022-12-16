package com.example.analizatorqxq;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Button ButtonChoice;

    @FXML
    private ListView<String> ListAll;

    @FXML
    void ButtonChoiceClick(ActionEvent event) {
        ButtonChoice.getScene().getWindow().hide();
        String message = "";
        ObservableList<String> movies;
        movies = ListAll.getSelectionModel().getSelectedItems();

        for (String m: movies){
            message += m;
        }
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("window2.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Scene scene = new Scene(root,600,400);
        Label label  = (Label) scene.lookup("#coll");
        Label label1  = (Label) scene.lookup("#aprel_col");
        Label label2  = (Label) scene.lookup("#col24");
        Label label3  = (Label) scene.lookup("#colHeath");
        Label label4  = (Label) scene.lookup("#vita_col");
        label.setText(message);
        if (message.equals("парацетамол")){
            label1.setText("520");
            label2.setText("420");
            label3.setText("310");
            label4.setText("220");
        }
        if (message.equals("уголь")){
            label1.setText("111");
            label2.setText("12312");
            label3.setText("321");
            label4.setText("321");
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       ListAll.getItems().addAll("парацетамол", "уголь", "fsdfsdf", "  vsdfsdf");
       ListAll.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }
}
