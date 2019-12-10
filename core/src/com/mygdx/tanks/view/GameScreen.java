package com.mygdx.tanks.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.tanks.common.Contract;
import com.mygdx.tanks.model.bullet.Bullet;
import com.mygdx.tanks.model.tank.Tank;
import com.mygdx.tanks.model.tank.builder.EnemyTankBuilderImpl;
import com.mygdx.tanks.model.tank.builder.PlayerTankBuilderImpl;
import com.mygdx.tanks.model.tank.builder.TankBuilder;
import com.mygdx.tanks.model.tank.creator.TankCreator;
import com.mygdx.tanks.model.tank.creator.TankCreatorImpl;

public class GameScreen implements Screen {
    private Batch batch;
    private Tank playerTank;
    private Tank enemyTank;
    private TankBuilder playerTankBuilder = new PlayerTankBuilderImpl();
    private TankBuilder enemyTankBuilder = new EnemyTankBuilderImpl();
    TankCreator tankCreator = new TankCreatorImpl();

    @Override
    public void show() {
        batch = new SpriteBatch();
        playerTank = tankCreator.getInstance(playerTankBuilder.setCoordinates(0f, 0f));
        enemyTank = tankCreator.getInstance(enemyTankBuilder.setCoordinates(50f, Contract.SCREEN_HEIGHT - 100f)
                        .setTexture(new Texture(Gdx.files.internal("enemy_tank.png")))
                        .setDimensions(72f, 76f));
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        playerTank.draw(batch);
        enemyTank.draw(batch);
        for(Bullet bullet : playerTank.getShootedBullets()) {
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
