package class3;

public class ArrayTest {

	public static void main(String[] args) {
		
		ArrayTest ob = new ArrayTest();
//		ob.array_1();
//		ob.array_2();
		ob.array_3();
	}
	
	
	public void array_1() {
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(a);
		// For Each
		for(int a1:a) {
			System.out.println(a1);
		}
	
	}
	
	
	public void array_2() {
		// Array Creation Declaration Initialization

		int a[];// Array Creation
		a = new int[5]; // Array Declaration
		// Array Initialization
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;

//				System.out.println(a);
//				System.out.println(ob);
		for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	
	public void array_3() {
		int[][] a1= {{1,2,3,4,5}, {11,22,33,44,55},{111,222,333,444,555},{22,22,222,222,222}};
		float[]a2= new float[5];
		
		System.out.println(a1[3].length);
		System.out.println(a2.length);
		
		System.out.println(a1[3][2]);
		ArrayTest ob = new ArrayTest();
		System.out.println(a1.getClass().getName()+"      "+a2.getClass().getName()+"    "+ob.getClass().getName());
		System.out.println(ob.getClass()+"@"+ob.hashCode());
		
	}


	@Override
	public String toString() {
		return "My Name is Rahul";
	}


	
	
	

}
