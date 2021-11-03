package di.esteban.tasca3_controls;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.util.HashMap;

public class Tarea3ControllerFormularioEnviado {
    public Label labelForm;
    public ImageView windows10;
    public ImageView appleLogo;
    public ImageView linuxLogo;
    private String linea;


    public void cargar(HashMap info){

        info.forEach((k,v) -> {
            linea= k + " : " + v + "\n";

            labelForm.setText(labelForm.getText()+linea);
                });

        String imagen = info.get("SO").toString();
        System.out.println(imagen);

        switch (imagen){
            case "Windows":
                windows10.setVisible(true);
                break;
            case "Mac":
                appleLogo.setVisible(true);
                break;
            case "Linux":
                linuxLogo.setVisible(true);
                break;
        }

    }

}
