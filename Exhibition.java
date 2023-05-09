import java.util.ArrayList;
import java.util.Scanner;

public class Exhibition {
    private String name;
    private String location;

    public Exhibition(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static void addExhibition(ArrayList<Exhibition> exhibitions, Scanner scanner) {
        System.out.print("Enter the name of the exhibition: ");
        String name = scanner.next();
        System.out.print("Enter the location of the exhibition: ");
        String location = scanner.next();
        Exhibition exhibition = new Exhibition(name, location);
        exhibitions.add(exhibition);
        System.out.print("\033[2A\033[0J");
        System.out.println("\"" + exhibition.getName() + "\"" + " has been added to the museum at location " + "\"" + exhibition.getLocation() + "\"");
        scanner.nextLine(); // Consume newline left-over
        System.out.println("Press enter to return to the menu.");
        scanner.nextLine(); // Wait for user to press enter
    }
}
