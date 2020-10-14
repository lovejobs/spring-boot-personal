package com.lovejobs.shape.show;

/**
 * The type Circle.
 * @author fengxin
 */
public class Circle extends Shape{

    private Point center;

    private double r;

    public Circle(Point center,double r){
        this.center = center;
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("drawcircleat"+center.toString()+"withr"+r+",usingcolor:"+getColor());
    }

    public double area(){
        return Math.PI*r*r;
    }
}
