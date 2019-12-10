package com.mygdx.tanks.model.tank.builder;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.tanks.model.tank.Tank;

public abstract class TankBuilderImpl implements TankBuilder {
    Texture texture = new Texture(Gdx.files.internal("yellow_tank.jpg"));
    float x = 0f;
    float y = 0f;
    float width = 22f;
    float height = 24f;
    int bulletsCount = 1;
    int velocity = 2;
    Color color = new Color(0f, 1f, 0f, 1f);

    @Override
    public TankBuilder setCoordinates(float x, float y) {
        this.x = x;
        this.y = y;
        return this;
    }

    @Override
    public TankBuilder setDimensions(float width, float height) {
        this.width = width;
        this.height = height;
        return this;
    }

    @Override
    public TankBuilder setTexture(Texture texture) {
        this.texture = texture;
        return this;
    }

    @Override
    public TankBuilder setColor(Color color) {
        this.color = color;
        return this;
    }

    @Override
    public TankBuilder setVelocity(int velocity) {
        this.velocity = velocity;
        return this;
    }

    @Override
    public TankBuilder setBulletCount(int bulletCount) {
        this.bulletsCount = bulletCount;
        return this;
    }

    @Override
    public abstract Tank build();
}
