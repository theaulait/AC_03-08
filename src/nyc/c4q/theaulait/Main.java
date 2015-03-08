package nyc.c4q.theaulait;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        System.out.println("what's your score?");
        int score =scanner.nextInt();
        if (score > 100)
            System.out.println("Wow!");
        if (score == 100)
            System.out.println("Perfect score!");
        else if (score >= 90);
            System.out.println("Great!");
        else if (score >= 75);
            System.out.println("You passed.");
        else
            System.out.println("You failed. :(");

        System.out.println("We're done!");

    }
}
