package overloading;

public class MethodOverloading1 
{
	int a;
	int b;
	
	void sum()  // first
	{
		a=10;
		b=20;
		System.out.println(a+b);
	}
	
	void sum(int a, int b)  // (int x, int y) //second
	{
		this.a=a;  // int a= x
		this.b =b;  //int b=y
		System.out.println(a+b);
	}
	
	void sum(int x, int y, int z) //third
	{ 
		System.out.println(x+y+z);
	}
	
	 void sum(int x, double y) //fourth
	{
		System.out.println(x+y);
	}

	public static void main(String[] args) 
	{
		
		MethodOverloading1 mo =new MethodOverloading1();
		mo.sum();  //call first method
		mo.sum(100, 200); //call second method
		mo.sum(10, 20, 30); //call third method
		mo.sum(10, 10.5); //call fourth method
	}

}
