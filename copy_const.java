class Employee
{
	String eName = "Netramani";
	int eId = 143;
	Employee(){}
	Employee(Employee obj)
	{
		this.eName = obj.eName;
		this.eId = obj.eId;
	}
	public static void main(String[] args) 
	{
		System.out.println("e1 memory");
		Employee e1 = new Employee();
		e1.eName = "Puru";
		e1.eId = 123;
		System.out.println(e1.eName);
		System.out.println(e1.eId);
		Employee e2 = new Employee(e1);
		e2.eName = "Alia";
		e2.eId = 234;
		System.out.println(e2.eName);
		System.out.println(e2.eId);
	}
}