class Test
{
	void m1(int x, String s)
	{
		System.out.println(1);
	}
	void m2(int x, String s)
	{
		System.out.println(2);
	}
	void m1(String tu, int k)
	{
		System.out.println(3);
	}
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.m1(10,"sheeee");
		t.m2(20,"hmmmmm");
		t.m1("sheee",123);	
	}
}