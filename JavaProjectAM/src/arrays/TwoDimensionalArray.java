package arrays;

public class TwoDimensionalArray 
{

	public static void main(String[] args) 
	{
		int a[][]= new int[3][2];  //declaration
		
		//storing values or elements into array
		
		a[0][0]=10;
		a[0][1]=20;
		
		a[1][0]=30;
		a[1][1]=40;
		
		a[2][0]=50;
		a[2][1]=60;
		 
		//classic for loop
		
		for(int i=0; i<=2; i++) // incrementing rows
		{
			for(int j=0; j<=1; j++) //incrementing coloums
			{
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("Program exited");
		System.out.println();
		 //for....each loop
		
		for(int k[]:a)
		{
			for(int l:k)
			{
				System.out.print(l + " ");
			}
			System.out.println();
		}
		System.out.println("Program exited");
		
	
	}

}
