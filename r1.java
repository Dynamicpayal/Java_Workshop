class EmployeeInformation
{
	public static void main(String[] args) 
	{
		String eName = args[0];
		int eId = Integer.parseInt(args[1]);
		double eSalary = Double.parseDouble(args[2]);

		System.out.println("Employee Name is : "+eName);
		System.out.println("Employee Id is : "+eId);
		System.out.println("Employee Salary is : "+eSalary);
	}
}