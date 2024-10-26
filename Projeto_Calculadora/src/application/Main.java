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
	String operador = "";
	double num1 = 0;
	double num2 = 0;
	double resultado = 0;
	
	@Override

	public void start(Stage primaryStage) {
		try {

			

			AnchorPane root = new AnchorPane();
			root.setId("back");
			Label lblCaluladora = new Label();
			lblCaluladora.setText("");
			lblCaluladora.setLayoutX(150);
			lblCaluladora.setLayoutY(5);
			lblCaluladora.setId("Calc");
			

			TextField txtPain = new TextField();
			txtPain.setLayoutX(10);
			txtPain.setLayoutY(25);
			txtPain.setMinSize(390, 50);
			txtPain.setId("barra");

			Button btnUm = new Button();
			btnUm.setText("1");
			btnUm.setLayoutX(10);
			btnUm.setLayoutY(80);
			btnUm.setMinSize(70, 70);
			String um = "1";
			double umdouble = Double.parseDouble(um);
			btnUm.setId("botao");

			btnUm.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					txtPain.setText(txtPain.getText()+"1");
				}
			});
			;

			Button btnDois = new Button();
			btnDois.setText("2");
			btnDois.setLayoutX(90);
			btnDois.setLayoutY(80);
			btnDois.setMinSize(70, 70);
			btnDois.setId("botao");
			
			

			btnDois.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					txtPain.setText(txtPain.getText()+"2");

				}
			});

			Button btnTres = new Button();
			btnTres.setText("3");
			btnTres.setLayoutX(170);
			btnTres.setLayoutY(80);
			btnTres.setMinSize(70, 70);
			btnTres.setId("botao");
			

			btnTres.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					txtPain.setText(txtPain.getText()+"3");

				}
			});

			Button btnQuatro = new Button();
			btnQuatro.setText("4");
			btnQuatro.setLayoutX(10);
			btnQuatro.setLayoutY(160);
			btnQuatro.setMinSize(70, 70);
			btnQuatro.setId("botao");
			
			
			btnQuatro.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					txtPain.setText(txtPain.getText()+"4");

				}
			});

			Button btnCinco = new Button();
			btnCinco.setText("5");
			btnCinco.setLayoutX(90);
			btnCinco.setLayoutY(160);
			btnCinco.setMinSize(70, 70);
			btnCinco.setId("botao");
			
			
			btnCinco.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					txtPain.setText(txtPain.getText()+"5");
				}
			});

			Button btnSeis = new Button();
			btnSeis.setText("6");
			btnSeis.setLayoutX(170);
			btnSeis.setLayoutY(160);
			btnSeis.setMinSize(70, 70);
			btnSeis.setId("botao");

			btnSeis.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					txtPain.setText(txtPain.getText()+"6");
				}
			});

			Button btnSete = new Button();
			btnSete.setText("7");
			btnSete.setLayoutX(10);
			btnSete.setLayoutY(240);
			btnSete.setMinSize(70, 70);
			btnSete.setId("botao");
			

			btnSete.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					txtPain.setText(txtPain.getText()+"7");

				}
			});

			Button btnOito = new Button();
			btnOito.setText("8");
			btnOito.setLayoutX(90);
			btnOito.setLayoutY(240);
			btnOito.setMinSize(70, 70);
			btnOito.setId("botao");
			
			btnOito.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					txtPain.setText(txtPain.getText()+"8");
				}
			});

			Button btnNove = new Button();
			btnNove.setText("9");
			btnNove.setLayoutX(170);
			btnNove.setLayoutY(240);
			btnNove.setMinSize(70, 70);
			btnNove.setId("botao");
			
			btnNove.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					txtPain.setText(txtPain.getText()+"9");
				}
			});

			Button btnC = new Button();
			btnC.setText("c");
			btnC.setLayoutX(10);
			btnC.setLayoutY(320);
			btnC.setMinSize(70, 70);
			btnC.setId("botao4");
			

			btnC.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					num1 = 0;
					num2 = 0;
					txtPain.setText("");
					operador = "";
					
				}
			});

			Button btnZero = new Button();
			btnZero.setText("0");
			btnZero.setLayoutX(90);
			btnZero.setLayoutY(320);
			btnZero.setMinSize(150, 70);
			btnZero.setId("botao");

			btnZero.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					txtPain.setText(txtPain.getText()+"0");

				}
			});

			Button btnMais = new Button();
			btnMais.setText("+");
			btnMais.setLayoutX(250);
			btnMais.setLayoutY(80);
			btnMais.setMinSize(70, 70);
			btnMais.setId("botao2");
		

			

			btnMais.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					num1 = Double.parseDouble(txtPain.getText());
					txtPain.setText("");
					operador = "+";

				}
			});

			Button btnMenos = new Button();
			btnMenos.setText("-");
			btnMenos.setLayoutX(250);
			btnMenos.setLayoutY(160);
			btnMenos.setMinSize(70, 70);
			btnMenos.setId("botao2");
		

			btnMenos.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					num1 = Double.parseDouble(txtPain.getText());
					txtPain.setText("");
					operador = "-";
				}
			});

			Button btnMult = new Button();
			btnMult.setText("*");
			btnMult.setLayoutX(250);
			btnMult.setLayoutY(240);
			btnMult.setMinSize(70, 70);
			btnMult.setId("botao2");

			btnMult.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					num1 = Double.parseDouble(txtPain.getText());
					txtPain.setText("");
					operador = "*";
				}
			});

			Button btnDiv = new Button();
			btnDiv.setText("/");
			btnDiv.setLayoutX(250);
			btnDiv.setLayoutY(320);
			btnDiv.setMinSize(70, 70);
			btnDiv.setId("botao2");

			btnDiv.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					num1 = Double.parseDouble(txtPain.getText());
					txtPain.setText("");
					operador = "/";
				}
			});

			Button btnPorc = new Button();
			btnPorc.setText("√");
			btnPorc.setLayoutX(330);
			btnPorc.setLayoutY(80);
			btnPorc.setMinSize(70, 70);
			btnPorc.setId("botao2");

			

			btnPorc.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					num1 = Double.parseDouble(txtPain.getText());
					txtPain.setText("");
					operador = "√";
					resultado = Math.sqrt(num1);
					txtPain.setText(String.valueOf(resultado));
					
				}
			});

			Button btnVirg = new Button();
			btnVirg.setText(",");
			btnVirg.setLayoutX(330);
			btnVirg.setLayoutY(160);
			btnVirg.setMinSize(70, 70);
			btnVirg.setId("botao2");

			

			btnVirg.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					txtPain.setText(txtPain.getText()+".");
				}
			});

			Button btnResu = new Button();
			btnResu.setText("=");
			btnResu.setLayoutX(330);
			btnResu.setLayoutY(240);
			btnResu.setMinSize(70, 150);
			btnResu.setId("botao3");

			btnResu.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					num2 = Double.parseDouble(txtPain.getText());

					switch (operador) {
					case "+":
						resultado = num1+num2;
						txtPain.setText(String.valueOf(resultado));
						break;
					case "-":
						resultado = num1 - num2;
						txtPain.setText(String.valueOf(resultado));
						
						break;
					case "*":
						resultado = num1 * num2;
						txtPain.setText(String.valueOf(resultado));
						break;
					case "/":
						resultado = num1 / num2;
						txtPain.setText(String.valueOf(resultado));
						break;
						
					}

				}
			});

			

			root.getChildren().add(lblCaluladora);
			root.getChildren().add(btnUm);
			root.getChildren().add(btnDois);
			root.getChildren().add(btnTres);
			root.getChildren().add(btnQuatro);
			root.getChildren().add(btnCinco);
			root.getChildren().add(btnSeis);
			root.getChildren().add(btnSete);
			root.getChildren().add(btnOito);
			root.getChildren().add(btnNove);
			root.getChildren().add(btnC);
			root.getChildren().add(btnZero);
			root.getChildren().add(btnMais);
			root.getChildren().add(btnMenos);
			root.getChildren().add(btnMult);
			root.getChildren().add(btnDiv);
			root.getChildren().add(btnPorc);
			root.getChildren().add(btnVirg);
			root.getChildren().add(btnResu);
			root.getChildren().add(txtPain);

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
