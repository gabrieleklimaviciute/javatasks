
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String userText = scanner.nextLine();

            if (userText.isEmpty()) {
                break;
            }
            String[] newLine = userText.split("\\s+");
            System.out.println(newLine[0]);

        }
    }
}
