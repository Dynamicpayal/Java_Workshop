class Test
{
	void add(int a, int b)
	{
		System.out.println("add() method");
		System.out.println("Addition = "+(a+b));
	}
	Test(int a, int b)
	{
		System.out.println("Test() constructor");
		System.out.println("Subtraction = "+(a-b));
	}
	public static void main(String[] args) 
	{
		new Test(100, 10).add(100,10);
	}
}