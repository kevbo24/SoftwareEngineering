package PokerController;

import PokerView.PokerGameView;

public class PokerGameController {
	
	public PokerGameView view;
	
	
	public PokerGameController(PokerGameView view) {
		this.view = view;
		
		view.getShuffleButton().setOnAction( e -> shuffle());
	}
	
	public void shuffle() {
		
	}
	}


