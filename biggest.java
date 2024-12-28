class Biggest
{
	public static void main(String[] args)
	{
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		int largest;
		if (num1 >= num2) {
            		if (num1 >= num3) 
			{
                		largest = num1;
            		} 
			else 
			{
                		largest = num3;
            		}
        	} 
		else 
		{
            		if (num2 >= num3) {
                	largest = num2;
            	}
		 else 
		{
                	largest = num3;
            	}
        }

        System.out.println("The largest number is: " + largest);
	}
}