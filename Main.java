import java.util.Scanner;

/**
 * Prints a box of asterisks to the screen based on the number the user enters 
 * @author Cole Girling
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //scanner for user input
    Scanner input = new Scanner(System.in);

    //asks the user for a number between 1 and 10
    System.out.println("Please enter a number between 1 and 10");
    int userNumber = input.nextInt();

    //loop runs until i equals the user number
    for(int i = 1; i <= userNumber; i++){
      
      //follows i and prints asterisks equal to the number  that i is on
      for(int j = 1; j <= i; j++){
        System.out.print("*");
       }
      
      if(i == userNumber){
        i-=2;
      }
      // prints a blank space to space the asteriks out
      System.out.println();
       
    }
    
  }
}