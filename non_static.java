class Test
{
	int x = 10;
	void m1()
	{
		System.out.println(x);
		//System.out.println(Test.x); // error
		Test t = new Test();
		System.out.println(t.x);
	}
	Test()
	{
		System.out.println(x);
	}
	static void m2()
	{
		//System.out.println(x); // error
		Test t = new Test();
		System.out.println(t.x);
	}
	static
	{
		//System.out.println(x);
		Test t = new Test();
		System.out.println(t.x);
	}
}