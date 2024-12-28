class Summation
{
	public static void main(String[] args) throws java.io.IOException
	{
		java.io.BufferedReader br = new java.io.BufferedReader(new 								java.io.InputStreamReader(System.in));
		System.out.println("Enter a Number : ");
		int no = Integer.parseInt(br.readLine());
		int sum = 0;
		while(no != 0)
		{
			sum += no % 10;
			no = no / 10;
		}
		System.out.println("Summation of Number : "+sum);	
	}
}