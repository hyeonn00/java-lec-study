package bookProgEX.EX06;
class Circle {
    protected int radius;
    public Circle(int r){
        radius = r;
    }
}
class Pizza extends Circle{
    public void
    super(r);
     private String s;
     public void print(){
         System.out.println("피자의 종류: " + s + "피자의 크기: " + radius);
     }
}
public class ProgEx01 {
    public static void main(String[] args) {
        Pizza obj = new Pizza ("Pepperoni", 20);
        obj.print();
    }
}
