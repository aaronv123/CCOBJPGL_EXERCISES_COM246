package com.example;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


public class HomeController implements Initializable {
    
    ObservableList<User> mylist = FXCollections.observableArrayList();

    @FXML
    Label nameLabel;

    @FXML
    private TableColumn<User, String> accountcreated_col;

    @FXML
    private ChoiceBox<String> choicebox;

    @FXML
    private Button createbutton;

    @FXML
    private Button deletebutton;

    @FXML
    private TextField nametextfield;

    @FXML
    private TextField passtextfield;

    @FXML
    private TableColumn<User, String> password_col;

    @FXML
    private TableColumn<User, String> status_col;

    @FXML
    private Button updatebutton;

    @FXML
    private TableColumn<User, String> username_col;

    @FXML
    private TableView<User> viewtable;
    

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
      initializeCol();
      loadData();

        String user = LoginController.user.getUsername();

        nameLabel.setText("Hello, " + user + "!");
        
    }

    private void initializeCol() {

        username_col.setCellValueFactory(new PropertyValueFactory<>("username"));
        password_col.setCellValueFactory(new PropertyValueFactory<>("password"));
        accountcreated_col.setCellValueFactory(new PropertyValueFactory<>("accountcreated"));
        status_col.setCellValueFactory(new PropertyValueFactory<>("accountstatus"));

    }

    private void loadData() {

        mylist.clear();

        try {
            // Create object from File class
            File myFile = new File("accounts.txt");

            // .exists() method checks if a file exists in the pathname
            if (myFile.exists()) {

                Scanner filescanner = new Scanner(myFile);

                while (filescanner.hasNextLine()) {

                    String data = filescanner.nextLine();
        
                    String username = data.split(",")[0];
                    String password = data.split(",")[1];
                    String dcreated = data.split(",")[2];
                    String status = data.split(",")[3];

                    mylist.add(new User(username, password, dcreated, status));
                } 
                viewtable.setItems(mylist);

                filescanner.close();
            }
            else {
                System.out.println(myFile.getName() + " does not exist!");
            }
        } catch (Exception e) {
            System.out.println("There is an error");
        } 
    }

}
