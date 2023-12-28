package bookProgEX.EX04;
class Person {
    String name;
    private String mobile;
    private String office;
    private String email;

    public Person(String n, String m, String o, String e){
        this.name = n;
        this.mobile = m;
        this.office = o;
        this.email = e;
        System.out.println(n+" "+m+" "+o+" "+e);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", office='" + office + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
public class ProgEx02 {
    public static void main(String[] args) {
        Person p = new Person("Ann","01011111111","070222222","Ann@nate.com");
        System.out.println(Person.class);
    }
}
