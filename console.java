class UserNamePassword
{
	public static void main(String[] args) 
	{
		java.io.Console c = System.console();
		System.out.println("Enter User Name : ");
		String uName = c.readLine();
		System.out.println("Enter Password : ");
		char[] arr = c.readPassword();
		String pwd = String.valueOf(arr);
		System.out.println("User Name is : "+uName);
		System.out.println("Password is :"+pwd);
	}
} 