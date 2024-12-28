class Student
{
	final int studentId = 11;
	final static String sName = "Haabaa";
	//final static double sMark;//variable sMark not initialized in the default constructor
	final int k;
	Student()
	{
		k = 10;
	}
	public static void main(String[] args) 
	{
		Student s = new Student();
		System.out.println(s.studentId);
		System.out.println(s.sName);
		//s.studentId = 12; //cannot assign a value to final variable studentId
		//s.sName = "Musaa";
		System.out.println(s.studentId);
		System.out.println(s.sName);
	}
}