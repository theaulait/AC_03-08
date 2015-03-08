package nyc.c4q.theaulait;

/**
 * Created by c4q-vanice and sufeiiz on 3/8/15.
 * Objective is to get the holiday.
 */
import java.util.Scanner;
public class Holidays {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String month, day;
        System.out.println("Give me a month, any month!");
        month = input.nextLine();
        System.out.println("Now, give me a date you like");
        day = input.nextLine();
        if ((day.equals("1") || (day.equals("one"))) && (month.equalsIgnoreCase("January") || (month.equals("1")))) {
            System.out.println("Today is New Years Day!");
        }
        else if ((day.equals("5") || (day.equals("five"))) && (month.equalsIgnoreCase("May") || (month.equals("5")))) {
            System.out.println("Feliz Cinco de Mayo!");
        }
        else if ((day.equals("4") || (day.equals("four"))) && (month.equalsIgnoreCase("July") || (month.equals("7")))) {
            System.out.println("Happy Independence Day!");
        }
        else if ((day.equals("25") || (day.equals("twenty five"))) && (month.equalsIgnoreCase("December") || (month.equals("25")))) {
            System.out.println("Today is New Years Day!");
        }
        else
            System.out.println("It's just another wonderful day.");

    }

}
