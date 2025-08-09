package chapter06;

public class Ex_18 {

}

class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    static int cv2 = iv;

    static void staticMethod1() {
        System.out.println(cv);
        System.out.println(iv);
    }

    void instanceMethod1 () {
        System.out.println(cv);
        System.out.println(iv);
    }

    static void staticMethod2() {
        staticMethod1();
        instanceMethod1();
    }

    void instanceMethod2() {
        staticMethod1();
        instanceMethod1();
    }
}

//컴파일 에러가 발생하는 라인
// A : static 변수 초기화에 인스턴스 변수 사용x
// B : static 메서드에 인스턴스 변수 사용x
// D : static 메서드에 인스턴스 메서드 사용x