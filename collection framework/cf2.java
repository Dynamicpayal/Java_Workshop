import java.util.*;
class Test
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println(list); // []
		System.out.println(list.isEmpty()); // true
		list.add(111);
		list.add(0,222);
		list.add(1,333);
		list.add(444);
		list.add(555);
		list.add(222);
		System.out.println(list); // [222, 333, 111, 444, 555, 222]

		System.out.println("----------------");

		System.out.println();
		System.out.println("Traverse the element by using get() mehod");
		for(int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i)+" "); // 222 333 111 444 555 222
		}

		System.out.println();

		System.out.println("----------------");

		System.out.println();
		System.out.println("Traverse the element by using Iterator interface");
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" "); // 222 333 111 444 555 222
		}

		System.out.println();
		list.remove(0);
		System.out.println(list); // [333, 111, 444, 555, 222]
		list.clear();
		System.out.println(list); // []
	}
}