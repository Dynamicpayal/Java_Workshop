class Test
{
	int x = 10;
	void show(int x)
	{
		System.out.println("The value of x is = "+x);
		System.out.println("The value of x is = "+this.x);
	}
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.show(20);	
	}
}