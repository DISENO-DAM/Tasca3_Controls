package di.esteban.tasca3_controls;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Tarea2Controller {
    String ud1="";
    String ud2="";
    String signo="";

    Boolean exec=false;

    @FXML private Text resultado;
    @FXML private Text numeros;


    public void ejecucion(ActionEvent actionEvent) {

        Button boton= (Button) actionEvent.getSource();

        signo=boton.getText();
        numeros.setText(ud1+" "+ signo+ " "+ud2);
        exec=true;

    }

    public void borrarAction(ActionEvent actionEvent) {

        numeros.setText("");
        exec=false;
        ud1="";
        ud2="";
        signo="";
    }

    public void resultado(ActionEvent actionEvent) {

        switch (signo){
            case "+":
                Double resultMas= Double.parseDouble(ud1) + Double.parseDouble(ud2);
                resultado.setText(resultMas.toString());
                break;
            case "-":
                Double resultMenos= Double.parseDouble(ud1) - Double.parseDouble(ud2) ;
                resultado.setText(resultMenos.toString());
                break;
            default:
        }

        borrarAction(actionEvent);
        numeros.setText(resultado.getText());
        ud1=resultado.getText();





    }

    public void addN(ActionEvent actionEvent) {

        Button boton= (Button) actionEvent.getSource();

        if (exec==false){
            ud1+=boton.getText();

        }else{
            ud2+=boton.getText();
        }

        numeros.setText(ud1+signo+ud2);
        System.out.println(ud2);
    }
}
