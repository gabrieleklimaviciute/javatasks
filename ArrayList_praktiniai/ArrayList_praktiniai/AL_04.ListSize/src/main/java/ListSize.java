
import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            System.out.println("Names: ");
            String input = scanner.nextLine();
            if (input == "0") {
                break;
            }
            if (input.equals("0")){
                System.out.println("In total: " + list.size());
            } else {
                list.add(input);
            }



        }


    }
}
