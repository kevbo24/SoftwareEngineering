package PokerView;

import PokerModel.Player;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.HBox;

public class PlayerPanelView {
	
	
	public HBox playerBox = new HBox();
	public int finalNumberPlayer;
	
	public PlayerView PV;
	public Player player;
	public ControlPanelView CPV;
	
	
	//constructor
	public PlayerPanelView(ControlPanelView CPV) {
		this.CPV = CPV;
		
		getNumberPlayer();
		
	       for (int i = 0; i < finalNumberPlayer; i++) {
	           PV = new PlayerView();
	           player = new Player("Player " + i);
	           setPlayerName();
	           playerBox.getChildren().add(PV.getPlayerPanel());
	        }       
	}

	
	
	public HBox getPlayerPanel() {	
		return playerBox;
	}
	
    public void setPlayerName() {
    	String name = player.getPlayerName();
    	PV.lblPlayerName.setText(name);
    }
    
	public void getNumberPlayer () {
		CPV.getTFNumberPlayer();
		
		finalNumberPlayer = 5;
    	if(CPV.numberPlayer>10) {
    		Alert alert = new Alert(AlertType.ERROR, "too much Players - max 10");
    		alert.showAndWait();
    	}
    	if(CPV.numberPlayer>2){ 
    		finalNumberPlayer = CPV.numberPlayer;
    	}
	}

}


