

import java.util.Scanner;
/************************************************************************************************************
 * @file    HeartRateZones.java
 * @brief   This program implement the idea of if statement and calculation to produce a program that can give
            user target heart rate zone by asking information from the user.
 * @author  Frank Liu,Tongtong
 * @date    September 15, 2019
 ************************************************************************************************************/

public class HeartRateZones {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int age;
        int restingHR;                        // declaring all necessary variables that can be used for calculation
        char userChoice;
        int estimatedMaxHR;
        int d;
        double targetLowEnd;
        double targetHighEnd;

        System.out.println("Enter your age: ");                     // asking input from the user
        age = scnr.nextInt();
        System.out.println("Enter your resting heart rate: ");
        restingHR = scnr.nextInt();
        System.out.println("");
        System.out.println("Choose your target: ");                 // providing three choices for the user to choose
        System.out.println("1. Weight loss or build endurance");
        System.out.println("2. Weight management or improve cardio fitness");
        System.out.println("3. Interval workout");
        System.out.println("");
        System.out.println("your choice?");
        userChoice = scnr.next().charAt(0);

        estimatedMaxHR = 220 - age;
        d = estimatedMaxHR - restingHR;                            // do necessary mathematical operation
        if (userChoice == '1')
        {
            targetLowEnd = (((double) d * 0.60) + restingHR );     // using three if statements corresponding to
            targetHighEnd = (((double) d * 0.75) + restingHR );    // three different choices from the user
            System.out.printf("Your target heart rate zone is %.2f -- %.2f \n" ,targetLowEnd,targetHighEnd);
        }
        if (userChoice == '2')
        {
            targetLowEnd = (((double) d * 0.70) + restingHR );     // each if statement uses a different coefficient
            targetHighEnd = (((double) d * 0.80) + restingHR );    // for calculating the range
            System.out.printf("Your target heart rate zone is %.2f -- %.2f \n",targetLowEnd,targetHighEnd);
        }
        if (userChoice == '3')
        {
            targetLowEnd = (((double) d * 0.80) + restingHR );     // all three statement need to cast variable d
            targetHighEnd = (((double) d * 1.00) + restingHR );    // from integer to double in terms of accuracy
            System.out.printf("Your target heart rate zone is %.2f -- %.2f \n",targetLowEnd,targetHighEnd);
        }
                                               // printf is used to ensure two digit when showing the answer
    }
}
