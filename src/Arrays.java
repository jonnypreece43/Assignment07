
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make an array of ints
        int[] nums = new int[5];
        
        //puts values into array
        nums[0] = 10;
        nums[1] = -17;
        nums[2] = 6;
        nums[3] = 100;
        nums[4] = 12;
        // | 10 | -17 | 6 | 100 | 12 |
        
        //loop through array
        //print out values
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
        //create a scanner
        Scanner input = new Scanner(System.in);
        
        //loops through the array
        //get input from the user
        for(int i = 0; i < nums.length; i++){   
            System.out.println("Type in an integer");
            nums[i] = input.nextInt();
            System.out.println("You typed: " + nums[i]);
        }
        //adding up all the numbers in the array
        int total = 0;
        for(int i = 0; i <nums.length; i++){
            total = total + nums[i];
        }
        System.out.println("Your numbers add to " + total);
        
        nums[0] = nums[1] + nums[2] * nums[3];
    }
}
