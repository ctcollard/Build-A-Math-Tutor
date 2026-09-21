/*
* Title of Class: PythagoreanTheorem
* Author's Name: Charlotte Collard
* Purpose: To take two user-inputted side lengths and output the hypotenuse of a right triangle.
*
* Resources:
*
*/
import java.util.Scanner;

public class PythagoreanTheorem {
    private double a;
    private double b;
    private double t;

    public PythagoreanTheorem() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input your first side length: " );
        a = input.nextDouble();
        System.out.println("Please input your second side length: ");
        b = input.nextDouble();
        input.close();
        
    }

    public double solvePythagoreanTheorem(){
        t = 2.0;
        double aSquare = Math.pow(a,t);
        double bSquare = Math.pow(b,t);
        double cSquare = Math.sqrt(aSquare + bSquare);
        return cSquare;
       
      
    }
}
