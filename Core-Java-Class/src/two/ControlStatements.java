package two;

import java.io.Console;

public class ControlStatements {

	boolean isApplicableForLicense(int  age) {
		
		if(age>18) {
			return true;
		}
		else if(age>75) {
			return false;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		Console console = System.console();
		
		int age = Integer.parseInt(console.readLine());
		
		ControlStatements cs = new ControlStatements();
		boolean licenseApplicable = cs.isApplicableForLicense(age);

		if(licenseApplicable==true) {
			System.out.println("You are Eligible to Apply for License");
		}
		else {
			System.out.println("You are Not Eligible to Apply for License");
		}
		
	}
	
	public void calculator()
	{
		int a,b,c;

		while(true)
		{
		System.out.println("Please Select an Operation");
		System.out.println("Select 1 for Addition - ");
		System.out.println("Select 2 for Subtraction - ");
		System.out.println("Select 3 for Multilication - ");
		System.out.println("Select 4 for Division - ");
		System.out.println("Select 5 for Exit- ");
		
		Console console = System.console();
		int operation = Integer.parseInt(console.readLine());
		
		switch(operation)
		{
		case 1:
			System.out.println("Please Enter value of A: ");
			a = Integer.parseInt(console.readLine());
			System.out.println("Please Enter value of B: ");
			b = Integer.parseInt(console.readLine());
			c = a+b;
			System.out.println("Addition Result - "+c);
			break;
		case 2:
			System.out.println("Please Enter value of A: ");
			a = Integer.parseInt(console.readLine());
			System.out.println("Please Enter value of B: ");
			b = Integer.parseInt(console.readLine());
			c = a-b;
			System.out.println("Substraction Result - "+c);
			break;
		case 3:
			System.out.println("Please Enter value of A: ");
			a = Integer.parseInt(console.readLine());
			System.out.println("Please Enter value of B: ");
			b = Integer.parseInt(console.readLine());
			c = a*b;
			System.out.println("Multiplication Result - "+c);
			break;
		case 4:
			System.out.println("Please Enter value of A: ");
			a = Integer.parseInt(console.readLine());
			System.out.println("Please Enter value of B: ");
			b = Integer.parseInt(console.readLine());
			c = a/b;
			System.out.println("Division Result - "+c);
			break;
		case 5: System.exit(0);
		default : System.out.println("*****************   Please Seclect Correct Operation  ************************");
		}
		}	
	}
	
	public void inputForCal()
	{
		Console console = System.console();
		System.out.println("Please Enter value of A: ");
		int a = Integer.parseInt(console.readLine());
		System.out.println("Please Enter value of B: ");
		int b = Integer.parseInt(console.readLine());
	}

}
