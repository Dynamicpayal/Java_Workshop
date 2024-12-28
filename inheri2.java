class P
{
	int x = 10;
}
class C extends P
{
	int y = 20;
}
class Test
{
	public static void main(String[] args) 
	{
		P p1 = new P();
		System.out.println(p1.x); // 10
		//System.out.println(p1.y); // Error
		System.out.println("************");

		C c1 = new C();
		System.out.println(c1.x); // 10
		System.out.println(c1.y); // 20
		System.out.println("************");

		P p2 = new C();
		System.out.println(p2.x); // 10
		//System.out.println(p2.y); // Error
		System.out.println("***********");

		//C c2 = new P(); //  P cannot be converted to C (ClassCastException)
		//System.out.println(c2.x);
		//System.out.println(c2.y);
	}
}