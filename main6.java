import java.util.Scanner;

class main6 {
    static int playerScore, guess, life = 3;
    
    //Generate a random number using pseudorandom and convert it to the decimal number
    static int answer = (int) ((Math.random() * 10) + 1);
    static String name, playAgain;
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\u001b[32mLet's play a game i called it, guess my number\u001b[32m");
        System.out.println("\u001b[32m .88888.                                                                         \u001b[0m"); 
        System.out.println("\u001b[32md8'   `88                                                                dP dP   \u001b[0m"); 
        System.out.println("\u001b[32m88        dP    dP .d8888b. .d8888b. .d8888b.    88d8b.d8b. dP    dP    8888888  \u001b[0m"); 
        System.out.println("\u001b[32m88   YP88 88    88 88ooood8 Y8ooooo. Y8ooooo.    88'`88'`88 88    88     88 88   \u001b[0m"); 
        System.out.println("\u001b[32mY8.   .88 88.  .88 88.  ...       88       88    88  88  88 88.  .88    8888888  \u001b[0m"); 
        System.out.println("\u001b[32m `88888'  `88888P' `88888P' `88888P' `88888P'    dP  dP  dP `8888P88     dP dP   \u001b[0m"); 
        System.out.println("\u001b[32m                                                                 .88             \u001b[0m"); 
        System.out.println("\u001b[32m                                                             d8888P              \u001b[0m"); 
        System.out.println("Rules:Please enter a number between 1 and 10; you have three chances;\neach incorrect guess reduces your life expectancy.\n");
        System.out.println("Coded by: Kaizer Andri Baynosa");
        System.out.print("What is your name: ");
        name = console.next();
        System.out.println(answer);
        
        //If the condition is true it will ask you repeatedly to enter your guess
        do {
            System.out.print("Enter your guess: ");
            guess = console.nextInt();
           
            //Check if the user input number less than zero or greater than 10
            if ((guess <= 0) || (guess >= 10)) {
                System.out.println("you input number not between 1 and 10");
                life--;
   
            //Check if the user input number is equal to answer
            } else if (guess == answer) {
                System.out.println(guess + " is the correct answer. you win!");
    
                //Prompt a msg to if player want to play again
                System.out.print("Do want to play again(y/n): ");
                playAgain = console.next();

                //Check if the user input n the program will stop
                if (playAgain == "n") {
                    life = 0; 
                  
                }

            } else {
                life--;
                System.out.println("Keep guessing");
                System.out.println("You have only " + life + " life remaining\n");

            }

        //if the life span is greater than 0 the condition is true
        } while(life > 0);
        System.out.println(name + " thank you for participating in my game.");
    }
}
