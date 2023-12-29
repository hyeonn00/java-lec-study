package bookProgEX.EX05.ProgEx02;

public class CircleMove {
    public static void main(String[] args) {
        Circle c = new Circle(10,10,5);
        System.out.println(c+"\n");
        c.move(10,20);
        System.out.println(c);
    }
}
