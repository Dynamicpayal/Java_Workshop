class Test
{
	static void m1()
	{
		System.out.println("m1() method...");
	}
	void m2()
	{
		System.out.println("m2() method...");
	}
	public static void main(String[] args)
	{
		m1();
		Test.m1();
		Test t = new Test();
		t.m1();
		t.m2();
	}
}