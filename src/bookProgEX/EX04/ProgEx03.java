package bookProgEX.EX04;
class Song{
    String title;
    String artist;
    int length;
    public Song(String t, String a,int l){
        this.title = t;
        this.artist = a;
        this.length=l;
    }
    public Song(String t, String a){
        this.title = t;
        this.artist = a;
    }
    public Song(String t){
        this.title = t;
    }


    public Song(){
        this("");
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", length='" + length + '\'' +
                '}';
    }
}

public class ProgEx03 {
    public static void main(String[] args) {
        Song s1 = new Song("Outward Bound","Nana",180);
        Song s2 = new Song("Jambalya","Carpenters");
        Song s3 = new Song("Yesterday");
        Song s4 = new Song();
        System.out.printf("%s, %s, %s, %s", s1, s2, s3, s4);
    }
}
