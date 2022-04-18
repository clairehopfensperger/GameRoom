
// Importing necessary classes.
import java.io.IOException;

/**
 * This class' main purpose is to test the classes I created as well as actually
 * run the programs.
 * 
 * @author Claire Hopfensperger
 *
 */
public class GameTester {

    public static void main(String[] args) throws IOException {

        // Creating a new RockPaperScissors object which runs the game, initial
        // tokens and score both set to 0.
        RockPaperScissors game = new RockPaperScissors(0, 0);
        // Setting tokens to 50. (Can alter number for different amount of
        // tokens.
        game.setTokens(50);
        // Printing token count for user.
        System.out.printf("Current token count: %d\n\n", game.getTokens());
        // Starting the game of 'Rock, Paper, Scissors'.
        game.play();
        // After game is played, printing updated tokens and score.
        System.out.printf("Tokens left: %d\n", game.getTokens());
        System.out.printf("Final score: %d\n\n", game.getScore());
        // Saving user stats to a file.
        game.statsFile();
        // Saving the score and tokens to variables to be used with the Prizes
        // object.
        int score = game.getScore();
        int tokens = game.getTokens();
        // Creating a new Prizes object which allows the user to get prizes.
        Prizes prizes = new Prizes(score, tokens);
        // Listing the possible prizes then allowing the user to select prizes.
        prizes.listPrizes();
        // Printing the prizes that the user selected.
        prizes.myPrizes();

    }

}
