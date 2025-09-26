import  java.util.Random;  //Import necessary utility class
import java.util.Scanner;  //Import Scanner class to read user input

public class DiceRollingGame {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);  //Scanner to read user input
        int count=0;  //Counter to track how many times dice have been rolled
        String answer;  //To store user input
        Random rand = new Random();  //Random object to simulate dice rolls


        while(true){

            System.out.println("Roll the dice (y/n): ");  //Ask user if they want to roll the dice

            answer = scnr.nextLine();  //Read user input
            String lowerAnswer = answer.toLowerCase();  //Convert input to lowercase

            int firstDie = rand.nextInt(6)+1;  //Generate number for first die (1-6)
            int secondDie = rand.nextInt(6)+1;  //Generate number for second die (1-6)

        if(lowerAnswer.equals("y")){
            count++;  //Increment roll counter
            System.out.printf("Die 1: %d, Die 2: %d\n", firstDie, secondDie);  //Print dice values
            System.out.printf("Dice Rolled %d Times\n", count);  //Print number of rolls
        }else if(lowerAnswer.equals("n")){
            System.out.println("Thanks for playing!!");  //Exit message
            break;  //Break the loop to end the game
        }else {
            System.out.println("Invalid input!");  //Invalid input message
        }
        }
    }
}
