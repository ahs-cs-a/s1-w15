import java.util.Scanner;
import java.util.Random;

public class HW{
    Scanner in = new Scanner(System.in);

    //Write a method that counts the number of two 
    //letter runs in a given string. 
    //For example, “xxxxyzz” should return 3 and “aaaaaaa” should return 3.
    // write a tester that tests various cases : 0 runs, 1 run, etc.
    public int twoRunCounter(String x){
        return -1;
    }

    //You should use this method in the numGuesser0to100 
    //method below
    public int askForNum(){
        //asks player for an integer and returns that integer.
        System.out.print("Enter an integer between 1 and 100:  ");
        int ans = in.nextInt(); 
        return ans;
    }
    
    //This is number 3 in the HW. See instructions in Gradescope.
    //Uncomment the code below and figure out what should go in each set
    //of underscores.
    public void numGuesser0to100(){
		// Random r = new Random();
		// int numGuesses = ______;
		// int numToGuess =   ______.nextInt(______);
		// while(______!= ______){
        //      ______++;
		// }
        // System.out.println("Congratulations! " + ______ + " was the correct number! You guessed it in " +  ______  );
        // if(______ == 1)
		// 	System.out.print(" try!");
		// else
		// 	System.out.print(" tries!");
	}



}