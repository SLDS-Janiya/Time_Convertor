import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class TimeConvertorController {
    public TextField inputDays;


    public void convertOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("showConvertor.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        int dates = Integer.parseInt(inputDays.getText());
        int hours = dates*24;
        int minutes = hours*60;
        int seconds = minutes*60;

        System.out.println("dates " +dates);
        System.out.println("hours " +hours);
        System.out.println("minutes " +minutes);
        System.out.println("seconds " +seconds);
        int a,b,c,d;

        ShowConvertorController scc = new ShowConvertorController();

        scc.a = dates;
        scc.b=hours;
        scc.c = minutes;
        scc.d = seconds;


    }
}
