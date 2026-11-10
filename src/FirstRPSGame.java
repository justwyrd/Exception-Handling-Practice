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
        int yourChoice, computerChoice; //creates two integer variables to store the user and computers' choice
        String yourInput; //creates a

    //Welcome screen and show the basic rule to the user
        JOptionPane.showMessageDialog(null, "Welcome to Paper, Scissor and Rock");
        JOptionPane.showMessageDialog(null,"Let me remind you the rule first:\\nScissor cuts" +
                " paper, paper covers rock,\n" + "and rock breaks scissors. ");
        JOptionPane.showMessageDialog(null,"0: Rock\n 1: Paper\n2: Scissor");

    //Get your choice
        yourInput = JOptionPane.showInputDialog("Now tell me your choice!");
        yourChoice = Integer.parseInt(yourInput);

    //Get computer choice
        computerChoice = (int)(Math.random()*10); //generate a random number
        computerChoice %= 3; //Uses Mod 3 to restrict the number to a valid input (0,1,or 2)

    //Compare your Choice with computer’s choice and output the result
    //Case I: Both you and computer pick the same choice, then it’s a tie!
        if (yourChoice == computerChoice){
            JOptionPane.showMessageDialog(null,"It’s a tie!");
        }

    //Case II: You WIN :)
        if ((yourChoice == 0 && computerChoice == 2) ||
                (yourChoice == 1 && computerChoice == 0) ||
                (yourChoice == 2 && computerChoice == 1)){
            JOptionPane.showMessageDialog(null, "You win!");
        }


    //Case III: You lose :(
        if ((yourChoice == 2 && computerChoice == 0) ||
                (yourChoice == 0 && computerChoice == 1) ||
                (yourChoice == 1 && computerChoice == 2)){
            JOptionPane.showMessageDialog(null, "You lose.");
        }

    }
}
