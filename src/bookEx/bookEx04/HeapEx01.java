package bookEx.bookEx04;
class Cat{
    String name;

    Cat(){
    this("토비");
    }

    Cat(String name){
        this.name = name;
    }
}
public class HeapEx01 {
    public static void main(String[] args) {
        Cat c = new Cat();
    }
}
