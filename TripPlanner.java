import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args) {

        /************************************************************************************************************
         * @file    TotemHeads.java
         * @brief   This program implement the idea of scanner and calculation by having a program to plan the trip for
         a user by asking some basic information. The program can calculate further data for reference of the trip.
         * @author  Frank Liu,Tongtong
         * @date    September 10, 2019
         ************************************************************************************************************/

        Scanner scnr = new Scanner(System.in);          // create the scanner object
        System.out.println("Welcome to the Trip Planner Calculator!!!");
        System.out.println("");
        int numCarPassenger;
        double lengthOfTripInMiles;                  // declare the variables needed for calculation
        double capOfFuelInGallon;
        double priceOfGas;
        double milesPerGallonOfCar;
        System.out.println("Enter the number of passengers.");
        numCarPassenger = scnr.nextInt();               // get information from users
        System.out.println("Enter the length of your trip in Miles.");
        lengthOfTripInMiles = scnr.nextDouble();
        System.out.println("Enter the capacity of the fuel tank in gallons.");
        capOfFuelInGallon = scnr.nextDouble();
        System.out.println("Enter the price of gas/gallon.");
        priceOfGas = scnr.nextDouble();
        System.out.println("Enter the miles per gallon of your car.");
        milesPerGallonOfCar = scnr.nextDouble();
        double gallonsNeeded = lengthOfTripInMiles / milesPerGallonOfCar; // calculating the we need how many gallon by dividing length of the trip by miles / gallon
        double tanksofGas = gallonsNeeded / capOfFuelInGallon;        // calculating how many tanks of gas is needed by dividing gallon with the capacity of cars
        double tanksofGasInNearstInteger ;                           // because tanks of gallon should be an integer, if we need 1.2 tanks, it simply means we need 2 tanks
        tanksofGasInNearstInteger = Math.ceil(tanksofGas);           // so I declare a new variable and use Math.ceil to round up to the integer
        int AAA = (int) tanksofGasInNearstInteger;                 // because it is still a double value after the Math.ceil, I need to initiate a new variable and convert its type to integer
        double totalCost = AAA * capOfFuelInGallon * priceOfGas;      // then use calculate the total cost by multiplying the tanks of gas we need, capacity of the fuel in gallon, and the price of gallon together
        double avaragePayment = totalCost / (double)numCarPassenger ;  // we calculate the average by using the total cost and divide by the number of passenger
        System.out.println(" ");
        System.out.println("You will need up to " + AAA + " tanks of gas");
        System.out.printf("The total cost will be %.2f dollars \n", totalCost);   // we print the result and keep it in two decimals by using printf
        System.out.printf("Each passenger should pay %.2f dollars \n", avaragePayment);




    }
}
