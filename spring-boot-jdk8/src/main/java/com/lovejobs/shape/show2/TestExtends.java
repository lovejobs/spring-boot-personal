package com.lovejobs.shape.show2;

/**
 * The type Test extends.
 *
 * @author fengxin
 */
public class TestExtends {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println("newChild()");
        Child c=new Child();
        System.out.println("\nc.action()");
        c.action();
        Base b=c;
        System.out.println("\nb.action()");
        b.action();
        System.out.println("\nb.s:"+b.s);
        System.out.println("\nc.s:"+c.s);


    }
}
