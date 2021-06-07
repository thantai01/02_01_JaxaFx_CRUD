package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField tfBrand;

    @FXML
    private TextField tfName;

    @FXML
    private TextField tfType;

    @FXML
    private TextField tfPrice;

    @FXML
    private TextField tfCC;

    @FXML
    private TextField tfWeight;

    @FXML
    private TextField tfColor;

    @FXML
    private TextField tfDate;

    @FXML
    private TableColumn<?, ?> colBrand;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colType;

    @FXML
    private TableColumn<?, ?> colCC;

    @FXML
    private TableColumn<?, ?> colWeight;

    @FXML
    private TableColumn<?, ?> colColor;

    @FXML
    private TableColumn<?, ?> colDate;

    @FXML
    private TableColumn<?, ?> colPrice;

    @FXML
    private Button btnInsert;

    @FXML
    private Button btnUpdate;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnFind;

    @FXML
    private Button btnWriteFile;

    @FXML
    private Button btnReadFile;

    @FXML
    private TextField tfWriteFile;

    @FXML
    private TextField tfReadFile;

    @FXML
    private TextField tfUserDisplay;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
