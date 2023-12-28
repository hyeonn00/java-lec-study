package bookProgEX.EX04;
class Movie{
    String title;
    String director;
    int year;
    String mainActor;
    double score;

    public Movie(String title, String director, int year, String mainActor, double score){
        this.title = title;
        this.director = director;
        this.year = year;
        this.mainActor = mainActor;
        this.score = score;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' +"\n"+
                "director='" + director + '\'' +"\n"+
                "year=" + year +"\n"+
                "mainActor='" + mainActor + '\'' +"\n"+
                "score=" + score;
    }
}
public class ProgEx07 {
    public static void main(String[] args) {
        Movie movie = new Movie
                ("티파니에서 아침을","블레이크 에드워즈",
                        1962,"오드리 헵번",8.43);
        System.out.println(movie);
    }
}
