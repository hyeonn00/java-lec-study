package bookProgEX.EX04;
class Date{
    int year;
    int month;
    int day;
    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    void print1(){
        year=2012;
        month = 7;
        day = 12;
        System.out.printf("%d.%d.%d\n", year, month, day);
    }
    void print2(){
        year=2012;
        day=12;
        String month = "July";
        System.out.printf("%s.%d.%d",month,day,year);
    }

    @Override
    public String toString() {
        return  year +
                "."+ month +
                "." + day;
    }
}
public class ProgEx06 {
    public static void main(String[] args) {
        Date date = new Date(2022,9,5);
        System.out.println(date);
        date.print1();
        date.print2();

    }
}
