class LitCollege
{
	String faculty = "Susant Sir";
}
class LitInstitute 
{
	String faculty = "Cool Sir";
	private LitInstitute() {}
	static LitInstitute netramani()
	{
		LitInstitute lit = new LitInstitute();
		return lit;
	}
	LitCollege getobjectofclg()
	{
		LitCollege chairman = new LitCollege();
		return chairman;
	}
}
class Cac
{
	public static void main(String[] args) 
	{
		//LitInstitute institute = new LitInstitute();
		//System.out.println(institute.faculty);
		LitInstitute institute = LitInstitute.netramani();
		System.out.println(institute.faculty);
		LitCollege college_sir = institute.getobjectofclg();
		System.out.println(college_sir.faculty);
	}
}