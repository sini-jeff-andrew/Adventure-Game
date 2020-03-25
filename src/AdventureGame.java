import java.util.Scanner;
import java.util.Random;
public class AdventureGame {




    public static void main(String[] args) {

        hoarder hoarder1 = new hoarder();
        hoarder1.health = 20;
        hoarder1.attack = 10;
        hoarder1.calcDamage();

        hoarder hoarder2 = new hoarder();
        hoarder2.health = 50;
        hoarder2.health = 20;


        Scanner scanner = new Scanner(System.in);
        System.out.println("A teenage hipster-stoner lab technician checks the labels on the stasis tubes lining the walls in the Fortune Cryogenics laboratory-turned-doomsday-bunker and notices the kitchen timer is mere seconds from dinging.\n\n");
        System.out.println("Lab-tech Carl: Oh, sweet I need this outlet to charge my vape.\n\n");
        System.out.println("As the timer DINGS, Carl pulls out the rat-gnawed extension cord from the human popsicle's machine and someone who desperately needed 50 bucks in exchange for a 6-month experiment rapidly thaws and stumbles out.\n\n");
        System.out.println("Stoner Lab-tech Carl: Whoa, easy bruh! Last guy we thawed's legs shattered like, uh, ice. True story. It was super cool. What's your name, brosef?\n");
        String heroName = scanner.nextLine();


//        Initial user query
        System.out.println("\n\nStoner Hipster Lab-tech Carl: 'Sup" + heroName + "I'm Carl, the Car-man, the Car-ster, AKA Carlton Banks. But you can call me Spencer because I hate all those names. I knew a Spencer once, he was super chill.\n\n");
        System.out.println(heroName + ": Oh, dear God, I need a bathroom quick!\n\n");
        System.out.println("Stoner Hipster Lab-tech Spencer: Whoa! Cool your jets, Brosef Stalin, there are somethings you need to know...\n");
        System.out.println("Stoner Hipster Lab-tech Carmax Spencer: Firstly, super sad news so brace yourself...Kobe died, bro. Helicopter crash. Never saw him play but it was blowing up on my twitter feed so, yeah, it's, like, the worst loss I've ever felt...that and my mother's.\n");
        System.out.println("Stoner Hipster Lab-tech Carmen San Diego Spencer: Oh, right, and there's a virus rampaging across the planet killing peeps. For reals. Governments have collapsed. Toilet paper is now the world's currency. Cash is pretty much useless...unless you're using it as toilet paper.\n");
        System.out.println("So, just so ya know, Brotein Shake, that bathroom visit gon' cost you 'bout a hundee...or I can make you a popsicle again...your choice.");
        System.out.println("OPTION 1 - “Get out of my way, you stoned loser!" + heroName + " is back to show this virus and the toilet who's boss!\n");
        System.out.println("OPTION 2 - “Yes, for the love of God, you stoned loser, make me a popsicle again!"  + hoarder1.calcDamage());
        String userInput = scanner.next();
        boolean confirmation = userInput.equals("1");
            if (confirmation) {
                System.out.println("Excellent, let us begin your grand adventure!");
            }
            else {
                System.out.println("A life of work and worry for you it is!");
            }

//   ***************Story begins here*******************
//
//
//
//
//
//
//
//            int heroHealth = 100;
//            int enemyHealth = 100;
//            int heroDefense = 1;




//            double attackRoll = (Math.random() * 6) + 1;
//            if (userPath.equals("1")) {
//                System.out.println("You fool, you chose 1!?");
//            }
////   ***********Test combat simulator******************
//            else {
//                double totalDamage = attackRoll - heroDefense;
//                System.out.println("You fool, 2 is even worse than 1! Have at thee!");
//                System.out.printf("You are in combat!\n Your current health: %d\n Your enemy's health: %d\n", heroHealth, enemyHealth);
//                System.out.printf("Your enemy attacks you for: %.0f damage!\n", attackRoll);
//                System.out.printf("Your defensive skill has blocked %d point but %f got through!\n", heroDefense, totalDamage );
//                System.out.printf("Your current health is: %f\n", heroHealth - totalDamage);
//            }






    }
    static class hoarder{
        int health;
        int attack;
        double attackRoll = (Math.random() * 6) + 1;


        int calcDamage(){
            return (int) (health - attackRoll);

        }
    }
}
