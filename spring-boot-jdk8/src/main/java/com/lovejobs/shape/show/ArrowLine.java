package com.lovejobs.shape.show;

/**
 * @author fengxin
 */
public class ArrowLine extends Line{

    private boolean startArrow;
    private boolean endArrow;

    public ArrowLine(Point start, Point end, String color, boolean startArrow,boolean endArrow) {
        super(start, end, color);
        this.endArrow=endArrow;
        this.startArrow=startArrow;
    }

    @Override
    public void draw() {
        super.draw();
        if(startArrow){
            System.out.println("draw start arrow");
        }
        if(endArrow){
            System.out.println("draw end arrow");
        }
    }
}
