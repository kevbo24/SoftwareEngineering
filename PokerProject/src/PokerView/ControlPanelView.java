package PokerView;


import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class ControlPanelView extends HBox{
	
	public HBox controlPanel = new HBox();
	public Button deal = new Button("Deal");
	public Button shuffle = new Button("Shuffle");
	public Label deck = new Label ("deck");
	public Label textPlayer = new Label("max 10 Players");
	public TextField TFNumberPlayer = new TextField();
	
	public int numberPlayer;
	
	
	//constructor
	public ControlPanelView() {
		
    TFNumberPlayer.setPrefColumnCount(3);

	this.getChildren().addAll(deck, textPlayer, TFNumberPlayer, shuffle, deal);
	this.setId("controlPanel");
	
	}
	
	
	
	public HBox getControlPanel() {
		return controlPanel;
	}
	
	public int getTFNumberPlayer() {
			String text = TFNumberPlayer.getText();
			if(!text.isEmpty()) {
			numberPlayer = Integer.parseInt(text);
			}
			return numberPlayer;
		}
	
}
