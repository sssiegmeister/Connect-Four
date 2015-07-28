
/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.*;
public class Menu
{
   public Menu()
   {
    int choice;
    int choice1;
    int choice2;
    //AI myAI = newAI();
    boolean myTurn = true;
    int move;
    Scanner scan = new Scanner (System.in);
    System.out.println("Welcome to connect 4!");
    System.out.println("Would you like to play a round? If so, press 1.");
    choice = scan.nextInt();
    if(choice == 1)
    {
        System.out.println("Please select the Player 1 difficulty: ");
        System.out.println("Select 0 for a confidence booster");
        System.out.println("Select 1 for easy");
        System.out.println("Select 2 for medium");
        System.out.println("Select 3 for hard");
        System.out.println("Select 4 to play against a human opponent");
        System.out.println("What difficulty would you like to play on?");
        choice1 = scan.nextInt();
        
        System.out.println("Please select the Player 2 difficulty: ");
        System.out.println("Select 0 for a confidence booster");
        System.out.println("Select 1 for easy");
        System.out.println("Select 2 for medium");
        System.out.println("Select 3 for hard");
        System.out.println("Select 4 to play against a human opponent");
        System.out.println("What difficulty would you like to play on?");
        choice2 = scan.nextInt();
        /*if (choice == 0)
        {
            
            
        }
        if (choice == 1)
        {
            myAI.setDifficulty(1);
        }
        if (choice == 2)
        {
            myAI.setDifficulty(2);
        }
        if (choice == 3)
        {
            myAI.setDifficulty(3);
        }
        if (choice == 4)
        {
            myBoard.makeBoard();
            myBoard.chooseMove();
            //myAI.setDifficulty(4);
        }*/
        Board myBoard = new Board();
        myBoard.showBoard();
        myBoard.chooseMove(choice1, choice2);
        /*if (myTurn == true)
        {
            System.out.print("Select your column: ");
            move = scan.nextInt();
            myBoard.chooseMove(choice, move, myTurn);
            myBoard.showBoard();
            myTurn = false;
        }
        else
        {
            System.out.println("Now the opponent will make their move");
            Random generator = new Random();
            move = generator.nextInt(7)+1;
            myBoard.chooseMove(choice, move, myTurn);
            myBoard.showBoard();
            System.out.println("Now it is your turn");
            myTurn = true;
        }*/
        //myBoard.getDifficulty();
    }
}
}
