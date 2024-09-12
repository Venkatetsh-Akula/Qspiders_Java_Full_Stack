package org.jsp.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	private GamingConsole game;
	public GameRunner(@Qualifier("SuperContraGameQulifer") GamingConsole game) {
		this.game=game;
	}
	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
