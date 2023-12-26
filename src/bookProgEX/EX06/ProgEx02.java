package bookProgEX.EX06;
class Animal{
    void walk(){
        System.out.println("can walk");
    }
}
class Bird extends Animal{
    public void fly(){
        System.out.println("can fly");
    }
    public void sing(){
        System.out.println("can sing");
    }
}
public class ProgEx02 {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.walk();
        b.fly();
        b.sing();
    }
}
