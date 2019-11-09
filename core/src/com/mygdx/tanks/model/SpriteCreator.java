package com.mygdx.tanks.model;

import com.badlogic.gdx.graphics.Texture;

public interface SpriteCreator<T> {
    T getInstance(Texture texture, float x, float y, float width, float height);
}
