import java.util.LinkedList;
import java.util.Scanner;
import java.util.Arrays;

public class ZMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> distances = new LinkedList<>();
        distances.add(30);
        distances.add(60);
        distances.add(5);
        distances.add(15);
        distances.add(40);
        distances.add(100);
        distances.add(80);
        distances.add(25);

        System.out.println("Enter the number of paintings you want to visit:");
        int n = scanner.nextInt();
        int[] visitedPaintings = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the painting number you want to visit:");
            visitedPaintings[i] = scanner.nextInt();
        }

        int[] sortedDistances = new int[distances.size()];
        for (int i = 0; i < distances.size(); i++) {
            sortedDistances[i] = distances.get(i);
        }
        Arrays.sort(sortedDistances);

        System.out.println("Paintings to visit in order for shortening the walk distance:");
        for (int i = 0; i < n; i++) {
            int index = distances.indexOf(sortedDistances[visitedPaintings[i] - 1]);
            System.out.println("Painting " + visitedPaintings[i] + " at distance " + sortedDistances[index] + "m");
            distances.remove(index);
        }
    }
}