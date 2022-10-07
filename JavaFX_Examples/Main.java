import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;



public class Main extends  Application {
    public void start(Stage stage) throws Exception
    {
        Button b = new Button("_Click Me");
        b.setTextFill(Color.BLUE);
        b.setMnemonicParsing(true);
        Tooltip tp = new Tooltip("Click this button to save data");
        b.setTooltip(tp);
        b.setStyle("-fx-border-color: yellow;-fx-background-color: red;");
        Alert a = new Alert(AlertType.INFORMATION , "Button is Clicked");
        b.setOnAction(e->a.show());
        FlowPane fp = new FlowPane(b);
        Scene sc = new Scene(fp , 400 , 400);
        stage.setScene(sc);
        stage.show();




    }
    public static void main(String[] args)
    {
        launch(args);
    }
}
