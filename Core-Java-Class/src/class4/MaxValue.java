package class4;

public class MaxValue {

	public static void main(String[] args) {
		int ar[] = {1,232,2,300,4,5,6,8,44};
		
		int max = 0;
		
		for(int i=0;i<ar.length;i++) {
			
			if(max<ar[i]) 
			{
				max  = ar[i];
			}
		}
		
		System.out.println(max);

	}

}
