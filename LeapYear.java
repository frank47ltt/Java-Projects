
import java.util.Scanner;
/************************************************************************************************************
 * @file    LeapYear.java
 * @brief   This program implement the idea of multiple if statements and loops to help identify if a input year
            is a leap year or not with an error checking loop.
 * @author  Frank Liu,Tongtong
 * @date    September 24, 2019
 ************************************************************************************************************/

public class LeapYear {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int year;                        // declaring the variable year
        System.out.println("Welcome to Leap Year Calculator!");
        System.out.println("");          // give the user instructions
        System.out.println("Please enter a year after 1582. (That's the year the Gregorian calendar was adopted.");
        year = scnr.nextInt();
                                         // let user type the year they want to test
        while (year < 1582){
            System.out.println("Please enter a year after 1582!");
            year = scnr.nextInt();       // this is a error checking while loop
        }                                // the user will keep enter a year until it's after 1582
                                         // which means it fails the condition and exit the loop
        if (year % 4 ==0 ){              // if the year is divisible by 4, it could be a leap year (other conditions need to be met)
            if (year % 100 == 0 && year % 400 !=0){   // the inner if statement is used to check the extra condition
                System.out.println("It is not a leap year!");
            }                            // if the year is also divisible by 100 but not 400, it is not a leap year
                                         // therefore I use "&&" and "%" to express the solution in a java language
            else {
                System.out.println("It is a leap year!");
            }
        }
        else {                           // if it is not divisible by 4, it's definitely not a leap year
            System.out.println("It is not a leap year!");
        }
    }
}
