import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
//import Calculator.fxml.CalculatorController;

public class JavaFXCalculator extends Application
{
    String appName = "Calculator";
    String version = "v1.0.0";

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("calculator.fxml"));

        Scene scene = new Scene(root);

        primaryStage.setResizable(false);
        primaryStage.setTitle(appName + " - " + version);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }

}