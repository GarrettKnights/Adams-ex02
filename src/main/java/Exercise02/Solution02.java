/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Garrett Adams
 */

package Exercise02;

//Sets up scanner
import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {

        //Initializes Scanner
        Scanner ScanWord = new Scanner(System.in);
        //Declares String we will be using
        String word;

        //Asks user for input
        System.out.println("What is the input string?");
        //Takes users input
        word = ScanWord.nextLine();
        //Gets length of users input
        int length = word.length();

        //Prints out final statement
        System.out.println("" + word + " has  " + length + " characters");
    }
}
