package com.mygdx.tanks.model.tank;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.tanks.model.SpriteCreator;

public class TankCreator implements SpriteCreator<Tank> {
    @Override
    public Tank getInstance(Texture texture, float x, float y, float width, float height) {
        return new Tank(texture, x, y, width, height);
    }
}


