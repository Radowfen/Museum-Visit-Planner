import java.util.ArrayList;
import java.util.Scanner;

public class MuseumRoutePlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Exhibition> exhibitions = new ArrayList<>();

        int choice = 0;
        while (choice != 4) {
            //clearConsole();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Welcome to the Museum Route Planner! Please select an option:");
            System.out.println("1. Add an exhibition");
            System.out.println("2. Search for an exhibition");
            System.out.println("3. Generate a route through the museum");
            System.out.println("4. Exit");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

            

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    addExhibition(exhibitions, scanner);
                    break;
                case 2:
                    ExhibitionSearch.searchExhibition(exhibitions, scanner);
                    break;
                case 3:
                    MuseumRouteGenerator.generateRoute(exhibitions);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    break;
            }
        }
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

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}