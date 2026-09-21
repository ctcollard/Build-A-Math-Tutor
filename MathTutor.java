//package Build-A-Math-Tutor;
import java.io.IOException;

/*
 * Title of Project: Build A Math Tutor
 * Author’s Name: Charlotte Collard
 * Purpose: To write methods to solve simple math problems with user input.
 *
 * Resources :
 *
 */

import java.util.Scanner;
public class MathTutor {
    public static void main ( String [] args ) throws IOException
{
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Math Tutor!" + "\n");
    System.out.println("Choose an option: Pythagorean theorem (enter 1), area of a circle (enter 2), or slope of a line between two points (enter 3)."+ "\n");
    int userInput = input.nextInt();


  if ( userInput ==1) {
PythagoreanTheorem myPythagoreanTheorem = new PythagoreanTheorem();
double pythagoreanResult = myPythagoreanTheorem.solvePythagoreanTheorem();
System.out.println("The hypotenuse is " + pythagoreanResult);

 }
 if ( userInput ==2) {
AreaOfCircle myAreaOfCircle = new AreaOfCircle();
double areaOfCircleResult = myAreaOfCircle.solveAreaOfCircle();
System.out.println("The area is " + areaOfCircleResult);
 }
 if ( userInput ==3) {
SlopeOfLine mySlopeOfLine = new SlopeOfLine();
double slopeOfLineResult = mySlopeOfLine.solveSlopeOfLine();
System.out.println("The slope is " + slopeOfLineResult);
 }  

}
