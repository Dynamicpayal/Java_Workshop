// Single Inheritance
class A
{
	int x = 10;
}
class B extends A
{
	int y = 20;
}
class Test
{
	public static void main(String[] args) 
	{
		A obj1 = new A();
		System.out.println(obj1.x); // 10
		//System.out.println(obj1.y); // Error

		B obj2 = new B();
		System.out.println(obj2.x); // 10
		System.out.println(obj2.y); // 20
	}
}