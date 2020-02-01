package Rodriguez_p2;

import java.util.Scanner;

public class BMICalculator {
	//Made scanner a class variable so all methods can use it.
	private static Scanner scan = new Scanner(System.in);
	
	//Main simply being the method chain
	public static void main(String[] args) {
		readUserData();
	}
	
	//readUserData will lead to readUnitType
	public static void readUserData() {
		readUnitType();
	}
	
	//ReadUnitType will get the user's desired measurement choice then pass on that to readMeasurementData
	private static void readUnitType() {
	
		System.out.printf("%nChoose Imperial(1) or Metric(2): ");
		int choice = scan.nextInt();
		
		readMeasurementData(choice);
	}
	
	//This method will redirect the user to the correct function based off of their choice
	private static void readMeasurementData(int choice) {
		
		if(choice == 1) {
			readImperialData(choice);
		}
		else if(choice == 2) {
			readMetricData(choice);
		}
		//Error check in case they choice anything other than 1 or 2 closes program if true
		else {
			System.out.println("Wrong input!");
		}
	}
	
	//Take the user input as imperial measurements then leads to the calculation method
	private static void readImperialData(int choice) {
		double weight, height;
		
		System.out.printf("%nEnter your weight in pounds: ");
		weight = scan.nextDouble();
		System.out.printf("%nEnter your height in inches: ");
		height = scan.nextDouble();
		
		calculateBmi(choice,weight,height);
	}
	
	//Take the user input as metric measurements then leads to the calculation method
	private static void readMetricData(int choice) {
		double weight, height;
		
		System.out.printf("%nEnter your weight in KG: ");
		weight = scan.nextDouble();
		System.out.printf("%nEnter your height meters: ");
		height = scan.nextDouble();
		
		calculateBmi(choice,weight,height);
	}
	
	//Checks to make sure no value is negative then calculates BMI, after leads to the category method
	private static void calculateBmi(int choice, double weight, double height) {
		double bmi;
		
		//checks for negative input and closes program if true
		if(weight < 0 || height < 0) {
			System.out.printf("%nYou eneterd a negative value!!! Exiting program!!!");
			return;
		}
		
		if(choice == 1) {
			bmi = (703 * weight) / (height * height);
		}
		else {
			bmi = weight / (height * height);
		}
		calculateBmiCategory(bmi);
	}
	
	//Determines which category the user fits into and displays it.
	private static void calculateBmiCategory(double bmi) {
		if(bmi < 18.5) {
			System.out.printf("%nYour BMI Category is Underweight since your BMI is %.1f",bmi);
		}
		else if(bmi == 18.5 || bmi <= 24.9) {
			System.out.printf("%nYour BMI Category is Normal weight since your BMI is %.1f",bmi);
		}
		else if(bmi == 25 || bmi <= 29.9) {
			System.out.printf("%nYour BMI Category is Overweight since your BMI is %.1f",bmi);
		}
		else if(bmi >= 30) {
			System.out.printf("%nYour BMI Category is Obesity since your BMI is %.1f",bmi);
		}
	}
}