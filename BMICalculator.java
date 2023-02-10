/*
 * @class: BMICalculator
 * @author: Hugo Padilla
 * @course: ITEC 2140 - 05, Spring 2023
 * @version: 1.0
 * @date: February 9th, 2023
 * @description: This program takes user-inputted data about height, and weight.
 * It will then return their BMI, as well as their BMI Interpretation.
 */
package TextbookHomework3;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weightPounds = input.nextDouble(); // I use double because I know that I'm going to need the real numbers later.
        System.out.print("Enter height in inches: ");
        double heightInches = input.nextDouble(); 
        input.close();

        double weightKg = weightPounds * 0.4536;
        double heightM = heightInches * 0.0254;
        double bmi = weightKg/(heightM * heightM);

        String interpretation;

        if (bmi < 18.5){
            interpretation = "Underweight";
        } else if (bmi >= 18.5 && bmi < 25.0) {
            interpretation = "Normal";
        } else if (bmi >= 25.0 && bmi < 30.0 ){
            interpretation = "Overweight";
        } else if (bmi >= 30.0){
            interpretation = "Obese";
        } else {
            interpretation = "error"; // while troubleshooting my code, i would get an error of an uninitialized interpretation.
            // to fix this I gave interpretation an obsolete value in every conditional statement.
            System.out.println("INVALID"); // This segment of code may also not be needed, but I added an extra precautionary level in case something went wrong.
        }
        // System.out.println(interpretation); // I used this to troubleshoot my code.
        System.out.println("Your BMI is: " + bmi + ", which would be considered " + interpretation);
     }
}