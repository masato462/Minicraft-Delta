package com.mojang.ld22.screen;

import com.mojang.ld22.entity.Player;
import com.mojang.ld22.gfx.Color;
import com.mojang.ld22.gfx.Font;
import com.mojang.ld22.gfx.Screen;
import com.mojang.ld22.sound.Sound;

public class PauseMenu extends Menu {
	private int selected = 0;
	private String[] options = {"Resume game", "how to play","new game", "save game", "load game", "end game", "Quit"};

	public PauseMenu(Player player) {
	}

	public void tick() {
		if (input.up.clicked) selected--;
		if (input.down.clicked) selected++;

		int len = options.length;
		if (selected < 0) selected += len;
		if (selected >= len) selected -= len;

		if (input.attack.clicked || input.menu.clicked) {
			if (selected == 2) {
				Sound.test.play();
				game.resetGame();
				game.setMenu(null);
			}
			if (selected == 0) {
				Sound.test.play();
				game.setMenu(null);
			}
			if (selected == 1) game.setMenu(new InstructionsMenu(this));
			if (selected == 3) game.setMenu(new ComingSoon(this));
			if (selected == 4) game.setMenu(new ComingSoon(this));
			if (selected == 5) 
				{
				game.resetGame();
				game.setMenu(new TitleMenu());
				}
			if (selected == 6) System.exit(0);
		}
		if (input.escape.clicked) {
			Sound.test.play();
			game.setMenu(null);
		}
	}
	
	public void render(Screen screen) {
		//screen.clear(0);
		Font.renderFrame(screen, "Pause Menu", 10, 5, 35, 22);//10, 5, 35, 20

		for (int i = 0; i < 7; i++) {
			String msg = options[i];
			int col = Color.get(5, 333, 333, 333);
			if (i == selected) {
				msg = "> " + msg + " <";
				col = Color.get(5, 5, 5, 550);
			}//8
			Font.draw(msg, screen, (screen.w - msg.length() * 8) / 2, (5 + i) * 13, col);
		}

		Font.draw("(W) and (S) to move,", screen, 85, screen.h - 49, Color.get(5, 222, 222, 222));
		Font.draw("(C) and (X) to Select.", screen, 85, screen.h - 59, Color.get(5, 222, 222, 222));
	}
}