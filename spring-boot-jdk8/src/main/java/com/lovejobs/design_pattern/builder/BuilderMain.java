package com.lovejobs.design_pattern.builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class BuilderMain {
    public static void main(String[] args) {
        ArrayList<String> sequence = (ArrayList<String>) Arrays.asList("start","stop","engine boom");
        BMWBuilder builder = new BMWBuilder();
        builder.setSequence(sequence);
        BMWModel bmwModel = (BMWModel) builder.getCarModel();
        bmwModel.run();
    }
}
