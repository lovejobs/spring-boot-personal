package com.lovejobs.jdk8.lambda;

public class JDK8Lambda {

    public static void printString(String s, Print<String> print) {
        print.print(s);
    }

    public static void main(String[] args) {
        printString("test", (x) -> System.out.println(x));
    }
}

@FunctionalInterface
interface Print<T> {
    void print(T x);
}
/**
 * 编译后代码
 * public class LambdaTest {
 *     public static void PrintString(String s, Print<String> print) {
 *         print.print(s);
 *     }
 *
 *     public static void main(String[] args) {
 *         PrintString("test", new LambdaTest$$Lambda$1());
 *     }
 *
 *     private static void lambda$main$0(String x) {
 *         System.out.println(x);
 *     }
 *
 *     static final class LambdaTest$$Lambda$1 implements Print {
 *         public void print(Object obj) {
 *             LambdaTest.lambda$main$0((String) obj);
 *         }
 *         private LambdaTest$$Lambda$1() {
 *         }
 *     }
 *
 * }
 *
 * @FunctionalInterface
 * interface Print<T> {
 *     public void print(T x);
 * }
 */
