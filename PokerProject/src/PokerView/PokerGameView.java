package PokerView;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class PokerGameView {
	
	private ControlPanelView CPV = new ControlPanelView();
	private PlayerPanelView PPV = new PlayerPanelView(CPV);
	
	
	public PokerGameView (Stage primaryStage){		
	
	BorderPane window = new BorderPane();
	
	window.setBottom(CPV);
    window.setCenter(PPV.getPlayerPanel());


	Scene scene = new Scene(window);
	scene.getStylesheets().add(getClass().getResource("poker.css").toExternalForm());

	primaryStage.setScene(scene);
	primaryStage.setTitle("Poker Game");
	primaryStage.show();
}
	
	public Button getShuffleButton() {
		return CPV.shuffle;
	}
	
}
