class Message
{
	String name = "Feeling";
	int roll;
	void Feelings()
	{
		System.out.println(name);
		System.out.println(roll);
		Message m1 = new Message();
		System.out.println(m1.name+"..."+m1.roll);
	}
	public static void main(String[] args) {
		//System.out.println(name); // error
		//System.out.println(roll); // error
		Message msg = new Message();
		System.out.println(msg.name+"..."+msg.roll);
		msg.Feelings();
	}
}