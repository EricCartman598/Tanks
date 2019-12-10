package com.mygdx.tanks.model.tank.creator;

import com.mygdx.tanks.model.tank.Tank;
import com.mygdx.tanks.model.tank.builder.TankBuilder;

public class TankCreatorImpl implements TankCreator {
    @Override
    public Tank getInstance(TankBuilder builder) {
        return builder.build();
    }
}
