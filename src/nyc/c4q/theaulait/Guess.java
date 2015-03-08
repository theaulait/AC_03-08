package nyc.c4q.theaulait;

/**
 * Created by c4q-vanice on 3/8/15.
 *
 * Need to make sure int sure is always invaild. Also, add error message.
 */
import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String [] args){
        Random random = new Random();
        int number = random.nextInt(1000) + 1;
        Scanner scanner = new Scanner(System.in);
        int user = 0;

        while(user != number)
        {
            System.out.println("What number am I thinking of from 1 to 1000?");
            user = scanner.nextInt();

            if(user>number) {
                System.out.println("It's too high! Guess again.");
            }
            else if (user<number){
                System.out.println("It's too low! Guess again.");
            }

        }
        System.out.println("Yeah, you guessed my number!");


    }
}
