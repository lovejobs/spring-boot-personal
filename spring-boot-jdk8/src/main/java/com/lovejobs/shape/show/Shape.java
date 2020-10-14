package com.lovejobs.shape.show;

import lombok.Data;

/**
 * The type Shape.
 * @author fengxin
 */
@Data
public class Shape {

    private static final String DEFAULT_COLOR = "black";

    private String color;

    public Shape(){
        this(DEFAULT_COLOR);
    }

    public Shape(String color) {
        this.color = color;
    }

    public void draw(){
        System.out.println("draw shape");
    }
}
