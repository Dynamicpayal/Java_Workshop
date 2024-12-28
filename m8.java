class Susant{}
class Babu{}
class Moon{}
class LitInstitute 
{
	Moon java()
	{
		System.out.println("Java() method...");
		Moon cool = new Moon();
		return cool;
	}
	static Babu python()
	{
		System.out.println("python() method...");
		Babu chutti = new Babu();
		return chutti;
	}
	Susant c()
	{
		System.out.println("c() method...");
		Susant sir = new Susant();
		return sir;
	}
	public static void main(String[] args) 
	{
		LitInstitute lit = new LitInstitute();
		Moon so_cool = lit.java();
		System.out.println("java() method returns value = "+so_cool);
		Babu chutti = LitInstitute.python();
		System.out.println("python() method returns value = "+chutti);
		Susant sea = lit.c();
		System.out.println("c() method returns value = "+sea);	
	}
}