class MyName
{
	public static void main(String[] args) throws Exception 
	{
		java.io.DataInputStream dis = new java.io.DataInputStream(System.in);
		System.out.println("Enter Your Name : ");
		String myName = dis.readLine();
		System.out.println("My Name is : "+myName); 
	}
}