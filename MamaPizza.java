import java.util.Scanner;
/************************************************************************************************************
 * @file    GPAmethod.java
 * @brief   This program uses methods to calculate to payment including tax by asking information of pizza
            from the user order and doing calculations to show a summary message
 * @author  Frank Liu,Tongtong
 * @date    Nov 5, 2019
 ************************************************************************************************************/

public class MamaPizza {
    public static double Tax(double totalWithoutTax){    // this is a method that calculate the tax
        return totalWithoutTax * (0.0825);             // 8.25% tax from the total
    }
    public static double Total(String userSize, String userType, String userDeliverChoice){
        // we declare a method that calculate the total by having three String parameters that corresponding to
        // different size, type, and deliver choice getting from the user in main
        double total = 0;    // first we need to initialize the total variable to value 0
        if(userSize.equals("L")){
            total = total + 10;
        }
        else if(userSize.equals("M")){
            total = total + 7;
        }                                           // we use if and else if statement to assign different price with
        else if(userSize.equals("S")){              // different size of pizza
            total = total + 5;
        }
        else{                                   //we have a final else statement that serve as error checking
            System.out.println("Please Enter the Proper Size of Pizza --- ([L/M/S])");

        }
        if(userType.equals("M")){
            total = total + 3;
        }
        else if(userType.equals("V")){
            total = total + 2;                  // we use if and else if statement to assign different price with
        }                                       // different type of pizza
        else{
            System.out.println("Please Enter the Proper Type of Pizza --- ([M/V])");
        }                                       // we have a final else statement that serve as error checking

        if(userDeliverChoice.equals("C")){
            total = total + 0;
        }
        else if(userDeliverChoice.equals("D")){
            total = total + 3;                      // we apply deliver fee to total if user chose to deliver
        }
        else{
            System.out.println("Please Enter the Proper Choice of Delivery --- ([C/D])");
        }                           // we have a final else statement that serve as error checking
        return total + Tax(total);
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String firstName;
        String lastName;
        String pizzaSize;
        String pizzaType;               // we define necessary variables
        String deliverChoice;
        int deliverTime;

        // we make instructions to ask user for what kind of pizza they want and the choice of delivery
        System.out.println("Welcome to Mama's Pizza!");
        System.out.print("First Name: ");
        firstName = scnr.nextLine();
        System.out.print("Last Name: ");
        lastName = scnr.nextLine();
        System.out.print("Size of Pizza [L]arge, [M]edium, [S]mall? [L/M/S]: ");
        pizzaSize = scnr.nextLine();
        System.out.print("[M]eat-lovers or [V]eggie Pizza? [M/V]: ");
        pizzaType = scnr.nextLine();
        System.out.print("[C]arry-out or [D]elivery? [C/D]: ");
        deliverChoice = scnr.nextLine();

        // this if-else if- else statement will calculate the time it takes to deliver and shows up in the final message
        // a deliver time of -1 will appear if the user do not enter correct letter
        if (deliverChoice.equals("C")){
            deliverTime = 15;
        }
        else if(deliverChoice.equals("D")){
            deliverTime = 30;
        }
        else{
            deliverTime = -1;
        }
        // then we print out a conclusion message that brings the total payment and the time
        System.out.println(firstName + " " + lastName + ",");
        // for the total payment, we call the method and use appropriate argument that so it returns to the total payment
        // we use the printf statement to keep two digits after the decimal
        System.out.printf("Your total is $%.2f", Total(pizzaSize,pizzaType,deliverChoice));
        System.out.println(", and your pizza will be ready in " + deliverTime + "-minutes!");
        System.out.println("Thank you,");
        System.out.println("Mama's Pizza!");
    }
}
