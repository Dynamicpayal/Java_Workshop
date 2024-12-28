class P 
{
	void m1()
	{
		System.out.println("m1() method of Parent Class");
	}
	void m2()
	{
		System.out.println("m2() method od Parent Class");
	}
}
class C extends P
{
	void m1()
	{
		System.out.println("m1() method of child class");
	}
	void m3()
	{
		System.out.println("m3() method of child class");
	}
}
class Test
{
	public static void main(String[] args) {
		P p = new C();
		p.m1();
		p.m2();
		//p.m3();
	}
}