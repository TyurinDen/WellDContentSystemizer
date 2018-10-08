package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {
    @FXML
    private Button scanDirButton;

    public void scanCurrentDir(ActionEvent event) {
        System.out.println("ScanDir is pressed!");
    }
}

