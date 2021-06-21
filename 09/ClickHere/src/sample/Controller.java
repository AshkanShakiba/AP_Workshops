package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javax.swing.*;

public class Controller {
    @FXML
    public void func(ActionEvent event){
        JOptionPane.showMessageDialog( null , "Hello JavaFX!" ) ;
    }
}