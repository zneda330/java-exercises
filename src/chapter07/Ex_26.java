package chapter07;

class Outer{
    static class Inner{
        int iv=200;
    }
}

public class Ex_26 {
    public static void main(String[] args) {
        Outer.Inner li = new Outer.Inner();
        System.out.println(li.iv);
    }
}
