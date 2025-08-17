package chapter07;

import jdk.swing.interop.SwingInterOpUtils;

class Outer{
    class Inner {
        int iv = 100;
    }
}


public class Ex_25 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner li = outer.new Inner();
        System.out.println(li.iv);
    }
}
