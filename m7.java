class Test
{
	void m1()
	{
		System.out.println("m1() method...");
	}
	static int m2()
	{
		System.out.println("m2() method...");
		return 10;
	}
	double m3()
	{
		System.out.println("m3() method...");
		return 3.5;
	}
	boolean m4()
	{
		System.out.println("m4() method...");
		return true;
	}
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.m1();
		System.out.println("m1() method doesn't return any value");
		System.out.println();
		int a = Test.m2();
		System.out.println("m2() method return value = "+a);
		System.out.println();
		double d = t.m3();
		System.out.println("m3() method return value = "+d);
		boolean bool = t.m4();
		System.out.println("m4() method return value = "+bool);	
	}
}