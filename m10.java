class Hmmm
{
	static int a = 1;
	int b = 2;
	int hm()
	{
		return a;
	}
	int hmm()
	{
		return b;
	}
	int hmmm()
	{
		int c = 3;
		return c;
	}
	public static void main(String[] args) 
	{
		Hmmm hmhm = new Hmmm();
		int x = hmhm.hm();
		System.out.println("hm() method returns value = "+x);
		int y = hmhm.hmm();
		System.out.println("hmm() method returns value = "+y);
		int z = hmhm.hmmm();
		System.out.println("hmmm() method returns value = "+z);	
	}
}