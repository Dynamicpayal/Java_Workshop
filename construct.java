class Test
{
	static void Test()
	{
		System.out.println("Test() Method.......");
	}
	int achhi()
	{
		System.out.println("Return type achhi......");
		return 0;
	}
	Test()
	{
		System.out.println("Test() constructor......");
	}
	public static void main(String[] args)
	{
		Test();
		Test.Test();
		Test t = new Test();
		t.Test();
		t.achhi();
		new Test().Test();
		new Test().achhi();
	}
}
