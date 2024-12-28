class Test
{
	public static void main(String[] args)
	{
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte)(b1 + b2);
		System.out.println(b3);
 
		System.out.println(1.0 / 0);
		System.out.println(0.0 / 0);
		System.out.println(-1.0 / 0);
		System.out.println(-0.0 / 0);
	}
}