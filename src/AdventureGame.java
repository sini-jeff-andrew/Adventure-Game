import java.util.Scanner;
import java.util.Random;
public class AdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Initial user query
        System.out.println("Shall we play a game? (Y/N)");
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
