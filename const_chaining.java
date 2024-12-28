class Test
{
	Test()
	{
		this(101);
		System.out.println("Test() constructor with 0-arg");
	}
	Test(int x)
	{
		this("Gaba", 3.2);
		System.out.println("Tes() constructor with 1-arg");
	}
	Test(String s, double d)
	{
		System.out.println("Test() constructor with 2-args");
	}
	public static void main(String[] args) 
	{
		new Test();
	}
}