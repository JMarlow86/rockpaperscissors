
package Practice;
import java.util.Scanner;

public class RockPaperScissors {



    public static void main(String[] args) {



        System.out.println("Let's play rock, paper, scissors. Best out of three is the Champion! I'll count, 1..2...3....");
        System.out.println("Shoot!");

        Scanner go = new Scanner(System.in);
        int game;
        for(game =1; game <=3; game++ ){
            System.out.println("PLAYER 1, GO!");
            String handOne = go.next();
            System.out.println("Player one entered...." + handOne );
            System.out.println("PLAYER 2, GO!");
            String handTwo = go.next();
            System.out.println("Player two entered...." + handTwo);


        if (handOne.equals(handTwo)) {
                System.out.println("It's a tie");
            } else if (handOne.equalsIgnoreCase("Rock")  && handTwo.equalsIgnoreCase("Scissors") || handOne.equalsIgnoreCase("Scissors")
                && handTwo.equalsIgnoreCase("Rock")) {
                System.out.println("Rock Wins This Round!");
            } else if (handOne.equalsIgnoreCase("Rock") && handTwo.equalsIgnoreCase("Paper") || handOne.equalsIgnoreCase("Paper")
                && handTwo.equalsIgnoreCase("Rock")) {
                System.out.println("Paper Wins This Round!");
            } else if (handOne.equalsIgnoreCase("Scissors") && handTwo.equalsIgnoreCase("Paper") || handOne.equalsIgnoreCase("Paper")
                && handTwo.equalsIgnoreCase("Scissors")) {
                System.out.println("WINNER WINNER CHICKEN DINNER!");
            } else {
            System.out.println("WRONG");

        }

        }
         go.close();
        System.out.println("Your game has concluded");


    }

}



