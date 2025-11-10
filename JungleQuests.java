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

else {
            System.out.println("\nInvalid choice! The jungle spirits are angry.");
            System.out.println(" GAME OVER.");
        }

        sc.close();
    }
}


