package com.functional;
import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.print(" Please enter value of temperature(in Fahrenheit)  ");
	double t = scan.nextDouble();
	if(t > 50) {
		System.out.println(" Please enter the temperature value less than 50 F");
		scan.close();
		return;
	}
	System.out.print(" Please enter the value of wind speed(in miles per hour)): ");
	
	double v = scan.nextDouble();
	if(v > 120 || v < 3) {
		System.out.println(" Please enter a velocity value that is between 3 and 120");
		scan.close();
		return;
	}
	
	double wind = 35.74 + 0.6215*t + (0.4275*t - 35.75)*Math.pow(v, 0.16);
	
	System.out.println(" The wind speed is: " + wind);
	scan.close();
}
}

