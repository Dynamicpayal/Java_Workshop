class Message
{
	void m1(int b)
	{
		b = 111;
		int a = 101;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args)
	{
		int c = 303;
		System.out.println(c);
		Message m = new Message();
		m.m1(202);
	}
}