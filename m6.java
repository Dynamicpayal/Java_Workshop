class Demo
{
	void calculate(int a, int b)
	{
		System.out.println("calculate() method...");
		System.out.println("Addition = "+(a + b));
	}
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		d.calculate(100,200);
		int x = 200, y = 30;
		d.calculate(x,y);
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter value of first parameter : ");
		int num1 = sc.nextInt();
		System.out.println("Enter value of second parameter : ");
		int num2 = sc.nextInt();
		d.calculate(num1,num2);	
	}
}