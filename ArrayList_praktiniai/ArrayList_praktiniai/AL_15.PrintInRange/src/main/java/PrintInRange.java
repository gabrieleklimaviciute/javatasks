
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);

        int lowerLimit = 0;
        int upperLimit = 5;

        System.out.println("Numbers in range [" + lowerLimit + ", " + upperLimit + "]:");
        printNumbersInRange(numbers, lowerLimit, upperLimit);

    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }

    }

}
