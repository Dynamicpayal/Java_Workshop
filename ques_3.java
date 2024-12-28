class Test 
{
    static void m1(int a, byte b, char c) 
    {
        System.out.println("m1() method...");
        System.out.println("The value of a is = " + a);
        System.out.println("The value of b is = " + b);
        System.out.println("The value of c is : " + c);
    }
    void m2(double d, float f, short s) 
    {
        System.out.println("m2() method...");
        System.out.println("The value of d is = " + d);
        System.out.println("The value of f is = " + f);
        System.out.println("The value of s is = " + s);
    }

    public static void main(String[] args) 
    {
        m1(10, (byte) 20, 'A');
        Test t = new Test();
        t.m2(12.34, 56.78f, (short) 100);
    }
}
