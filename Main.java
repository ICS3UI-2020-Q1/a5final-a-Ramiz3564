 import java.util.Scanner;
/**
 *This program prints black and white according to user input 
 * @author Zach Ramirez 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner for user input
    Scanner input = new Scanner(System.in); 
    //ask user for a size of the line 
    System.out.println("Please enter the length of the line"); 
    int size = input.nextInt();  
    int coma = size % 2; 
    String pattern = "black, white, ";
    
    
    //use for loop to count up size 
    for(int i = 3; i < size; i++){ 
      System.out.print(pattern);
      
    }if(coma >= 1){ 
      System.out.print("black");
    }else{
      System.out.print("black");
    }
  
      
 
  }
}
