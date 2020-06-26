package gui;

<<<<<<< HEAD
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
=======
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
>>>>>>> d7208b2c44acfe0b38b687a401c0ebfd11ccfc1b

public class MainViewController implements Initializable {

	@FXML
	private MenuItem interagir;

	@FXML
	private MenuItem adicionar;

	@FXML
	private MenuItem sobre;

	@FXML
	private void onMenuItemListarAction() {
		System.out.println("LISTAR");
	}

	@FXML
	private void onMenuItemInteragirAction() {
		System.out.println("INTERAGIR");
	}

	@FXML
	private void onMenuItemSobreAction() {
<<<<<<< HEAD
		loadView("/gui/SobreView.fxml");
=======
		System.out.println("SOBRE");
>>>>>>> d7208b2c44acfe0b38b687a401c0ebfd11ccfc1b
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}
<<<<<<< HEAD
	
	private void loadView(String path) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(path));
			VBox newVbox = loader.load();
			
			Scene mainScene = Main.getMainScene();
			VBox mainVBox = (VBox)((ScrollPane)mainScene.getRoot()).getContent();
			
			Node mainMenu = mainVBox.getChildren().get(0);
			mainVBox.getChildren().clear();
			
			mainVBox.getChildren().add(mainMenu);
			mainVBox.getChildren().addAll(newVbox.getChildren());
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
=======
>>>>>>> d7208b2c44acfe0b38b687a401c0ebfd11ccfc1b

}
