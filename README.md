# Java programming activities to school

<p>I wrote this code as part of my computer programming major in a Bachelor of Science in Information Technology program, and I uploaded it to my GitHub repository to help other IT students or anyone else who wants to learn programming. This code represents the activities I completed in my programming course during the first semester, including the preliminary, midterm, and final exams.</p>



<p>1. Comparing Answers

Finally, the exam is over! I think I did quite well, but I’m not very confident with my answer for number 10. I need to verify my answer.


Hey, you! Yeah, you, what’s your answer for number 10? Is it A, B, C, D, or E?


Inputs

1. Answer for number 10

This is a character value which will be either A, B, C, D, or E.


Sample Output

Enter your answer for number 10: A
Oh, my answer is A as well</p>

```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your answer for number 10: ");
        char input = keyboard.next().charAt(0);
        
        System.out.print("Oh, my answer is " + input + " as well");
    }
}

```

<hr/>

<p>2. John's Birthday

It’s John’s birthday, so Cody decided to buy John a cute little pet. He has to ask John which animal he likes though so have John input either "dog", "cat", or "eagle" then print out his choice.


Inputs

1. The animal John likes


Sample Output

Enter the animal John likes: dog
dog</p>

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the animal John likes: ");
        String choice = keyboard.nextLine();

        System.out.print(choice);
    }
}
```

<hr/>

<p>3. A Meter for Cody

Cody has n feet worth of wooden sticks. The problem is, Cody wasn’t designed to read measurements done in feet. Cody has to convert this into meters and read it that way instead. One foot is equivalent to 0.305 meters. Print the converted unit.


Inputs

1. Feet worth of wooden sticks

6.5

Since this is a measurement, this can be a decimal value


Sample Output

Enter measurement in feet: 6.5
Equivalent meters = 1.98

Score: 13/13</p>

```
import java.util.*;
import java.text.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double metersPerFoot = 0.305;

		System.out.print("Enter measurement in feet: ");
		double feet = input.nextDouble();

		double meters = feet * metersPerFoot;
        DecimalFormat df = new DecimalFormat("0.00");
        String meterFormated = df.format(meters);

		System.out.println("Equivalent meters = " + meterFormated);
	}
}
```

<hr/>

<p>4. Cody the Berserk

Cody had a hard time saving The Programmer from the Hydra, so he decided to call his friends to help him cut off the heads together. This was brilliant because then the number of heads he has to cut would be far less than if he was all alone. For example, if the Hydra had 10 heads and he called 5 friends then they would each cut 2 heads. This presented a problem, however, if the Hydra had 11 heads then that meant one of them had to cut 3 heads.


Input the number of friends Cody has to call and the number of heads the Hydra currently has and then print the minimum number of heads each one of them has to cut.


Inputs

1. Number of friends


2. Number of heads


Sample Output

Enter the number of friends: 4
Enter the number of heads: 12
Minimum heads to cut per friend = 3

Score: 12/12
</p>

```
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of friends: ");
        int friends = keyboard.nextInt();
        
        System.out.print("Enter the number of heads: ");
        int heads = keyboard.nextInt();
        
        int answer = Math.floorDiv(heads, friends);

        System.out.println("Minimum heads to cut per friend = " + answer);
    }
}
```

<hr/>

1. Midterm_Activity2_No1

Write a program that does the following:

a. Prompts the user to input five decimal numbers

b. Prints the five decimal numbers

c. Converts each decimal number to the nearest integer

d. Adds the five integers

e. Prints the sum and average of the five integers

```
/**
 * Write a program that does the following:
 * a. Prompts the user to input five decimal numbers
 * b. Prints the five decimal numbers
 * c. Converts each decimal number to the nearest integer
 * d. Adds the five integers
 * e. Prints the sum and average of the five integers
 * 
 * Algorithm
 * 
 * 1. Declare a, b, c, d, e to get the user input
 * 2. Converting each decimal place to the nearest integer using round off
 * 3. Calculating the sum of 5 decimal numbers
 * 4. Round off the sum of 5 decimal numbers
 * 5. Converting sum of 5 decimal place(double) to integer 
 * 6. Divide the sum of 5 decimal place to 5 to get the averageResult
 * 7. Display the resutl
**/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Prompts the user to input five decimal numbers
        System.out.println("Input five decimal numbers");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();

        //Each decimal place converted to the nearest integer.
        final int numb1 = (int) Math.round(a * 100) / 100;
        final int numb2 = (int) Math.round(b * 100) / 100;
        final int numb3 = (int) Math.round(c * 100) / 100;
        final int numb4 = (int) Math.round(d * 100) / 100;
        final int numb5 = (int) Math.round(e * 100) / 100;

        //Add the five integers to get the sum
        final double sum = numb1 + numb2 + numb3 + numb4 + numb5;

        //Rounding off the sum to the nearest integer
        final double average =  Math.round(sum);

        //divide the sum of 5 decimal numbers to 5 to get the averageResult
        final double averageResult = (average) / 5;
        //Converting doubles to integers
        final int result = (int) Math.round(sum);
        
        //Display the result
        System.out.println(a);
        System.out.println(b);
        System.out.printf("%.2f", c);
        System.out.print("\n");
        System.out.println(d);
        System.out.println(e);
        System.out.println("");
        System.out.println("You input " + numb1 + "," + numb2 + "," + numb3 + "," + numb4 + " and " + numb5);
        System.out.println("The sum of 5 integers is " + result + " and the average is " + averageResult + ".");

        sc.close();

    }

}
```

<hr/>

2. Midterm_Activity2_No2

A milk carton can hold 3.78 liters of milk. Each morning, a dairy farm ships cartons of milk to a local grocery store. The cost of producing one liter of milk is $0.38, and the profit of each carton of milk is $0.27.

Write a program that does the following:

a. Prompts the user to enter the total amount of milk produced in the morning

b. Outputs the number of milk cartons needed to hold milk (Round your answer to the nearest integer.)

c. Outputs the cost of producing milk

d. Outputs the profit for producing milk


```
/**
 * A milk carton can hold 3.78 liters of milk. Each morning, a dairy farm ships cartons of milk to a local grocery store. 
 * The cost of producing one liter of milk is $0.38, and the profit of each carton of milk is $0.27.

 * Write a program that does the following:
 * a. Prompts the user to enter the total amount of milk produced in the morning
 * b. Outputs the number of milk cartons needed to hold milk (Round your answer to the nearest integer.)
 * c. Outputs the cost of producing milk
 * d. Outputs the profit for producing milk


 * Algorithm:

 * 1. Declare CartoonSize and get the amount of milk entered by the user.
 * 2. Declare the variables productCost, costOfProducingMilk, and cartoonsProfits.
 * 3. Calculation of results.
 *    a. productCost = cartoonSize divided by 3.78 (floor division) minus 3.
 *    b. costOfProducingMilk = cartoonSize multiplied by 0.38
 *    c. cartoonProfits = productCost multiplied by 0.27.
 *
 * 4. Convert the resulting decimal number to a two-digit (0.00) decimal number.
 * 5. Display the result.
**/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String pattern = "#,##";
    static DecimalFormat decimalFormat = new DecimalFormat();
    /**
     * @param args
     */
    public static void main(String[] args) {

        //Prompts the user to input amount of milk
        System.out.print("The total amout of milk (in liters) produced to days is: ");
        int CartoonSize = sc.nextInt();

        //Calculating the result
        final int productCost = (int) (Math.floorDiv(CartoonSize, (int) 3.78) - 3);
        final double costOfProducingMilk = CartoonSize * 0.38;
        final double cartoonProfits = productCost * 0.27;

        //converting decimal place to (0.00) 2 digit decimal place
        String format = decimalFormat.format(cartoonProfits);

         //Display the result
        System.out.println("\n");
        System.out.println("The number of cartons needed is: " + productCost);
        System.out.println("The cost of milk is:" + costOfProducingMilk);
        System.out.println("The profit is:" + format + "\n");
        System.out.println("Thank you...");

    }
}
```
<hr>

<h1>Pre-Finals</h1>
<p>During the programming final exam, my professor challenged us to create and solve our own problems in order to test our capabilities and to demonstrate that we have learned enough to move on to more advanced programming lessons. I accepted this challenge and worked to solve the problem independently</p>

<h2>IF…..ELSE STATEMENT PROBLEM:</h2>
<p>Anna forgot to bring a calculator for exam day and didn’t know where she could borrow a calculator and
the exam will be after 10 minutes. Write a program arithmetic calculator using Addition (+), Subtraction
(-), Multiplication (x), and Division (%) using the reversed keyword of java if, else if, and else that will
calculate the sum of two numbers.</p>

```
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

```
<h2>WHILE LOOP PROBLEM:</h2>
<p>Joseph wants to play a game of paper, scissors, and stone, but he doesn&#39;t have any friends to play the
game. He feels bored and sad now because he can&#39;t play that game. Write a program that could
automate paper, scissors, and stone so joseph plays himself. Using the reserved keyword &quot;while loop&quot; to
keep the game running until joseph quits playing.</p>
```
import java.util.*;

class main2 {
    static Scanner console = new Scanner(System.in);
    static int player;
    static int computerScore = 0, playerScore = 0;

    public static void main(String[] args) {
        final String []computer = {
            "BATO",
            "GUNTING",
            "PAPEL"
            
        };

        System.out.println("\u001b[32m▄▄▄▄    ▄▄▄     ▄▄▄█████▓ ▒█████  ▒██   ██▒    ██▓███   ██▓ ▄████▄   ██ ▄█▀\u001b[0m");
        System.out.println("\u001b[32m▓█████▄ ▒████▄   ▓  ██▒ ▓▒▒██▒  ██▒▒▒ █ █ ▒░   ▓██░  ██▒▓██▒▒██▀ ▀█   ██▄█▒\u001b[0m");
        System.out.println("\u001b[32m▒██▒ ▄██▒██  ▀█▄ ▒ ▓██░ ▒░▒██░  ██▒░░  █   ░   ▓██░ ██▓▒▒██▒▒▓█    ▄ ▓███▄░\u001b[0m");
        System.out.println("\u001b[32m▒██░█▀  ░██▄▄▄▄██░ ▓██▓ ░ ▒██   ██░ ░ █ █ ▒    ▒██▄█▓▒ ▒░██░▒▓▓▄ ▄██▒▓██ █▄\u001b[0m");
        System.out.println("\u001b[32m░▓█  ▀█▓ ▓█   ▓██▒ ▒██▒ ░ ░ ████▓▒░▒██▒ ▒██▒   ▒██▒ ░  ░░██░▒ ▓███▀ ░▒██▒ █▄\u001b[0m");
        System.out.println("\u001b[32m░▒▓███▀▒ ▒▒   ▓▒█░ ▒ ░░   ░ ▒░▒░▒░ ▒▒ ░ ░▓ ░   ▒▓▒░ ░  ░░▓  ░ ░▒ ▒  ░▒ ▒▒ ▓▒\u001b[0m");
        System.out.println("\u001b[32m▒░▒   ░   ▒   ▒▒ ░   ░      ░ ▒ ▒░ ░░   ░▒ ░   ░▒ ░      ▒ ░  ░  ▒   ░ ░▒ ▒░\u001b[0m");
        System.out.println("\u001b[32m ░    ░   ░   ▒    ░      ░ ░ ░ ▒   ░    ░     ░░        ▒ ░░        ░ ░░ ░ \u001b[0m");
        System.out.println("\u001b[32m ░            ░  ░            ░ ░   ░    ░               ░  ░ ░      ░  ░   \u001b[0m");
        System.out.println("\u001b[32m      ░                                                     ░               \u001b[0m");
        System.out.println("\u001b[34mCoded by: Kaizer Andri Baynosa");
        System.out.println("");
        System.out.println("[0] Bato ");
        System.out.println("[1] Gunting ");
        System.out.println("[2] Papel ");
        System.out.println("[3] Exit");
         
        //Utilizing a while to  keep the game running
        while (true) {
            
            //Pick a weapon at random from the ArrayList from computer weapon
            java.util.Random random = new java.util.Random();
            int randomComputerWeapon = random.nextInt(computer.length);
            
            //Get the player-chosen weapon
            System.out.print("choose your weapon: ");
            player = console.nextInt();
            
            //Check if the player's chosen weapon is equal to the computer weapon that was a random choice by the computer
            if (player == randomComputerWeapon) {
                System.out.println("Tie!");
             
            //Check if the player has chosen BATO as a weapon and check if the computer has chosen PAPEL as a weapon, the condition is true
            } else if ((player == 0) && (randomComputerWeapon == 2)) {
                System.out.println("Computer wins!");
                computerScore++;
    
            //Check if the player has chosen BATO as a weapon and check if the computer has chosen GUNTING as a weapon, the condition is true
            } else if ((player == 0) && (randomComputerWeapon == 1)) {
                System.out.println("Player wins!");
                playerScore++;
    
            //Check if the player has chosen PAPEL as a weapon and check if the computer has chosen BATO as a weapon, the condition is true
            } else if ((player == 2) && (randomComputerWeapon == 0)) {
                System.out.println("Player wins!");
                playerScore++;
    
            //Check if the player has chosen GUNTING as a weapon and check if the computer has chosen PAPEL as a weapon, the condition is true
            } else if ((player == 1) && (randomComputerWeapon == 2)) {
                System.out.println("Player wins!");
                playerScore++;
    
            //Check if the player has chosen GUNTING as a weapon and check if the computer has chosen BATO as a weapon, the condition is true
            } else if ((player == 1) && (randomComputerWeapon == 0)) {
                System.out.println("Computer wins!");
                computerScore++;
    
            //Check if the player has chosen PAPEL as a weapon and check if the computer has chosen GUNTING as a weapon, the condition is true
            } else if ((player == 2) && (randomComputerWeapon == 1)) {
                System.out.println("Computer wins!");
                computerScore++;

            //check if the player chosen 3 the game would stop    
            } else if (player == 3) {
                break;

            //Check if the player inputs not in the provided category are print a message
            } else {
                System.out.println("please choose you weapon");
                
            }
        }

        System.out.println("____________________________________________\nScore board");
        System.out.println("Player Score: " + playerScore);
        System.out.println("Computer Score: " + computerScore);
    
    }
}
```
<h2>SWITCH CASE PROBLEM:</h2>
<p>The class president loves reading bible verses, riddles, quotes, and advice every day, but she is tired of
getting those books to read, she wants to make an automation that could randomly generate the
content on his books in the bible, advice, Tagalog riddles and quotes, but she doesn’t know how to that.
Let’s help our class president to do his task by writing a program that could help her.</p>
```
import java.util.Scanner;

class main3 
{
    static Scanner console = new Scanner(System.in);
    static String result;
    public static void main(String[] args)
    {
        //The four ArrayList below stored random value

        final String []advices = {
            "Your life is your responsibility. \n\nThere is one person and one person alone over whom you have control in this life—and that is yourself. \nSince you are the only person you can control, you are the only person who can take responsibility for your life. \nThat includes your energy, your happiness, your fulfillment, your career, your choices and more. \nYou are responsible for you and you alone. You are not responsible for anyone else. \nHow could you be? It is their responsibility to take care of themselves. \nYes, you can and should support someone in making good choices, building a life that makes them happy, and taking care of themselves. \nIn fact, taking responsibility for your own well-being is precisely how we are better able to be present for those around us. \nJust remember: Support and responsibility are two extremely different approaches. \nYou take responsibility for yourself. you support other people. Do your best not to reverse or mix up the two.",

            "The way someone treats you is a reflection of how they feel about themselves. \n\nThat cross look? Not about you. That snide comment? Not about you. That temper tantrum? Not about you. \nThe way a person behaves indicates where they’re at physically, mentally, and spiritually. \nTry not to take things personally. They probably have nothing to do with you. Learn to see someone’s behavior through the lens of love. \nIf they’re acting out, that probably means they’re in desperate need of a love tank fill-up. \nDo not react when someone acts out. Ask her if she’s okay. Inquire about what’s going on in his life. \nRemain open and curious and compassionate. You know that’s exactly what you’ll want when your cup of love runs low, too. \nAnd you know it eventually will.",

            "Life is all about managing expectations—most of all your own. \n\nThe world will expect many things from you. And you will expect many things in return. \nThe key is to manage its expectations of you—and yours of it. \nGoing through life trying to live up to someone else’s expectations of you is how you end up disappointing both of you in the process. \nConversely, trying to force the world to meet your expectations is like trying to make Niagara Falls flow backwards. \nIt just doesn’t work that way. There is another way, and it’s through finding harmony between your expectations and reality. \nAccording to Manel Baucells and Rakesh Sarin, authors of Engineering Happiness: A New Approach for Building a Joyful Life, \nthere is even a formula for happiness that takes into account this harmony. The formula is as follows: Happiness equals reality minus shifting expectations. \nThus, you’ll be happy as long your shifting expectations are lower than reality. When you feel your energy or happiness slipping, focus on softening your expectations a bit. \nYou’ll be better off not just in the moment but in the long run, too."
        
        };
        
        final String []quote = {
            "The greatest glory in living lies not in never falling, but in rising every time we fall. \n\n~Nelson Mandela",

            "The way to get started is to quit talking and begin doing. \n\n~Walt Disney",
            
            "Your time is limited, so don't waste it living someone else's life. Don't be trapped by dogma – which is living with the results of other people's thinking. \n\n~Steve Jobs",

            "If life were predictable it would cease to be life, and be without flavor. \n\n~Eleanor Roosevelt"
            
        };

        final String []bible = {
            "\u001b[43mThessalonians 2:11-12\u001b[0m“For you know that we dealt with each of you as a father deals with his own children, encouraging, comforting and urging you to live lives worthy of God, who calls you into his kingdom and glory.”",

            "\u001b[43mMark 10:27\u001b[0m“Jesus looked at them and said, ‘With man this is impossible, but not with God; all things are possible with God.’”",
            
            "\u001b[43mPhilippians 1:6\u001b[0m“…being confident of this, that he who began a good work in you will carry it on to completion until the day of Christ Jesus.”",
            
            "\u001b[43mPsalm 37:23-24\u001b[0m“The LORD makes firm the steps of the one who delights in him; though he may stumble, he will not fall, for the LORD upholds him with his hand.”"
        };

        final String []bugtong = {
            "Sa araw nahihimbing, sa gabi ay gising. \n\nAnswer: Paniki",

            "Matanda na ang nuno hindi pa naliligo. \n\nAnswer: Pusa",

            "Aling bahagi ng katawan ang di naaabot ng kanang kamay? \n\nAnswer: Kanang Siko",
            
            "Kay liit pa ni Neneng marunong nang kumendeng. \n\nAnswer: Bibe",

        };
        
        System.out.println("\u001b[34m  ▐▄▄▄ ▄▄▄· ▄▄▄   ▌ ▐·▪  .▄▄ ·\u001b[34m");
        System.out.println("\u001b[34m   ·██▐█ ▀█ ▀▄ █·▪█·█▌██ ▐█ ▀. \u001b[34m");
        System.out.println("\u001b[34m ▪▄ ██▄█▀▀█ ▐▀▀▄ ▐█▐█•▐█·▄▀▀▀█▄\u001b[34m");
        System.out.println("\u001b[34m  ▐▌▐█▌▐█ ▪▐▌▐█•█▌ ███ ▐█▌▐█▄▪▐█\u001b[34m");
        System.out.println("\u001b[34m   ▀▀▀• ▀  ▀ .▀  ▀. ▀  ▀▀▀ ▀▀▀▀ \u001b[0m");
        System.out.println("Words generator");
        System.out.println("Usage:");
        System.out.println("[0] Advice");
        System.out.println("[1] Quote");
        System.out.println("[2] Bible");
        System.out.println("[3] Bugtong");
 
        //Get the user input
        System.out.print(">>>> ");
        int usage = console.nextInt();

        switch (usage)

        {   //Check if the user chosen 0 it will randomly chose a piece of advice on ArrayList
            case 0:
                java.util.Random random = new java.util.Random();
                int randomAdvice = random.nextInt(advices.length);
                System.out.println(advices[randomAdvice]);
                break;
             
            //Check if the user chosen 1 it will randomly chose a piece of quote on ArrayList
            case 1:
                java.util.Random random2 = new java.util.Random();
                int randomQuote = random2.nextInt(quote.length);
                System.out.println(quote[randomQuote]);
                break;
              
            //Check if the user chosen 2 it will randomly chose a piece of bible on ArrayList
            case 2:
                java.util.Random random3 = new java.util.Random();
                int randomBible = random3.nextInt(bible.length);
                System.out.println(bible[randomBible]);
                break;

            //Check if the user chosen 3 it will randomly chose a piece of bugtong on ArrayList     
            case 3:
                java.util.Random random4 = new java.util.Random();
                int randomBugtong = random4.nextInt(advices.length);
                System.out.println(bugtong[randomBugtong]);
                break;
            
            //Check if the user inputs not in the provided category are print a message 
            default:
                System.out.println("please use the matching number as your basis of choice.");
                break;

        }
    }
}
  
```
<h2>FOR LOOP PROBLEM:</h2>
<p>Write a program to print even and odd numbers Using for loop.</p>
```
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
```
<h2>Nested if Statement PROBLEM:</h2>
<p>The company owner attempted to log in to the admin panel on the company&#39;s website link was not
found because of misconfiguration to the website. The company boss tries to communicate with the IT
department to find a solution to this problem no one responds to him because the IT staff is on
vacation. He wants to check the increasing sales of products in October and the presentation is
tomorrow morning he needs to finish it as soon as possible. Write a program as an alternative admin
portal to the company website, allowing us to log in to our boss to log in to his account and track sales
growth. Assume it is connected to Secure Socket Shell (SSH) using the window command prompt
terminal as an admin portal and will redirect to the admin dashboard so, our boss would see the
increasing sales and status.</p>
```
import java.util.Scanner;

class main5 {
    static Scanner console = new Scanner(System.in);
    static String email, password, secretKey;
    public static void main(String[] args) {
        System.out.println("\u001b[31m  ▄▄▄· ·▄▄▄▄  • ▌ ▄ ·. ▪   ▐ ▄      ▄▄▄· ▄▄▄·  ▐ ▄ ▄▄▄ .▄▄▌\u001b[0m"); 
        System.out.println("\u001b[31m ▐█ ▀█ ██▪ ██ ·██ ▐███▪██ •█▌▐█    ▐█ ▄█▐█ ▀█ •█▌▐█▀▄.▀·██•\u001b[0m");  
        System.out.println("\u001b[31m ▄█▀▀█ ▐█· ▐█▌▐█ ▌▐▌▐█·▐█·▐█▐▐▌     ██▀·▄█▀▀█ ▐█▐▐▌▐▀▀▪▄██▪\u001b[0m");  
        System.out.println("\u001b[31m ▐█ ▪▐▌██. ██ ██ ██▌▐█▌▐█▌██▐█▌    ▐█▪·•▐█ ▪▐▌██▐█▌▐█▄▄▌▐█▌▐▌\u001b[0m");
        System.out.println("\u001b[31m  ▀  ▀ ▀▀▀▀▀• ▀▀  █▪▀▀▀▀▀▀▀▀ █▪    .▀    ▀  ▀ ▀▀ █▪ ▀▀▀ .▀▀▀ \u001b[0m");
        
        //Get the user input credentials
        System.out.print("Email: ");	
        email = console.next();

        System.out.print("Password: ");
        password = console.next();

        System.out.print("Enter your secret KEY to proceed: ");
        secretKey = console.next();
      
        //Check if the user email exists on the database
        if (email.equals("admin")) {

            //Check if the user password is correct
            if (password.equals("password1234")) {

                //Check if the user input correct secret key
                if (secretKey.equals("K912@C21")) {
                    System.out.println("\u001b[32mWelcome to the administrator\u001b[0m");

                } else {
                    System.out.println("\u001b[33mYou cant not login please input the correct secret key\u001b[0m");

                }

            } else {
                System.out.println("\u001b[33mYou input incorrect password\u001b[0m");

            }
    
        } else {
            System.out.println("\u001b[33mCredentials not exist do you an acount?\u001b[0m");
        
        }
    }
}
```
<h2>WHILE LOOP PROBLEM:</h2>
<p>Create a guessing game, give it a name, and use a do-while loop to guess my number. In this game,
every wrong guess has the potential of 3 lifelines, which reduces the life expectancy and if the life
exceeds zero it&#39;s game over.</p>
```
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
```



