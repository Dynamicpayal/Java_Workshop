class America
{
	public static void main(String[] args)
	{
		// Print the stars and stripes part
		for (int i = 0; i < 9; i++) {
			if (i % 2 == 0) {
				System.out.println("* * * * * * ==========================================");
			} else {
				System.out.println(" * * * * *  ==========================================");
			}
		}
		
		// Print the remaining stripes part
		for (int i = 0; i < 6; i++) {
			System.out.println("=====================================================");
		}
	}
}
