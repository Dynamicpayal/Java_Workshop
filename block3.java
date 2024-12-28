class Message
{
	static
	{
		System.out.println(3);
		Message m = new Message();
		m.m1(111, 222);
	}
	void m1(int a, int b)
	{
		System.out.println("Addition = "+(a+b));
	}
	{
		System.out.println(4);
	}
	Message()
	{
		System.out.println(1);
	}
	public static void main(String[] args) 
	{
		System.out.println(2);
		Message m = new Message();
		m.m1(100,200);
	}
	static
	{
		System.out.println(5);
	}
	{
		System.out.println(6);
	}
}