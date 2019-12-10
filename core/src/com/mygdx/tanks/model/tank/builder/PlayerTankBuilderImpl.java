package com.mygdx.tanks.model.tank.builder;

import com.mygdx.tanks.model.tank.PlayerTank;

public class PlayerTankBuilderImpl extends TankBuilderImpl {
    @Override
    public PlayerTank build() {
        return new PlayerTank(texture, x, y, width, height, bulletsCount, velocity);
    }
}
