/**************************************************************************
 * @file: Complex.java
 * @brief: This program provide a class that contains methods allow the main
            to do calculations related to imaginary number
 * @author: Frank Liu Tongtong
 * @date: Nov 24, 2019
 **************************************************************************/

public class Complex{
    // creating two fields variables that represent the real part and image part of complex number
    private double realPart;
    private double imagPart;
    // this is a default constructor that sets the number to zero
    public Complex(){
        realPart = 0;
        imagPart = 0;
    }
    // this is a constructor that take a parameter and set it to real part
    public Complex(double a){
        realPart = a;
        imagPart = 0;
    }
    // this is a constructor that take two parameters and set them to both real and imga part
    public Complex(double a, double b){
        realPart = a;
        imagPart = b;
    }
    // this is an accessor that return the format of a complex number
    public String format(){
        if (imagPart >= 0) {
            return (realPart + "+" + imagPart + "i");
        }           // the use of if-else statement will help to differentiate two forms of complex number
        else {      // a+bi or a-bi
            return (realPart + "" + imagPart + "i");
        }
    }
    // this is an accessor that return to the real part of the complex number
    public double getRealPart() {
        return realPart;
    }
    // this is a mutator that take the user parameter and set it to the real part.
    public void setRealPart(double userRealPart){
        realPart = userRealPart;
    }
    // this is an accessor that return to the image part of the complex number
    public double getImagePart() {
        return imagPart;
    }
    // this is a mutator that take the user parameter and set it to the image part.
    public void setImagePart(double userImagPart){
        imagPart = userImagPart;
    }
    // this is a method that add to complex number together
    public Complex plus(Complex z){                  // a object parameter is taken
        Complex addition = new Complex();            // create a temporary object that represent the sum
        addition.realPart = realPart + z.realPart;   // real part of temporary object is the sum of the two real parts
        addition.imagPart = imagPart + z.imagPart;   // imag part of temporary object is the sum of the two image parts
        return addition;                             // return to the object that representing the sum
    }
    // same principle of the method plus applied to minus
    public Complex minus(Complex z){
        Complex difference = new Complex();
        difference.realPart = realPart - z.realPart;
        difference.imagPart = imagPart - z.imagPart;
        return difference;
    }
    // same principle applied except the multiplication process is more complicated
    // we use distribution law to keep track of the product
    // keep in mind that i^2 = -1
    public Complex times(Complex z){
        Complex product_1 = new Complex();
        product_1.realPart = realPart * z.realPart - imagPart * z.imagPart;
        product_1.imagPart = realPart * z.imagPart + imagPart * z.realPart;
        return product_1;
    }
    // same principle applied
    // this multiplication takes a scalar
    public Complex times(double a){
        Complex product_2 = new Complex();
        product_2.realPart = realPart * a;
        product_2.imagPart = imagPart * a;
        return product_2;
    }
    // modulus returns to a number that equals to the square root of the sum of the square of each part
    // we use Math.sqrt to calculate the square root
    public double modulus() {
        return Math.sqrt(realPart * realPart + imagPart * imagPart);
    }

    // the conjugate is simply keep the real part unchanged and times the image part with -1
    // same principle of returning an object is applied
    public Complex conjugate(){
        Complex conjugate = new Complex();
        conjugate.realPart = realPart;
        conjugate.imagPart = imagPart * (-1);
        return conjugate;
    }
    // this is an additional method of my choice which print out the complex number
    public void printNumber(){
        System.out.println(realPart + " + " + imagPart + "i");
    }

    // this is an additional method of my choice which square the complex number
    // the result should be the same with  " object1.times(object1) "
    public Complex squares() {
        Complex square = new Complex();
        square.realPart = realPart * realPart - imagPart * imagPart;
        square.imagPart = 2 * realPart * imagPart;
        return square;
    }
}
