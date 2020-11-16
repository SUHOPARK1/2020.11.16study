package day02;

import java.util.Scanner;
import day02.BMI;


public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BMI height = new BMI();	
		BMI weight = new BMI();
				
		
		System.out.println("키");
		double getHeight = scanner.nextDouble();
		
		System.out.println("몸무게");
		double getWeight = scanner.nextDouble();
		
		double BMI = getWeight/getHeight/getHeight;
		
		System.out.printf("%.2f입니다.",BMI);
		
		scanner.close();
		
		
		
		
	}

}
