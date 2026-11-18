/* Program name: Paper, Scissor and Rock Version 0.1
Initially created by Dr. Wenjia Li
Finished by Jason Weir
November 10, 2026
*/

import javax.swing.JOptionPane;

public class FirstRPSGame
{
    public static void main(String[] args)
    {
    //Variable declaration
        int yourChoice, computerChoice, playerWins, cpuWins, rounds; //creates two integer variables to store the user and computers' choice
        String yourInput; //creates a

    //Welcome screen and show the basic rule to the user
        JOptionPane.showMessageDialog(null, "Welcome to Paper, Scissor and Rock");
        JOptionPane.showMessageDialog(null,"Let me remind you the rule first: \n Scissor cuts" +
                " paper, paper covers rock,\n" + "and rock breaks scissors. ");
        JOptionPane.showMessageDialog(null,"0: Rock\n1: Paper\n2: Scissor");
        JOptionPane.showMessageDialog(null, "First to 3 wins!");

        rounds = 0;
        playerWins = 0;
        cpuWins = 0;

        while(playerWins != 3 && cpuWins != 3){

            //Increases and states round number at the beginning of each round
            rounds += 1;
            JOptionPane.showMessageDialog(null, "Round: " + rounds);

            //Get your choice
            boolean validChoice = false;
            yourChoice = -1;

            while(!validChoice){
                try{
                    yourInput = JOptionPane.showInputDialog("Now tell me your choice!");
                    yourChoice = Integer.parseInt(yourInput);
                    validChoice = true;
                }catch (IllegalArgumentException e){
                    JOptionPane.showMessageDialog(null, "Invalid input." +
                            " Please enter a number from 0-2.");
                }
            }


            //Get computer choice
            computerChoice = (int) (Math.random() * 10); //generate a random number
            computerChoice %= 3; //Uses Mod 3 to restrict the number to a valid input (0,1,or 2)

            //Compare your Choice with computer’s choice and output the result
            //Case I: Both you and computer pick the same choice, then it’s a tie!
            if (yourChoice == computerChoice) {
                JOptionPane.showMessageDialog(null, "It’s a tie!");
            }

            //Case II: You WIN :)
            if ((yourChoice == 0 && computerChoice == 2) ||
                    (yourChoice == 1 && computerChoice == 0) ||
                    (yourChoice == 2 && computerChoice == 1)) {

                playerWins += 1;
                JOptionPane.showMessageDialog(null, "You win!");
                JOptionPane.showMessageDialog(null, "Computer: " + cpuWins + " "
                        + "\n Player: " + playerWins);
            }


            //Case III: You lose :(
            if ((yourChoice == 2 && computerChoice == 0) ||
                    (yourChoice == 0 && computerChoice == 1) ||
                    (yourChoice == 1 && computerChoice == 2)) {

                cpuWins += 1;
                JOptionPane.showMessageDialog(null, "You lose.");
                JOptionPane.showMessageDialog(null, "Computer: " + cpuWins + " "
                        + "\n Player: " + playerWins);
            }
        }

        //Displays winner of the game
        if (playerWins == 3){
            JOptionPane.showMessageDialog(null, "Player Wins!");
        }else{
            JOptionPane.showMessageDialog(null, "Computer Wins!");
        }
    }
}
