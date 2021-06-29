package com.lovejobs.design_pattern.abstract_factory;

public class MaleFactory implements HumanFactory{
    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }
}
