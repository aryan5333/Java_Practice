package jfxproject;
import java.awt.event.ActionEvent;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.*;
import javafx.application.Application;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.RadioButton;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.text.Text;
import javafx.scene.Scene;
import javafx.scene.paint.*;
import javafx.event.*;


public class JFXProject extends Application 
 {
    Text t;
    RadioButton r1,r2,r3;
    CheckBox c1,c2,c3;
    ChoiceBox cb;

    public void start(Stage stage)throws Exception 
    {
        t=new Text("Hello World");
        HBox b1=new HBox();
        b1.getChildren().addAll(t);

        r1=new RadioButton("Red");
        r2=new RadioButton("Green");
        r3=new RadioButton("Blue");
        ToggleGroup tg=new ToggleGroup();
        r1.setToggleGroup(tg);
        r2.setToggleGroup(tg);
        r3.setToggleGroup(tg);

        HBox b2=new HBox();
        b2.getChildren.addAll(r1,r2,r3);
        b2.setSpacing(15);
        b2.setPadding(10,10,10,10);

        c1=new Checkbox("Normal");
        c2=new Checkbox("Italic");
        c3=new Checkbox("Bold");
        HBox b3=new HBox();
        b3.getChildren.addAll(c1,c2,c3);
        b3.setSpacing(15);
        b3.setPadding(10,10,10,10);

        cb=new ChoiceBox<>();
        cb.getItems().addAll(10,20,30,40,50);
        VBox v=new VBox();
        v.getChildren().addAll(b1,b2,b3);
        v.setSpacing(15);
        v.setPadding(new Insets(10,10,10,10));

        Scene sc=new Scene(v,500,500);
        stage.setScene(sc);
        stage.setscene(sc);


    }
    public static void main(String[]args)
    {
        launch(args);
    }
    
}
