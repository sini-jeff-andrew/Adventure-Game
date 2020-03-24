import java.util.Scanner;
import java.util.Random;
public class AdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wary from the day’s travels down many miles of bad road laden with brigands and ne’er-do-wells, you finally reach your destination:\n the quaint and run-down lakeside village of Fortune.\n\nThe desire to wet your whistle is overwhelming, the local tavern for meat, mead, and lodging is calling your name.\n\n  The tavern, like the rest of the village, has seen much better days and the lack of activity save for the burly innkeeper behind the bar is cause for concern,\n but you decide to sit regardless. Your posterior has barely hit the chair when a frothy mug is slammed down before you by the innkeeper.\n”What’s your name, traveler?\n\n");
        String heroName = scanner.nextLine();


//        Initial user query
        System.out.println("Hail and well met, " + heroName);
        System.out.println("You reach for a silver coin and slide it across the bar to the innkeeper.\n\“A bed, a meal, and mead for the night\n\n"
//                “All well and good but you can save you coin in exchange for brave deeds done and high adventure. Do you fancy yourself an adventurer or are you just a traveler passing through?”\n\n" +
//                "1 - “My blade already runs red with the blood of those on the road in who tried to deprive me of gold and goods — tell me more of this quest!”\n" +
//                "2 - “I’m merely a traveling merchant — work and worry are all the adventure I can handle, count me out!\" \n");
        String userInput = scanner.next();
        boolean confirmation = userInput.equalsIgnoreCase("y");
            if (confirmation) {
                System.out.println("Excellent, let us begin your grand adventure!");
            }
            else {
                System.out.println("A life of work and worry for you it is!");
            }

//   ***************Story begins here*******************
            int heroHealth = 100;
            int enemyHealth = 100;
            int heroDefense = 1;


        System.out.println("Initial call to adventure happens here. As a test, choose your path: (1 or 2):");
            String userPath = scanner.next();
            double attackRoll = (Math.random() * 6) + 1;
            if (userPath.equals("1")) {
                System.out.println("You fool, you chose 1!?");
            }
//   ***********Test combat simulator******************
            else {
                double totalDamage = attackRoll - heroDefense;
                System.out.println("You fool, 2 is even worse than 1! Have at thee!");
                System.out.printf("You are in combat!\n Your current health: %d\n Your enemy's health: %d\n", heroHealth, enemyHealth);
                System.out.printf("Your enemy attacks you for: %.0f damage!\n", attackRoll);
                System.out.printf("Your defensive skill has blocked %d point but %f got through!\n", heroDefense, totalDamage );
                System.out.printf("Your current health is: %f\n", heroHealth - totalDamage);
            }











    }
}
