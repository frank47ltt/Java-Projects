
import java.util.Scanner;
/************************************************************************************************************
 * @file    PredictGPA.java
 * @brief   This program implement the idea of multiple if statements and mathematical operation to help student
            calculate their semester GPA by asking input of credit hours and expected letter grades.
 * @author  Frank Liu,Tongtong
 * @date    September 21, 2019
 ************************************************************************************************************/

public class PredictGPA {
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

        correspondingGPA_1 = 0;
        correspondingGPA_2 = 0;
        correspondingGPA_3 = 0;                 // initialized the four variables to make sure the program compile
        correspondingGPA_4 = 0;

        if (letterGrade_1.equals("A")) {
            correspondingGPA_1 = 4.00;
        }
        if (letterGrade_1.equals("A-")) {
            correspondingGPA_1 = 3.67;
        }
        if (letterGrade_1.equals("B+")) {
            correspondingGPA_1 = 3.33;
        }
        if (letterGrade_1.equals("B")) {
            correspondingGPA_1 = 3.00;
        }
        if (letterGrade_1.equals("B-")) {
            correspondingGPA_1 = 2.67;
        };                                     // using a bunch of if statements to convert the letter grade
        if (letterGrade_1.equals("C+")) {      // for each of the four courses to a corresponding GPA ( 0.00 - 4.00)
            correspondingGPA_1 = 2.33;
        }
        if (letterGrade_1.equals("C")) {
            correspondingGPA_1 = 2.00;
        }
        if (letterGrade_1.equals("C-")) {
            correspondingGPA_1 = 1.67;
        }
        if (letterGrade_1.equals("D+")) {
            correspondingGPA_1 = 1.33;
        }
        if (letterGrade_1.equals("D")) {
            correspondingGPA_1 = 1.00;
        }
        if (letterGrade_1.equals("D-")) {
            correspondingGPA_1 = 0.67;
        }
        if (letterGrade_1.equals("F")) {
            correspondingGPA_1 = 0.00;
        }

        if (letterGrade_2.equals("A")) {
            correspondingGPA_2 = 4.00;
        }
        if (letterGrade_2.equals("A-")) {
            correspondingGPA_2 = 3.67;
        }
        if (letterGrade_2.equals("B+")) {
            correspondingGPA_2 = 3.33;
        }
        if (letterGrade_2.equals("B")) {
            correspondingGPA_2 = 3.00;
        }
        if (letterGrade_2.equals("B-")) {
            correspondingGPA_2 = 2.67;
        };
        if (letterGrade_2.equals("C+")) {
            correspondingGPA_2 = 2.33;
        }
        if (letterGrade_2.equals("C")) {
            correspondingGPA_2 = 2.00;
        }
        if (letterGrade_2.equals("C-")) {
            correspondingGPA_2 = 1.67;
        }
        if (letterGrade_2.equals("D+")) {
            correspondingGPA_2 = 1.33;
        }
        if (letterGrade_2.equals("D")) {
            correspondingGPA_2 = 1.00;
        }
        if (letterGrade_2.equals("D-")) {
            correspondingGPA_2 = 0.67;
        }
        if (letterGrade_2.equals("F")) {
            correspondingGPA_2 = 0.00;
        }

        if (letterGrade_3.equals("A")) {
            correspondingGPA_3 = 4.00;
        }
        if (letterGrade_3.equals("A-")) {
            correspondingGPA_3 = 3.67;
        }
        if (letterGrade_3.equals("B+")) {
            correspondingGPA_3 = 3.33;
        }
        if (letterGrade_3.equals("B")) {
            correspondingGPA_3 = 3.00;
        }
        if (letterGrade_3.equals("B-")) {
            correspondingGPA_3 = 2.67;
        };
        if (letterGrade_3.equals("C+")) {
            correspondingGPA_3 = 2.33;
        }
        if (letterGrade_3.equals("C")) {
            correspondingGPA_3 = 2.00;
        }
        if (letterGrade_3.equals("C-")) {
            correspondingGPA_3 = 1.67;
        }
        if (letterGrade_3.equals("D+")) {
            correspondingGPA_3 = 1.33;
        }
        if (letterGrade_3.equals("D")) {
            correspondingGPA_3 = 1.00;
        }
        if (letterGrade_3.equals("D-")) {
            correspondingGPA_3 = 0.67;
        }
        if (letterGrade_3.equals("F")) {
            correspondingGPA_3 = 0.00;
        }

        if (letterGrade_4.equals("A")) {
            correspondingGPA_4 = 4.00;
        }
        if (letterGrade_4.equals("A-")) {
            correspondingGPA_4 = 3.67;
        }
        if (letterGrade_4.equals("B+")) {
            correspondingGPA_4 = 3.33;
        }
        if (letterGrade_4.equals("B")) {
            correspondingGPA_4 = 3.00;
        }
        if (letterGrade_4.equals("B-")) {
            correspondingGPA_4 = 2.67;
        };
        if (letterGrade_4.equals("C+")) {
            correspondingGPA_4 = 2.33;
        }
        if (letterGrade_4.equals("C")) {
            correspondingGPA_4 = 2.00;
        }
        if (letterGrade_4.equals("C-")) {
            correspondingGPA_4 = 1.67;
        }
        if (letterGrade_4.equals("D+")) {
            correspondingGPA_4 = 1.33;
        }
        if (letterGrade_4.equals("D")) {
            correspondingGPA_4 = 1.00;
        }
        if (letterGrade_4.equals("D-")) {
            correspondingGPA_4 = 0.67;
        }
        if (letterGrade_4.equals("F")) {
            correspondingGPA_4 = 0.00;
        }

        GPA = ((correspondingGPA_1 * numHour_1) + (correspondingGPA_2 * numHour_2) + (correspondingGPA_3 * numHour_3) + (correspondingGPA_4 * numHour_4)) / (numHour_1 + numHour_2 + numHour_3 + numHour_4);

        System.out.println("");
        System.out.printf("Your semester GPA would be: %.4f", GPA );   // using printf statement to make sure that
    }                                                                  // the GPA has four digit after decimals
}
