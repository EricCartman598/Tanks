package com.mygdx.tanks.model.tank;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.mygdx.tanks.common.Contract;
import com.mygdx.tanks.model.GameObject;
import com.mygdx.tanks.model.bullet.Bullet;

import java.util.ArrayList;
import java.util.List;

public class Tank extends GameObject {
    private int bulletsCount;
    private int velocity;
    private Color color;
    private List<Bullet> shootedBullets = new ArrayList<>();
    private Texture bulletTexture;

    public List<Bullet> getShootedBullets() {
        return shootedBullets;
    }

    public void setShootedBullets(List<Bullet> shootedBullets) {
        this.shootedBullets = shootedBullets;
    }

    public Tank(Texture texture, float x, float y, float width, float height) {
        super(texture, x, y, width, height);
        bulletTexture = new Texture(Gdx.files.internal("bullet.png"));
    }

    public Tank(Texture texture, float x, float y, float width, float height, int bulletsCount, int velocity, Color color) {
        this(texture, x, y, width, height);
        this.bulletsCount = bulletsCount;
        this.velocity = velocity;
        this.color = color;
    }

    @Override
    public void draw(Batch batch) {
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            getGameObject().setRotation(-90f);
            if((this.getBounds().getX() + this.getBounds().getWidth() < Contract.SCREEN_WIDTH)) {
                this.getBounds().setX(getBounds().getX() + 1);
            }
        } else if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            getGameObject().setRotation(90f);
            if(this.getBounds().getX() > 0) {
                this.getBounds().setX(getBounds().getX() - 1);
            }
        } else if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
            getGameObject().setRotation(0f);
            if((this.getBounds().getY() + this.getBounds().getHeight() < Contract.SCREEN_HEIGHT)) {
                this.getBounds().setY(getBounds().getY() + 1);
            }
        } else if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            getGameObject().setRotation(180f);
            if((this.getBounds().getY() > 0)) {
                this.getBounds().setY(getBounds().getY() - 1);
            }
        }
        if(Gdx.input.isKeyPressed(Input.Keys.SPACE)) {
            attack();
        }

        for(Bullet bullet : shootedBullets) {
            if(bullet.isShot()) {
                bullet.getBounds().setY(bullet.getBounds().getY() + 2);
            }
        }
        super.draw(batch);
    }

    private void attack() {
        if(bulletsCount <= 0) {
            return;
        }

        shootedBullets.add(new Bullet(bulletTexture, getBounds().getX() + (getBounds().getWidth() / 2) - (float)(bulletTexture.getWidth() / 2), getBounds().getY() + getBounds().getHeight(), 18, 15));
        for(Bullet bullet : shootedBullets) {
            bullet.setShot(true);
        }
        bulletsCount --;
    }
}
