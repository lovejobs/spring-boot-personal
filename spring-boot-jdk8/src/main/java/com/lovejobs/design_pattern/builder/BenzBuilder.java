package com.lovejobs.design_pattern.builder;

import java.util.List;

public class BenzBuilder extends CarBuilder{

    private BenzModel benzModel = new BenzModel();

    @Override
    public void setSequence(List<String> sequence) {
        this.benzModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return benzModel;
    }
}
