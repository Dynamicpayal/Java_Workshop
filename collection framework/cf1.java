import java.util.*;
class Test
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		System.out.println(list); // []
		System.out.println(list.isEmpty()); // true
		list.add(111);
		list.add(222);
		list.add(333);
		list.add(333);
		list.add(555);
		//list.add("Cool"); // error
		list.add(1,444);
		list.add(1,777);
		list.add(888);
		System.out.println(list); // [111, 777, 444, 222, 333, 333, 555, 888]
		Collections.sort(list);
		System.out.println("After Sorting Elements are : "+list);//[111, 222, 333, 333, 444, 555, 777, 888]
		System.out.println(list.contains(222)); // true
		System.out.println(list.contains(324)); // false
		System.out.println(list.indexOf(333)); // 2
		System.out.println(list.lastIndexOf(333)); // 3
		System.out.println(list.size()); // 8
		System.out.println(list.get(4)); // 444
		System.out.println("First Element : "+list.getFirst()); // First Element : 111
		System.out.println("Last Element : "+list.getLast()); // Last Element : 888
		System.out.println("***********************");
		for(Integer x : list)
		{
			System.out.print(x+" ");
		}
	}
}