class Guru{}
class Test extends Guru
{
	public static void main(String[] args)
	{
		System.out.println(5 == 5);
		System.out.println('a' == 'b');
		System.out.println(98 == 'b');
		System.out.println(65.0 == 'A');
		System.out.println(2.9 == 9.2);
		System.out.println(true == false);

		System.out.println("**********************");
		Test t1 = new Test();
		Test t2 = new Test();
		System.out.println(t1 == t2);
		Guru g1 = new Guru();
		Guru g2 = new Guru();
		System.out.println(g1 == g2);

		Thread th1 = new Thread();
		Thread th2 = new Thread();
		System.out.println(th1 == th2);
		System.out.println(t1 == g1);
	
		java.util.Scanner ac = new java.util.Scanner(System.in);	
		java.util.Scanner cooler = new java.util.Scanner(System.in);
		System.out.println(ac == cooler);
	
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println(obj1 == obj2);
		System.out.println(t1 == obj1);
		System.out.println(g1 == obj2);
		System.out.println(th1 == obj1);
		System.out.println(cooler == obj2);
		//System.out.println(ac == t1);					
	}
}