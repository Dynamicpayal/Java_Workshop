class Test
{
	public static void main(String[] args)
	{
		int p,q,r,s;
		p = q = r = s = 30;
		p += q -= r *= s /= 3;
		System.out.println(p+" "+q+" "+r+" "+s);
	}
}

//Output
//-240 -270 300 10