import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage; 
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
public class App extends Application {

    @Override
    public void start (Stage primaryStage) {

        AnchorPane root = new AnchorPane();
        
        Label lbl1 = new Label("Button:");
        Label lbl2 = new Label("CheckBox:");
        Label lbl3 = new Label("Hyperlink:");
        Label lbl4 = new Label("ToggleButton:");
        Label lbl5 = new Label("RadioButton:");
        Label lbl6 = new Label("Label:");
        Label lbl7 = new Label("TextField:");
        Label lbl8 = new Label("PasswordField:");
        Label lbl9 = new Label("TextArea:");
        Label lbl10 = new Label("ProgressIndicator:");
        Label lbl11 = new Label("ProgressBar:");
        Label lbl12 = new Label("Slider:");

        Button btn1 = new Button();
        btn1.setText("Button");
        CheckBox cb1 = new CheckBox("CheckBox");
        Hyperlink hl1 = new Hyperlink("Hyperlink");
        ToggleButton tb1 = new ToggleButton("ToggleButton");
        RadioButton rb1 = new RadioButton("RadioButton");
        Label lbl13 = new Label("Label");
        TextField tf = new TextField("some text...");
        PasswordField pf = new PasswordField();
        TextArea ta = new TextArea();
        ta.setPrefHeight(120);
        ta.setPrefWidth(230);
        ta.setWrapText(true);
        ProgressIndicator pi = new ProgressIndicator(0.49);
        ProgressBar pb = new ProgressBar(0.49);
        pb.setPrefWidth(150);
        Slider slider = new Slider(0, 100, 10);
        slider.setPrefWidth(230);
        
        root.getChildren().addAll(lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, lbl10, lbl11, lbl12, cb1, btn1, hl1, tb1, rb1, lbl13, tf, pf, ta, pi, pb, slider);
        AnchorPane.setLeftAnchor(lbl1, 10d);
        AnchorPane.setTopAnchor(lbl1, 15d);
        AnchorPane.setLeftAnchor(lbl2, 10d);
        AnchorPane.setTopAnchor(lbl2, 50d);
        AnchorPane.setLeftAnchor(lbl3, 10d);
        AnchorPane.setTopAnchor(lbl3, 90d);
        AnchorPane.setLeftAnchor(lbl4, 10d);
        AnchorPane.setTopAnchor(lbl4, 130d);
        AnchorPane.setLeftAnchor(lbl5, 10d);
        AnchorPane.setTopAnchor(lbl5, 170d);
        AnchorPane.setLeftAnchor(lbl6, 10d);
        AnchorPane.setTopAnchor(lbl6, 210d);
        AnchorPane.setLeftAnchor(lbl7, 10d);
        AnchorPane.setTopAnchor(lbl7, 250d);
        AnchorPane.setLeftAnchor(lbl8, 10d);
        AnchorPane.setTopAnchor(lbl8, 290d);
        AnchorPane.setLeftAnchor(lbl9, 10d);
        AnchorPane.setTopAnchor(lbl9, 380d);
        AnchorPane.setLeftAnchor(lbl10, 10d);
        AnchorPane.setTopAnchor(lbl10, 480d);
        AnchorPane.setLeftAnchor(lbl11, 10d);
        AnchorPane.setTopAnchor(lbl11, 530d);
        AnchorPane.setLeftAnchor(lbl12, 10d);
        AnchorPane.setTopAnchor(lbl12, 570d);

        AnchorPane.setLeftAnchor(btn1, 150d);
        AnchorPane.setTopAnchor(btn1, 10d);
        AnchorPane.setLeftAnchor(cb1, 150d);
        AnchorPane.setTopAnchor(cb1, 50d);
        AnchorPane.setLeftAnchor(hl1, 150d);
        AnchorPane.setTopAnchor(hl1, 87d);
        AnchorPane.setLeftAnchor(tb1, 150d);
        AnchorPane.setTopAnchor(tb1, 125d);
        AnchorPane.setLeftAnchor(rb1, 150d);
        AnchorPane.setTopAnchor(rb1, 170d);
        AnchorPane.setLeftAnchor(lbl13, 150d);
        AnchorPane.setTopAnchor(lbl13, 210d);
        AnchorPane.setLeftAnchor(tf, 150d);
        AnchorPane.setTopAnchor(tf, 245d);
        AnchorPane.setLeftAnchor(pf, 150d);
        AnchorPane.setTopAnchor(pf, 285d);
        AnchorPane.setLeftAnchor(ta, 150d);
        AnchorPane.setTopAnchor(ta, 335d);
        AnchorPane.setLeftAnchor(pi, 250d);
        AnchorPane.setTopAnchor(pi, 475d);
        AnchorPane.setLeftAnchor(pb, 150d);
        AnchorPane.setTopAnchor(pb, 530d);
        AnchorPane.setLeftAnchor(slider, 150d);
        AnchorPane.setTopAnchor(slider, 570d);

        Scene scene = new Scene(root, 400, 600);
        primaryStage.setTitle("All controls");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}