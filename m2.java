class Message
{
	void method1()
	{
		method2();
		System.out.println("Method1() method...");
	}
	void method2()
	{
		method3();
		System.out.println("Method2() method...");
	}
	void method3()
	{
		System.out.println("Method3() method...");
	}
	public static void main(String[] args)
	{
		Message m = new Message();
		m.method1();
	}
}