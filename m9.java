class Message
{
	Message method1()
	{
		System.out.println("method1() method...");
		Message msg = new Message();
		return msg;
	}
	Message method2()
	{
		System.out.println("method2() method...");
		// Message msg = new Message();
		return new Message();
	}
	Message method3()
	{
		System.out.println("method3() method...");
		// Message msg = new Message();
		return this;
	}
	public static void main(String[] args) 
	{
		Message m = new Message();
		Message obj1 = m.method1();	
		System.out.println("method1() method returns value = "+obj1);
		Message obj2 = m.method2();
		System.out.println("method2() method returns value = "+obj2);
		Message obj3 = m.method3();
		System.out.println("method3() method returns value = "+obj3);
	}
}