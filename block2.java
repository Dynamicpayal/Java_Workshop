class Test
{
	Test()
	{
		System.out.println("Test() constructor");
	}
	{
		System.out.println("non static block-1");
	}
	public static void main(String[] args) 
	{
		new Test();
		new Test();
	}
	{
		System.out.println("nonstatic block-2");
	}
}