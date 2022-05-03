<h1 align="center">🎮 Game Room</h1><br>

new repository, work in progress :)

## 👾 About the Class and Assignment
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

## The Problem
The problem I solved with my code is being able to play a game. I created 3 classes: A Game class, a RockPaperScissors class, and a Prizes class. The purpose of the overall code is to play ‘Rock, Paper, Scissors’ and then purchase prizes with the earned tickets.
<br><br><br>

## How it Works
The following description explains how the code written in GameTester.java works from the user’s perspective. Method breakdowns are under “Class Overviews/Documentation.”
<br>

I created a GameTester class that has a main method that runs the code. In order to play ‘Rock, Paper, Scissors’, you first need to make a RockPaperScissors object and add arguments for how many tokens you want to start with and if you are coming in with an initial score. I created these parameters because if someone wanted to play a game, end it, then play again but didn’t cash in their score for tickets and then prizes, they could start a new game (by creating another RockPaperScissors object) with an incoming score.
<br>

Once you’ve created a RockPaperScissors object, you can call the setTokens() method that allows you to add tokens to your count. You need tokens to play, and each round of ‘Rock, Paper, Scissors’ takes 5 tokens. You can then use the getTokens() method that returns an integer count of how many tokens you have.
<br>

<p align="center">
  <img src="https://github.com/clairehopfensperger/GameRoom/blob/main/Images/howItWorks3.jpg" width=500>
</p>

In order to begin a game of ‘Rock, Paper, Scissors’, you need to call the play() method. When you call this method, you will be prompted to enter ‘Rock’, ‘Paper’, or ‘Scissors’. Then, once you enter your choice, the program prints to the console your choice, the computer’s choice, and whether you won or lost. Then you’re asked if you want to play again, and this process repeats until you run out of tokens or choose not to play again. If you run out of tokens, you’re asked if you want to add more to continue playing, and if you choose yes, then you can select how many tokens to add and then you can play again.
<br>

<p align="center">
  <img src="https://github.com/clairehopfensperger/GameRoom/blob/main/Images/howItWorks5.jpg" width=500><br>
  <img src="https://github.com/clairehopfensperger/GameRoom/blob/main/Images/howItWorks6.jpg" width=500>
</p>

When you’re done playing ‘Rock, Paper, Scissors’, you can save your game statistics to a file by using the statsFile() method. When you call this method, you will be prompted to enter a name of a file, and then a file with the name you inputted will be created with your remaining tokens and final score written inside of it. The program will say when your file is ready.
<br>

<p align="center">
  <img src="https://github.com/clairehopfensperger/GameRoom/blob/main/Images/howItWorks7.jpg" width=500>
</p>

After you finish playing ‘Rock, Paper, Scissors’, you can start the process of choosing prizes by creating a Prizes object and adding arguments for score and tokens. In order to add these tokens, you can call getScore() and getTokens() for your RockPaperScissors object. Then, to see and select prizes, you must call the listPrizes() method for your Prizes object. 
<br>

When you call the listPrizes() method, your input score and tokens are converted to tickets which allows you to buy prizes. Then, all the available prizes will be listed with their prices, and you can decide if you want to purchase a prize and then enter which prize you want. You are repeatedly asked if you want to purchase a prize until you say no. All the prizes you purchase are added to an ArrayList representing your prizes. Then, if you want to see all your prizes, you can call the myPrizes() method and all of your prizes will be listed. 
<br><br><br>

## How Others Can Use My Code
People could interact with my code as it is written now, so they could create RockPaperScissors and Prizes objects and play ‘Rock, Paper, Scissors’ and buy prizes with the tickets they earn. If people are to use my code for just entertainment, they could follow my GameTester class or mess with the methods and figure things out for themselves.
<br>

Another way people could use my code is by creating their own games using my abstract Game class as their parent class. People could get creative with the games they make and not have to worry about the extra methods that are already provided in the Game class.
<br><br><br>

## Important Notes From the Author (Me)
<ol type = "1">
  <li>I do not close my Scanners because, depending on how the user uses the program, closing a Scanner would close the input stream and then the Scanners wouldn’t work for the rest of the program. It was more important to me to have completely functional Scanners than a potential “resource leak.” If the Scanners don’t work, then practically my whole program would not work.</li><br>
  <li>Regarding the visibility of methods in my classes, I wanted to make the methods reflect the “environment” that the user is interacting with. For example, if the user is actually at an arcade, they would not be able to set their score or decide what choice the computer makes in the game of ‘Rock, Paper, Scissors’. I thought the limited choices for the user would be more realistic. </li>
</ol type = "1">
<br><br>

## UML
Here's the UML for my program. 😎
<br>
<p align="center">
  <img src="https://github.com/clairehopfensperger/GameRoom/blob/main/Images/GameRoomUML.jpg" width = 750>
</p>
<br><br>

## Class Overviews/Documentation
### Game
The Game class is an abstract parent class. It has the structure to make different child class game objects.
<br>

<ul class="disk">
  <li>Instance Variables:</li>
  <ul class="circle">
    <li>Private int tokens - user’s tokens count</li>
    <li>Private int score - user’s score</li>
  </ul>
  </li>
  <br>
 
  <li>Constructor: public Game(int tokens, int score)</li>
  <ul class="circle">
    <li>Used to create Game objects</li>
    <li>Parameter int tokens - user’s initial token count</li>
    <li>Parameter int score - user’s score</li>
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
        <li>Sets the user’s token count</li>
        <li>Parameter int tokens - user’s tokens</li>
      </ul>
      </li>
    <li>public int getTokens()</li>
      <ul class="square">
        <li>Gets the user’s token count</li>
        <li>Returns an int value - user’s tokens</li>
      </ul>
      </li>
    <li>public int getScore()</li>
      <ul class="square">
        <li>Gets the user's score</li>
        <li>Returns an int value - user's score</li>
      </ul>
      </li>
    <li>protected void setScore(int score)</li>
      <ul class="squre">
        <li>Sets the user's score</li>
        <li>Parameter int score - user's score</li>
        <li>Protected because I didn’t want the user to be able to mess with their score but I needed the child classes to be able to use this method</li>
      </ul>
      </li>
    </ul>
    </li>
  <li>Other Methods:</li>
  <ul class="circle">
    <li>public void statsFile()</li>
      <ul class="square">
        <li>Takes the user’s stats and writes them into a file</li>
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
        <li>Protected because the user doesn’t need to call this method as it should be called at the beginning of the play method</li>
      </ul>
      </li>
    <li>protected abstract void playAgain()</li>
      <ul class="squre">
        <li>Abstract method that child classes must override</li>
        <li>Asks the user if they want to play again</li>
        <li>Protected because the user doesn’t need to call this method as it should be called at the end of the play method</li>
      </ul>
      </li>
    </ul>
    </li>
  </ul>
  </li>
  <br>
  
