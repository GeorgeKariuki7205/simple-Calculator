/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.calculator;

import static java.lang.Double.parseDouble;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author George
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    public Label label;
    public TextField txtfno ;
    public TextField txtsno;
    public TextField txtans;
    
    
    @FXML
    
    
    // DOINF THE RELEVANT CALCUTATIONS.
    
    
    
    public void handleAddition(ActionEvent event) {
        
          double fno = parseDouble(txtfno.getText()) ;
          double sno = parseDouble(txtsno.getText());
          double sum = fno+sno;
         String add = String.format("%.2f",sum );
     txtans.setText(add);
     label.setText(" ADDITION CLICKED.");
    }
    
     public void handleSubtraction(ActionEvent event) {
         double fno = parseDouble(txtfno.getText()) ;
          double sno = parseDouble(txtsno.getText());
          double difference = fno-sno;
          //String minus = String.format("%.2f",difference );
     txtans.setText(""+difference);
      label.setText(" SUBTRACTION CLICKED.");
    }
     
      public void Multiplication(ActionEvent event) {
          double fno = parseDouble(txtfno.getText()) ;
          double sno = parseDouble(txtsno.getText());
          double product = fno*sno;
          String times = String.format("%.2f",product );
     txtans.setText(times);
      label.setText(" MULTIPLICATION CLICKED.");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
