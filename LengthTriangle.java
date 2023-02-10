/*
 * @class: LengthTriangle
 * @author: Hugo Padilla
 * @course: ITEC 2140 - 05, Spring 2023
 * @version: 1.0
 * @date: February 9th, 2023
 * @description: This program will determine whether or not 
 * a triangle is valid by using 3 user-inputed side lengths.
 */
package TextbookHomework3;

import java.util.Scanner;

public class LengthTriangle {
    public static void main(String[] args){
        Scanner lengths = new Scanner(System.in);
        System.out.print("Enter side length 1: ");
        int side1 = lengths.nextInt();
        System.out.print("Enter side length 2: ");
        int side2 = lengths.nextInt();
        System.out.print("Enter side length 3: ");
        int side3 = lengths.nextInt();
        lengths.close();
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) { // This if-statement decides if a triangle is valid.
            int perimeter = side1 + side2 + side3; // Calculates the perimeter.
            System.out.println("The perimeter of the triangle is " + perimeter + ".");
          } else {
            System.out.println("Invalid Input: Cannot form triangle.");
          }
    }
}

