import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = userInput.nextLine();

        System.out.printf("Hello %s", userName);
    }
}
