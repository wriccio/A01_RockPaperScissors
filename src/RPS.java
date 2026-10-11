import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerA;
        String playerB;
        String playAgain;

        do {
            do {
                System.out.print("Player A: Enter R, P, or S: ");
                playerA = scanner.nextLine().trim();

                if (!playerA.equalsIgnoreCase("R")
                        && !playerA.equalsIgnoreCase("P")
                        && !playerA.equalsIgnoreCase("S")) {
                    System.out.println("Invalid entry. Enter R, P, or S.");
                }
            } while (!playerA.equalsIgnoreCase("R")
                    && !playerA.equalsIgnoreCase("P")
                    && !playerA.equalsIgnoreCase("S"));

            do {
                System.out.print("Player B: Enter R, P, or S: ");
                playerB = scanner.nextLine().trim();

                if (!playerB.equalsIgnoreCase("R")
                        && !playerB.equalsIgnoreCase("P")
                        && !playerB.equalsIgnoreCase("S")) {
                    System.out.println("Invalid entry. Enter R, P, or S.");
                }
            } while (!playerB.equalsIgnoreCase("R")
                    && !playerB.equalsIgnoreCase("P")
                    && !playerB.equalsIgnoreCase("S"));

            if (playerA.equalsIgnoreCase("R")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock it's a Tie!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock. Player B wins!");
                } else {
                    System.out.println("Rock breaks Scissors. Player A wins!");
                }
            } else if (playerA.equalsIgnoreCase("P")) {
                if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs Paper it's a Tie!");
                } else if (playerB.equalsIgnoreCase("S")) {
                    System.out.println("Scissors cuts Paper. Player B wins!");
                } else {
                    System.out.println("Paper covers Rock. Player A wins!");
                }
            } else {
                if (playerB.equalsIgnoreCase("S")) {
                    System.out.println("Scissors vs Scissors it's a Tie!");
                } else if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors. Player B wins!");
                } else {
                    System.out.println("Scissors cuts Paper. Player A wins!");
                }
            }

            do {
                System.out.print("Would you like to play again? (Y/N): ");
                playAgain = scanner.nextLine().trim();

                if (!playAgain.equalsIgnoreCase("Y")
                        && !playAgain.equalsIgnoreCase("N")) {
                    System.out.println("Invalid entry. Enter Y or N.");
                }
            } while (!playAgain.equalsIgnoreCase("Y")
                    && !playAgain.equalsIgnoreCase("N"));

        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");

        scanner.close();
    }
}


