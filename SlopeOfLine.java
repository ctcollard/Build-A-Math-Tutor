/*
* Title of Class: SlopeOfLine
* Author's Name: Charlotte Collard
* Purpose: To take two user-inputted points on the x-y plane and provide the slope of the line between those points.
*
* Resources:
*
*/
import java.util.Scanner;

public class SlopeOfLine {
    private double y1;
    private double y2;
    private double x1;
    private double x2;

    public SlopeOfLine() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the x-coordinate of your first point: ");
        x1 = input.nextDouble();
        System.out.println("Please input the y-coordinate of your first point: ");
        y1 = input.nextDouble();
        System.out.println("Please input the x-coordinate of your second point: ");
        x2 = input.nextDouble();
        System.out.println("Please input the y-coordinate of your second point: ");
        y2 = input.nextDouble();
        input.close();
    }

    public double solveSlopeOfLine(){
        double changeInY = y2 - y1;
        double changeInX = x2 - x1;
        return changeInY/changeInX;
    }
}
