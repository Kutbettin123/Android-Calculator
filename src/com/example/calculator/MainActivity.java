package com.example.calculator;



import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends ActionBarActivity {

	calculation cal = new calculation();;
	TextView output;
	String op = "";
	
	Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnClear, btnAddiction, btnBackspace, btnDecimal, btnDivide, btnEquals, btnMultiplication, btnPosNeg, btnSubtraction; 
	String num = "";
	String num1 = "";
	String num2 = "";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btn0 = (Button) findViewById(R.id.btn0);
		btn1 = (Button) findViewById(R.id.btn1);
		btn2 = (Button) findViewById(R.id.btn2);
		btn3 = (Button) findViewById(R.id.btn3);
		btn4 = (Button) findViewById(R.id.btn4);
		btn5 = (Button) findViewById(R.id.btn5);
		btn6 = (Button) findViewById(R.id.btn6);
		btn7 = (Button) findViewById(R.id.btn7);
		btn8 = (Button) findViewById(R.id.btn8);
		btn9 = (Button) findViewById(R.id.btn9);
		btnClear = (Button) findViewById(R.id.btnClear);
		btnAddiction = (Button) findViewById(R.id.btnAddiction);
		btnBackspace = (Button) findViewById(R.id.btnBackspace);
		btnDecimal = (Button) findViewById(R.id.btnDecimal);		
		btnDivide = (Button) findViewById(R.id.btnDivide);
		btnEquals = (Button) findViewById(R.id.btnEquals);
		btnMultiplication = (Button) findViewById(R.id.btnMultiplication);
		btnPosNeg = (Button) findViewById(R.id.btnNegPos);
		btnSubtraction = (Button) findViewById(R.id.btnSubtraction);
		
		output = (TextView)findViewById(R.id.txtOutput);
		
		btn0.setOnClickListener(new OnClickListener(){
			
			public void onClick(View arg0){
				
				output.append("0");
				if (num == "" || num == "0"){
					num = "0";
				}
				else{
					num += "0";
				}
					
				
			}
		});//end class listener
		
		btn1.setOnClickListener(new OnClickListener(){
					
			public void onClick(View arg0){
						
				output.append("1");
				if (num == "" || num == "0"){
					num = "1";
				}
				else{
					num += "1";
				}
					
			}
		});//end class listener
		
		btn2.setOnClickListener(new OnClickListener(){
			
			public void onClick(View arg0){
				
				output.append("2");
				if (num == "" || num == "0"){
					num = "2";
				}
				else{
					num += "2";
				}
					
				
			}
		});//end class listener
		
		btn3.setOnClickListener(new OnClickListener(){
			
			public void onClick(View arg0){
				
				output.append("3");
				if (num == "" || num == "0"){
					num = "3";
				}
				else{
					num += "3";
				}
					
			}
		});//end class listener
		
		btn4.setOnClickListener(new OnClickListener(){
			
			public void onClick(View arg0){
				
				output.append("4");
				if (num == "" || num == "0"){
					num = "4";
				}
				else{
					num += "4";
				}
					
			}
		});//end class listener
		
		btn5.setOnClickListener(new OnClickListener(){
			
			public void onClick(View arg0){
				
				output.append("5");
				if (num == "" || num == "0"){
					num = "5";
				}
				else{
					num += "5";
				}
					
			}
		});//end class listener
		
		btn6.setOnClickListener(new OnClickListener(){
			
			public void onClick(View arg0){
				
				output.append("6");
				if (num == "" || num == "0"){
					num = "6";
				}
				else{
					num += "6";
				}
					
			}
		});//end class listener
		
		btn7.setOnClickListener(new OnClickListener(){
			
			public void onClick(View arg0){
				
				output.append("7");
				if (num == "" || num == "0"){
					num = "7";
				}
				else{
					num += "7";
				}
					
			}
		});//end class listener
				
		btn8.setOnClickListener(new OnClickListener(){
			
			public void onClick(View arg0){
				
				output.append("8");
				if (num == "" || num == "0"){
					num = "8";
				}
				else{
					num += "8";
				}
					
			}
		});//end class listener
		
		btn9.setOnClickListener(new OnClickListener(){
			
			public void onClick(View arg0){
				
				output.append("9");
				if (num == "" || num == "0"){
					num = "9";
				}
				else{
					num += "9";
				}
					
			}
		});//end class listener
		
		btnClear.setOnClickListener(new OnClickListener(){
			
			public void onClick(View arg0){
				
				output.setText("");
				num = "";
				num1 = "";
				num2 = "";
			}
		});//end class listener
		
		btnBackspace.setOnClickListener(new OnClickListener(){
			
			public void onClick(View arg0){
				if (num.length() >= 1){
					num = num.substring(0, num.length() -1);
					if (op == ""){
						printNum1(num);
					}
					else if(op == ""){
						printNum2(num1, num, op);
					}
					else {
						op = "";
						printOp(num, op);
					}
				
				}
				
			}
		});//end class listener
		
		btnAddiction.setOnClickListener(new OnClickListener(){
			
			public void onClick(View arg0){
				if (num != "" && op ==""){
				op = "+";
				output.append("+");							
				num1 = num;	
				num = "";
				}
			}
		});//end class listener
		
		btnDivide.setOnClickListener(new OnClickListener(){
			
			public void onClick(View arg0){
				if (num != "" && op == ""){
				op = "/";
				output.append("/");
				num1 = num;	
				num = "";
				}	
			}
		});//end class listener
		
		btnMultiplication.setOnClickListener(new OnClickListener(){
			
			public void onClick(View arg0){
				if (num != "" && op ==""){
				op = "*";
				output.append("*");
				num1 = num;	
				num = "";
				}
			}
		});//end class listener
		
		btnSubtraction.setOnClickListener(new OnClickListener(){
			
			public void onClick(View arg0){
				if (num != "" && op == ""){
				op = "-";
				output.append("-");
				num1 = num;	
				num = "";
				}
			}
		});//end class listener
		
		btnDecimal.setOnClickListener(new OnClickListener(){
			
			public void onClick(View arg0){
				if (num != ""){
				output.append(".");
				num += ".";
				}
			}
		});//end class listener
		
		btnEquals.setOnClickListener(new OnClickListener(){
			
			public void onClick(View arg0){
				Double answer;
				String sAnswer;
				num2 = num;
				if (num1 != "" && op != "" && num2 != ""){
					if (num2 == "0" && op == "/"){
						output.setText("NaN");
					}
					
					
					answer = cal.calculate(num1, num2, op);
					sAnswer = answer.toString();
					output.setText(sAnswer);
					num = "";
					num1 = "";
					num2 = "";
					op = "";
				}
			}
		});//end class listener
		
		btnPosNeg.setOnClickListener(new OnClickListener(){
			
			public void onClick(View arg0){
				
				if (num != ""){
					
					double posNeg = Double.parseDouble(num);
					
					posNeg = posNeg * -1;
					num = String.valueOf(posNeg);

					if (op == ""){
						printNum1(num);
					}
					else{
						printNum2(num1, num, op);
					}
				
				}
				
						
			}
		});//end class listener
		
		
		
	}
	
	public void printNum1(String num1){
		
		output.setText(num1);
		
	}
	
	public void printOp(String num1, String op){
		output.setText(num1 + op);
	}
	
	public void printNum2(String num1, String num2, String op){
		
		output.setText(num1 + op + num2);
		
	}

	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
