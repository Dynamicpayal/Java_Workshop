abstract class Test 
{
	void show()
	{
		System.out.println("show() method of Test class");
	}
	abstract void display();
	abstract void fun();
	public static void main(String[] args) 
	{
		Test t = new Test()
		{
			void display()
			{
				System.out.println("display() method");
			}
			void fun()
			{
				System.out.println("fun() method");
			}
		};
		Test t1 = new Test()
		{
			void fun()
			{
				System.out.println(1);
			}
			void display()
			{
				System.out.println(2);
			}
		};
		t.show();
		t.display();
		t.fun();
		System.out.println();
		t1.show();
		t1.display();
		t1.fun();
	}
}