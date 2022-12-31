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
