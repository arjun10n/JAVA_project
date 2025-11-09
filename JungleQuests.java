// ===== Member 1: Setup and First Choice =====
import java.util.Scanner;

public class JungleQuest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

#arjun scenario 2

        
        if (choice1 == 1) {
            System.out.println("\nYou walk through the dense forest. The air grows still... then you hear a growl nearby!");
            System.out.println("A tiger's eyes glow in the shadows!");

            System.out.println("1. Hide behind a rock ");
            System.out.println("2. Climb a tree ");
            System.out.println("3. Try to scare it away with fire ");
            System.out.print("Choose (1, 2 or 3): ");
            int choice2 = sc.nextInt();

            if (choice2 == 1) {
                System.out.println("\nYou press yourself behind the rock. The tiger walks away.");
                System.out.println("You find an old map a route to the exit.");
                System.out.println("1. Head toward the mountains ");
                System.out.println("2. Follow the river trail ");
                System.out.print("Choose (1 or 2): ");
                int choice3 = sc.nextInt();

                if (choice3 == 1) {
                    System.out.println("\nYou find a hermit who helps you escape.");
                    System.out.println(" YOU SURVIVED AND ESCAPED THE JUNGLE!");
                } else {
                    System.out.println("\nYou discover a hidden temple and treasure!");
                    System.out.println(" YOU FOUND THE TREASURE OF THE JUNGLE!");
                }

            } else if (choice2 == 2) {
                System.out.println("\nYou climb a tree and spot smoke.")
                System.out.println("1. Head toward the smoke ");
                System.out.println("2. Stay and rest ");
                System.out.print("Choose (1 or 2): ");
                int choice3 = sc.nextInt();

#namith scenario 3
 } else if (choice1 == 2) {
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
                System.out.println("GAME OVER.");
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
                    System.out.println("YOU WIN!");
                } else {
                    System.out.println("\nSnakes attack you.");
                    System.out.println("GAME OVER.");
                }

            } else if (choice3 == 3) {
                System.out.println("\nYou find a stone tablet.");
                System.out.println("1. Touch it ");
                System.out.println("2. Ignore it ");
                System.out.print("Choose (1 or 2): ");
                int choice4 = sc.nextInt();

         if (choice4 == 1) {
                    System.out.println("\nYou become the guardian of the jungle.");
                    System.out.println("YOU WIN!");
                } else {
                    System.out.println("\nThe ground collapses. You fall.");
                    System.out.println("GAME OVER.");
                }

            } else {
                System.out.println("\nInvalid choice! ");
                System.out.println("GAME OVER.");
            }

#prakash end


















