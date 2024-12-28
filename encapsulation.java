class Pattnaik
{
	private String daughter = "Rani";
	String servant()
	{
		return daughter;
	}
}
class Jena
{
	public static void main(String[] args) {
		Pattnaik nayak = new Pattnaik();
		//System.out.println(nayak.daughter);
		String girl = nayak.servant();
		System.out.println("Now Pattnaik's daughter"+girl+"present in Jena's Family.");
	}
}