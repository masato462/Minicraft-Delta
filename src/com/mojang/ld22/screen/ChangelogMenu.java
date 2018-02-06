package com.mojang.ld22.screen;

import com.mojang.ld22.gfx.Color;
import com.mojang.ld22.gfx.Font;
import com.mojang.ld22.gfx.Screen;

public class ChangelogMenu extends Menu {
	private Menu parent;

	public ChangelogMenu(Menu parent) {
		this.parent = parent;
	}

	public void tick() {
		if (input.attack.clicked || input.menu.clicked) {
			game.setMenu(parent);
		}
	}

	public void render(Screen screen) {
		screen.clear(0);
		Font.draw("Minicraft Delta - Changelog", screen, 10 * 8 + 4, 1 * 8, Color.get(0, 555, 555, 555));
		Font.draw("Minicraft Delta - Alpha 0.1.1 2018/02/07", screen, 2 * 8 + 4, 3 * 8, Color.get(0, 500, 500, 500));
		Font.draw("First Release.", screen, 28 * 8 + 4, 4 * 8, Color.get(0, 500, 500, 500));
		Font.draw("Added:", screen, 4 * 8 + 4, 6 * 8, Color.get(0, 555, 555, 555));
		Font.draw("+ New Main Menu.", screen, 4 * 8 + 4, 7 * 8, Color.get(0, 333, 333, 333));
		Font.draw("+ Added Changelog Menu.", screen, 4 * 8 + 4, 8 * 8, Color.get(0, 333, 333, 333));
		Font.draw("+ Added New HUD.", screen, 4 * 8 + 4, 9 * 8, Color.get(0, 333, 333, 333));
		Font.draw("+ Added Wood Stick.", screen, 4 * 8 + 4, 10 * 8, Color.get(0, 333, 333, 333));
		
		Font.draw("Minicraft Delta - Alpha 0.1.0 Unreleased", screen, 2 * 8 + 4, 12 * 8, Color.get(0, 500, 500, 500));
		Font.draw("Added:", screen, 4 * 8 + 4, 14 * 8, Color.get(0, 555, 555, 555));
		Font.draw("+ Added Wood Log.", screen, 4 * 8 + 4, 15 * 8, Color.get(0, 333, 333, 333));
		Font.draw("+ Added Charcoal.", screen, 4 * 8 + 4, 16 * 8, Color.get(0, 333, 333, 333));
		Font.draw("+ Added Plank Recipe.", screen, 4 * 8 + 4, 17 * 8, Color.get(0, 333, 333, 333));
		Font.draw("+ Added Charcoal Recipe.", screen, 4 * 8 + 4, 18 * 8, Color.get(0, 333, 333, 333));
		Font.draw("+ Added Pause Menu.", screen, 4 * 8 + 4, 19 * 8, Color.get(0, 333, 333, 333));
		Font.draw("+ New Main Menu.", screen, 4 * 8 + 4, 20 * 8, Color.get(0, 333, 333, 333));
		Font.draw("Changes:", screen, 4 * 8 + 4, 22 * 8, Color.get(0, 555, 555, 555));
		Font.draw("> About Menu.", screen, 4 * 8 + 4, 23 * 8, Color.get(0, 333, 333, 333));
		Font.draw("> How to Play Nenu.", screen, 4 * 8 + 4, 24 * 8, Color.get(0, 333, 333, 333));
		Font.draw("> Large Window size.", screen, 4 * 8 + 4, 25 * 8, Color.get(0, 333, 333, 333));
	
	}
}