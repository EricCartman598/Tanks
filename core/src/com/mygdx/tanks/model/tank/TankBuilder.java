package com.mygdx.tanks.model.tank;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;

public interface TankBuilder {
    TankBuilder setCoords(float x, float y);

    TankBuilder setDimensions(float width, float height);

    TankBuilder setTexture(Texture texture);

    TankBuilder setColor(Color color);

    TankBuilder setVelocity(int velocity);

    TankBuilder setBulletCount(int bulletCount);

    Tank build();
}
