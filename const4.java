class Student
{
	String sName;
	int sRoll;
	double sMark;
	void studentDetails()
	{
		System.out.println("Student Name is : "+sName);
		System.out.println("Student Roll is : "+sRoll);
		System.out.println("Student Mark is : "+sMark);
	}
	Student()
	{
		sName = "rani";
		sRoll = 101;
		sMark = 3.9;
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.studentDetails();
	}
}