package calculator;

public class CalculatorServiceImpl implements CalculatorService {

	public int add(CalculatorDTO calculator){
		
		return calculator.getNum1() + calculator.getNum2();
		
	}

	public int minus(CalculatorDTO calculator){
		return calculator.getNum1() - calculator.getNum2();
		
	}

	public int multi(CalculatorDTO calculator){
		return calculator.getNum1() * calculator.getNum2();
		
	}

	public int divid(CalculatorDTO calculator){
		return calculator.getNum1() / calculator.getNum2();
		
	}
	
	public int modul(CalculatorDTO calculator) {
		return calculator.getNum1() % calculator.getNum2();
	}

}
