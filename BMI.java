package MyProjects;

import java.util.*;

public class BMI {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int feet, inches, weight, height;
		double bmi;

		System.out.println("This program will calculate your BMI based on your height and weight. ");
		System.out.println("Enter your height (feet): ");
		feet = kb.nextInt();

		System.out.println("Now Enter the remaining inches of your height: ");
		inches = kb.nextInt();

		System.out.println("Now enter your weight in pounds: ");
		weight = kb.nextInt();

		height = ((feet * 12) + inches);
		bmi = ((weight * 703) / (height * height));

		if (bmi < 18.5) {
			System.out.println("Your BMI is: " + bmi + " which indicated that you are \"Underweight\".");
		} else if (bmi > 18.5 && bmi < 24.9) {
			System.out.println("Your BMI is: " + bmi + " which indicated that you are at a \"Normal\" weight.");
		} else {
			System.out.println("Your BMI is: " + bmi + " which indicated that you are \"Overweight\".");
		}

	}

}
