class Average
{
	public static void main(String[] args)
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		int num4 = Integer.parseInt(args[3]);
		int num5 = Integer.parseInt(args[4]);
		int avg = (num1 + num2 + num3 + num4 + num5)/5;
		System.out.println("Average is : "+avg);
	}
}