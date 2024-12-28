class Test
{
	static void method1()
	{
		System.out.println("m1() method...");
	}
	void m2()
	{
		System.out.println("m2() method...");
	}
	static void m3()
	{
		System.out.println("m3() method...");
	}
	void m4()
	{
		System.out.println("m4() method...");
	}
	void m1()
	{
		method1();
		m3();
		Test.method1();
		Test.m3();
		Test t = new Test();
		t.method1();
		t.m3();
		t.m2();
		t.m4();
	}
	public static void main(String[] args) 
	{
		Test nian = new Test();	
		Test.method1();
		Test.m3();
		nian.m2();
		nian.m4();
	}

}