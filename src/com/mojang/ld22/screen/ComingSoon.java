package com.mojang.ld22.screen;

import com.mojang.ld22.gfx.Color;
import com.mojang.ld22.gfx.Font;
import com.mojang.ld22.gfx.Screen;

public class ComingSoon extends Menu {
	private Menu parent;

	public ComingSoon(Menu parent) {
		this.parent = parent;
	}

	public void tick() {
		if (input.attack.clicked || input.menu.clicked) {
			game.setMenu(parent);
		}
	}

	public void render(Screen screen) {
		screen.clear(0);
		Font.draw("Coming Soon...?", screen, 15 * 8 + 4, 1 * 8, Color.get(0, 555, 555, 555));
		Font.draw("I'dont know Java.", screen, 15 * 8 + 4, 5 * 8, Color.get(0, 555, 555, 555));
	}
}