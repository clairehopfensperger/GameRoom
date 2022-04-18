
// Importing necessary classes.
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A Prizes class.
 * 
 * @author Claire Hopfensperger
 *
 */
public class Prizes {

    /**
     * An ArrayList of Strings that hold the possible prizes to buy.
     */
    private ArrayList<String> prizes = new ArrayList<String>();

    /**
     * An ArrayList of Integers that hold the corresponding prices to the
     * possible prizes.
     */
    private ArrayList<Integer> prices = new ArrayList<Integer>();

    /**
     * An ArrayList of Strings that hold the prizes the user buys.
     */
    private ArrayList<String> myPrizeList = new ArrayList<String>();

    /**
     * An int variable that represents the user's tokens.
     */
    private int tokens = 0;

    /**
     * An int variable that represents the user's score.
     */
    private int score = 0;

    /**
     * An int variable that represents the user's tickets.
     */
    private int tickets = 0;

    /**
     * A Prizes constructor used to create Prizes objects.
     * 
     * @param score  An int variable representing the user's score.
     * @param tokens An int variable representing the user's tokens.
     */
    public Prizes(int score, int tokens) {
        this.score = score;
        this.tokens = tokens;
    }

    /**
     * A method that determines how many tickets the user has and sets up the
     * prizes and prices ArrayLists.
     */
    private void setup() {
        // Determining how many tickets the user has.
        setTickets((this.score / 10) + this.tokens);
        // Adding prizes to prizes ArrayList.
        this.prizes.add("Stuffed Animal");
        this.prizes.add("Rubiks Cube");
        this.prizes.add("Bouncy Ball");
        this.prizes.add("Candy");
        // Adding corresponding prices of prizes to prices ArrayList.
        this.prices.add(60);
        this.prices.add(40);
        this.prices.add(15);
        this.prices.add(5);
    }

    /**
     * A method that lists the possible prizes to buy.
     */
    public void listPrizes() {
        // Calling the setup method.
        setup();
        // Printing the available prizes.
        System.out.println("Prizes:");
        for (int i = 0; i < prizes.size(); i++) {
            System.out.printf("%s: %d tickets\n", prizes.get(i), prices.get(i));
        }
        // Calling the pickPrize method to allow the user to pick prizes.
        pickPrize();
    }

    /**
     * A method that allows the user to pick a prize.
     * 
     * @note I suppressed a warning that alerted me of a potential resource leak
     *       from not closing Scanner in. I do not close the Scanner because if
     *       I were to close the Scanner, it would close the input stream, and I
     *       need the input stream to stay open because I need to access it many
     *       times during this program.
     */
    @SuppressWarnings("resource")
    private void pickPrize() {
        // Creating a Scanner to read user input.
        Scanner in = new Scanner(System.in);
        String answer = "";
        boolean bool = true;
        // Depending on if the user says 'y', 'n', or neither, repeating the
        // loop.
        do {
            System.out.printf("\nYou have %d tickets.\n", getTickets());
            System.out.println("Would you like to pick a prize? Y/N: ");
            // Taking user input as answer then testing if it's 'y', 'n', or
            // neither.
            answer = in.next();
            if (!(answer.equalsIgnoreCase("Y")
                    || answer.equalsIgnoreCase("N"))) {
                System.out.println("Invalid input.");
            } else {
                bool = false;
            }
        } while (bool);
        // If answer is 'y', calling the selectPrize method which allows the
        // user to select a prize, and calling the pickPrize method again.
        if (answer.equalsIgnoreCase("Y")) {
            selectPrize();
            pickPrize();
        }

    }

    /**
     * A method that allows the user to select a specific prize.
     * 
     * @note I suppressed a warning that alerted me of a potential resource leak
     *       from not closing Scanner in. I do not close the Scanner because if
     *       I were to close the Scanner, it would close the input stream, and I
     *       need the input stream to stay open because I need to access it many
     *       times during this program.
     */
    @SuppressWarnings("resource")
    private void selectPrize() {
        // Creating a Scanner to read user input.
        Scanner in = new Scanner(System.in);
        String selectPrize = "";
        System.out.println("Enter which prize you want (name): ");
        // User selects prize.
        selectPrize = in.nextLine();
        // Creating an int variable to help track whether or not the user input
        // a valid prize.
        int temp = 0;
        // Finding price in prizes ArrayList.
        for (int i = 0; i < prizes.size(); i++) {
            if (selectPrize.equalsIgnoreCase(prizes.get(i))
                    && getTickets() >= prices.get(i)) {
                System.out.printf("Here is your %s!\n", prizes.get(i));
                // Subtracting price of prize from user's tickets.
                setTickets(getTickets() - prices.get(i));
                // Adding prize to user's prize list ArrayList.
                myPrizeList.add(prizes.get(i));
            } else if (selectPrize.equalsIgnoreCase(prizes.get(i))
                    && getTickets() < prices.get(i)) {
                System.out.printf(
                        "Sorry, you don't have enough tickets for the %s.\n",
                        prizes.get(i));
            } else if (!selectPrize.equalsIgnoreCase(prizes.get(i))) {
                temp += 1;
            }
        }
        // If temp is the same as the size of prizes, then the user did not
        // enter a valid prize.
        if (temp == prizes.size()) {
            System.out.println("Invalid input.");
        }
    }

    /**
     * A method that lists the prizes the user purchased.
     */
    public void myPrizes() {
        System.out.print("Here are your prizes: ");
        // Printing the user's prizes from their prize list ArrayList.
        for (int i = 0; i < myPrizeList.size(); i++) {
            System.out.print(myPrizeList.get(i));
            // Printing punctuation.
            if (i < myPrizeList.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.printf("\nThanks for playing!\n");
        // End of whole program.
    }

    /**
     * A method that gets the user's tickets.
     * 
     * @return An int value representing the user's tickets.
     */
    private int getTickets() {
        return this.tickets;
    }

    /**
     * A method that sets the user's tickets.
     * 
     * @param tickets An int value representing the user's tickets.
     */
    private void setTickets(int tickets) {
        this.tickets = tickets;
    }

}
