package com.mygdx.tanks.model.tank;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;

public class TankBuilderImpl implements TankBuilder {
    private Texture texture = new Texture(Gdx.files.internal("yellow_tank.jpg"));
    private float x = 0f;
    private float y = 0f;
    private float width = 22f;
    private float height = 24f;
    private int bulletsCount = 1;
    private int velocity = 2;
    private Color color = new Color(0f, 1f, 0f, 1f);

    @Override
    public TankBuilder setCoords(float x, float y) {
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
    public Tank build() {
        return new Tank(texture, x, y, width, height, bulletsCount, velocity, color);
    }

}
