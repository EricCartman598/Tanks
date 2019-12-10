package com.mygdx.tanks.model.tank.builder;

import com.mygdx.tanks.model.tank.EnemyTank;

public class EnemyTankBuilderImpl extends TankBuilderImpl {
    @Override
    public EnemyTank build() {
        return new EnemyTank(texture, x, y, width, height, bulletsCount, velocity);
    }
}
