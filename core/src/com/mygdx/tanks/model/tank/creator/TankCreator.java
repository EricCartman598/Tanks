package com.mygdx.tanks.model.tank.creator;

import com.mygdx.tanks.model.tank.Tank;
import com.mygdx.tanks.model.tank.builder.TankBuilder;

public interface TankCreator {
    Tank getInstance(TankBuilder builder);
}
