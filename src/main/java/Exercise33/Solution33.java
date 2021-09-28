/*
 *  UCF COP3330 Fall 2021 Assignment 33 Solution
 *  Copyright 2021 Ihosvany Marquez
 */

package Exercise33;

import java.util.Scanner;
import java.util.Random;


public class Solution33
{
    public static String magicBall()
    {
        String[] choices = {"Yes.", "No.", "Maybe.", "Ask again later."};
        Random random_num = new Random();
        return(choices[random_num.nextInt(3)]);
    }

    public static void main(String[] args)
    {
        {
            Scanner scan = new Scanner(System.in);

            System.out.println("What's your question? ");
            String question = scan.nextLine();
            System.out.println("Question Asked: " + question + "\nResponse: " + magicBall());
        }
    }
}
