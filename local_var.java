class Test
{
	void m1(int d)
	{
		int a = 10;
		//System.out.println(Test.a);// error
		Test obj = new Test();
		//System.out.println(obj.a);// error
		System.out.println(a);
		//int c; // error because variable c might not have been intialized
		//System.out.println(c);
		System.out.println(d);
		final int k;
		//static int m;//error
	}
	Test()
	{
		int b = 20;
		System.out.println(b);
	}
	 static()
	{
		int c = 10;
		System.out.println(c);
	}
}