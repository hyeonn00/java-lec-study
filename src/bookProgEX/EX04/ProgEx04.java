package bookProgEX.EX04;
class Dog{
    String name;
    String breed;
    int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    public void baking(){
        System.out.println("barking");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
}
public class ProgEx04 {
    public static void main(String[] args) {
        Dog d = new Dog("york","orange",1);
        System.out.println(d);
        d.baking();
    }
}
