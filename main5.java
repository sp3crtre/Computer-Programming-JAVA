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
