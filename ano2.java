abstract class Lit
{
	abstract void joinItCourse(int x);
}
class College
{
	public static void main(String[] args) 
	{
		Lit institute = new Lit()
		{
			void joinItCourse(int y)
			{
				System.out.println("All join in Java...."+y);
			}
		};	
		institute.joinItCourse(10);
	}
}