<h1 align="center">ð® Game Room ð®</h1><br>

<table align="center">
	<tr>
		<th>
			Directory
		</th>
	</tr>
	<tr>
		<td>
			<a href="#-about-the-class-and-assignment">ð¾ About the Class and Assignment</a><br><br>
			<a href="#-the-problem">ð¯ The Problem</a><br><br>
      			<a href="#-how-it-works">ð¹ How it Works</a><br><br>
      			<a href="#-how-others-can-use-my-code">ð° How Others Can Use My Code</a><br><br>
      			<a href="#%EF%B8%8F-important-notes-from-the-author-me">â ï¸ Important Notes From the Author (Me)</a><br><br>
      			<a href="#-uml">ð² UML</a><br><br>
			<a href="#-class-overviewsdocumentation">ð± Class Overviews/Documentation</a>
			<ul>
				<li><a href="#game">Game</a></li>
        			<li><a href="#rockpaperscissors">RockPaperScissors</a></li>
				<li><a href="#prizes">Prizes</a></li>
			</ul>
		</td>
  	</tr>
</table><br>

## ð¾ About the Class and Assignment
#### CSE 271 - Object-Oriented Programming
I took this class during the spring semester of my freshman year, and I created this project for a homework assignment we were given 3 days to complete, but my professor extended the deadline so we ultimately had a whole week to work on this. I have a summary of what I've learned in CSE 271 on my main repository if you're curious what the class entailed. 
<br>

The assignment's requirements were:
- Solve a problem around you
- Create (minimum) 3 classes with at least 7 methods each
- Create UML for the classes
- Create documentation for the code and generate the JavaDoc
- Explain how the code works, how someone else could use it, and all of the classes' and methods' details
<br><br><br>

## ð¯ The Problem
The problem I solved with my code is being able to play a game. I created 3 classes: A Game class, a RockPaperScissors class, and a Prizes class. The purpose of the overall code is to play âRock, Paper, Scissorsâ and then purchase prizes with the earned tickets.
<br><br><br>

## ð¹ How it Works
The following description explains how the code written in GameTester.java works from the userâs perspective. Method breakdowns are under âClass Overviews/Documentation.â
<br>

I created a GameTester class that has a main method that runs the code. In order to play âRock, Paper, Scissorsâ, you first need to make a RockPaperScissors object and add arguments for how many tokens you want to start with and if you are coming in with an initial score. I created these parameters because if someone wanted to play a game, end it, then play again but didnât cash in their score for tickets and then prizes, they could start a new game (by creating another RockPaperScissors object) with an incoming score.
<br>

Once youâve created a RockPaperScissors object, you can call the setTokens() method that allows you to add tokens to your count. You need tokens to play, and each round of âRock, Paper, Scissorsâ takes 5 tokens. You can then use the getTokens() method that returns an integer count of how many tokens you have.
<br>

<p align="center">
 	<img src="https://github.com/clairehopfensperger/GameRoom/blob/main/Images/howItWorks3.jpg" width=500>
</p>

In order to begin a game of âRock, Paper, Scissorsâ, you need to call the play() method. When you call this method, you will be prompted to enter âRockâ, âPaperâ, or âScissorsâ. Then, once you enter your choice, the program prints to the console your choice, the computerâs choice, and whether you won or lost. Then youâre asked if you want to play again, and this process repeats until you run out of tokens or choose not to play again. If you run out of tokens, youâre asked if you want to add more to continue playing, and if you choose yes, then you can select how many tokens to add and then you can play again.
<br>

<p align="center">
 	<img src="https://github.com/clairehopfensperger/GameRoom/blob/main/Images/howItWorks5.jpg" width=500><br>
 	<img src="https://github.com/clairehopfensperger/GameRoom/blob/main/Images/howItWorks6.jpg" width=500>
</p>

When youâre done playing âRock, Paper, Scissorsâ, you can save your game statistics to a file by using the statsFile() method. When you call this method, you will be prompted to enter a name of a file, and then a file with the name you inputted will be created with your remaining tokens and final score written inside of it. The program will say when your file is ready.
<br>

<p align="center">
	<img src="https://github.com/clairehopfensperger/GameRoom/blob/main/Images/howItWorks7.jpg" width=500>
</p>

After you finish playing âRock, Paper, Scissorsâ, you can start the process of choosing prizes by creating a Prizes object and adding arguments for score and tokens. In order to add these tokens, you can call getScore() and getTokens() for your RockPaperScissors object. Then, to see and select prizes, you must call the listPrizes() method for your Prizes object. 
<br>

<p align="center">
  	<img src="https://github.com/clairehopfensperger/GameRoom/blob/main/Images/howItWorks10.jpg" width=500>
</p>

When you call the listPrizes() method, your input score and tokens are converted to tickets which allows you to buy prizes. Then, all the available prizes will be listed with their prices, and you can decide if you want to purchase a prize and then enter which prize you want. You are repeatedly asked if you want to purchase a prize until you say no. All the prizes you purchase are added to an ArrayList representing your prizes. Then, if you want to see all your prizes, you can call the myPrizes() method and all of your prizes will be listed. 
<br>

<p align="center">
  	<img src="https://github.com/clairehopfensperger/GameRoom/blob/main/Images/howItWorks11.jpg" width=500><br>
  	<img src="https://github.com/clairehopfensperger/GameRoom/blob/main/Images/howItWorks12.jpg" width=500>
</p>

<br><br>

## ð° How Others Can Use My Code
People could interact with my code as it is written now, so they could create RockPaperScissors and Prizes objects and play âRock, Paper, Scissorsâ and buy prizes with the tickets they earn. If people are to use my code for just entertainment, they could follow my GameTester class or mess with the methods and figure things out for themselves.
<br>

Another way people could use my code is by creating their own games using my abstract Game class as their parent class. People could get creative with the games they make and not have to worry about the extra methods that are already provided in the Game class.
<br><br><br>

## â ï¸ Important Notes From the Author (Me)
<ol type = "1">
  	<li>I do not close my Scanners because, depending on how the user uses the program, closing a Scanner would close the input stream and then the Scanners wouldnât work for the rest of the program. It was more important to me to have completely functional Scanners than a potential âresource leak.â If the Scanners donât work, then practically my whole program would not work.</li><br>
  	<li>Regarding the visibility of methods in my classes, I wanted to make the methods reflect the âenvironmentâ that the user is interacting with. For example, if the user is actually at an arcade, they would not be able to set their score or decide what choice the computer makes in the game of âRock, Paper, Scissorsâ. I thought the limited choices for the user would be more realistic. </li>
</ol type = "1">
<br><br>

## ð² UML
Here's the UML for my program. ð
<br>
<p align="center">
  	<img src="https://github.com/clairehopfensperger/GameRoom/blob/main/Images/GameRoomUML.jpg" width = 750>
</p>
<br><br>

## ð± Class Overviews/Documentation
### Game
The Game class is an abstract parent class. It has the structure to make different child class game objects.
<br>

<ul class="disk">
<li>Instance Variables:</li>
	<ul class="circle">
    		<li>Private int tokens - userâs tokens count</li>
    		<li>Private int score - userâs score</li>
  	</ul>
  	</li>
	<br>
 
<li>Constructor: public Game(int tokens, int score)</li>
  	<ul class="circle">
    		<li>Used to create Game objects</li>
    		<li>Parameter int tokens - userâs initial token count</li>
    		<li>Parameter int score - userâs score</li>
   			<ul class="square">
				<li>Useful if the user wants to create a new game but keep their score from a previous game</li>
    			</ul>
   		</li>
 	</ul>
</li>
<br>
 
<li>Getters/Setters:</li>
  	<ul class="circle">
    		<li>public void setTokens(int tokens)</li>
     			<ul class="square">
        			<li>Sets the userâs token count</li>
        			<li>Parameter int tokens - userâs tokens</li>
      			</ul>
      		</li>
    		<li>public int getTokens()</li>
      			<ul class="square">
        			<li>Gets the userâs token count</li>
        			<li>Returns an int value - userâs tokens</li>
      			</ul>
      		</li>
    		<li>public int getScore()</li>
      			<ul class="square">
        			<li>Gets the user's score</li>
        			<li>Returns an int value - user's score</li>
      			</ul>
      		</li>
    		<li>protected void setScore(int score)</li>
      			<ul class="square">
        			<li>Sets the user's score</li>
        			<li>Parameter int score - user's score</li>
        			<li>Protected because I didnât want the user to be able to mess with their score but I needed the child classes to be able to use this method</li>
      			</ul>
      		</li>
	</ul>
</li>
<li>Other Methods:</li>
  	<ul class="circle">
    		<li>public void statsFile()</li>
			<ul class="square">
        			<li>Takes the userâs stats and writes them into a file</li>
			</ul>
      		</li>
    		<li>public abstract void play()</li>
      			<ul class="square">
        			<li>Abstract method that child classes must override</li>
        			<li>Plays a game</li>
      			</ul>
      		</li>
    		<li>protected abstract boolean canPlay()</li>
      			<ul class="square">
        			<li>Abstract method that child classes must override</li>
        			<li>Determines if the user can play a game</li>
        			<li>Returns a boolean value - true/false if the user can play</li>
        			<li>Protected because the user doesnât need to call this method as it should be called at the beginning of the play method</li>
      			</ul>
      		</li>
    		<li>protected abstract void playAgain()</li>
      			<ul class="squre">
        			<li>Abstract method that child classes must override</li>
        			<li>Asks the user if they want to play again</li>
        			<li>Protected because the user doesnât need to call this method as it should be called at the end of the play method</li>
      			</ul>
      		</li>
    	</ul>
</li>
</ul>
<br>
<br>
  
### RockPaperScissors
The RockPaperScissors class is a child class to the Game class. It is used to create RockPaperScissors objects that allow the user to play âRock, Paper, Scissorsâ.
<br>

<ul class="disk">
<li>Instance Variables:</li>
	<ul class="circle">
    		<li>private Scanner in - used to read in user input with the System.in input stream</li>
			<ul class="sqaure">
				<li>I made a Scanner object an instance variable because I use a Scanner in multiple methods, and it was more simple to create an instance variable to reference each time than to create a new Scanner object in each method.</li>
				<li>Note: I do not close Scanner in because if I were to close the Scanner, it would close the input stream, and I need the input stream to stay open because I need to access it many times during the program.</li>
			</ul>
  	</ul>
  	</li>
	<br>
 
<li>Constructor: public RockPaperScissors(int tokens, int score)</li>
  	<ul class="circle">
    		<li>Used to create RockPaperScissors objects which allow the user to play âRock, Paper, Scissors'</li>
    		<li>Parameter int tokens - userâs initial token count</li>
    		<li>Parameter int score - userâs score</li>
   			<ul class="square">
				<li>Useful if the user wants to play a new game but keeps their score from a previous game</li>
    			</ul>
   		</li>
 	</ul>
</li>
<br>

<li>Methods:</li>
  	<ul class="circle">
    		<li>public void play()</li>
     			<ul class="square">
        			<li>Implements Gameâs abstract play() method</li>
        			<li>Initiates a game of âRock, Paper, Scissorsâ, compares what the user and computer choose and determines who wins</li>
      			</ul>
      		</li>
    		<li>protected boolean canPlay()</li>
      			<ul class="square">
        			<li>Implements Gameâs abstract canPlay() method</li>
        			<li>Determines of the user is able to play the game based on if they have enough tokens for the game</li>
				<li>Returns a boolean value - true/false if the user can play</li>
				<li>Protected because the user doesnât need to call this method as it should be called at the beginning of the play method</li>
      			</ul>
      		</li>
    		<li>protected void playAgain()</li>
      			<ul class="square">
        			<li>Implements Gameâs abstract playAgain() method</li>
        			<li>Asks the user if they want to play another round of âRock, Paper, Scissorsâ</li>
				<li>Protected because the user doesnât need to call this method as it should be called at the end of the play method</li>
      			</ul>
      		</li>
    		<li>private void intro()</li>
      			<ul class="square">
        			<li>Prints the intro message to the âRock, Paper, Scissorsâ game</li>
        			<li>Private because the user doesnât need to call this method as it should be called at the beginning of the play method</li>
      			</ul>
      		</li>
		<li>private void takeTokens(int tokens)</li>
			<ul class="square">
				<li>Removes 5 tokens from the userâs token count each time they play a round of âRock, Paper, Scissorsâ</li>
				<li>Parameter int tokens - how many tokens to remove</li>
				<li>Private because the user doesnât need to call this method as it should be called when the user decides to play each round of âRock, Paper, Scissorsâ</li>
			</ul>
		</li>
		<li>private void addTokens()</li>
			<ul class="square">
				<li>Allows the user to add more tokens to their token count when they run out of tokens but want to play more rounds of âRock, Paper, Scissorsâ</li>
				<li>Private because the user doesnât need to call this method as it should be called when the user decides to play each round of âRock, Paper, Scissorsâ</li>
			</ul>
		</li>
		<li>private void giveScore(int score)</li>
			<ul class="square">
				<li>Adds 100 to the userâs score when they win a round of âRock, Paper, Scissorsâ</li>
				<li>Private because the user doesnât need to call this method as it should be called when the user decides to play each round of âRock, Paper, Scissorsâ</li>
			</ul>
		</li>
		<li>private int userChoice()</li>
			<ul class="square">
				<li>User enters a word and, depending on whether they choose ârockâ, âpaperâ, or âscissorsâ, this method returns a number (1, 2, or 3) to be used in the math that determines if the user wins or loses</li>
				<li>Returns an int value - userâs choice</li>
				<li>Private because the user doesnât need to call this method as it should be called when the user decides to play each round of âRock, Paper, Scissorsâ</li>
			</ul>
		</li>
		<li>private int computerChoice()</li>
			<ul class="square">
				<li>Randomly sets computerâs choice to a number 1-3 which correlates to ârockâ, âpaperâ, or âscissorsâ</li>
				<li>Returns an int value - computerâs choice</li>
				<li>Private because the user doesnât need to call this method as it should be called when the user decides to play each round of âRock, Paper, Scissorsâ</li>
			</ul>
		</li>
	</ul>
</li>
</ul>
<br>
<br>

### Prizes
The Prizes class is used to create Prizes objects that allow the user to purchase prizes.
<br>

<ul class="disk">
<li>Instance Variables:</li>
	<ul class="circle">
    		<li>The Prizes class is used to create Prizes objects that allow the user to purchase prizes.</li>
    		<li>private ArrayList< Integer > prices - an ArrayList of int variables representing the corresponding prices to the available prizes</li>
		<li>private ArrayList< String > myPrizeList - an ArrayList of String objects representing the prizes the user purchased</li>
		<li>private int tokens - userâs token count</li>
		<li>private int score - userâs score</li>
		<li>private int tickets - userâs tickets</li>
  	</ul>
  	</li>
	<br>
 
<li>Constructor: public Prizes(int score, int tokens)</li>
  	<ul class="circle">
    		<li>Used to create Prizes objects that allow the user to purchase prizes</li>
    		<li>Parameter int score - userâs score</li>
    		<li>Parameter int tokens - userâs token count</li>
 	</ul>
</li>
<br>
 
<li>Getters/Setters:</li>
  	<ul class="circle">
    		<li>private void setTickets(int tickets)</li>
     			<ul class="square">
        			<li>Sets the userâs ticket count</li>
        			<li>Parameter int tickets - userâs ticket count</li>
				<li>Private because the user doesnât need to call this method as it should be called in the setup method</li>
      			</ul>
      		</li>
    		<li>public int getTickets()</li>
      			<ul class="square">
        			<li>Gets the userâs tickets</li>
        			<li>Returns an int value - userâs tickets</li>
				<li>Private because the user doesnât need to call this method as it should be called in the selectPrize() method when determining if the user has enough tickets for a prize</li>
      			</ul>
      		</li>
	</ul>
</li>
<li>Other Methods:</li>
  	<ul class="circle">
    		<li>public void listPrizes()</li>
			<ul class="square">
        			<li>Prints the prizes and their corresponding prices</li>
			</ul>
      		</li>
    		<li>public void myPrizes()</li>
      			<ul class="square">
        			<li>Prints the prizes that the user purchased</li>
      			</ul>
      		</li>
    		<li>private void setup()</li>
      			<ul class="square">
        			<li>Calculates the userâs ticket count</li>
        			<li>Adds prizes and corresponding prices to their respective ArrayLists</li>
        			<li>Private because the user doesnât need to call this method as it should be called in the beginning of the listPrizes() method</li>
      			</ul>
      		</li>
    		<li>private void pickPrize()</li>
      			<ul class="squre">
        			<li>Allows the user to select which prize theyâd like to purchase prizes repeatedly until they decide not to purchase a prize</li>
        			<li>Private because the user doesnât need to call this method as it should be called at the end of the listPrizes() method</li>
      			</ul>
      		</li>
		<li>private void selectPrize()</li>
      			<ul class="squre">
        			<li>The active process of the user entering which prize they want to purchase, subtracting the cost of the prize from the userâs ticket count, and adding their purchased prize to the myPrizeList</li>
      			</ul>
      		</li>
    	</ul>
</li>
</ul>
<br>
<br>

- - - -
<h6 align="center">
	<a align="center" href="#-game-room-">â¬ Back To The Top </a>
</h6>

- - - -

<h6 align="center">
	<a href="https://github.com/clairehopfensperger">â© Back to Claire Hopfensperger's Profile</a>
</h6>

- - - -

<h6 align="center">
  Copyright Â© Claire Hopfensperger 2022
</h6>
