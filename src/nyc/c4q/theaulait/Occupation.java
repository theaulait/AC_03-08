package nyc.c4q.theaulait;

/**
 * Created by c4q-vanice on 3/8/15.
 */
import java.util.Scanner;

public class Occupation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you carry a sword");
        String response = scanner.next();
        boolean sword =
                response.equalsIgnoreCase("yes")|| (response.equalsIgnoreCase("y"));
        System.out.print("Do you wear a helmet");
        response = scanner.next();
        boolean helmet =
                response.equalsIgnoreCase("yes")|| (response.equalsIgnoreCase("y"));
        System.out.print("Do you use a shovel");
        response = scanner.next();
        boolean shovel =
                response.equalsIgnoreCase("yes")|| (response.equalsIgnoreCase("y"));
        if (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no") && ! response.equalsIgnoreCase("y") && !response.equalsIgnoreCase("n"));
        {
            System.err.println("Please enter yes or no");
        }

        String profession;
        if (sword && helmet && ! shovel)
            profession = " Samurai";
        else if (! sword && helmet && shovel)
            profession = " Ninja";
        else if (! sword && helmet && ! shovel)
            profession = "n Astronaut";
        else if (! sword && ! helmet && ! shovel)
            profession = " Coder";
        else if (! sword && ! helmet && shovel)
            profession = " Gardener";
        else if (! sword && helmet && shovel)
            profession = " Construction Worker";
        else
        {
            System.err.println("You're unemployed?");
            return;
        }
            System.out.println("You're a" + profession);


    }
}
