package interfaces;

final class Test{
	final int a =10;
	
	final void m1() {
		//a=20; //not valid because a is final variable
		System.out.println(a);
	}
}

/*class Test123 extends Test // not valid because class Test is final
{

	/*void m1() // not valid because m1 is final method
	{
		System.out.println("m1 is overridden");
	}
}*/

public class FinalExample {

	public static void main(String[] args) {
		

	}

}
