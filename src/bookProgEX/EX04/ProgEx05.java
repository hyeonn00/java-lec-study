package bookProgEX.EX04;

class Student{
    String name;
    private String rollno;
    int age;

    public Student(String name, String rollno, int age){
        this.name = name;
        this.rollno = rollno;
        this.age = age;

    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno='" + rollno + '\'' +
                ", age=" + age +
                '}';
    }
}
public class ProgEx05 {
    public static void main(String[] args) {
        Student s = new Student("Kim","0001",20);
        System.out.println(s);
        System.out.println("Student object created");
    }
}
