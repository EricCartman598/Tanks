package com.mygdx.tanks.model.tank;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.mygdx.tanks.model.GameObject;
import com.mygdx.tanks.model.bullet.Bullet;

import java.util.ArrayList;
import java.util.List;

public class Tank extends GameObject {

    int bulletsCount;
    int velocity;
    List<Bullet> shootedBullets = new ArrayList<>();
    private Texture bulletTexture = new Texture(Gdx.files.internal("bullet.png"));;

    public Tank(Texture texture, float x, float y, float width, float height) {
        super(texture, x, y, width, height);
    }

    public Tank(Texture texture, float x, float y, float width, float height, int bulletsCount, int velocity) {
        this(texture, x, y, width, height);
        this.bulletsCount = bulletsCount;
        this.velocity = velocity;
    }

    public List<Bullet> getShootedBullets() {
        return shootedBullets;
    }

    public void setShootedBullets(List<Bullet> shootedBullets) {
        this.shootedBullets = shootedBullets;
    }

    @Override
    public void draw(Batch batch) {
        super.draw(batch);
    }

    public void attack() {
        if(bulletsCount <= 0) {
            return;
        }

        shootedBullets.add(new Bullet(bulletTexture, getX() + (getWidth() / 2) - (float)(bulletTexture.getWidth() / 2), getY() + getHeight(), 18, 15));
        for(Bullet bullet : shootedBullets) {
            bullet.setShot(true);
        }
        bulletsCount --;
    }
}
