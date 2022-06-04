import java.util.Arrays;

public class Game {

    public static void playGame(){
        System.out.println("-------Welcome to Hangman!---------");
        String word = "airplane";
        char[] stars = new char[word.length()];
        System.out.print("The word is: ");
        Arrays.fill(stars, '*');
        System.out.println(String.valueOf(stars));
    }
}
