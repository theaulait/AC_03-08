package nyc.c4q.theaulait;

/**
 * Created by c4q-vanice on 3/8/15.
 */
import java.util.Scanner;

public class While {
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
        int x = 10;
        while (x <=10){
            System.out.println("The number is " + x);
            System.out.println("What's another number?");
            x =input.nextInt();
        }
    }
}
