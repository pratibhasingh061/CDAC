package in.com.oops;
import java.io.*; 

class program6
{ 
	public static double BMI(double height, double weight) 
	{ 
		double bmi = weight / Math.pow(height, 2); 
		return bmi; 
	} 
	 
	public static void main(String[] args) 
	{ 
		double height = 1.79832; 
		double weight = 70; 
		
		  
		double bmi = BMI(height, weight); 
		System.out.print("The BMI is " + bmi + " so "); 
		
		 
		if (bmi < 18.5) 
			System.out.print("underweight"); 

		else if (bmi >= 18.5 && bmi < 24.9) 
			System.out.print("Healthy"); 

		else if (bmi >= 24.9 && bmi < 30) 
			System.out.print("overweight"); 

		else if (bmi >= 30) 
			System.out.print("Suffering from Obesity"); 
	} 
} 



