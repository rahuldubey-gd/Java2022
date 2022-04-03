package class3;

public class ControlStatements {

	//Declaration 
	int a;
	//Declaration And Initialization
	int b = 10;
	
	public static void main(String[] args) {
		ControlStatements ob = new ControlStatements();
		ob.forLoopTest();
		ob.ifElseTest();
		ob.whileTest();
		ob.doWhileLoopTest();
	}

	
	public void forLoopTest() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello Good Afternoon");
		}
		
		for(int i=0;i<5;i++) {
			System.out.println("Hello Good Afternoon  "+i);
		}
		
	}
	
	public void ifElseTest() {
		int age =87;
		if(age<18) {
			System.out.println("Not Applicable for Driving License");
		}
		else if(age>80){
			System.out.println("Not Applicable for Driving License");
		}
		else
		{
			System.out.println("Applicable for Driving License");
		}
		
	}
	
	public void whileTest() {
		int over = 1;
		while(over<=20) {
			System.out.println("Match is running "+over);
			over++;
		}
	}
	
	public void doWhileLoopTest() {
		int over = 0;
		do {
			System.out.println("Batsman is playing "+over);
			over++;
		}
		while(over<=20 && over>1);
	}
	
	
}
