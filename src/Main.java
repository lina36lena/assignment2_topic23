import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        ArrayList<CulturalObject> objects = new ArrayList<>();

        objects.add(new Artworks("Allegory of the Planets", 1455, 3000000));
        objects.add(new Artworks("Allegory of Government", 1730, 2500000));

        objects.add(new Artist("Giovanni Battista Tiepolo", 56, true));
        objects.add(new Artist("Jacob de Wit", 59, true));

        objects.add(new Gallery("Modern Art Hall", 1200, "Modern"));
        objects.add(new Gallery("Eastern Gallery", 900, "Eastern"));

        System.out.println("=== ALL OBJECTS ===");
        for (CulturalObject obj : objects) {
            System.out.println(obj);
        }

        System.out.println("\n=== FILTER: SCORE > 50 ===");
        for (CulturalObject obj : objects) {
            if (obj.getScore() > 50) {
                System.out.println(obj);
            }
        }

        System.out.println("\n=== SORTED BY SCORE ===");
        objects.sort(Comparator.comparingDouble(CulturalObject::getScore));
        for (CulturalObject obj : objects) {
            System.out.println(obj + " | Score: " + obj.getScore());
        }

        System.out.println("\n=== SEARCH BY NAME (contains 'Art') ===");
        for (CulturalObject obj : objects) {
            if (obj.getName().contains("Art")) {
                System.out.println(obj);
            }
        }
    }
}

