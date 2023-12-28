package bookProgEX.EX04;
class Rocket{
    int x, y;

    public Rocket(int x, int y){
        this.y = y;
        this.x = x;
    }
    public void moveUp(){
        y++;
        System.out.println(y);
    }
    @Override
    public String toString() {
        return "Rocket{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

public class ProgEx01 {
    public static void main(String[] args) {
        Rocket r = new Rocket(10,10);
        r.moveUp();
    }
}
