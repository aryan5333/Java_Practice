package jfxsecond;
import java.awt.Color;
import javafx.scene.*;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.colour.*;

public class JFXSecond extends Application
{
    public void start(Stage stage) throws Exception
    {
        Button b=new Button("Click Me");

        b.setTextFill(Color.BLUE);
        FlowPane fp=new FlowPane(b);

        Scene sc=new Scene(fp,500,500);

        stage.setScene(sc);
        stage.show();

    }
    public static void main(String[] args) {
        launch();
    }
    
}
