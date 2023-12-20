package bookEx.bookEx04;

class Telvision{
    private int channel;
    private int volume;
    private boolean onOff;

    Telvision(int c, int v, boolean o){
        channel = c;
        volume = v;
        onOff = o;
    }
    void print(){
        System.out.printf("채널은 %d이고 볼륨은 %d입니다.\n", channel, volume);
    }
}
public class TelevisionTest {
    public static void main(String[] args) {
        Telvision myTv = new Telvision(7, 10, true);
        myTv.print();

        Telvision yourTv = new Telvision(11, 20, true);
        yourTv.print();
    }
}
