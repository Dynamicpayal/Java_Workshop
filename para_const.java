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
	Student(String sName, int sRoll, double sMark)
	{
		this.sName = sName;
		this.sRoll = sRoll;
		this.sMark = sMark;
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student("Gaba", 100, 3.2);
		s1.studentDetails();
		System.out.println("************");
		Student s2 = new Student("Feelings", 202, 1.5);
		s2.studentDetails();
		System.out.println("************");
		Student s3 = new Student("Photo", 101, 4.5);
		s3.studentDetails();
	}
}