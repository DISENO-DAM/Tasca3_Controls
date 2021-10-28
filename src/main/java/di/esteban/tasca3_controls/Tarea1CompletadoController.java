package di.esteban.tasca3_controls;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class Tarea1CompletadoController {


    @FXML  private Text loginUser;


    public void cargar(String text){

        loginUser.setText(text);

    }
}
