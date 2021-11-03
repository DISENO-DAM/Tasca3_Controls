package di.esteban.tasca3_controls;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HubInicioController {

    public void eventE1(ActionEvent actionEvent) throws IOException {
        System.out.println("Entro al 1");
        Stage stage= new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("tarea1Scene.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Tarea1!");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);

    }

    public void eventE2(ActionEvent actionEvent) throws IOException {

        System.out.println("Entro al 2");
        Stage stage= new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("tarea2Calculadora.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 400);
        stage.setTitle("Tarea2 Calculadora!");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);


    }

    public void eventE3(ActionEvent actionEvent) throws IOException {

        System.out.println("Entro al 3");
        Stage stage= new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("form-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 750, 700);
        stage.setTitle("Tarea3 Formulario!");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);

    }
}
