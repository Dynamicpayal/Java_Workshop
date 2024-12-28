class Bus
{
	void student1()
	{
		System.out.println("Studen-1....");
	}
	void student2()
	{
		System.out.println("Student-2....");
	}
	void student3()
	{
		System.out.println("Student-3....");
	}
	Bus()
	{
		System.out.println("Bus Constructor....");
	}
	public static void main(String[] args) 
	{
		Bus one = new Bus();
		one.student1();
		one.student2();
		one.student3();
		System.out.println("**************");
		new Bus().student1();
		new Bus().student2();
		new Bus().student3();
	}
}