interface Mensuration
{
	void drawShape();
}
class Triangle implements Mensuration
{
	public void drawShape()
	{
		System.out.println("Am drawing Triangle");
	}
}
class Rectangle implements Mensuration
{
	public void drawShape()
	{
		System.out.println("Am drawing Rectangle");
	}
}
class Circle implements Mensuration
{
	public void drawShape()
	{
		System.out.println("Am drawing Circle");
	}
}
class Main
{
	public static void main(String[] args) 
	{
		Mensuration shape1 = new Triangle();
		shape1.drawShape();

		System.out.println();

		Mensuration shape2 = new Rectangle();
		shape2.drawShape();

		System.out.println();

		Mensuration shape3 = new Circle();
		shape3.drawShape();
	}
}