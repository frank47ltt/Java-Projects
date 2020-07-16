/**************************************************************************
 * @file: Shapes.java
 * @brief: This program provide a class that contains methods allow the main
            to do calculations related to perimeter and areas of different shape
 * @author: Frank Liu Tongtong
 * @date: Nov 24, 2019
 **************************************************************************/
import java.util.Scanner;

public class Shapes {
    //creating three field variables that represent the shape, perimeter, and areas
    private String shape;
    private double perimeter;
    private double area;

    public Shapes(){
        shape = "unknown";          // default constructor
        perimeter = 0;
        area = 0;
    }
    public Shapes(String userShape){
        shape = userShape;
        perimeter = 0;          // constructor that sets the shape
        area= 0;
    }

    public void setShape(String userShape){
        shape = userShape;      // mutator method
    }
    public String getShape(){
        return shape;           // accessor method
    }
    public double getPerimeter(){
        return perimeter;       // accessor method
    }
    public double getArea(){
        return area;        // accessor method
    }


    public void setPerimeter(Scanner scnr){     //this is a method to calculate perimeter by asking user input
        if(shape.equals("squares")){
            System.out.println("Please Enter the Height for Square for perimeter calculation");
            double height = scnr.nextDouble();      // ask user for height
            perimeter = 4 * height;                 // perimeter of square is 4 times the length
        }
        else if(shape.equals("rectangles")){
            System.out.println("Please Enter the Height for Rectangles for perimeter calculation");
            double height = scnr.nextDouble();
            System.out.println("Please Enter the Width for Rectangles for perimeter calculation");
            double width = scnr.nextDouble();       // ask user for height and width
            perimeter = 2 * (height + width);       // perimeter for rectangles is 2 times the sum of height and width
        }
        else if(shape.equals("triangles")){
            System.out.println("Please Enter the Length1 for Triangle for perimeter calculation");
            double length1 = scnr.nextDouble();
            System.out.println("Please Enter the Length1 for Triangle for perimeter calculation");
            double length2 = scnr.nextDouble();
            System.out.println("Please Enter the Length1 for Triangle for perimeter calculation");
            double length3 = scnr.nextDouble();     // ask the three side length of triangle
            perimeter = (length1 + length2 + length3);  // perimeter is the sum of three length
        }
        else if(shape.equals("circles")){
            System.out.println("Please Enter the Radius for Circle for perimeter calculation");
            double radius = scnr.nextDouble();      // prompt user for radius
            perimeter = 2 * radius * Math.PI;   // use Math.PI to get pi
        }                                           // the perimeter should be 2 times radius times pi
        else{
            System.out.println("You must first define a shape before a perimeter can be calculated");
            perimeter = 0;                  // ask user to set shape if not
        }
    }

    public void setArea(Scanner scnr) {    //this is a method to calculate area by asking user input
        if (shape.equals("squares")) {
            System.out.println("Please Enter the Height for Square for area calculation");
            double height = scnr.nextDouble();      // prompt user for side length
            area = height * height;             // area of square is the square of side length
        }
        else if (shape.equals("rectangles")) {
            System.out.println("Please Enter the Height for Rectangles for area calculation");
            double height = scnr.nextDouble();
            System.out.println("Please Enter the Width for Rectangles for area calculation");
            double width = scnr.nextDouble();       // prompt user for height and width
            area = height * width;              // area of rectangles is product of height and width
        }
        else if (shape.equals("triangles")) {
            System.out.println("Please Enter the Base for Triangle for area calculation");
            double base = scnr.nextDouble();
            System.out.println("Please Enter the Height for Triangle for area calculation");
            double height = scnr.nextDouble();  // prompt user for base and height for triangle
            area = 0.5 * base * height;     // area of triangle is one half of product of base and height
        }
        else if (shape.equals("circles")) {
            System.out.println("Please Enter the Radius for Circle for area calculation");
            double radius = scnr.nextDouble();      // prompt user for radius
            area = radius * radius * Math.PI;       // area equals to pi times square of radius
        }
        else {
            System.out.println("You must first define a shape before an area can be calculated");
            area = 0;               // ask user to set area if not
        }
    }

    public void printInfo() {
        System.out.println("Your shape is " + shape);
        System.out.println("Your perimeter is " + perimeter);
        System.out.println("Your area is " + area);     // method that I created that could print all the information
    }

    public void clearObject() {
        shape = "unknown";          // method that I create the clear all stored value of the object to default value
        perimeter = 0;
        area = 0;
    }

}

