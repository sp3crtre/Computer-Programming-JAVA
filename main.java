//Activity 1.1
//if, else if, else statement

import java.util.Scanner;

class main {
    static Scanner console =  new Scanner(System.in);
    static int numb1, numb2, sum, operator;

    public static void main(String[] args) {
	System.out.println("              ###                 ###");                         
	System.out.println("              ##                   ##             ##");              
	System.out.println("              ##                   ##             ##");            
	System.out.println("  ###   ####  ##   ###    ###  ##  ##     ######  ##   ##  ## ##"); 
	System.out.println(" #  # ##  ##  ##  ##  #   ##   ##  ##   ##    ##  ##  ##  # ## ");
	System.out.println("##    ##  ##  ##  ##      ##   ##  ##   ##    ##  ##  ##  ##  ##");
	System.out.println("##  # ##  ##  ##  ##  #    ## ##   ##   ##    ##  ##  ##  #   ##");
	System.out.println(" ###   ## ## ###   ###      ###   ####   ## #### ###  ##             "); 
        System.out.println("[0] Addition ");
        System.out.println("[1] Subtraction ");
        System.out.println("[2] Multiplication ");
        System.out.println("[3] Division ");
        System.out.println("");
       
        //Get the user input 
        System.out.print("[+]Choose operator you want to use: ");
        operator = console.nextInt();
        System.out.print("[+]Input first number: ");
        numb1 = console.nextInt();
        System.out.print("[+]Input second number: \u001b[0m");
        numb2 = console.nextInt();

        //Check if the user input 0 it well adds the two numbers
        if (operator == 0) {
            System.out.println("You chose addition");
            sum = numb1 + numb2;
            System.out.println("Result: " + sum);
          
        //Check if the user input 1 it well subtract the two numbers
        } else if (operator == 1) {
            System.out.println("You chose subtraction");
            sum = numb1 - numb2;    
            System.out.println("Result: " + sum);
            
        //Check if the user input 2 it well multiply the two numbers
        } else if (operator == 2) {
            System.out.println("You chose multiplication");
            sum = numb1 * numb2;
            System.out.println("Result: " + sum);
            
        //Check if the user input 3 it well divide the two numbers
        } else if (operator == 3) {
            System.out.println("You chose division");
            sum = numb1 / numb2;
            System.out.println("Result: " + sum);
            
        } else {
            System.out.println("You cannot get the sum of 2 number without using operators.");
            
        }
    }
}
