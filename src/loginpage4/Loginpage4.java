/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginpage4;

import com.jfoenix.controls.JFXDecorator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author HP
 */
public class Loginpage4 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root;
                
root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
//   root=loader.load();
                    stage.setTitle("login");
        JFXDecorator myJFXDecorator = new JFXDecorator(stage, root);

        
        Scene scene = new Scene(myJFXDecorator,800,800);
   
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
