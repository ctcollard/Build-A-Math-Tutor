package Build-A-Math-Tutor;
/*
 * Title of Project
 * Author ’s Name
 * Purpose
 *
 * Resources :
 *
 */

import java . util . Scanner ;
public class MathTutor {
    public static void main ( String [] args ) throws IOException
{
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Math Tutor!" + "\n");
    System.out.println("Choose an option: Pythagorean theorem (enter 1), area of a circle (enter 2), or slope of a line between two points (enter 3)."+ "\n");
    int userInput = input.nextInt();
  if ( userInput ==1) {
Problem1 problem = new Problem1 () ;
 problem . solver () ;
 }
 if ( userInput ==2) {
 Problem2 problem = new Problem2 () ;
 problem . solver () ;
 }
 if ( userInput ==3) {
 Problem3 problem = new Problem3 () ;
 problem . solver () ;
 }  
}
}
