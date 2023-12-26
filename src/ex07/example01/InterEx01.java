package ex07.example01;
interface Remocon {
    public abstract void on();
    public abstract void off();
}

class SamsungRemocon implements Remocon {

    @Override
    public void on() {
    }

    @Override
    public void off() {
    }
}

class LgRemocon implements Remocon {

    @Override
    public void on() {
    }

    @Override
    public void off() {
    }
}
public class InterEx01 {
    public static void on(Remocon s) {
        s.on();
    }
    public static void main(String[] args) {
    }
}