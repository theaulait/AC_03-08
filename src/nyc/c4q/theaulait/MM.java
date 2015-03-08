package nyc.c4q.theaulait;

/**
 * Created by c4q-vanice and sufeiiz on 3/8/15.
 */
import java.util.Scanner;

public class MM {
    public static void main (String[]args){
      Scanner input = new Scanner(System.in);
        int eat, left;
        left = 100; //Total numbers of M&Ms
        while (left>0) {
            System.out.println("You have " + left + " M&Ms left");
            System.out.println("How many M&Ms do you want to eat?");
            eat = input.nextInt();
            if (eat>left){
                System.err.println("Oh no, don't have enough M&Ms :(");
                return;
            }
            left -= eat;
        }

        System.out.println("All the M&Ms are gone!");
    }
}
 /**
  * Alternative Solution

import java.util.Scanner;

public class MM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int left, eat;

        left = 100;
        while (left > 0)
        {
            System.out.println("you " + left + " M&Ms left.");
        }
            System.out.println("How many M&Ms do you want to eat?");
        eat = input.nextInt();
        System.out.println("you don't have that many! tell me again how many you want to eat?");
        eat = input.nextInt();
    }
}
*/