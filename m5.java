class Test
{
	void m1(int x)
	{
		System.out.println("m1() method...");
		System.out.println("The value of x = "+x);
	}
	static void m2(String s, double d)
	{
		System.out.println("m2() method...");
		System.out.println("The value of s = "+s);
		System.out.println("The value of d = "+d);
	}
	void m3(char c, boolean b, short s)
	{
		System.out.println("m3() method...");
		System.out.println("The value of c = "+c);
		System.out.println("The value of b = "+b);
		System.out.println("The value of s = "+s);
	}
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.m1(101);
		System.out.println();
		Test.m2("harhar",7.8);
		System.out.println();
		t.m3('K',true,(short)30);	
	}
}