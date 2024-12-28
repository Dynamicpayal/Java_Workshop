class X{}
class Y{}
class Student{}
class Java{}
class Python{}
class Oracle{}
class Cool{}
class Gaba{}
class Andha{}
class Message
{
	void show(X x, Y y, Student s)
	{
		System.out.println("show() Method...");
		System.out.println("The value of x is = "+x);
		System.out.println("The value of y is = "+y);
		System.out.println("The value of s is = "+s);
	}
	static void display(Java java, Python python, Oracle oracle)
	{
		System.out.println("display() Method...");
		System.out.println("The value of java is = "+java);
		System.out.println("The value of python is = "+python);
		System.out.println("The value of oracle is = "+oracle);
	}
	void fun(Cool fav, Gaba jaa, Andha chasma)
	{
		System.out.println("fun() Method...");
		System.out.println("The value of fav is = "+fav);
		System.out.println("The value of jaa is = "+jaa);
		System.out.println("The value of chasma is = "+chasma);
	}
	public static void main(String[] args) 
	{
		Message m = new Message();
		X tu = new X();
		Y mu = new Y();
		Student se = new Student();
		m.show(tu,mu,se);

		Java cool = new Java();
		Python py = new Python();
		Oracle or = new Oracle();
		m.display(cool,py,or);

		Cool sir = new Cool();
		Gaba alia = new Gaba();
		Andha de = new Andha();
		m.fun(sir,alia,de);
	}
}