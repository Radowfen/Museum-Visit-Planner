/*import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MuseumRouteGenerator {

    public static void generateRoute(ArrayList<Exhibition> exhibitions) {
        // Sort the exhibitions by their location
        Collections.sort(exhibitions, new Comparator<Exhibition>() {
            @Override
            public int compare(Exhibition e1, Exhibition e2) {
                return e1.getLocation().compareTo(e2.getLocation());
            }
        });

        // Print out the ordered list of exhibitions
        System.out.println("Museum Route:");
        int index = 1;
        for (Exhibition exhibition : exhibitions) {
            System.out.println(index + ". " + exhibition.getName() + " (" + exhibition.getLocation() + ")");
            index++;
        }
    }

}
*/