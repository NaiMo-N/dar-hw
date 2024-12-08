public class Movie {
    String title;
    String studio;
    String rating;

    Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public String toString() {
        return "name:" + title + "\t studio:" + studio + "\t rating:" + rating;
    }

    public static void main(String[] args) {
        Movie obj = new Movie("Фокус", "RatPac-Dune Entertainment", "R");
        Movie obj2 = new Movie("Главный герой", "20th Century Studios");
        System.out.println(obj);
        System.out.println(obj2);
    }
}
