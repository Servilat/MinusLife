import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


import java.io.File;


public class Controller {
    @FXML
    private TableView<Item> tableView;
    /*@FXML
    private TableColumn previewColumn;
    @FXML
    private TableColumn nameColumn;
    @FXML
    private TableColumn typeColumn;
    @FXML
    private TableColumn sizeColumn;
    @FXML
    private TableColumn dateColumn;*/

    private Logic logic = new Logic();

    @FXML
    private void documentAction(ActionEvent event) {
        tableView.getItems().addAll(logic.getItems(Logic.DOCUMENTS));
    }

    @FXML
    private void imagesAction(ActionEvent event) {
        // File file = logic.getFile(logic.IMAGES);

    }

    @FXML
    private void videoAction(ActionEvent event) {
        //File file = logic.getFile(logic.VIDEO);

    }

    @FXML
    private void audioAction(ActionEvent event) {
        // File file = logic.getFile(logic.AUDIO);

    }

    @FXML
    private void addAction(ActionEvent event) {

    }

    @FXML
    private void removeAction(ActionEvent event) {

    }
}
