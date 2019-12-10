package com.mygdx.tanks.model.tank;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.mygdx.tanks.common.Contract;
import com.mygdx.tanks.model.bullet.Bullet;

public class PlayerTank extends Tank {
    public PlayerTank(Texture texture, float x, float y, float width, float height, int bulletsCount, int velocity) {
        super(texture, x, y, width, height, bulletsCount, velocity);
    }

    @Override
    public void draw(Batch batch) {
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            gameObject.setRotation(-90f);
            if((getX() + getWidth() < Contract.SCREEN_WIDTH)) {
                setX(getX() + 1);
            }
        } else if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            gameObject.setRotation(90f);
            if(getX() > 0) {
                setX(getX() - 1);
            }
        } else if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
            gameObject.setRotation(0f);
            if((getY() + getHeight() < Contract.SCREEN_HEIGHT)) {
                setY(getY() + 1);
            }
        } else if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            gameObject.setRotation(180f);
            if((getY() > 0)) {
                setY(getY() - 1);
            }
        }
        if(Gdx.input.isKeyPressed(Input.Keys.SPACE)) {
            attack();
        }

        for(Bullet bullet : shootedBullets) {
            if(bullet.isShot()) {
                bullet.setY(bullet.getY() + 2);
            }
        }
        super.draw(batch);
    }
}
