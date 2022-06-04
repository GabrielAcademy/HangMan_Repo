public class Game {

    public static void playGame(){
        System.out.println("-------Welcome to Hangman!---------");
        String word = "Airplane";
        char[] stars = new char[word.length()];
        for (int i = 0; i <word.length() ; i++) {
            System.out.println("*");

        }
        System.out.println("The word is " + word);

    }



}
