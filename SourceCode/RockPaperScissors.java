
// Importing necessary classes.
import java.util.Scanner;

/**
 * A RockPaperScissors class, a subclass of Game.
 * 
 * @author Claire Hopfensperger
 *
 */
public class RockPaperScissors extends Game {

    /**
     * A Scanner object used to read in user input.
     */
    private Scanner in = new Scanner(System.in);

    /**
     * A RockPaperScissors constructor used to created RockPaperScissors
     * objects.
     * 
     * @param tokens An int variable that represents the user's tokens.
     * @param score  An int variable that represents the user's score.
     */
    public RockPaperScissors(int tokens, int score) {
        super(tokens, score);
    }

    /**
     * A method that starts the game of 'Rock, Paper, Scissors'. It implements
     * Game's abstract play method.
     */
    public void play() {
        // If the canPlay method returns true, allow the user to play.
        if (this.canPlay()) {
            // Subtracting tokens from the user each time they play.
            takeTokens(5);
            // Calling intro method.
            intro();
            // Calling userChoice and computerChoice methods to initialize user
            // and computer variables.a
            int user = userChoice();
            int computer = computerChoice();
            // If the user and computer select the same item, it's a tie.
            if (user == computer) {
                System.out.printf("It's a tie.\n\n");
            }
            // Depending on these cases, the user is the winner.
            if (user - computer == 1 || computer - user == 2) {
                System.out.printf("You win!\n\n");
                giveScore(100);
            }
            // Depending on these cases, the computer is the winner.
            if (computer - user == 1 || user - computer == 2) {
                System.out.printf("You lost.\n\n");
            }
            // Calling the playAgain method.
            this.playAgain();
        } else {
            // If the canPlay method returns false, calling the addTokens
            // method.
            addTokens();
        }
    }

    /**
     * A method that determines if the user can play the game. It implements
     * Game's abstract canPlay method.
     * 
     * @return A boolean value.
     */
    protected boolean canPlay() {
        // If the user doesn't have 5 or more tokens, returns false. Otherwise,
        // returns true.
        if (super.getTokens() >= 5) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * A method that introduces the game of 'Rock, Paper, Scissors'.
     */
    private void intro() {
        System.out.printf("Welcome to 'Rock, Paper, Scissors'!\n");
        System.out.printf("Rules: Enter 'rock', 'paper', or 'scissors'");
        System.out.printf(" and try to beat the computer.\n");
    }

    /**
     * A method that takes tokens from the user when they choose to play.
     * 
     * @param tokens An int variable that represents the tokens being taken from
     *               the user.
     */
    private void takeTokens(int tokens) {
        super.setTokens(super.getTokens() - tokens);
    }

    /**
     * A method that adds to the user's score when they win.
     * 
     * @param score An int variable that represents the score being added to the
     *              user's score.
     */
    private void giveScore(int score) {
        super.setScore(super.getScore() + score);
    }

    /**
     * A method that determines the user's choice of 'weapon' for the game.
     * 
     * @return An int value representing 'rock' (1), 'paper' (2), or 'scissors'
     *         (3).
     */
    private int userChoice() {
        String userIn = "";
        boolean bool = true;
        // Depending on if the user says 'rock', 'paper', 'scissors', or
        // neither, repeating the loop.
        do {
            System.out.printf("Enter your weapon: ");
            userIn = in.next();
            if (!(userIn.equalsIgnoreCase("Rock")
                    || userIn.equalsIgnoreCase("Paper")
                    || userIn.equalsIgnoreCase("Scissors"))) {
                System.out.printf("Invalid input. ");
            } else {
                // Printing what the user selected.
                System.out.printf("\nYou selected %s.\n", userIn);
                bool = false;
            }
        } while (bool);
        // Returning an int value that corresponds to the 'weapon' chosen.
        if (userIn.equalsIgnoreCase("Rock")) {
            return 1;
        } else if (userIn.equalsIgnoreCase("Paper")) {
            return 2;
        } else {
            return 3;
        }
    }

    /**
     * A method that determines the computer's choice of 'weapon' for the game.
     * 
     * @return An int value representing 'rock' (1), 'paper' (2), or 'scissors'
     *         (3).
     */
    private int computerChoice() {
        // Randomly assigning computer 1, 2, or 3.
        int computer = (int) (Math.random() * 3) + 1;
        // Depending on computer value, printing which 'weapon' it chose.
        if (computer == 1) {
            System.out.printf("Computer selected rock.\n");
        } else if (computer == 2) {
            System.out.printf("Computer selected paper.\n");
        } else if (computer == 3) {
            System.out.printf("Computer selected scissors.\n");
        }
        // Returning computer value.
        return computer;
    }

    /**
     * A method that determines if the user wants to play again.
     */
    protected void playAgain() {
        String answer = "";
        boolean bool = true;
        // Depending on if the user says 'y', 'n', or neither, repeating the
        // loop.
        do {
            System.out.printf(
                    "Do you want to play 'Rock, Paper, Scissors' again? Y/N: ");
            // Taking user input for answer.
            answer = in.next();
            if (!(answer.equalsIgnoreCase("Y")
                    || answer.equalsIgnoreCase("N"))) {
                System.out.println("Invalid input.");
            } else {
                bool = false;
            }
        } while (bool);
        // If the user enters 'y', calling the play method, otherwise ending the
        // game.
        if (answer.equalsIgnoreCase("Y")) {
            this.play();
        } else {
            System.out.println("Thanks for playing!\n");
        }
    }

    /**
     * A method that allows the user to add tokens to resume playing.
     */
    private void addTokens() {
        String answer = "";
        boolean bool = true;
        System.out.printf("Sorry, you don't have enough tokens. "
                + "Add more to play? Y/N: ");
        // Depending on if the user says 'y', 'n', or neither, repeating the
        // loop.
        do {
            // Taking user input for answer.
            answer = in.next();
            if (!(answer.equalsIgnoreCase("Y")
                    || answer.equalsIgnoreCase("N"))) {
                System.out.println("Invalid input.");
            } else {
                bool = false;
            }
        } while (bool);
        // If user enters 'y', asking how many tokens they'd like to add, adding
        // tokens to user's tokens, then calling the play method.
        if (answer.equalsIgnoreCase("Y")) {
            System.out.print("How many tokens would you like to add? ");
            System.out.println();
            super.setTokens(super.getTokens() + in.nextInt());
            this.play();
        } else {
            // If the user selects 'n', ending the game.
            System.out.println("Thanks for playing!\n");
        }
    }

}
