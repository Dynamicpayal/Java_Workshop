class Wow
{
	static void hm()
	{
		System.out.println("hm() method...");
	}
	void hmm()
	{
		System.out.println("hmm() method");
	}
	public static void main(String[] args) 
	{
		Wow ati = new Wow();
		Wow.hm();
		ati.hmm();	
	}
}