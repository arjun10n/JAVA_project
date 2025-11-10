//Darshan
import java.util.Scanner;

public class JungleQuests {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===================== INTRODUCTION =====================
        System.out.println(" Welcome to THE JUNGLE QUEST! ");
        System.out.println("You are Alex, an explorer whose helicopter crashed deep inside the Amazon jungle.");
        System.out.println("You wake up with a torn backpack, a broken compass, and a storm approaching.\n");
        System.out.println("Your mission: Find a way out of the jungle safely — or uncover its hidden secret!\n");

        // ===================== MAIN CHOICE =====================
        System.out.println("You see four paths ahead:");
        System.out.println("1. Take the path with tall, ancient trees ");
        System.out.println("2. Cross the narrow river with sparkling water ");
        System.out.println("3. Enter a dark cave covered in vines 🕳");
        System.out.println("4. Climb a nearby hill to get a better view ");
        System.out.print("Choose (1, 2, 3, or 4): ");
        int choice1 = sc.nextInt();

//arjun
        if (choice1 == 1) {
            System.out.println("\nYou walk through the dense forest. The air grows still... then you hear a growl nearby!");
            System.out.println("A tiger’s eyes glow in the shadows!");
            System.out.println("1. Hide behind a rock ");
            System.out.println("2. Climb a tree ");
            System.out.println("3. Try to scare it away with fire ");
            System.out.print("Choose (1, 2 or 3): ");
            int choice2 = sc.nextInt();
if (choice2 == 1) {
                System.out.println("\nYou press yourself behind the rock. The tiger walks away.");
                System.out.println("You find an old map showing a route to the exit.");
                System.out.println("1. Head toward the mountains ");
                System.out.println("2. Follow the river trail ");
                System.out.print("Choose (1 or 2): ");
                int choice3 = sc.nextInt();

     if (choice3 == 1) {
                    System.out.println("\nYou find a research station and call for rescue.");
                    System.out.println(" YOU WIN!");
                } else {
                    System.out.println("\nYou fall from the tree and die.");
                    System.out.println(" GAME OVER.");
                }

            } else if (choice2 == 3) {
                System.out.println("\nYou scare the tiger using fire and find a hidden tunnel.");
                System.out.println("1. Enter the tunnel ");
                System.out.println("2. Set up camp ");
                System.out.print("Choose (1 or 2): ");
                int choice3 = sc.nextInt();

                if (choice3 == 1) {
                    System.out.println("\nYou discover a glowing crystal chamber.");
                    System.out.println(" YOU WIN!");
                } else {
                    System.out.println("\nStrange spirits find you in your sleep...");
                    System.out.println(" GAME OVER.");
                }

            } else {
                System.out.println("\nInvalid choice! The tiger attacks.");
                System.out.println(" GAME OVER.");
            }
        }

//namith

            else if (choice1 == 2) {
            System.out.println("\nYou reach a waterfall.");
            System.out.println("1. Go behind the waterfall ");
            System.out.println("2. Follow the river downstream ");
            System.out.println("3. Climb the cliff ");
            System.out.print("Choose (1, 2 or 3): ");
            int choice3 = sc.nextInt();

            if (choice3 == 1) {
                System.out.println("\nYou find a cave with treasure.");
                System.out.println("1. Take the treasure ");
                System.out.println("2. Leave it ");
                System.out.print("Choose (1 or 2): ");
                int choice4 = sc.nextInt();

                if (choice4 == 1) {
                    System.out.println("\nThe cave collapses.");
                    System.out.println(" GAME OVER.");
                } else {
                    System.out.println("\nA secret exit opens!");
                    System.out.println(" YOU WIN!");
                }

            } else if (choice3 == 2) {
                System.out.println("\nYou see a raft in a swamp.");
                System.out.println("1. Use the raft ");
                System.out.println("2. Swim ");
                System.out.print("Choose (1 or 2): ");
                int choice4 = sc.nextInt();

                if (choice4 == 1) {
                    System.out.println("\nYou escape using the raft!");
                    System.out.println(" YOU WIN!");
                } else {
                    System.out.println("\nSnakes attack you.");
                    System.out.println(" GAME OVER.");
                }

            } else if (choice3 == 3) {
                System.out.println("\nYou find a stone tablet.");
                System.out.println("1. Touch it ");
                System.out.println("2. Ignore it ");
                System.out.print("Choose (1 or 2): ");
                int choice4 = sc.nextInt();

                if (choice4 == 1) {
                    System.out.println("\nYou become the guardian of the jungle.");
                    System.out.println(" YOU WIN!");
                } else {
                    System.out.println("\nThe ground collapses. You fall.");
                    System.out.println(" GAME OVER.");
                }

            } else {
                System.out.println("\nInvalid choice!");
                System.out.println(" GAME OVER.");
            }
        }


        


//End darshan 
else {
            System.out.println("\nInvalid choice! The jungle spirits are angry.");
            System.out.println(" GAME OVER.");
        }

        sc.close();
    }
}

















