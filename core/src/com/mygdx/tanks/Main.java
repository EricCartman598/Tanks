package com.mygdx.tanks;

import com.badlogic.gdx.Game;
import com.mygdx.tanks.view.GameScreen;

public class Main extends Game {

	@Override
	public void create () {
		setScreen(new GameScreen());
	}
}
