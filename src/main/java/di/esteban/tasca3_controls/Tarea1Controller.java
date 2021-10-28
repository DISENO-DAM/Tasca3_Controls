package di.esteban.tasca3_controls;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;

public class Tarea1Controller {

    @FXML private Text error;
    @FXML private TextField textUser;
    @FXML private  TextField textPass;

    public void enviar(ActionEvent actionEvent) throws IOException {

       if (textUser.getText().equalsIgnoreCase("esteban") && textPass.getText().equalsIgnoreCase("esteban")  ||  textUser.getText().equalsIgnoreCase("miguel") && textPass.getText().equalsIgnoreCase("miguel")){

           System.out.println("Comleto el login");
           Stage stage= new Stage();
           FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("tarea1Completado.fxml"));
           Scene scene = new Scene(fxmlLoader.load(), 600, 400);
           stage.setTitle("Tarea1CompletadoLOgin!");
           stage.setScene(scene);
           stage.show();

           Tarea1CompletadoController tarea1CompletadoController=(Tarea1CompletadoController) fxmlLoader.getController();
           tarea1CompletadoController.cargar(textUser.getText());

          cerrarEscena(actionEvent);
       }else{

        error.setText("ERROR");

       }

    }
    public void cerrarEscena(ActionEvent actionEvent){
        //Cerramos la anterior escena
        Node source = (Node) actionEvent.getSource();
        Stage stage1 = (Stage) source.getScene().getWindow();
        stage1.close();
    }


}
