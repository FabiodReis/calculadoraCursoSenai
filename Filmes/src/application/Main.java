package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = new AnchorPane();
			root.setId("Back");

			Label lbsAnime = new Label();
			lbsAnime.setText("AnimeFlix");
			lbsAnime.setMinSize(40, 100);
			lbsAnime.setId("Titulo");
			lbsAnime.setLayoutX(750);
			lbsAnime.setLayoutY(30);

			Label lbsAnime1 = new Label();
			lbsAnime1.setText("Boku no Hero");

			lbsAnime1.setLayoutX(200);
			lbsAnime1.setLayoutY(250);
			lbsAnime1.setId("imagem");

			Button btnBoku = new Button();
			btnBoku.setText("Ver Trailer");
			btnBoku.setLayoutX(220);
			btnBoku.setLayoutY(950);
			btnBoku.setMinSize(110, 40);
			btnBoku.setId("botao");

			btnBoku.setOnAction(event -> Trailer1("https://youtu.be/8i59SlmTRNw?si=-fxdyNFGH9YlpIyS"));

			Image ima1 = new Image(getClass().getResource("Boku.jpg").toString());
			ImageView imageView = new ImageView(ima1);
			imageView.setLayoutY(300);
			imageView.setLayoutX(100);

			Label lbsAnime2 = new Label();
			lbsAnime2.setText("Hunter X Hunter");
			lbsAnime2.setId("imagem");
			lbsAnime2.setLayoutX(850);
			lbsAnime2.setLayoutY(250);

			Button btnHunter = new Button();
			btnHunter.setText("Ver Trailer");
			btnHunter.setLayoutX(900);
			btnHunter.setLayoutY(950);
			btnHunter.setMinSize(110, 40);
			btnHunter.setId("botao");
			

			btnHunter.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					;

				}
			});

			btnHunter.setOnAction(event -> Trailer2 ("HunterFilme.mp4"));
			
			Image ima2 = new Image(getClass().getResource("Hunter.jpg").toString());
			ImageView imageView2 = new ImageView(ima2);
			imageView2.setLayoutY(300);
			imageView2.setLayoutX(750);

			Label lbsAnime3 = new Label();
			lbsAnime3.setText("DragonBall");
			lbsAnime3.setLayoutX(1550);
			lbsAnime3.setLayoutY(250);
			lbsAnime3.setId("imagem");

			Button btnDragon = new Button();
			btnDragon.setText("Ver Trailer");
			btnDragon.setLayoutX(1550);
			btnDragon.setLayoutY(950);
			btnDragon.setMinSize(110, 40);
			btnDragon.setId("botao");
			
			
			btnDragon.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					;

				}
			});
			
			btnDragon.setOnAction(event -> Trailer3 ("DroganFilme.mp4"));
			

			Image ima3 = new Image(getClass().getResource("Doragon.jpg").toString());
			ImageView imageView3 = new ImageView(ima3);
			imageView3.setLayoutY(300);
			imageView3.setLayoutX(1400);

			root.getChildren().add(btnHunter);
			root.getChildren().add(btnDragon);
			root.getChildren().add(btnBoku);
			root.getChildren().add(lbsAnime);
			root.getChildren().add(lbsAnime1);
			root.getChildren().add(lbsAnime2);
			root.getChildren().add(lbsAnime3);
			root.getChildren().add(imageView);
			root.getChildren().add(imageView2);
			root.getChildren().add(imageView3);

			// BorderPane root = new BorderPane();
			Scene scene = new Scene(root, 1900, 1000);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}//main
	
	private void Trailer1(String video1) {
		Stage trailer = new Stage();
		trailer.setTitle("Trailer");
		Media media =  new Media(getClass().getResource("BokuFilme.mp4").toExternalForm());
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		mediaPlayer.setAutoPlay(true);
		MediaView mediaView = new MediaView(mediaPlayer);
		mediaView.setFitHeight(600);
		mediaView.setFitWidth(800);
		AnchorPane trailerroot = new AnchorPane(mediaView);
		Scene trailer1 = new Scene(trailerroot, 720, 470);
		trailer.setScene(trailer1);
		trailer.show();
		mediaPlayer.play();
		
	}
		
		
		
		
	private void Trailer2(String video2) {
		Stage trailer2 = new Stage();
		trailer2.setTitle("Trailer");
		Media media2 =  new Media(getClass().getResource("HunterFilme.mp4").toExternalForm());
		MediaPlayer mediaPlayer2 = new MediaPlayer(media2);
		mediaPlayer2.setAutoPlay(true);
		MediaView mediaView2 = new MediaView(mediaPlayer2);
		mediaView2.setFitHeight(600);
		mediaView2.setFitWidth(800);
		AnchorPane trailerroot = new AnchorPane(mediaView2);
		Scene trailer3 = new Scene(trailerroot, 720, 470);
		trailer2.setScene(trailer3);
		trailer2.show();
		mediaPlayer2.play();
		
	}
		
	private void Trailer3(String video3) {
		Stage trailer5 = new Stage();
		trailer5.setTitle("Trailer");
		Media media5 =  new Media(getClass().getResource("DroganFilme.mp4").toExternalForm());
		MediaPlayer mediaPlayer5 = new MediaPlayer(media5);
		mediaPlayer5.setAutoPlay(true);
		MediaView mediaView5 = new MediaView(mediaPlayer5);
		mediaView5.setFitHeight(600);
		mediaView5.setFitWidth(800);
		AnchorPane trailerroot = new AnchorPane(mediaView5);
		Scene trailer6 = new Scene(trailerroot, 720, 470);
		trailer5.setScene(trailer6);
		trailer5.show();
		mediaPlayer5.play();
		
	}
		
		
		

		
	}

