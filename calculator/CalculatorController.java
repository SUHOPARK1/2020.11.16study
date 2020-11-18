package calculator;

import bmi.*;
import user.*;

public class CalculatorController {
	
	public int execute(CalculatorDTO param) {
		CalculatorService service = new CalculatorServiceImpl();
		int res = 0;
		String op = param.getOpcode();
		if(op.equals("+")) {
			res = service.add(param);
		}else if(op.equals("-")){
			res = service.minus(param);
		}else if(op.equals("*")){
			res = service.multi(param);
		}else if(op.equals("/")){
			res = service.divid(param);
		}else if(op.equals("%")){
			res = service.modul(param);
		}
		return res;
	}
	public String getBmi(UserDTO user, BmiDTO bmi) {
		
		return String.format("%s님의 BMI지수는 %f",
				user.getName(), service.calcBmi(bmi));
	}
}
