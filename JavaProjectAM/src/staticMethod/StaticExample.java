package staticMethod;

public class StaticExample {
	
	int a; //non static 
	static int b; //static

	static void m1() //static method
	{
		System.out.println("This is static method");
	}
	
	void m2() //non static method
	{
		System.out.println("This is non static method");
	}
	
	

	public static void main(String[] args) // static method
	{
//static methods can access static stuff only..(Direct)
		b=100;
		System.out.println(b);
		m1();
		
		//a=200;  we can not call  int a..(non static)
		//m2();  we can not call  m2..(non static)
		
		
//static methods can also access non static stuff but through object.. 
		StaticExample se= new StaticExample();
		se.a =200;
		System.out.println(se.a);
		se.m2();
	}

}
