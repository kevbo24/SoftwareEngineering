package PokerView;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class PlayerView {
	
	public VBox playerPanel = new VBox();
	public HBox cardPlayer = new HBox();
	public Label lblPlayerName = new Label();
	public Label hand = new Label("Street");
	public Label result = new Label("Winner");
	
	
	
	//constructor
    public PlayerView() {
	
	playerPanel.getChildren().addAll(lblPlayerName, cardPlayer, hand, result);
	
    for (int i = 0; i < 5; i++) {
         Label card = new Label("King");
         cardPlayer.getChildren().add(card);
     }
 
 }

    public VBox getPlayerPanel() {
	return playerPanel;
}

}
