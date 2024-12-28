class Emiti
{
	public static void main(String[] arr)
	{
		int no1 = Integer.parseInt(arr[0]);
		int no2 = Integer.parseInt(arr[1]);
		int no3 = Integer.parseInt(arr[2]);

		int largest ;
		if(no1 >= no2 && no1 >= no3)
		{
			largest = no1;
		}
		else if(no2 >= no1 && no2 >= no3)
		{
			largest = no2;
		}
		else
		{
			largest = no3;
		}
		System.out.println("The largest number is: " + largest);
	}
}