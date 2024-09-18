
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        Statistics statistics = new Statistics();
        Statistics allNumbers = new Statistics();
        Statistics evenNumbers = new Statistics();
        Statistics oddNumbers = new Statistics();
//        statistics.addNumber(3);
//        statistics.addNumber(5);
//        statistics.addNumber(1);
//        statistics.addNumber(2);
//        System.out.println("Count: " + statistics.getCount());
//        System.out.println("Sum: " + statistics.sum());
//        ;


        System.out.println("Enter numbers: ");
        int number;
        while (true) {

            number = Integer.parseInt(scanner.nextLine());
            if (number == -1) {
                break;
            }

            allNumbers.addNumber(number);

//        statistics.addNumber(number);
           // System.out.println("Sum: " + statistics.sum());
            if (number % 2 == 0) {
                evenNumbers.addNumber(number);
            } else {
                oddNumbers.addNumber(number);
            }
        }
        System.out.println("The sum of all numbers is: " + allNumbers.sum());
        System.out.println("The sum of even numbers is: " + evenNumbers.sum());
        System.out.println("The sum of odd numbers is: " + oddNumbers.sum());
        System.out.println("Average: " + allNumbers.average());
    }


}
