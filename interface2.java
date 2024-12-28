interface LitInstitute
{
	void joinItCourse();
}
class C implements LitInstitute
{
	public void joinItCourse()
	{
		System.out.println("Am joining C course...");
	}
}
class Java implements LitInstitute
{
	public void joinItCourse()
	{
		System.out.println("Am joining Java course...");
	}
}
class Python implements LitInstitute
{
	public void joinItCourse()
	{
		System.out.println("Am joining Python course...");
	}
}
class Test
{
	public static void main(String[] args) 
	{
		//LitInstitute potola=new LitInstitute();//LitInstitute is abstract; cannot be instantiated
		C c = new C();
		c.joinItCourse();

		Java java = new Java();
		java.joinItCourse();

		Python ssss = new Python();
		ssss.joinItCourse();

		System.out.println();

		System.out.println("***********************");

		System.out.println();

		LitInstitute course1 = new C();
		course1.joinItCourse();

		LitInstitute course2 = new Java();
		course2.joinItCourse();

		LitInstitute course3 = new Python();
		course3.joinItCourse();
	}
}