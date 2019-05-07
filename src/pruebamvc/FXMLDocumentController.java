/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebamvc;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author javier
 */
public class FXMLDocumentController implements Initializable {
     
    @FXML private TextField txtNombre;
    @FXML private TextField txtApellido;
    @FXML private Label label;
    
    @FXML
    private void mostrar(ActionEvent event) {
        System.out.println("You clicked me!");
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        label.setText(nombre + " "+apellido);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
