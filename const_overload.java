class Test
{
	Test()
	{
		System.out.println("Test() constructor with 0-arg");
	}
	Test(int x)
	{
		System.out.println("Test() constructor with 1-arg");
	}
	Test(String s, double d)
	{
		System.out.println("Test() constructor with 2-args");
	}
	public static void main(String[] args) 
	{
		new Test();
		new Test(100);
		new Test("andha", 4.2);
	}
}