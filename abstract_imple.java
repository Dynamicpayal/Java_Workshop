abstract class NayakFamily
{
	abstract void kirti();
	void murti()
	{
		System.out.println("Murti is already complete");
	}
}
class JenaFamily extends NayakFamily
{
	void kirti()
	{
		System.out.println("Now kirti completed");
	}
	public static void main(String[] args) 
	{
		//NayakFamily nf = new NayakFamily();//NayakFamily is abstract; cannot be instantiated
		JenaFamily jf = new JenaFamily();
		jf.kirti();
		jf.murti();
	}
}