import java.util.*;
class Test
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		System.out.println(list); // []
		System.out.println(list.isEmpty()); // true
		list.add(10);
		list.add(20);
		list.add(30);
		list.addLast("cool");
		list.add('P');
		list.addFirst(3.7);
		list.add(true);
		System.out.println(list);
	}
}