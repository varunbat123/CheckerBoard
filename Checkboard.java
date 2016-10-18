import javafx.application.Application;

import javafx.stage.Stage;

import javafx.scene.Scene;

import javafx.scene.layout.Pane;

import javafx.scene.shape.Rectangle;

import javafx.scene.paint.Color;

public class Checkboard extends Application {

               @Override

               public void start(Stage primaryStage) {

                              Pane pane = new Pane();

                              for (int i = 0; i < 8; i++) {

                                             for (int j = 0; j < 8; j++) {

                                                            Rectangle r = new Rectangle(20 * j, 20 * i, 20, 20);

                                                            if ((i + j) % 2 == 1) {

                                                                           r.setFill(Color.BLACK);

                                                            } else {

                                                                           r.setFill(Color.WHITE);

                                                            }

                                                            pane.getChildren().add(r);

                                             }

                              }

                              Scene scene = new Scene(pane, 160, 160);

                              primaryStage.setTitle("Checkboard");

                              primaryStage.setScene(scene);

                              primaryStage.show();

               }

               public static void main(String[] args) {

                              launch(args);

               }

}
