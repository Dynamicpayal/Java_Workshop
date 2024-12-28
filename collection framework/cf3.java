import java.util.*;
class Test
{
	public static void main(String[] args) 
	{
		ArrayList<Character> list = new ArrayList<Character>();
		System.out.println(list); // []
		list.add('A');
		list.add('B');
		list.add('C');
		list.add('D');
		list.add('E');
		System.out.println(list); // [A, B, C, D, E]
		ListIterator<Character> itr = list.listIterator();
		System.out.println("Forword Traversing by using ListIterator interface");
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" "); // A B C D E
		}
		System.out.println();
		System.out.println("Backward Travesing by using ListIterator interface");
		while(itr.hasPrevious())
		{
			System.out.print(itr.previous()+" "); // E D C B A
		}
	}
}