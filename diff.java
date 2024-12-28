class Demo
{
	public static void main(String[] args)
	{
		String s1 = new String("Bibek");
		String s2 = new String("Bibek");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals("BIBEK")); // false
		System.out.println(s1.equals("Bibek")); // true
		System.out.println(s1.equalsIgnoreCase("BIBEK")); // true
	}
}