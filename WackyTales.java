import java.util.Scanner;
public class WackyTales {
    public static void main(String[] args) {

        /************************************************************************************************************
         * @file    TotemHeads.java
         * @brief   This program implement the idea of Scanner that let user to input some words of different part of
         speech so that the program can automatically generate a story by using the words.
         * @author  Frank Liu,Tongtong
         * @date    September 10, 2019
         ************************************************************************************************************/

        Scanner keyboard = new Scanner(System.in);   // create the scanner object
        System.out.println("Enter your own word to create your own Wacky Tales!");
        System.out.println("Let's get started!");
        System.out.println(" ");
        String adjective1;                         // declare the variables I need from the users
        String adjective2;
        String adjective3;
        String adjective4;
        int RoomNumber;
        String ingVerb;
        String singularNoun;

        System.out.println("Enter an adjective.");          // print instruction on screen to ask for input
        adjective1= keyboard.next();                        // get input from user and store it in the variable
        System.out.println("Enter an adjective.");
        adjective2= keyboard.next();
        System.out.println("Enter a verb ending with -ing.");
        ingVerb = keyboard.next();
        System.out.println("Enter a singular noun.");
        singularNoun = keyboard.next();
        System.out.println("Enter an adjective.");
        adjective3= keyboard.next();
        System.out.println("Enter the room number.（Note: Enter an integer value. ex: 302)");
        RoomNumber= keyboard.nextInt();
        System.out.println("Enter an adjective.");
        adjective4= keyboard.next();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("The New Computer Game");        // print the story by using words user typed
        System.out.println(" ");
        System.out.println("For my birthday, I got a new computer game. It's really " + adjective1 + "! The main character");
        System.out.println("wears " + adjective2 + " glasses, called the Multiple Perspecticles, that allow him to see what");
        System.out.println("other people think. I have been " + ingVerb + " it a lot since I got it. I guess I've been playing the");
        System.out.println("game a lot because I've started to be able to tell what people are thinking!");
        System.out.println(" ");
        System.out.println("The other day, I forgot to take out the " + singularNoun + " and it was really " + adjective3 + " in the");
        System.out.println(RoomNumber + ". I could tell just by looking at my mom that she was mad! Another day, I");
        System.out.println("forgot to make my lunch and I left my homework at home, so I called Dad at work. I ");
        System.out.println("could tell even without seeing him that he was " + adjective4 + ". I think I may have on my own");
        System.out.println("invisible Multiple Perspecticles!");








    }
}
