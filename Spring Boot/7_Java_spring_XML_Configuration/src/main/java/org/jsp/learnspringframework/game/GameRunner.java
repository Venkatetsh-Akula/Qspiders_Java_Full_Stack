package org.jsp.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	private GamingConsole game;
	public GameRunner(GamingConsole game) {  //@Qualifier("SuperContraGameQulifer") 
		this.game=game;
	}
	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
