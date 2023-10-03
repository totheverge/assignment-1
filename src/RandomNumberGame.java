import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            int random_number = random.nextInt(100);
            System.out.println("Enter Any Number (Between 1-100) or (quit) to quit the game:");
            String choice = input.nextLine();
            if (choice.equals("quit")){
                System.out.println("Exiting the game");
                break;
            }
            else {
                int user_number = Integer.parseInt(choice);
                if(user_number<1|user_number>100){
                    System.out.println("Enter between 1 and 100");
                }
                else{
                    if (user_number==random_number){
                        System.out.println("Correct Guess");
                    }
                    else {
                        System.out.println("Wrong Guess. The correct number was:"+random_number);
                    }
                }
            }
        }
    }
}
