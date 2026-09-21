/*
* Title of Class: AreaOfCircle
* Author's Name: Charlotte Collard
* Purpose: To take a user-inputted radius length and produce the area of a circle with that radius.
*
* Resources:
*
*/
import java.util.Scanner;

public class AreaOfCircle {
    private double r;

    public AreaOfCircle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the radius length: ");
        r = input.nextDouble();
        input.close();
    }

    public double solveAreaOfCircle(){
        double rSquare = Math.pow(r,2);
        return Math.PI*rSquare;
    }
}
