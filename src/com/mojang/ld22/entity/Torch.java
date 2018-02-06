package com.mojang.ld22.entity;

import com.mojang.ld22.gfx.Color;

public class Torch extends Furniture {
	public Torch() {
		super("Torch");
		col = Color.get(-1, 100, 111, 555);//100 = 000
		sprite = 5;
		xr = 3;
		yr = 2;
	}

	public int getLightRadius() {
		return 5;
	}
}