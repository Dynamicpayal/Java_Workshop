interface Student
{
	String sName = "Bagicha";
	int sRoll = 3;
	//double sMark; // Error it's final in nature
	public static final int a = 10;
	void m1();
	static void m2()
	{
		System.out.println("m2() method of interface Student");
	}
	public static void main(String[] args) 
	{
		//sRoll = 33; // cannot assign a value to final variable sRoll
		//Student feeling = new Student(); // Student is abstract can't be instantiated
		System.out.println(sName);
		System.out.println(sRoll);
		//System.out.println(sMark);
		System.out.println(Student.sName);
		System.out.println(Student.sRoll);

		m2();
		Student.m2();
	}
}