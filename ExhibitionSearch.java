/*import java.util.ArrayList;
import java.util.Scanner;

public class ExhibitionSearch {

    public static void searchExhibition(ArrayList<Exhibition> exhibitions, Scanner scanner) {
        System.out.print("Enter the name of the exhibition to search for: ");
        String name = scanner.next();
        Exhibition exhibition = findExhibition(exhibitions, name);
        if (exhibition != null) {
            System.out.println(exhibition.getName() + " is located at " + exhibition.getLocation() + ".");
        } else {
            System.out.println("Exhibition not found.");
        }
        scanner.nextLine(); // Consume newline left-over
        System.out.println("Press enter to return to the menu.");
        scanner.nextLine(); // Wait for user to press enter
    }

    private static Exhibition findExhibition(ArrayList<Exhibition> exhibitions, String name) {
        for (Exhibition exhibition : exhibitions) {
            if (exhibition.getName().equalsIgnoreCase(name)) {
                return exhibition;
            }
        }
        return null;
    }

}
*/