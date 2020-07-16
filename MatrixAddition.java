import java.util.Scanner;
/************************************************************************************************************
 * @file    MatrixAddition.java
 * @brief   This program implement the idea of array to make a matrix addition calculator by asking information
            from the user.
 * @author  Frank Liu,Tongtong
 * @date    October 15, 2019
 ************************************************************************************************************/
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        // declare variables necessary for the program
        int numRows;
        int numColumns;
        int i;
        int j;
        //ask the user for the number of columns and rows
        System.out.println("Enter the number of rows and columns for the matrices: ");
        numRows = scnr.nextInt();
        numColumns = scnr.nextInt();
        // declare the array
        // two matrices and the sum should have the same size
        int[][] matrixA = new int[numRows][numColumns];
        int[][] matrixB = new int[numRows][numColumns];
        int[][] sumAB = new int[numRows][numColumns];
        // use a nested for loops to asked user for the entries in the first matrix
        System.out.println("Enter the elements of the first matrix: ");
        for (i=0; i<matrixA.length; i++){
            for (j=0; j<matrixA[i].length; j++){
                matrixA[i][j] = scnr.nextInt();
            }
        }
        // use a nested for loops to asked user for the entries in the second matrix
        System.out.println("Enter the elements of the second matrix: ");
        for (i=0; i<matrixB.length; i++){
            for (j=0; j<matrixB[i].length; j++){
                matrixB[i][j] = scnr.nextInt();
            }
        }
        // use a nested for loops to add each entry of the two matrices together
        System.out.println("Sum of the matrices ");
        for (i=0; i<sumAB.length; i++){
            for (j=0; j<sumAB[i].length; j++){
                sumAB[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        // use the nested for loops to print out the sum of two matrices
        for (i=0; i<sumAB.length; i++){
            for (j=0; j<sumAB[i].length; j++){
                System.out.print(sumAB[i][j] + "\t");
            }
            System.out.println();    // print a new line after the completion of each row
        }
    }
}
