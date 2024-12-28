class Addition
{
	int m1(int a)
	{
		System.out.println("m1() method...");
		System.out.println("The value of a = "+a);
		return a;
	}
	int m2(int b)
	{
		System.out.println("m2() method...");
		System.out.println("The value of b = "+b);
		return b;
	}
	public static void main(String[] args) 
	{
		Addition add = new Addition();
		int x = add.m1(10);
		int y = add.m2(20);	
		System.out.println("Addition = "+(x + y));
	}
}