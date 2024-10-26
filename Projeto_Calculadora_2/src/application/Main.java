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
			txtPain.setMinSize(310, 50);
			txtPain.setId("barra");

			Button btnC = new Button();
			btnC.setText("c");
			btnC.setLayoutX(10);
			btnC.setLayoutY(80);
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

			Button btnRaiz = new Button();
			btnRaiz.setText("√");
			btnRaiz.setLayoutX(90);
			btnRaiz.setLayoutY(80);
			btnRaiz.setMinSize(70, 70);
			btnRaiz.setId("botao4");

			btnRaiz.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					num1 = Double.parseDouble(txtPain.getText());
					txtPain.setText("");
					operador = "√";
					resultado = Math.sqrt(num1);
					txtPain.setText(String.valueOf(resultado));

				}
			});

			Button btnPorc = new Button();
			btnPorc.setText("%");
			btnPorc.setLayoutX(170);
			btnPorc.setLayoutY(80);
			btnPorc.setMinSize(70, 70);
			btnPorc.setId("botao4");
			btnPorc.setOnAction(new EventHandler<ActionEvent>() {
			

				@Override
				public void handle(ActionEvent arg0) {
					txtPain.setText(txtPain.getText() + "%");

				}
			});

			Button btnDiv = new Button();
			btnDiv.setText("/");
			btnDiv.setLayoutX(250);
			btnDiv.setLayoutY(80);
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

			Button btnSete = new Button();
			btnSete.setText("7");
			btnSete.setLayoutX(10);
			btnSete.setLayoutY(160);
			btnSete.setMinSize(70, 70);
			String sete = "7";
			double umdouble = Double.parseDouble(sete);
			btnSete.setId("botao");

			btnSete.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					txtPain.setText(txtPain.getText() + "7");
				}
			});
			;

			Button btnOito = new Button();
			btnOito.setText("8");
			btnOito.setLayoutX(90);
			btnOito.setLayoutY(160);
			btnOito.setMinSize(70, 70);
			btnOito.setId("botao");

			btnOito.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					txtPain.setText(txtPain.getText() + "8");

				}
			});

			Button btnNove = new Button();
			btnNove.setText("9");
			btnNove.setLayoutX(170);
			btnNove.setLayoutY(160);
			btnNove.setMinSize(70, 70);
			btnNove.setId("botao");

			btnNove.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					txtPain.setText(txtPain.getText() + "9");

				}
			});

			Button btnQuatro = new Button();
			btnQuatro.setText("4");
			btnQuatro.setLayoutX(10);
			btnQuatro.setLayoutY(240);
			btnQuatro.setMinSize(70, 70);
			btnQuatro.setId("botao");

			btnQuatro.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					txtPain.setText(txtPain.getText() + "4");

				}
			});

			Button btnCinco = new Button();
			btnCinco.setText("5");
			btnCinco.setLayoutX(90);
			btnCinco.setLayoutY(240);
			btnCinco.setMinSize(70, 70);
			btnCinco.setId("botao");

			btnCinco.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					txtPain.setText(txtPain.getText() + "5");
				}
			});

			Button btnSeis = new Button();
			btnSeis.setText("6");
			btnSeis.setLayoutX(170);
			btnSeis.setLayoutY(240);
			btnSeis.setMinSize(70, 70);
			btnSeis.setId("botao");

			btnSeis.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					txtPain.setText(txtPain.getText() + "6");
				}
			});

			Button btnUm = new Button();
			btnUm.setText("1");
			btnUm.setLayoutX(10);
			btnUm.setLayoutY(320);
			btnUm.setMinSize(70, 70);
			btnUm.setId("botao");

			btnUm.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					txtPain.setText(txtPain.getText() + "1");

				}
			});

			Button btnDois = new Button();
			btnDois.setText("2");
			btnDois.setLayoutX(90);
			btnDois.setLayoutY(320);
			btnDois.setMinSize(70, 70);
			btnDois.setId("botao");

			btnDois.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					txtPain.setText(txtPain.getText() + "2");
				}
			});

			Button btnTres = new Button();
			btnTres.setText("3");
			btnTres.setLayoutX(170);
			btnTres.setLayoutY(320);
			btnTres.setMinSize(70, 70);
			btnTres.setId("botao");

			btnTres.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					txtPain.setText(txtPain.getText() + "3");
				}
			});

			Button btnZero = new Button();
			btnZero.setText("0");
			btnZero.setLayoutX(10);
			btnZero.setLayoutY(400);
			btnZero.setMinSize(150, 70);
			btnZero.setId("botao");

			btnZero.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					txtPain.setText(txtPain.getText() + "0");
				}
			});

			Button btnVirg = new Button();
			btnVirg.setText(".");
			btnVirg.setLayoutX(170);
			btnVirg.setLayoutY(400);
			btnVirg.setMinSize(70, 70);
			btnVirg.setId("botao");

			btnVirg.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					txtPain.setText(txtPain.getText() + ".");
				}
			});

			Button btnMult = new Button();
			btnMult.setText("x");
			btnMult.setLayoutX(250);
			btnMult.setLayoutY(160);
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

			Button btnMenos = new Button();
			btnMenos.setText("-");
			btnMenos.setLayoutX(250);
			btnMenos.setLayoutY(240);
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

			Button btnMais = new Button();
			btnMais.setText("+");
			btnMais.setLayoutX(250);
			btnMais.setLayoutY(320);
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

			Button btnResu = new Button();
			btnResu.setText("=");
			btnResu.setLayoutX(250);
			btnResu.setLayoutY(400);
			btnResu.setMinSize(70, 70);
			btnResu.setId("botao2");

			btnResu.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					num2 = Double.parseDouble(txtPain.getText());

					switch (operador) {
					case "+":
						resultado = num1 + num2;
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

			root.getChildren().add(btnZero);
			root.getChildren().add(btnMais);
			root.getChildren().add(btnMenos);
			root.getChildren().add(btnMult);
			root.getChildren().add(btnDiv);
			root.getChildren().add(btnPorc);
			root.getChildren().add(btnVirg);
			root.getChildren().add(btnResu);
			root.getChildren().add(txtPain);
			root.getChildren().add(btnC);
			root.getChildren().add(btnRaiz);

			// BorderPane root = new BorderPane();
			Scene scene = new Scene(root, 340, 500);
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
