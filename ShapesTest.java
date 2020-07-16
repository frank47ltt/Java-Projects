/**************************************************************************
 * @file: ShapesTest.java
 * @brief: This program is a testing class that test the method and constructor
            on Shapes class
 * @author: Frank Liu Tongtong
 * @date: Nov 24, 2019
 **************************************************************************/
import java.util.Scanner;

public class ShapesTest {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("TEST START!");
        System.out.println("");
        // provide instruction for user
        System.out.println("Note: the four shapes provided are \n squares \n" +
                " triangles \n rectangles \n circles \n");

        // define object with four shapes by using constructor and the set method
        Shapes obj1 = new Shapes();
        obj1.setShape("squares");
        Shapes obj2 = new Shapes("triangles");
        Shapes obj3 = new Shapes("rectangles");
        Shapes obj4 = new Shapes("circles");

        // test the first object, which is squares
        System.out.println("Start to test object 1 ... squares");
        obj1.setPerimeter(scnr);
        obj1.setArea(scnr);
        obj1.printInfo();
        System.out.println("");
        // test the get method to see if the info printed is the same with printInfo method
        System.out.println("Start to test get method");
        System.out.println("Should print the same information as above");
        System.out.println("Your shape is " + obj1.getShape());
        System.out.println("Your perimeter is " + obj1.getPerimeter());
        System.out.println("Your area is " + obj1.getArea());

        // test the second object, which is triangles
        System.out.println("");
        System.out.println("Start to test object 2 ... triangles");
        obj2.setPerimeter(scnr);
        obj2.setArea(scnr);
        obj2.printInfo();

        // test the third object, which is rectangles
        System.out.println("");
        System.out.println("Start to test object 3 ... rectangles");
        obj3.setPerimeter(scnr);
        obj3.setArea(scnr);
        obj3.printInfo();

        // test the fourth object, which is circles
        System.out.println("");
        System.out.println("Start to test object 4 ... circles");
        obj4.setPerimeter(scnr);
        obj4.setArea(scnr);
        obj4.printInfo();

        // test the clearance method
        System.out.println("");
        System.out.println("Start to test clearance method");
        obj4.clearObject();
        obj4.printInfo();

        System.out.println("");
        System.out.println("Test Ends!");
    }
}
