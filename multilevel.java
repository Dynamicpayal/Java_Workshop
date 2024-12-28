class A
{
	int a = 10;
}
class B extends A
{
	int b = 20;
}
class C extends B
{
	int c = 30;
}
class Test
{
	public static void main(String[] args) 
	{
		A obj1 = new A();
		System.out.println(obj1.a);
		//System.out.println(obj1.b);//Error

		B obj2 = new B();
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		// System.out.println(obj2.c);

		C obj3 = new C();
		System.out.println(obj3.a);
		System.out.println(obj3.b);
		System.out.println(obj3.c);
	}
}