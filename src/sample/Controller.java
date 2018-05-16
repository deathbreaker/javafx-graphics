package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import java.net.URL;
import java.util.ResourceBundle;

import static javax.print.attribute.standard.Chromaticity.COLOR;


public class Controller implements Initializable{

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        gc = canvas.getGraphicsContext2D();

    }

    private GraphicsContext gc;

    @FXML
    private Canvas canvas;

    @FXML
    private Button btn_pes;

    @FXML
    private Button btn_cervena;

    @FXML
    private Button btn_modra;

    @FXML
    private Button btn_zelena;

    @FXML
    private Button btn_otec;

    @FXML
    private Button btn_dite;

    @FXML
    void action_otec(ActionEvent event) {
        gc.clearRect(0,0,canvas.getWidth(), canvas.getHeight());

        double[] x = {25,  -25 , 75};
        double[] y = {150,  50,  50};

        gc.fillOval(0,0, 50,50);
        gc.fillPolygon(x,y,3);
    }

    @FXML
    void action_dite(ActionEvent event) {
        gc.clearRect(0,0,canvas.getWidth(), canvas.getHeight());

        double[] x = {  25,  0 , 50};
        double[] y = {  50,  100, 100};

        gc.fillOval( 0, 0 ,50,50);
        gc.fillPolygon(x,y,3);
    }

    @FXML
    void action_pes(ActionEvent event) {
        gc.clearRect(0,0,canvas.getWidth(), canvas.getHeight());


        gc.fillOval( 0,  0,55,55);
        gc.fillRect( 40,   45,100,60);
        gc.strokeLine( 135,   50,  190,5);
    }


    @FXML
    void action_cervena(ActionEvent event) {
        gc.setFill(Color.rgb(225, 0, 0));
    }

    @FXML
    void action_zelena(ActionEvent event) {
        gc.setFill(Color.rgb(0, 255, 0));
    }

    @FXML
    void action_modra(ActionEvent event) {
        gc.setFill(Color.rgb(0, 0, 255));
    }

}
