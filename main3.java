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
  
  
	
