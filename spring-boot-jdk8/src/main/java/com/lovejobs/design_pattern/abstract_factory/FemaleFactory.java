package com.lovejobs.design_pattern.abstract_factory;

public class FemaleFactory implements HumanFactory{
    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }
}
