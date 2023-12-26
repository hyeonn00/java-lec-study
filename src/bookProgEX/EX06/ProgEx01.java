package bookProgEX.EX06;
class Circle{
    protected int radius;
    public Circle(int r){
        radius = r;
    }
}
class Pizza extends Circle{
    String s;

    public Pizza(String s, int r) {
        super(r);
        this.s = s;
    }

    public void print() {
        System.out.print("피자의 종류: " + s + ", 피자의 크기: " + radius);
    }
}
public class ProgEx01 {
    public static void main(String[] args) {
        Pizza obj = new Pizza ("Peperoni", 20);
        obj.print();
    }
}
