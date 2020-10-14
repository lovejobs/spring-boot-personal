package com.lovejobs.shape.show;

import lombok.Data;

/**
 * @author fengxin
 */
@Data
public class Line extends Shape{

    private Point start;

    private Point end;

    public Line(Point start, Point end, String color) {
        super(color);
        this.start = start;
        this.end = end;
    }

    @Override
    public void draw() {
        System.out.println("drawlinefrom"+start.toString()+"to"+end.toString()+",usingcolor"+super.getColor());
    }
}
