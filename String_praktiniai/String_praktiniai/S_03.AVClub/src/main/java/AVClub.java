
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userText = scanner.nextLine();

            if (userText.isEmpty()) {
                break;

            }

            String[] newLine = userText.split("\\s+");
            for (int i = 0; i < newLine.length; i++) {
                if (newLine[i].contains("av")) {
                    System.out.println(newLine[i]);
                }
            }
        }
        scanner.close();
    }
}
