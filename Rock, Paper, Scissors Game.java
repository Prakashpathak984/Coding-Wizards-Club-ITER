/*

This code ask user to input ‘R’ for Rock ‘P’ for Paper and ‘S’ for Scissors. Now
the user needs a 2nd player to play with and finds computer as reliable
partner. Now as Computer is the 2nd player it generates a random value
between ‘R’ for Rock, ‘P’ for Paper and ‘S’ for Scissors and our program
checks who has won the game, (either the computer or the user).

They play 3 rounds together to decide who has finally won the game of
Rock, Paper, Scissors game.

Tie of Round: (Tie in the following round of the game. Same input of
computer and user)
Tie of Game: (Case where user won 1 round and computer won 1 round and
the other round is tie.)

*/

import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int comp = 0, user = 0;
    char arr[]={'R','P','S'};
    int i=1;
    while(i<=3)
    {
        System.out.println("Enter Your Choice");
        char ch = sc.next().charAt(0);
        ch = Character.toUpperCase(ch);
        char c = arr[(int)(3*Math.random())];
        if ((c == 'R') && (ch == 'S'))
        {
            System.out.println("You lose this round.");
            comp++;
        }
        else if ((c == 'P') && (ch == 'R'))
        {
            System.out.println("You lose this round.");
            comp++;
            
        }
        else if ((c == 'S') && (ch == 'P'))
        {
            System.out.println("You lose this round.");
            comp++;
            
        }
        else if ((c == 'R') && (ch == 'P'))
        {
            System.out.println("You won this round.");
            user++;
            
        }
        else if ((c == 'P') && (ch == 'S'))
        {
            System.out.println("You won this round.");
            user++;
            
        }
        else if ((c == 'S') && (ch == 'R'))
        {
            System.out.println("You won this round.");
            user++;
            
        }
        else if (c == ch)
        {
            System.out.println("Tie of round.");
            
        }
        i++;
    }
    if (comp > user)
        System.out.println("3 Rounds over, Computer scored "+ comp + ", Computer won the game.");
    else if (user > comp)
        System.out.println("3 Rounds over, User scored "+ user + ", You won the game.");
    else
        System.out.println("Match Tied");
  }
}
