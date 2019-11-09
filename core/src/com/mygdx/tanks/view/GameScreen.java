package com.mygdx.tanks.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.tanks.model.SpriteCreator;
import com.mygdx.tanks.model.bullet.Bullet;
import com.mygdx.tanks.model.tank.Tank;
import com.mygdx.tanks.model.tank.TankBuilder;
import com.mygdx.tanks.model.tank.TankBuilderImpl;
import com.mygdx.tanks.model.tank.TankCreator;

public class GameScreen implements Screen {
    private Batch batch;
    private Tank tank;
    private TankBuilder tankBuilder = new TankBuilderImpl();
    private SpriteCreator<Tank> tankCreator = new TankCreator(tankBuilder);

    @Override
    public void show() {
        batch = new SpriteBatch();
        tankBuilder.setCoords(0f, 0f);
        tank = tankCreator.getInstance();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        tank.draw(batch);
        for(Bullet bullet : tank.getShootedBullets()) {
            bullet.draw(batch);
        }
        batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
