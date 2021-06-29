package com.lovejobs.design_pattern.factory_method;

public class Main {
    public static void main(String[] args) {
        AbstractHumanFactory humanFactory = new HumanFactory();
        Human blackHuman = humanFactory.createHuman(BlackHuman.class);
        Human human = humanFactory.createHuman(WhiteHuman.class);
    }
}
