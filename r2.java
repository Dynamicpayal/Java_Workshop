import java.util.Scanner;
class StudentDetails
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Student Name : ");
		String sName = sc.nextLine();
		System.out.println("Enter Student Roll : ");
		int sRoll = sc.nextInt();
		System.out.println("Enter Student Mark : ");
		double sMark = sc.nextDouble();
		System.out.println("Enter Student Gender : ");
		char sGender = sc.next().charAt(0);

		System.out.println("Student Name is : "+sName);
		System.out.println("Student Roll is : "+sRoll);
		System.out.println("Student Mark is : "+sMark);
		System.out.println("Student Gender is : "+sGender);
	}
}