package practicalfour;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Displays the totals of a cupcake sale.
 *
 * @author {Your Name Here}
 */
public class CupcakeSale {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // Set up scanner and read values from file
    File file = null;
    Scanner input = null;
    try {
      file = new File("input/cupcakes.nomnomnom");
      input = new Scanner(file);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    String strawberrySales = input.next();
    input.nextLine();
    String redVelvetSales = input.next();
    input.nextLine();
    String raspberrySales = input.next();
    
    // TODO: Calculate sales from Strings above
    
    // TODO: Calculate total(s) and tax
    
    // TODO: Print output
  }
}