package eventfx;
import java.awt.event.ActionEvent;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.FlowPane;

public class EventFX extends Application implements EventHandler<ActionEvent>
{
    Button b;
    int count=0;
    public void start(Stage stage)throws Exception
    {
        b=new Button("OK");

        b.setPrefSize(100,30);
        b.setOnAction(e->{count++;b.setText(""+count);});

        FlowPane f=new FlowPane(b);
        Scene sc=new Scene(f,400,400);
        stage.setScene(sc);
        stage.show();

    } 
    
    public void handle(ActionEvent event) {
        count++;
        b.setText("Clicked " + count);
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
