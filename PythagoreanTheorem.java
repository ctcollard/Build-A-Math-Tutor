/*
* Title of Class
* Author's Name
* Purpose
*
* Resources:
*
*/
import java.util.Scanner;

public class PythagoreanTheorem {
    private double a;
    private double b;
    // add other private members if necessary

    public PythagoreanTheorem() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a your first side length: ");
        a = input.nextDouble();
        System.out.println("Please input a your second side length: ");
        b = input.nextDouble();
        input.close();
        // add your code here
    }

    public double solvePythagoreanTheorem(){
        double aSquare = Math.pow(a,2);
        double bSquare = Math.pow(b,2);
        double cSquare = Math.sqrt(aSquare + bSquare);
        return Math.sqrt(cSquare);
        // add your code here
    }
}
