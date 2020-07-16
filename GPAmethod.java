import java.util.Scanner;
/************************************************************************************************************
 * @file    GPAmethod.java
 * @brief   This program modified the previous lab and use the concept of method to reduce redundant codes. It can
            calculate their semester GPA by asking input of credit hours and expected letter grades.
 * @author  Frank Liu,Tongtong
 * @date    Oct 29, 2019
 ************************************************************************************************************/
public class GPAmethod {

    public static double GPA(String courseGrade){                 // using a method to reduce redundant code
                                                                    // this method will take up a String as parameter
        double correspondingGPA = 0;                          // declare the variable we will return and initialize it
        if (courseGrade.equals("A")) {
            correspondingGPA = 4.00;
        }
        else if (courseGrade.equals("A-")) {
            correspondingGPA = 3.67;
        }
        else if (courseGrade.equals("B+")) {
            correspondingGPA = 3.33;
        }
        else if (courseGrade.equals("B")) {
            correspondingGPA = 3.00;
        }
        else if (courseGrade.equals("B-")) {
            correspondingGPA = 2.67;
        }                                          // using a bunch of if and else if statements to convert the letter grade
        else if (courseGrade.equals("C+")) {      //  to a corresponding GPA ( 0.00 - 4.00)
            correspondingGPA = 2.33;
        }
        else if (courseGrade.equals("C")) {
            correspondingGPA = 2.00;
        }
        else if (courseGrade.equals("C-")) {
            correspondingGPA = 1.67;
        }
        else if (courseGrade.equals("D+")) {
            correspondingGPA = 1.33;
        }
        else if (courseGrade.equals("D")) {
            correspondingGPA = 1.00;
        }
        else if (courseGrade.equals("D-")) {
            correspondingGPA = 0.67;
        }
        else if (courseGrade.equals("F")) {
            correspondingGPA = 0.00;
        }
        else {
            System.out.println("Not a valid grade letter!");
        }
        return correspondingGPA;                     // return to the double value from a String
    }
    public static void main(String[] args) {
            Scanner scnr = new Scanner(System.in);
            int numHour_1;                          // declaring four number of hours variables
            int numHour_2;
            int numHour_3;
            int numHour_4;
            String letterGrade_1;
            String letterGrade_2;                   // declaring four letter grade variables
            String letterGrade_3;
            String letterGrade_4;
            double correspondingGPA_1;
            double correspondingGPA_2;              // declaring four floating number GPA that correspond
            double correspondingGPA_3;              // with the letter grade
            double correspondingGPA_4;
            double GPA;  // declaring the final semester GPA variable

            System.out.println("Semester GPA Predictor: Let's see what your GPA could be this semester ...");

            System.out.println("");
            System.out.println("Course 1: Number of hours?");
            numHour_1 = scnr.nextInt();
            System.out.println("Course 1: Expected grade?");
            letterGrade_1 = scnr.next();

            System.out.println("");
            System.out.println("Course 2: Number of hours?");
            numHour_2 = scnr.nextInt();
            System.out.println("Course 2: Expected grade?");
            letterGrade_2 = scnr.next();
                                                        // asked user for information about their four courses
            System.out.println("");                 // including information about their GPA and hours
            System.out.println("Course 3: Number of hours?");
            numHour_3 = scnr.nextInt();
            System.out.println("Course 3: Expected grade?");
            letterGrade_3 = scnr.next();

            System.out.println("");
            System.out.println("Course 4: Number of hours?");
            numHour_4 = scnr.nextInt();
            System.out.println("Course 4: Expected grade?");
            letterGrade_4 = scnr.next();

            correspondingGPA_1 = GPA(letterGrade_1);
            correspondingGPA_2 = GPA(letterGrade_2);
            correspondingGPA_3 = GPA(letterGrade_3);      // calling the method to convert letter grade to GPA
            correspondingGPA_4 = GPA(letterGrade_4);


            GPA = ((correspondingGPA_1 * numHour_1) + (correspondingGPA_2 * numHour_2) + (correspondingGPA_3 * numHour_3) +
                    (correspondingGPA_4 * numHour_4)) / (numHour_1 + numHour_2 + numHour_3 + numHour_4);
            // do calculations
            System.out.println("");
            System.out.printf("Your semester GPA would be: %.4f", GPA );   // using printf statement to make sure that
    }                                                                  // the GPA has four digit after decimals
}

