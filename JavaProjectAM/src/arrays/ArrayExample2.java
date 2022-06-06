package arrays;

public class ArrayExample2 
{

	public static void main(String[] args) 
	{
		String s[]=new String[3];
		
		s[0]="Welcome";
		s[1] = "To";
		s[2] = "Training";
		
		System.out.println(s.length); //returns length of an array
		
		for(String i:s) //will read elements
		{
			System.out.println(i);
		}

	}

}
