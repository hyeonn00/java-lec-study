package ex04.test;

public class ScopeEx01 {

    int n1 = 1; // heap
    static int n2 = 2; // static

    static void m1(){
        int n5 = 10;  // stack
        System.out.println("m1: " + n5);
    }

    void m2(){
        System.out.println("m2: " + n1);
    }


    public static void main(String[] args) {
        System.out.println(1);
        m1();
        System.out.println(2);

    }
}
