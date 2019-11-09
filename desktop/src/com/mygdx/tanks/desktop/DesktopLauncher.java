package com.mygdx.tanks.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.tanks.Main;
import com.mygdx.tanks.common.Contract;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = Contract.SCREEN_WIDTH;
		config.height = Contract.SCREEN_HEIGHT;
		new LwjglApplication(new Main(), config);
	}
}
