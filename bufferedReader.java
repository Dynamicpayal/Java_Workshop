class StudentInformation
{
	public static void main(String[] args) throws Exception
	{
		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.println("Enter Student Name : ");
		String sName = br.readLine();
		System.out.println("Enter Student Roll : ");
		int sRoll = Integer.parseInt(br.readLine());
		System.out.println("Enter Student Mark : ");
		double sMark = Double.parseDouble(br.readLine());

		System.out.println("Student Name is : "+sName);
		System.out.println("Enter Student Roll is : "+sRoll);
		System.out.println("Enter Student Mark is : "+sMark);
	}
}