import java.util.Scanner;

/**
 * Prints a line of asterisks to the screen based on the number the user enters then repeats that line based on the number the user enters
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
      
      //runs until j equals the user number
      
       for(int j = 1; j <= userNumber; j++){
        //prints an asterisk to the screen
        if(i == 1 || i == userNumber){
        System.out.print("*");
        }
        if(i >= 2 && i <= userNumber){
          if(j == 1 || j == userNumber){
          System.out.print("*");
         }
        }
        if(j >= 2 && j < userNumber && i >= 2 && i < userNumber){
          System.out.print(" ");
          
        }
       }
      
      
        
        
        // prints a blank space to space the asteriks out
        System.out.println();
        
        
    }
    
  }
}