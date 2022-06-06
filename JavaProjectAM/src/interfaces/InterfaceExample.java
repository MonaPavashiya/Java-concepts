package interfaces;

interface Testinterface
{
	int a =10; //by default variable is static and final
	void display(); // abstract method
}

public class InterfaceExample implements Testinterface 
{

	public void display() 
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) 
	{

		//Testinterface ie =new Testinterface(); // it can not instantiate
		Testinterface ie =new InterfaceExample();
		ie.display();


	}

}
