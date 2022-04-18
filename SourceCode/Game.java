
// Importing necessary classes.
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This abstract class is the parent class to RockPaperScissors. It can be used
 * as a parent class to other game classes.
 * 
 * @author Claire Hopfensperger
 *
 */
public abstract class Game {

    /**
     * An int variable representing how many tokens the user has.
     */
    private int tokens = 0;

    /**
     * An int variable representing the user's score.
     */
    private int score = 0;

    /**
     * A Game constructor used to create Game objects.
     * 
     * @param tokens An int variable representing user's tokens.
     * @param score  An int variable representing user's score.
     */
    public Game(int tokens, int score) {
        this.tokens = tokens;
        this.score = score;
    }

    /**
     * A method that sets the number of tokens.
     * 
     * @param tokens An int variable representing user's tokens.
     */
    public void setTokens(int tokens) {
        this.tokens = tokens;
    }

    /**
     * A method that gets the number of tokens.
     * 
     * @return An int value representing user's tokens.
     */
    public int getTokens() {
        return this.tokens;
    }

    /**
     * A method that sets the user's score.
     * 
     * @param score An int variable representing the user's score.
     */
    protected void setScore(int score) {
        this.score = score;
    }

    /**
     * A method that gets the user's score.
     * 
     * @return An int value representing the user's score.
     */
    public int getScore() {
        return this.score;
    }

    /**
     * An abstract method used to run the game.
     */
    public abstract void play();

    /**
     * An abstract method used to determine if the user can still play.
     * 
     * @return A boolean value.
     */
    protected abstract boolean canPlay();

    /**
     * An abstract method used to determine in the user wants to play again.
     */
    protected abstract void playAgain();

    /**
     * A method that writes the user's stats to a file.
     * 
     * @note I suppressed a warning that alerted me of a potential resource leak
     *       from not closing Scanner in. I do not close the Scanner because if
     *       I were to close the Scanner, it would close the input stream, and I
     *       need the input stream to stay open because I need to access it many
     *       times during this program.
     * 
     * @throws IOException An exception that signals an I/O exception has
     *                     occurred.
     */
    @SuppressWarnings("resource")
    public void statsFile() throws IOException {
        // Creating a Scanner then using it to read user input to determine name
        // of file.
        Scanner in = new Scanner(System.in);
        System.out.println("What file would you like to hold your stats? ");
        String fileName = in.next();
        // Creating a PrintWriter then using it to write in the user's selected
        // file.
        PrintWriter write = new PrintWriter(new File(fileName));
        write.printf("User tokens: %d\n", this.tokens);
        write.printf("User score: %d\n", this.score);
        // Closing PrintWriter write.
        write.close();
        System.out.printf("Your Stats file, '%s', is ready!\n\n", fileName);
    }

}
