import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
Media expendables = new Media("Expendables","4.0","Sylvester Stallone");
Movie expendables1 = new Movie(103,"Action",274.5);
TvShow warrior = new TvShow(3,10);

ArrayList<String> cast = new ArrayList<>();

        System.out.println(expendables.getTitle());
        System.out.println(expendables.getRating());
        System.out.println(expendables.getDirector());

        System.out.println(expendables1.getLength());
        System.out.println(expendables1.getDescription());
        System.out.println(expendables1.getGrossing());

        System.out.println(warrior.getSeasons());
        System.out.println(warrior.getEpisodes());

    }
}