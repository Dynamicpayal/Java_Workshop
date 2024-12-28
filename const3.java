class Test
{
	int x = 100;
	static Test t1;
	Test t2;
	public static void main(String[] args) 
	{
		Test t3;
		System.out.println(t1); // null
		System.out.println(Test.t1); // null
		System.out.println(new Test().t1); // null
		//System.out.println(t1.t2); // NullPointerException
		System.out.println(new Test().t2); // null
		//System.out.println(t3); // variable t3 might not have been initialized
		t3 = t1;
		System.out.println(t3); // null
		//System.out.println(t1.x+" "+new Test().t2.x+" "+t3.x); // NullPointerException
		System.out.println("************");

		t1 = new Test();
		System.out.println(t1); // Test@2c7b84de
		System.out.println(Test.t1); // Test@2c7b84de
		System.out.println(new Test().t1); // Test@2c7b84de

		t1.t2 = new Test();
		System.out.println(t1.t2); // Test@3fee733d

		t3 = new Test();
		System.out.println(t3); // Test@5acf9800

		System.out.println(t1.x+" "+t1.t2.x+" "+t3.x); // 100 100 100
	}
}