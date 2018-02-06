package com.mojang.ld22.screen;

import com.mojang.ld22.gfx.Color;
import com.mojang.ld22.gfx.Font;
import com.mojang.ld22.gfx.Screen;
import com.mojang.ld22.sound.Sound;

public class TitleMenu extends Menu {
	private int selected = 0;

	private static final String[] options = { "Start game", "load game", "How to play", "About", "Changelog", "Quit" };

	public TitleMenu() {
	}

	public void tick() {
		if (input.up.clicked) selected--;
		if (input.down.clicked) selected++;

		int len = options.length;
		if (selected < 0) selected += len;//0
		if (selected >= len) selected -= len;

		if (input.attack.clicked || input.menu.clicked) {
			if (selected == 0) {
				Sound.test.play();
				game.resetGame();
				game.setMenu(null);
			}
			if (selected == 1) game.setMenu(new ComingSoon(this));
			if (selected == 2) game.setMenu(new InstructionsMenu(this));
			if (selected == 3) game.setMenu(new AboutMenu(this));
			if (selected == 4) game.setMenu(new ChangelogMenu(this));
			if (selected == 5) System.exit(0);
		}
	}

	public void render(Screen screen) {
		//screen.clear(0);

		int h = 2;
		int w = 13;
		int titleColor = Color.get(-1, 010, 131, 551);
		int xo = (screen.w - w * 8) / 2;
		int yo = 24;
		for (int y = 0; y < h; y++) {
			for (int x = 0; x < w; x++) {
				screen.render(xo + x * 8, yo + y * 8, x + (y + 6) * 32, titleColor, 0);
			}
		}

		Font.renderFrame(screen, "", 10, 5, 35, 22);//10, 5, 35, 20

		for (int i = 0; i < 6; i++) {
			String msg = options[i];
			int col = Color.get(5, 333, 333, 333);
			if (i == selected) {
				msg = "> " + msg + " <";
				col = Color.get(5, 5, 5, 550);
			}//8
			Font.draw(msg, screen, (screen.w - msg.length() * 8) / 2, (5 + i) * 13, col);
		}
		
		Font.draw("(W) and (S) to move,", screen, 92, screen.h - 35, Color.get(-1, 555, 555, 555));
		Font.draw("(C) and (X) to Select.", screen, 92, screen.h -25, Color.get(-1, 555, 555, 555));
		Font.draw("Alpha Version", screen, 256, screen.h - 8, Color.get(-1, 500, 500, 500));
		Font.draw("Minicraft Delta - Alpha Testing Version", screen, 0, screen.h - 220, Color.get(-1, 555, 555, 555));
	}
}