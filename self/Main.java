package self;

import java.util.Scanner;
import self.Calculator;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator cal = new Calculator();
		
		
		System.out.println("1번째 숫자");
		int num1 = scanner.nextInt();
		
		System.out.println("2번째 숫자");
		int num2 = scanner.nextInt();
		
		System.out.println("합: ", cal(int num1+int num2));
		System.out.println(cal.(setNum1+setNum2));
		
		
		
		
		
		
	}

}
