package com.mygdx.tanks.model.tank;

import com.mygdx.tanks.model.SpriteCreator;

public class TankCreator implements SpriteCreator<Tank> {
    private TankBuilder tankBuilder;

    public TankCreator(TankBuilder tankBuilder) {
        this.tankBuilder = tankBuilder;
    }

    @Override
    public Tank getInstance() {
        return tankBuilder.build();
    }
}


