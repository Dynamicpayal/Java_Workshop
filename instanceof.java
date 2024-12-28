class Guru {}
class Chasma {}
class Message
{
	public static void main(String[] args)
	{
		Message m = new Message();
		System.out.println(m instanceof Message);
		Guru g = new Guru();
		System.out.println(g instanceof Guru);
		Thread th = new Thread();
		System.out.println(th instanceof Thread);
		Chasma andha = new Chasma();
		System.out.println(andha instanceof Chasma);

		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.println(br instanceof java.io.BufferedReader);
		Object obj = new Object();
		System.out.println(obj instanceof Object);
		
		System.out.println("******************");

		System.out.println(m instanceof Object);
		System.out.println(g instanceof Object);
		System.out.println(br instanceof Object);
		System.out.println(andha instanceof Object);

		System.out.println(obj instanceof Message);
		System.out.println(obj instanceof Thread);
		System.out.println(obj instanceof java.io.BufferedReader);
		System.out.println(obj instanceof Guru);

		System.out.println("******************");
		
		System.out.println(null instanceof Message);
		System.out.println(null instanceof Chasma);
		System.out.println(null instanceof Object);
		System.out.println(null instanceof Guru);
		System.out.println(null instanceof java.io.BufferedReader);
	}
}