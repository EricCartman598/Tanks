package com.mygdx.tanks.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;

public abstract class GameObject extends Actor {
    protected Sprite gameObject;

    public GameObject(Texture texture, float x, float y, float width, float height) {
        setX(x);
        setY(y);
        setWidth(width);
        setHeight(height);
        gameObject = new Sprite(texture);
    }

    public void draw(Batch batch) {
        gameObject.setBounds(getX(), getY(), getWidth(), getHeight());
        gameObject.draw(batch);
    }
}
