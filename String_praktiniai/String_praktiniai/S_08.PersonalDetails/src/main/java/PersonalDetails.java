
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String[]> namesArray = new ArrayList<>();

        while (true) {
            String userText = scanner.nextLine();

            if (userText.isEmpty()) {
                break;
            }

            String[] innerArray = userText.split(",");
            namesArray.add(innerArray);
        }

        String[] longestName = namesArray.get(0);
        double sumOfYears = 0;
        double avarageYear = 0;


        for (int e = 1; e < namesArray.size(); e++) {
            if (namesArray.get(e)[0].length() > longestName[0].length()) {
                longestName = namesArray.get(e);
            }
        }

        for (int e = 0; e < namesArray.size(); e++) {
            sumOfYears += Integer.parseInt(namesArray.get(e)[1]);
        }

        avarageYear = sumOfYears / namesArray.size();

        System.out.println("Longest person name: " + longestName[0]);
        System.out.println("Average birth year: " + avarageYear);
    }
}
