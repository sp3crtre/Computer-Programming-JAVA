import java.util.Scanner;

class main4 {
    static int i, number;
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(" _______ _____ ______ ______      ______  _     _ ______ ______");     
        System.out.println(" |______   |    ____/  ____/      |_____] |     |  ____/  ____/");     
        System.out.println(" |       __|__ /_____ /_____      |_____] |_____| /_____ /_____");
        
        //Get the user input number 
        System.out.print("input any numbers: ");
        number = console.nextInt();
       
        //It will loop depending on  the number input by the user until reaching the number limit
        for (i = 0; i <= number; i++) {
            
            //Divide the incremented value by number 2 and check if the result equal to zero
            //Check if the number is even
            if ((i % 2) == 0) {
                System.out.println("The number " + i + " is even number");
            
            //check if the number is odd
            } else {
                System.out.println("The number " + i + " is odd number");
                
            }
    
        }
    }
}
