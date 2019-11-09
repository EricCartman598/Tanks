package com.mygdx.tanks.model.bullet;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.mygdx.tanks.model.GameObject;

public class Bullet extends GameObject {
    private boolean isShot = false;

    public boolean isShot() {
        return isShot;
    }

    public void setShot(boolean shot) {
        isShot = shot;
    }

    public Bullet(Texture texture, float x, float y, float width, float height) {
        super(texture, x, y, width, height);
    }

    @Override
    public void draw(Batch batch) {
        if(isShot) {
            super.draw(batch);
        }
    }
}
