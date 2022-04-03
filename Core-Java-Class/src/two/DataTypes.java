package two;

public class DataTypes {

	// Boolean Data Types
	boolean bool = false;
	
	//Character Data Types
	char ch = 'a';
	
	//Integral Data Types
	byte b= 125;
	short s = 257;
	int i  =30808;
	long l = 8787878787887878l;
	
	//Floating Points Data Types
	float f = 122.444f;
	double d = 4.398238432982309;
	
	
	public static void main(String[] args) {
		
		DataTypes dt = new DataTypes();
		System.out.println(Integer.SIZE);
		
		System.out.println(dt.b+dt.ch+" "+((int)dt.ch));
		
		dt.b = (byte) dt.s;
		
		System.out.println(dt.b);
		dt.l = dt.i;
		
		dt.i = (int) dt.ch;
		
		String s = "1";
		
		dt.bool = Boolean.valueOf(s);
		System.out.println(dt.bool);
		
		dt.i = Integer.valueOf(s);
		System.out.println(dt.i++);
		System.out.println(dt.i*dt.i);
	}
}
