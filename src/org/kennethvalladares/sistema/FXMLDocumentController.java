package org.kennethvalladares.sistema;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


/**
 *
 * @author informatica
 */
public class FXMLDocumentController implements Initializable {
    float dato1, dato2, resultado;
    int op, i;
    
    @FXML private TextField txtValores;
    @FXML private Button btnMasMenos;
    @FXML private Button btnCero;
    @FXML private Button btnPunto;
    @FXML private Button btnUno;
    @FXML private Button btnDos;
    @FXML private Button btnTres;
    @FXML private Button btnCuatro;
    @FXML private Button btnCinco;
    @FXML private Button btnSeis;
    @FXML private Button btnSiete;
    @FXML private Button btnOcho;
    @FXML private Button btnNueve;
    @FXML private Button btnSuma;
    @FXML private Button btnResta;
    @FXML private Button btnMulti;
    @FXML private Button btnDivi;
    @FXML private Button btnUnoX;
    @FXML private Button btnCE;
    @FXML private Button btnC;
    @FXML private Button btnPorciento;
    @FXML private Button btnXY;
    @FXML private Button btnXDos;
    @FXML private Button btnIgual;
    
    @FXML
    private void handleButtonAction(ActionEvent event){
        if(event.getSource() == btnUno)
            txtValores.setText(txtValores.getText() + "1");        
        else if (event.getSource() == btnDos)
            txtValores.setText(txtValores.getText() + "2");
        else if (event.getSource() == btnTres)
            txtValores.setText(txtValores.getText() + "3");
        else if (event.getSource() == btnCuatro)
            txtValores.setText(txtValores.getText() + "4");
        else if (event.getSource() == btnCinco)
            txtValores.setText(txtValores.getText() + "5");
        else if (event.getSource() == btnSeis)
            txtValores.setText(txtValores.getText() + "6");
        else if (event.getSource() == btnSiete)
            txtValores.setText(txtValores.getText() + "7");
        else if (event.getSource() == btnOcho)
            txtValores.setText(txtValores.getText() + "8");
        else if (event.getSource() == btnNueve)
            txtValores.setText(txtValores.getText() + "9");
        else if (event.getSource() == btnCero)
            txtValores.setText(txtValores.getText() + "0");
        //Boton CE
        else if (event.getSource() == btnCE){
            txtValores.clear();
            btnPunto.setDisable(false);
        //Boton C
        }else if (event.getSource() == btnC){
            txtValores.setText("");
            dato1 = 0;
            dato2 = 0;
            resultado = 0;
            i = 0;
            btnPunto.setDisable(false);
        //Boton Sumas
        }else if (event.getSource() == btnSuma){
            dato1 += Float.parseFloat(txtValores.getText());
            txtValores.setText("");
            op = 1;
            btnPunto.setDisable(false);
        //Boton Restar
        }else if (event.getSource() == btnResta){
            if(dato1 == 0){
                dato1 += Float.parseFloat(txtValores.getText());
                txtValores.setText("");
            }else{
                dato1 -= Float.parseFloat(txtValores.getText());
                txtValores.setText("");
            }   
            op = 2;
            btnPunto.setDisable(false);
        //Boton Multiplicacion
        }else if (event.getSource() == btnMulti){
            dato1 = -1;
            dato1 -= Float.parseFloat(txtValores.getText());
            txtValores.setText("");
            op = 3;
            btnPunto.setDisable(false);
        //Boton Division
        }else if (event.getSource() == btnDivi){
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText("");
            op = 4;
            btnPunto.setDisable(false);
        //Boton X a la Y
        }else if (event.getSource() == btnXY){
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText("");
            op = 5;
            btnPunto.setDisable(false);
        // Boton Porcentaje
        }else if (event.getSource() == btnPorciento){
            resultado = Float.parseFloat(txtValores.getText());
            resultado = (resultado) / 100;
            txtValores.setText(String.valueOf(resultado));
            btnPunto.setDisable(false);
        //Boton 1 dividido X
        }else if (event.getSource() == btnUnoX){
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText("");
            resultado = 1 / dato1;
            txtValores.setText(String.valueOf(resultado));
            btnPunto.setDisable(false);
        //Boton Mas/Menos
        }else if (event.getSource() == btnMasMenos){
            resultado = Float.parseFloat(txtValores.getText());
            resultado = resultado * (-1);
            txtValores.setText(String.valueOf(resultado));
            btnPunto.setDisable(false);
        //Boton X a la 2
        }else if (event.getSource() == btnXDos){
            dato1 = Float.parseFloat(txtValores.getText());
            dato1 = dato1 * dato1;
            txtValores.setText(String.valueOf(dato1));
            btnPunto.setDisable(false);
        //Boton Punto
        }else if (event.getSource() == btnPunto){
                txtValores.setText(txtValores.getText() + ".");
                btnPunto.setDisable(true);
        //Boton Igual
        }else if (event.getSource() == btnIgual){
                    dato2 = Float.parseFloat(txtValores.getText());
                    txtValores.setText("");
                    switch (op){
                        case 1:
                            resultado = dato1 + dato2;
                            dato1 = 0;
                            dato2 = 0;
                            txtValores.setText(String.valueOf(resultado));
                            break;
                        case 2:
                            resultado = dato1 - dato2;
                            dato1 = 0;
                            dato2 = 0;
                            txtValores.setText(String.valueOf(resultado));
                            break;
                        case 3:
                            resultado = dato1 * dato2;
                            txtValores.setText(String.valueOf(resultado));
                            break;
                        case 4:
                            resultado = dato1 / dato2;
                            txtValores.setText(String.valueOf(resultado));
                            break;
                        case 5:
                            resultado = 1;
                            for (i = 1; i <= dato2; i++){
                                resultado = resultado * dato1;
                            }
                            txtValores.setText(String.valueOf(resultado));
                            break;
                    }
                    btnPunto.setDisable(false);
                    
        }
            
        
            
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
