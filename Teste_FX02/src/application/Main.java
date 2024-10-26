package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = new AnchorPane();
			Label lblNome = new Label();
			lblNome.setLayoutX(100);
			lblNome.setLayoutY(50);

			Label lblSenha = new Label();
			lblSenha.setText("Senha");
			lblSenha.setLayoutX(100);
			lblSenha.setLayoutY(100);
			lblSenha.setId("Label");

			TextField txtNome = new TextField();
			txtNome.setLayoutX(150);
			txtNome.setLayoutY(50);

			TextField txtSenha = new TextField();
			txtSenha.setLayoutX(150);
			txtSenha.setLayoutY(100);

			Button btnEnviar = new Button();
			btnEnviar.setText("Enviar");
			btnEnviar.setLayoutX(150);
			btnEnviar.setLayoutY(150);
			btnEnviar.setId("botao");
			btnEnviar.setMinSize(50, 50);
			
			
			
			root.getChildren().add(btnEnviar);
			root.getChildren().add(txtSenha);
			root.getChildren().add(lblSenha);
			root.getChildren().add(lblNome);
			root.getChildren().add(txtNome);
			lblNome.setText("Nome");

			// BorderPane root = new BorderPane();
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private TextField TextField() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
