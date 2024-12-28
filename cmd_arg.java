class Test
{
	public static void main(String[] args)
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mult = num1 * num2;
		int div = num1 / num2;
		int rem = num1 % num2;
		System.out.println("Sum is "+sum);
		System.out.println("Sub is "+sub);
		System.out.println("Mult is "+mult);
		System.out.println("Div is "+div);
		System.out.println("Rem is "+rem);
	}
}