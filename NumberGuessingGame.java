import java.util.Random;  //Importing the Random library to generate random numbers
import java.util.Scanner;  //Importing the Scanner library to read user input


public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();  //Creating a Random object to generate random numbers
        int numberToGuess = rand.nextInt(100) + 1;  //Generating a random number between 1 and 100
        Scanner scnr = new Scanner(System.in);  // Creating a Scanner object to read user input

        int attempts = 0;  //Variable to store the number of attempts
        int n = 0;  //Variable to store the number of allowed attempts


        System.out.println("Choose the number of tries you prefer: ");  //Asking the user to choose the number of attempts
        try {
             n = scnr.nextInt();  //Reading the user's input and converting it to an integer
        } catch (Exception e) {  //Handling any exceptions in case of invalid input
            System.out.println("Invalid number");  //Displaying an error message if the input is invalid
        }

        int guess = 0;  //Variable to store the user's guess

        //Loop to give the player multiple attempts to guess the number
        for (int i = 0; i < n; i++) {
            attempts = (i + 1);  //Updating the attempts counter based on the current iteration
            System.out.print("Guess the number between 1 and 100: ");  //Prompting the user to guess the number
            try {
                guess = scnr.nextInt();  //Reading the user's guess and converting it to an integer
            } catch (Exception e) {  //Handling invalid input (non-numeric or out of range)
                System.out.println("Invalid number");  //Displaying an error message for invalid input
                scnr.next();  //Discarding the invalid input and continuing to the next iteration

            }

            //Comparing the guessed number with the correct one
            if (numberToGuess > guess) {
                System.out.println("Guess higher ");  //If the guessed number is lower, prompt the user to guess higher
            } else if (numberToGuess < guess) {
                System.out.println("Guess lower ");  //If the guessed number is higher, prompt the user to guess lower
            } else {  //If the guess is correct
                System.out.printf("Congrats, that is the correct answer!!\nYou got it in: %d tries\n", attempts);
            }
        }

        System.out.printf("The number was: %d\n", numberToGuess);  //Display the correct number if the user runs out of attempts
    }
}



