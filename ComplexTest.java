/**************************************************************************
 * @file: ComplexTest.java
 * @brief: This program is a testing class that test the method and constructor
            on Complex class
 * @author: Frank Liu Tongtong
 * @date: Nov 24, 2019
 **************************************************************************/

public class ComplexTest {
    public static void main(String[] args){
        System.out.println("TEST START!");
        System.out.println("");
        // I declare and initialize two objects using the constructor
        Complex num1 = new Complex(2, 3);
        Complex num2 = new Complex(1, 4);

        // I declare another object by using set method and see if it is the same with object num1
        Complex num3 = new Complex();
        num3.setRealPart(2);
        num3.setImagePart(3);
        if (num1.format().equals(num3.format())){
            System.out.println("Mutator works");
        }
        else{
            System.out.println("Mutator fails");
        }
        // I will test the plus method by using num1 + num2
        // the result should be 3.0+7.0i because the variable type is double
        Complex addition = new Complex();
        addition = num1.plus(num2);
        if(addition.format().equals("3.0+7.0i")){
            System.out.println("plus works");
        }
        else{
            System.out.println("plus fails");
        }
        // I will test the minus method by using num1 - num2
        // the result will be 1.0-1.0i
        Complex difference = new Complex();
        difference = num1.minus(num2);
        if(difference.format().equals("1.0-1.0i")){
            System.out.println("minus works");
        }
        else{
            System.out.println("minus fails");
        }
        // I will test the times method which times two object (num1 * num2)
        // the result, according to distribution law, will be -10.0+11i
        Complex product1 = new Complex();
        product1 = num1.times(num2);
        if(product1.format().equals("-10.0+11.0i")){
            System.out.println("times(take object) works");
        }
        else{
            System.out.println("times(take object) fails");
        }

        // I will test the times method which times a scalar
        // num1 times 2 should be 4.0+6.0i
        Complex product2 = new Complex();
        product2 = num1.times(2);
        if(product2.format().equals("4.0+6.0i")){
            System.out.println("times(take number) works");
        }
        else{
            System.out.println("times(take number) fails");
        }
        // I will test the modulus method
        // the modulus of num1 is square root of (2^2 + 3^2） = square root of 13
        double modulus;
        modulus = num1.modulus();
        if(modulus == Math.sqrt(13)){
            System.out.println("modulus works");
        }
        else {
            System.out.println("modulus fails");
        }

        // I will test the conjugate method
        // the conjugate of num1 should be 2.0-3.0i
        Complex conjugate = new Complex();
        conjugate = num1.conjugate();
        if(conjugate.format().equals("2.0-3.0i")){
            System.out.println("conjugate works");
        }
        else{
            System.out.println("conjugate fails");
        }

        // I will test the method that I create
        // the string that print out should be 2.0 + 3.0i because I add space between number and signs
        num1.printNumber();

        // I will use the get method to see if it shows the same thing as printNumber() does
        System.out.println(num1.getRealPart() + " + " + num1.getImagePart() +"i");

        // I will test the square method that I create by comparing it with num1.times(num1)
        // the result of these two method should be the same
        if(num1.squares().format().equals(num1.times(num1).format())){
            System.out.println("square works");
        }
        else{
            System.out.println("square fails");
        }
        System.out.println("");
        System.out.println("TEST COMPLETE!");
    }
}
