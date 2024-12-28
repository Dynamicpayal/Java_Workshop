class Parent
{
	Parent()
	{
		System.out.println("Parent() constructor...");
	}
	void hmm()
	{
		System.out.println("hmm() method of Parent class");
	}
}
class Child extends Parent
{
	Child()
	{
		System.out.println("Child() constructor...");
	}
	void hmm()
	{
		System.out.println("hmm() method of Child class");
	}
}
class Tu
{
	public static void main(String[] args) 
	{
		Child c = new Child();
		c.hmm();
	}
}