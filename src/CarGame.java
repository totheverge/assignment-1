import java.util.Scanner;

public class CarGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;
        boolean isCarStarted = false;

        System.out.println("Welcome to the Car Game!");

        while (true) {
            System.out.print("Enter a command (start/stop/quit/hint): ");
            choice = input.nextLine().toLowerCase();

            if (choice.equals("start")) {
                if (isCarStarted) {
                    System.out.println("The car is already started.");
                } else {
                    System.out.println("Car started. Vromm Vrommmmmmmmmmmm!");
                    isCarStarted = true;
                }
            } else if (choice.equals("stop")) {
                if (!isCarStarted) {
                    System.out.println("The car is already stopped.");
                } else {
                    System.out.println("Car stopped.");
                    isCarStarted = false;
                }
            } else if (choice.equals("quit")) {
                System.out.println("Thanks for playing. Goodbye!");
                break;
            } else if (choice.equals("hint")) {
                System.out.println("Type 'start' to start the car.");
                System.out.println("Type 'stop' to stop the car.");
                System.out.println("Type 'quit' to quit the game.");
            } else {
                System.out.println("Invalid command. Type 'hint' for instructions.");
            }
        }
    }
}
