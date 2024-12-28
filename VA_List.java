class Test
{
	static void add(int...x)
	{
		int sum = 0;
		for(int i = 0; i < x.length; i++)
		{
			sum += x[i];
		}
		System.out.println("Summation = "+sum);
	}
	public static void main(String...cool) 
	{
		Test.add(); // 0
		Test.add(1,2,3); // 6
		Test.add(1,2,3,4,5,'a',7); // 119(a = 97 -> ASCII)
	}
}