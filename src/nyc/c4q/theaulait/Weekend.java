package nyc.c4q.theaulait;

/**
 * Created by c4q-vanice and sufeiiz on 3/8/15.
 * Objective is to guess the day.
 */
import java.util.Scanner;

public class Weekend {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String day, Week;
        System.out.println("What day is today?");
        day = input.nextLine();
        if (day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("Wednesday") || day.equalsIgnoreCase("Thursday") || day.equalsIgnoreCase("Friday"))
        {
            Week = "It's a weekday";
        }
        else if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday"))
        {
            Week = "It's a weekend";
        }
        else
        {
            Week = "I don't know what you're talking about.";
        }

        System.out.println(Week);
    }
}
