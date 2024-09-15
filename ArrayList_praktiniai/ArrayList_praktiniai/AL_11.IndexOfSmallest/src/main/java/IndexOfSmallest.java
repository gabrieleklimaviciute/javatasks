
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            list.add(input);
        }
        if (list.isEmpty()) {
            System.out.println("No numbers were entered.");

        }

        int min = list.get(0);
        int index = 0;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
                index = i;

            }

        }
        System.out.println("Smallest number: " + min);
        System.out.println("Found at index: " + index);

    }
}
