package com.example.calculator;

public class calculation {
	
	public double calculate(String firstNum, String secondNum, String operator){
		
		double num1 = Double.parseDouble(firstNum);
		double num2 = Double.parseDouble(secondNum);

		
		if(operator == "+"){
			
			return num1 + num2;
			
		}
		
		if(operator == "-"){
			
			return num1 - num2;
			
		}
		
		if(operator == "*"){
			
			return num1 * num2;
			
		}
		
		if(operator == "/"){
			
			return num1/num2;
			
		}
		
		return 0;
		
		
	}//end calculate method

}
