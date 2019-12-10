package com.mygdx.tanks.model.tank.builder;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.tanks.model.tank.Tank;

public interface TankBuilder {
    TankBuilder setCoordinates(float x, float y);

    TankBuilder setDimensions(float width, float height);

    TankBuilder setTexture(Texture texture);

    TankBuilder setColor(Color color);

    TankBuilder setVelocity(int velocity);

    TankBuilder setBulletCount(int bulletCount);

    Tank build();
}
