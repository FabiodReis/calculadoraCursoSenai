package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
			root.setStyle("-fx-background-color: gray ");

			Label lblCadastro = new Label();
			lblCadastro.setText("Cadastro");
			lblCadastro.setLayoutX(150);
			lblCadastro.setLayoutY(10);

			Label lblNome = new Label();
			lblNome.setText("Nome");
			lblNome.setLayoutX(50);
			lblNome.setLayoutY(100);

			TextField txtNome = new TextField();
			txtNome.setLayoutX(100);
			txtNome.setLayoutY(100);

			Label lblemail = new Label();
			lblemail.setText("Email");
			lblemail.setLayoutX(50);
			lblemail.setLayoutY(150);

			TextField txtemail = new TextField();
			txtemail.setLayoutX(100);
			txtemail.setLayoutY(150);

			Label lblCpf = new Label();
			lblCpf.setText("CPF");
			lblCpf.setLayoutX(50);
			lblCpf.setLayoutY(200);

			TextField txtCpf = new TextField();
			txtCpf.setLayoutX(100);
			txtCpf.setLayoutY(200);

			Label lblRg = new Label();
			lblRg.setText("Rg");
			lblRg.setLayoutX(50);
			lblRg.setLayoutY(250);

			TextField txtRg = new TextField();
			txtRg.setLayoutX(100);
			txtRg.setLayoutY(250);

			Button btnEnviar = new Button();
			btnEnviar.setText("Enviar");
			btnEnviar.setLayoutX(150);
			btnEnviar.setLayoutY(300);
			//btnEnviar.setStyle("-fx-background-color: bisque");
			//Fornecer uma inditificação ao botão enviar
			btnEnviar.setId("botao");
			
			
			String nome_Programador = "Fabio Reis";

			btnEnviar.setOnAction(new EventHandler<ActionEvent>() {

				public void handle(ActionEvent arg0) {
					System.out.println(txtNome.getText());
					System.out.println(txtemail.getText());
					System.out.println(txtCpf.getText());
					System.out.println(txtRg.getText());

					// Levando o nome do programador para a caixa de texto

					txtNome.setText(nome_Programador);

				}

			});

			root.getChildren().add(lblCadastro);
			root.getChildren().add(lblNome);
			root.getChildren().add(txtNome);
			root.getChildren().add(txtemail);
			root.getChildren().add(lblemail);
			root.getChildren().add(lblRg);
			root.getChildren().add(txtRg);
			root.getChildren().add(lblCpf);
			root.getChildren().add(txtCpf);
			root.getChildren().add(btnEnviar);

			// Capturando o clique do botao enviar

			// BorderPane root = new BorderPane();
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
