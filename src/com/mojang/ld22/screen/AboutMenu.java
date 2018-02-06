package com.mojang.ld22.screen;

import com.mojang.ld22.gfx.Color;
import com.mojang.ld22.gfx.Font;
import com.mojang.ld22.gfx.Screen;

public class AboutMenu extends Menu {
	private Menu parent;

	public AboutMenu(Menu parent) {
		this.parent = parent;
	}

	public void tick() {
		if (input.attack.clicked || input.menu.clicked) {
			game.setMenu(parent);
		}
	}

	public void render(Screen screen) {
		screen.clear(0);
		Font.draw("About Minicraft Delta", screen, 13 * 8 + 4, 1 * 8, Color.get(0, 555, 555, 555));
		Font.draw("", screen, 0 * 8 + 4, 2 * 8, Color.get(0, 333, 333, 333));
		Font.draw("Minicraft Delta", screen, 4 * 8 + 4, 3 * 8, Color.get(0, 500, 500, 500));
		Font.draw(" was made by masato59.", screen, 19 * 8 + 4, 3 * 8, Color.get(0, 333, 333, 333));
		Font.draw("More Added Items. modified in 2017.", screen, 4 * 8 + 4, 4 * 8, Color.get(0, 333, 333, 333));
		Font.draw("Minicraft ", screen, 4 * 8 + 4, 6 * 8, Color.get(0, 555, 555, 555));
		Font.draw("was made by Markus Persson", screen, 14 * 8 + 4, 6 * 8, Color.get(0, 333, 333, 333));
		Font.draw("For the 22'nd ludum dare competition", screen, 4 * 8 + 4, 7 * 8, Color.get(0, 333, 333, 333));
		Font.draw("in december 2011.", screen, 4 * 8 + 4, 8 * 8, Color.get(0, 333, 333, 333));
		Font.draw("it is dedicated to my father. <3", screen, 4 * 8 + 4, 9 * 8, Color.get(0, 333, 333, 333));
	}
}