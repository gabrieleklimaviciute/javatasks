
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Room room1 = new Room("A105", 32);
        System.out.println("Room code: " + room1.getCode());
        System.out.println("Room seats: " + room1.getSeats());

    }
}
