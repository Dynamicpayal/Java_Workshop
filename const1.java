class Test
{
	static void test()
	{
		System.out.println("Test() method");
	}
	Test()
	{
		System.out.println("Test() constructor");
	}
	public static void main(String[] args) 
	{
		test();
		Test.test();
		new Test().test();
		// t.test();
	}
}