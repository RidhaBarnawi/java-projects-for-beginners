import java.util.*;  //Import necessary utility classes

public class RockPaperScissorsGame {
    public static void main(String[] args) {
       Scanner scnr = new Scanner(System.in);  //Scanner to read user input

       Random rand = new Random();  //Random object for computer's choice

       int winCounter = 0;  //Counter for user's wins
       int loseCounter = 0;  //Counter for user's losses

       String answer;  //To store user input
       String continueGame;  //To store user's choice to continue or not

        //Map representing which choice beats what
       Map<String, String> winningArray = new HashMap<>();
       winningArray.put("r", "s");  //Rock beats Scissors
       winningArray.put("p", "r");  //Paper beats Rock
       winningArray.put("s", "p");  //Scissors beats Paper


       while (true){
           //Mapping each character to its full word
           Map<String, String> guesses = new HashMap<>();
           guesses.put("r", "Rock");
           guesses.put("p", "Paper");
           guesses.put("s", "Scissors");

           //Create list of keys and pick one randomly for computer
           List<String> keys = new ArrayList<>(guesses.keySet());
           String randomKey = keys.get(rand.nextInt(keys.size()));

           //Ask user for their input
           System.out.println("Rock, Paper, or Scissors? (r/p/s): ");
           answer = scnr.nextLine();
           String lowercaseString = answer.toLowerCase();  //Convert input to lowercase

           //Check user input and print choices
           if (lowercaseString.equals("r")) {
               System.out.printf("you chose: %s\n", guesses.get(lowercaseString));
               System.out.printf("computer chose: %s\n", guesses.get(randomKey));
           }else if (lowercaseString.equals("p")) {
               System.out.printf("you chose: %s\n", guesses.get(lowercaseString));
               System.out.printf("computer chose: %s\n", guesses.get(randomKey));
           }else if (lowercaseString.equals("s")) {
               System.out.printf("you chose: %s\n", guesses.get(lowercaseString));
               System.out.printf("computer chose: %s\n", guesses.get(randomKey));
           }else {
               System.out.println("invalid choice!");  //Invalid input message
               continue;  //Go back to the start of the loop
           }

           //Determine winner based on the winning array
           if (winningArray.get(lowercaseString).equals(randomKey)){
               winCounter++;
           } else if (winningArray.get(randomKey).equals(lowercaseString)){
               loseCounter++;
           }else {
               System.out.println("it's a tie");  //Same choice by both
           }

           //Check for game-ending condition
           if (winCounter == 2){
               System.out.println("Congratulations! You win!");
           }else if (loseCounter == 2){
               System.out.println("You lose!");
           }else  {
               continue; // Continue if no one has 2 wins yet
           }

           //Ask the user if they want to play again
            System.out.println("do you want to play again?(n/y): ");
            continueGame = scnr.nextLine().toLowerCase();  //Convert to lowercase

            if (continueGame.equals("y")){
                //Reset the counters for a new game
                winCounter = 0;
                loseCounter = 0;
                continue;
            }else if (continueGame.equals("n")){
                System.out.println("thanks for playing");
                break;
            }else  {
                System.out.println("invalid choice!");  //Invalid replay input
                break;
            }

       }
       scnr.close();
    }
}
