package viewer;
import java.util.Scanner;

import bmi.*;
import user.*;
import calculator.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		BmiDTO bmi = new BmiDTO();
		BmiController controller = new BmiController();	
		CalculatorController calculatorController = new CalculatorController();
		UserDTO user = new UserDTO();
		System.out.println("0. 종료 1. 계산기 2. BMI");
		switch(scanner.next()) {
		case"1":
			System.out.println("계산기 시작");
			System.out.println("수 입력");
			calculator.setOpcode(scanner.nextInt());
			
		}
		
	
		System.out.println("BMI 시작");
		System.out.println("이름입력: ");
		user.setName(scanner.next());		
		
		System.out.println("키 입력");
		bmi.setHeight(scanner.nextDouble());			
		
		System.out.println("몸무게 입력");
		bmi.setWeight(scanner.nextDouble());
		
		String bmiResult = controller.getBmi(user, bmi);
		
		scanner.close();
	}
	
	
		
	
}
