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
      
      //loop runs until j equals the user number
      
      for(int j = 1; j <= userNumber; j++){
       //if i is equal to 1 or the user number will print asterisks to the screen equal to the user number
       if(i == 1 || i == userNumber){
        System.out.print("*");
        }
       //if i is greater than or equal to 2 and i is less than the user number will run the if statement inside
       if(i >= 2 && i < userNumber){
        //if j is equal to 1 or the user number will print an asterisk at the beginnig and end of a line
        if(j == 1 || j == userNumber){
        System.out.print("*");
         }
        }
        //if j is greater than or equal to 2 and j is less than the user number and i is greater than or equal to 2 and i is less than the user number then this will print a spacein the middle of a line
      if(j >= 2 && j < userNumber && i >= 2 && i < userNumber){
        System.out.print(" ");
          
        }
       }
      
      // prints a blank space to space the asteriks out
      System.out.println();
       
    }
    
  }
}