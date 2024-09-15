
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String[]> elements = new ArrayList<>();

        while (true) {
            String userText = scanner.nextLine();

            if (userText.isEmpty()) {
                break;
            }

            String[] innerArray = userText.split(",");
            elements.add(innerArray);
        }

        String[] oldestPerson = elements.get(0);

        for (int i = 1; i < elements.size(); i++) {
            if(Integer.parseInt(elements.get(i)[1]) > Integer.parseInt(oldestPerson[1])) {
                oldestPerson = elements.get(i);
            }
        }

        System.out.println(oldestPerson[0]);
    }
}

