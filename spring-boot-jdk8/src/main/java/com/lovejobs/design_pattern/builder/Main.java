package com.lovejobs.design_pattern.builder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BenzModel benzModel = new BenzModel();
        benzModel.setSequence(Arrays.asList("start","stop","engine boom"));
        benzModel.run();
    }
}
