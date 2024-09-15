
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        System.out.println("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == searching) {
                index = i;
                System.out.println(searching + " is at index " + index);
            }
        }
    }

}
