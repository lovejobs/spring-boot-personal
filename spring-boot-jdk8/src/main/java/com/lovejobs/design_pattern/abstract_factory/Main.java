package com.lovejobs.design_pattern.abstract_factory;

public class Main {

    public static void main(String[] args) {
        HumanFactory maleHumanFactory = new MaleFactory();
        maleHumanFactory.createWhiteHuman();
        HumanFactory femaleFactory = new FemaleFactory();
        femaleFactory.createWhiteHuman();

    }
}
