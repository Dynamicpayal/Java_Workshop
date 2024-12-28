class Test
{
	void show()
	{
		System.out.println("show() method");
	}
	Private Test() {}
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.show();
	}
}