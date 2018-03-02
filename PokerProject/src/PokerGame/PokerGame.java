package PokerGame;

import PokerController.PokerGameController;
import PokerModel.PokerGameModel;
import PokerView.PokerGameView;
import javafx.application.Application;
import javafx.stage.Stage;


public class PokerGame extends Application{
	
	PokerGameView PGV;
	PokerGameController PGC;
	PokerGameModel PGM;
	

    public static void main(String[] args) {
        launch();
    }
    
    @Override
	public void start(Stage primaryStage) {
    	
    PGV = new PokerGameView(primaryStage);
	PGC = new PokerGameController(PGV);
	PGM = new PokerGameModel();

    }

}
