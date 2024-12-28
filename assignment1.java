class Test
{
	static String s = "Kichhi";
	int b = 10;
	void m1()
	{
		System.out.println(s);
		System.out.println(Test.s);
		System.out.println(b);
		Test t = new Test();
		System.out.println(t.s);
		System.out.println(t.b);
		//System.out.println(Test.b); // error
	}
	static void m2()
	{
		System.out.println(s);
		System.out.println(Test.s);
		//System.out.println(b); // error
		//System.out.println(Test.b); // error
		Test t = new Test();
		System.out.println(t.s);
		System.out.println(t.b);
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		t.m2();
	}
}