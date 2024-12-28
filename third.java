class MyDetails
{
	public static void main(String[] x)
	{
		String name = x[0];
		int roll = Integer.parseInt(x[1]);
		double mark = Double.parseDouble(x[2]);

		System.out.println("My Name is : "+name);
		System.out.println("My Roll is : "+roll);
		System.out.println("My Mark is : "+mark);
	}
}