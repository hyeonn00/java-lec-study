package bookProgEX.EX06;
class Sports{
    String getName(){
        return "not";
    }
    int getPlayer(){
        return 0;
    }
}
class Soccer extends Sports{
    public String getName(){
        return "Soccer";
    }
    public int getPlayer(){
        return 11;
    }

}
public class ProgEx03 {
    public static void main(String[] args) {
        Sports s = new Soccer();
        System.out.println("Sports name: " + s.getName());
        System.out.println("Player number: " + s.getPlayer());
    }
}
