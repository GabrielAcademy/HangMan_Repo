import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Game {

    public static void playGame(){
        System.out.println("-------Welcome to Hangman!---------");
        String word = "airplane";
        char[] stars = new char[word.length()];
        System.out.print("The word is: ");
        Arrays.fill(stars, '*');
        System.out.println(String.valueOf(stars));
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Insert a letter: ");
            char letter = sc.next().charAt(0);
            boolean letterFound = false;

            for (int i = 0; i < word.length(); i++) {
                if (letter == word.charAt(i)) {
                    stars[i] = letter;
                    letterFound = true;
                }
            }

            if (letterFound) {
                System.out.println("You guessed! The word is: " + String.valueOf(stars));
            }
            else {
                System.out.println("You're wrong!");
            }
        }
    }
}
