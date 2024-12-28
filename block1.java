class Test
{
	static
	{
		System.out.println("static block-3");
	}
	static 
	{
		System.out.println("static block-2");
	}
	public static void main(String[] args) 
	{
		System.out.println("main() method execution");
	}
	static
	{
		System.out.println("static block-1");
	}
}