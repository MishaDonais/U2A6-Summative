/*
 * This program was created by Misha Donais
 * On the 23rd of October 2018
 * To calculate cubes, squares, and powers of numbers
 */
package cubes.sqares.and.powers;

import java.util.Scanner;
/**
 *
 * @author misha
 */
public class CubesSqaresAndPowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Scanner
        Scanner keyedInput = new Scanner(System.in);
        
        //Variables
        int menuSelection = 0;
        int baseInput = 0;
        int loopCounter = 1;
        int result = 1;
        int exponentInput = 0;
        
        
        //Initial outputs
        System.out.println("Enter a number to select an operation to perform");
        System.out.println("---------------");
        System.out.println("1 -- Find the value of a number squared");
        System.out.println("2 -- Find the value of a number cubed");
        System.out.println("3 -- Find the value of a number, to any power");
        System.out.println("4 -- Exit");
        System.out.println("---------------");

        
        //Menu selection
        menuSelection = keyedInput.nextInt();
        
        
        //Menu option 1
        while (menuSelection == 1){
            System.out.println("Input the number you want to square");
            baseInput = keyedInput.nextInt();
            
                while(loopCounter <= 2){
                    loopCounter+=1;
                    result = baseInput*result;
                }
                System.out.println("Result = " + result);
                //Resets numbers
                result = 1;
                loopCounter = 1;
                baseInput = 0;
        }
        
        //Menu option 2
        while (menuSelection == 2){
            System.out.println("Input the number you want to cube");
            baseInput = keyedInput.nextInt();
            
                while(loopCounter <= 3){
                    loopCounter+=1;
                    result = baseInput*result;
                }
                System.out.println("Result = " + result);
                //Resets numbers
                result = 1;
                loopCounter = 1;
                baseInput = 0;
        }
        
        //Menu option 3
        while (menuSelection == 3){
            System.out.println("Enter first a base, and then the power to which you would like to raise the base");
            baseInput = keyedInput.nextInt();
            exponentInput = keyedInput.nextInt();
            
                while(loopCounter <= exponentInput){
                    loopCounter +=1;
                    result = baseInput*result;
                }
                System.out.println("Result = " + result);
                //Resets numbers
                result = 1;
                loopCounter = 1;
                baseInput = 0;
                exponentInput = 0;
                }
 
        
        //Exit
        while (menuSelection == 4){
            System.exit(0);
            
        }
        
        
    }
    
}
