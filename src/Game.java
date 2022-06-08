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
        System.out.print("Insert a letter: ");
        char letter = sc.next().charAt(0);
        for (int i = 0; i <word.length(); i++) {
            if (word.charAt(i) == letter){
                stars[i]=letter;
            }
        }
    }
}
