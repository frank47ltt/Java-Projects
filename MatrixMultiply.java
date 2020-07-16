import java.util.Scanner;
/************************************************************************************************************
 * @file    MatrixMultiply.java
 * @brief   This program implement the idea of array and for loops to make a matrix multiplication calculator
            by asking information from the user.
 * @author  Frank Liu,Tongtong
 * @date    October 15, 2019
 ************************************************************************************************************/
public class MatrixMultiply {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        // declare the variables need to be use
        // NOTE: the two matrices can have different sizes, so four variables were declared
        int numRowsA;
        int numRowsB;
        int numColumnsA;
        int numColumnsB;
        // during the multiplication process, three for loop is used
        int i;
        int j;
        int k;
        // ask the user for sizes of the first matrix
        System.out.println("Enter the number of rows and columns for the first matrices: ");
        numRowsA = scnr.nextInt();
        numColumnsA = scnr.nextInt();
        // declare array matrixA given the size
        int[][] matrixA = new int[numRowsA][numColumnsA];
        // use for loops to ask user for elements in the matrix
        System.out.println("Enter the elements of the first matrix");
        for (i=0; i<matrixA.length; i++){
            for (j=0; j<matrixA[i].length; j++){
                matrixA[i][j] = scnr.nextInt();
            }
        }
        // ask the user for sizes of the second matrix
        System.out.println("Enter the number of rows and columns for the second matrices: ");
        numRowsB = scnr.nextInt();
        numColumnsB = scnr.nextInt();
        // declare array matrixB given the size
        int[][] matrixB = new int[numRowsB][numColumnsB];
        // use for loops to ask user for elements in the matrix
        System.out.println("Enter the elements of the second matrix");
        for (i=0; i<matrixB.length; i++){
            for (j=0; j<matrixB[i].length; j++){
                matrixB[i][j] = scnr.nextInt();
            }
        }
        // multiplication cannot be performed unless the number of columns of first matrix equals to the number of
        // rows of the second matrix
        // adding an if statement to check if the two value is equal.
            if (numColumnsA != numRowsB){
            System.out.println("ERROR! Cannot compute the multiplication. ");
        }
            // if they are equal, programs runs into else statement, which is the multiplication process
        else {
            // declare the product array.
                // the size will be the number of rows of A and the number of columns of B
            int[][] productAB = new int[numRowsA][numColumnsB];

            // the multiplication process is complicated
                // we need an extra variable k to keep track of the multiple addition process in one entries
                // the sum of matrixA[i][k] and matrixB[k][j] forms the productAB[i][j]
                // for the third for loops, k< numColumnsA because there should be numColumnsA times of element
                // need to be added together. This value can be substitute as numRowsB because they are equal
            System.out.println("Product of the matrices: ");
            for (i = 0; i < productAB.length; i++) {
                for (j = 0; j < productAB[i].length; j++) {
                    for (k = 0; k < numColumnsA; k++) {
                        productAB[i][j] = (productAB[i][j] + (matrixA[i][k] * matrixB[k][j]));
                    }
                }
            }
            // print out the answer
            for (i = 0; i < productAB.length; i++) {
                for (j = 0; j < productAB[i].length; j++) {
                    System.out.print(productAB[i][j] + "\t");
                }
                System.out.println("");  // print a new line after completion of a row
            }
        }
    }
}
