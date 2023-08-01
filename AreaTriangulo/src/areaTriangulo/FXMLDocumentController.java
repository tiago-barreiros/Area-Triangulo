package areaTriangulo;

import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.Platform.exit;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField a;
    @FXML
    private TextField b;
    @FXML
    private TextField c;
    @FXML
    private Label area;

    public void actionCalcular(ActionEvent e) {
        int valorA = Integer.parseInt(a.getText());
        int valorB = Integer.parseInt(b.getText());
        int valorC = Integer.parseInt(c.getText());
        
        double resultado = (double) (valorA + valorB + valorC) / 2;
        
        resultado = Math.sqrt(resultado * (resultado - valorA) * (resultado - valorB) * (resultado - valorC));
        
        if (Double.isNaN(resultado)) {
            area.setText("Erro!");
            a.setText("");
            b.setText("");
            c.setText("");
        } else{
            area.setText(String.valueOf(resultado));
        }
    }
    
    public void actionCancelar(ActionEvent e1){
        exit();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //teste
    }

}

