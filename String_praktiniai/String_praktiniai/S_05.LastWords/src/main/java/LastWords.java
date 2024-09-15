
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String userText = scanner.nextLine();

            if (userText.isEmpty()) {
                break;
            }
            String[] newLine = userText.split("\\s+");
            System.out.println(newLine[newLine.length -1]);
        }
    }
}
