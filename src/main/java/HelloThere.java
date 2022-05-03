import java.util.Scanner;
public class HelloThere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello there! How are you doing today?");
        String message = scanner.nextLine();
        System.out.println("Wow - Interesting! Tell me more!");
        String more = scanner.nextLine();
        System.out.println("Nice chatting with you! Bye!");
        scanner.close();
    }
}
