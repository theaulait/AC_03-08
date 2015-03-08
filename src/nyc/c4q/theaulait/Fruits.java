package nyc.c4q.theaulait;

/**
 * Created by c4q-vanice on 3/8/15.
 * Objective is to guess your fruit.
 */
import java.util.Scanner;

public class Fruits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String color, flavor;
        System.out.println("What's your favorite fruit?");
        String fruits =  scanner.next();

        if (fruits.equals("banana")){
            color = "yellow";
            flavor = "sweet";
        }
        else if (fruits.equals("grapefruit")){
            color = "pink";
            flavor = "bitter";
        }
        else if (fruits.equals("lemon")){
            color = "yellow";
            flavor = "sour";
        }
        else if (fruits.equals("apple")){
            color = "red";
            flavor = "sweet";
        }
        else if (fruits.equals("strawberry")){
            color = "red";
            flavor = "sweet";
        }
        else {
            System.out.println("I don't know that fruit.");
            return;
        }
        System.out.println("A " + fruits + " is " + color + " and tastes " + flavor + ".");
    }

}
