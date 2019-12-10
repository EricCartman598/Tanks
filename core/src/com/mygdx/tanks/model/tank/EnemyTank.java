package com.mygdx.tanks.model.tank;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

public class EnemyTank extends Tank {
    public EnemyTank(Texture texture, float x, float y, float width, float height, int bulletsCount, int velocity) {
        super(texture, x, y, width, height, bulletsCount, velocity);
    }

    @Override
    public void draw(Batch batch) {
        super.draw(batch);
    }
}
