/*
 * Anton dela Cruz
 * unit2RecapProgram
 * While prompting users to input values, this program will recap/teach new material learned in Unit 2 of ICS3U
 * November 22, 2018
 */

package unit2summative;

import java.util.Scanner;
/**
 *
 * @author antde
 */

public class Unit2Summative {

    /**
     * @param args the command line arguments
     */

// Declaring Seperate voids' functions
    
public static void maxAndOut (int n1, int n2)
    {  
        double ans = Math.max(n1, n2);
        System.out.println("the greater number is " + ans);
        System.out.println("------------------------------");
        System.out.println("HOW: double ans = Math.max(n1, n2);");
        System.out.println("------------------------------");
    }

public static void minAndOut (int n1, int n2)
    {  
        double ans = Math.min(n1, n2);
        System.out.println("the lesser number is " + ans);
        System.out.println("------------------------------");
        System.out.println("HOW: double ans = Math.min(n1, n2);");
        System.out.println("------------------------------");
    }

public static void hypotAndOut (int n1, int n2)
    {  
        double ans = Math.hypot(n1, n2);
        System.out.println("the hypotenuse is " + ans);
        System.out.println("------------------------------");
        System.out.println("HOW: double ans = Math.hypot(n1, n2);");
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner keyedInput = new Scanner(System.in);
        
        //Declaring variables
        
        int choice, base, exp, num1, num2, ans = 0;
        
        System.out.println("----------ICS3U Unit 2 Recap----------");
        System.out.println("");
        
        //Looping Selection menu
        
        do {
            System.out.println("Relearn how to...");
            System.out.println("Option 1: Square a number (using loops)");
            System.out.println("Option 2: Find the greater value of 2 numbers (Math Method)");
            System.out.println("Option 3: Find the lesser value of 2 numbers (Math Method)");
            System.out.println("Option 4: Calculate the hypotenuse based off length and width (Math Method)");
            System.out.println("Option 5: Display user-given numbers in reverse order (using arays)");
            System.out.println("Option 6: End Program");
            System.out.println("");
            System.out.println("------------------------------");
            
            System.out.println("Choose Option: ");
            choice = keyedInput.nextInt();
            
            System.out.println("------------------------------");
            System.out.println("");
            
            if (choice == 1) {
                System.out.println("Enter in the base number:");
                base = keyedInput.nextInt();
                
                for (int i = 1; i < 2; i ++){
                    ans = base * base;
                }
                System.out.println("the value squared equals " + ans);
                System.out.println("----------------------------");
                System.out.println("1. Get base number from user");
                System.out.println("2. Use for loop: for (int i = 1; i < 2; i ++){"); 
                System.out.println("                    ans = base * base;");
                System.out.println("Explanation: first you initialize i, then make a conditional, i will increment by one if conditonal is true");
                System.out.println("------------------------------");
            }
            
            else if (choice == 2) {
                System.out.println("Enter in 2 values:");
                num1 = keyedInput.nextInt();
                num2 = keyedInput.nextInt();
                
                maxAndOut (num1, num2);
            }
            
            else if (choice == 3) {
                System.out.println("Enter in 2 values:");
                num1 = keyedInput.nextInt();
                num2 = keyedInput.nextInt();
                
                minAndOut (num1, num2);
            }
            
            else if (choice == 4) {
                System.out.println("Enter in 2 values:");
                num1 = keyedInput.nextInt();
                num2 = keyedInput.nextInt();
                
                hypotAndOut (num1, num2);
            }
            
            else if (choice == 5) {
                
                int [ ] numbers  = new int [5];
            
                System.out.println("Enter in 5 values");
                numbers[0] = keyedInput.nextInt();
                numbers[1] = keyedInput.nextInt();
                numbers[2] = keyedInput.nextInt();
                numbers[3] = keyedInput.nextInt();
                numbers[4] = keyedInput.nextInt();
                
                System.out.println("Here are the values you entered, in reverse order");
        
                System.out.println(numbers[4]);
                System.out.println(numbers[3]);
                System.out.println(numbers[2]);
                System.out.println(numbers[1]);
                System.out.println(numbers[0]);
                System.out.println("------------------------------");
                System.out.println("1. (type of data stored) [ ] (arrayname) = new (type of data stored) [(array capacity)]");
                System.out.println("What was used: int [ ] numbers  = new int [5];");
                System.out.println("2. Output the values in whatever order you choose");
                System.out.println("------------------------------");
                
            }
            
            else if  (choice == 6) { 
                System.out.println("Goodbye!");
                System.out.println("------------------------------");
                System.out.println("HOW: while != 6 (means the loop will stop looping if the  user chooses 6)");
                System.out.println("------------------------------");
        }
        }
            //Menu will stop looping if user chooses option 6
        
            while (choice != 6);      
    }
}
