package com.mygdx.tanks.model;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;

public abstract class GameObject {
    private Rectangle bounds;
    private Sprite gameObject;

    public Rectangle getBounds() {
        return bounds;
    }

    public Sprite getGameObject() {
        return gameObject;
    }

    public GameObject(Texture texture, float x, float y, float width, float height) {
        bounds = new Rectangle(x, y, width, height);
        gameObject = new Sprite(texture);
    }

    public void draw(Batch batch) {
        gameObject.setBounds(bounds.getX(), bounds.getY(), bounds.getWidth(), bounds.getHeight());
        gameObject.draw(batch);
    }
}
