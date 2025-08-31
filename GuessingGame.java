import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100);
        int guess = 0;

        while (guess != number) {
            System.out.println("Guess number from (1-100)");
            guess = sc.nextInt();

            if (guess > number) {
                System.out.println("Too high");
                
            }
            else if(guess < number ){
                System.out.println("Too low");
            }
            else{
                System.out.println("Correct the number was:"+number);
            }
            
        }

    }
    
}
