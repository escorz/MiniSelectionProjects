import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter (0) for Rock, (1) for Scissors, and (2) for paper");
        int rps = scan.nextInt();
        int comp = (int) (Math.random() * 3);


        if (rps == 0) {
            if (comp == 1) {
                System.out.println("You played Rock. The computer played Scissors. Rock beats Scissors,You win! ");
            }
            if (comp == 2) {
                System.out.println("You played Rock. The computer played Paper. Paper Beats Rock, You lose!");
            }
            if (comp == 0) {
                System.out.println("Both you and the computer played Rock. It's a draw!");
            }
        }
        else if (rps == 1) {
            if (comp == 0) {
                System.out.println("You played Scissors. The computer played Rock. Rock beats Scissors,You lose! ");
            }
            if (comp == 2) {
                System.out.println("You played Scissors. The computer played Paper. Scissors Beats Paper, You win!");
            }
            if (comp == 1) {
                System.out.println("Both you and the computer played Scissors. It's a draw!");
            }
        }
        else if (rps == 2){
            if (comp == 0){
                        System.out.println("You played Rock. The computer played Paper. Paper beats Rock,You lose! ");
                    }
            if (comp == 1 ){
                        System.out.println("You played Scissors. The computer played Paper. Scissors beats Paper,You win! ");
                    }
            if (comp == 2) {
                System.out.println("Both you and the computer played Paper. It's a draw!");
            }

                }
            }

        }


