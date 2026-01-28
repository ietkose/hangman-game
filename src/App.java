import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import java.nio.file.Path;
import java.nio.file.Paths;


public class App {
    public static void main(String[] args) throws Exception {
        
        String projectRoot = System.getProperty("user.dir");
        Path filePath = Paths.get(projectRoot, "assets", "words.txt");
        
        String wordsFile = filePath.toString();

        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader (new FileReader (wordsFile))){
            String line;
            while ((line = reader.readLine()) != null){
                words.add(line.trim());
            }
        }

        catch(FileNotFoundException e){
            System.out.println("Could not locate file");
        }

        catch(IOException e){
            System.out.println("Something went wrong");
        }
        
        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();

        int wrongGuesses = 0;

        for (int i = 0; i < word.length(); i++){
            wordState.add('_');
        }

        System.out.println("**************************");
        System.out.println(" Welcome to Hangman! ");
        System.out.println("**************************\n");

        while(wrongGuesses < 6){
            System.out.println(getHangmanArt(wrongGuesses));

            System.out.print("Word: ");

            for (char c : wordState){
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("\nGuess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            System.out.println();
            if (word.indexOf(guess)>=0){
                System.out.println("Correct guess!\n");

                for (int i = 0; i < word.length(); i++){
                    if(word.charAt(i) == guess){
                        wordState.set(i, guess);
                    }
                }

                if(!wordState.contains('_')){
                    System.out.println(getHangmanArt(wrongGuesses));
                    System.out.println("YOU WIN!");
                    System.out.println("The word was: " + word);
                    break;
                }
            }

            else{
            wrongGuesses++;
            System.out.println("Wrong guess\n");
            }
        }

        if(wrongGuesses >= 6){
            System.out.println(getHangmanArt(wrongGuesses));

            System.out.println("GAME OVER!");
            System.out.println("The word was: " + word);
        }

        scanner.close();
    }

    static String getHangmanArt (int wrongGuesses){
        return switch(wrongGuesses){
            case 0 -> """
            ..........................
                      
                      
                      
            ..........................
                      """;

            case 1 -> """
            ..........................
                      o
                      
                      
            ..........................
                      """;

            case 2 -> """
            ..........................
                      o
                      |
                      
            ..........................
                      """;

            case 3 -> """
            ..........................
                      o
                     /|
                      
            ..........................          
                     """;

            case 4 -> """
            ..........................
                      o
                     /|\\
                      
            ..........................
                      """;

            case 5 -> """
            ..........................
                      o
                     /|\\
                     /
            ..........................
                      """;

            case 6 -> """
            ..........................
                      o
                     /|\\
                     / \\
            ..........................
                      """;

            default -> "";
        };
    }
}
