import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class q_Linlist {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		
		// we can add elements with add or offer method to queue
		q.add(1);
		q.offer(4);
		q.add(2);
		q.offer(5);
		
		// printing all elements in one line
		System.out.println(q);
		
		// printing one by one
		for(int i:q) {
			System.out.print(i+" ");
		}
		
		Queue<Integer> q1 = new LinkedList<>(Arrays.asList(3,9,7,15));
		
		// checking the elements all in queue
		System.out.println(q.contains(q1));
		
		// checking the element in queue
		System.out.println(q.contains(3));
		
		// adding all elements of q1 to q at a time
		q.addAll(q1);
		
		// removing all elements
		q1.clear();
		
		// type of q 
		System.out.println(q.getClass());
		
		// whether q is empty or not
		System.out.println(q.isEmpty());
		
		// removing particular element
		q.remove(2);
		
		// removing all elements
		q.removeAll(q1);
		
		// returns the head of element
		System.out.println(q.element());
		
		// first element in queue
		System.out.println(q.peek());
		
		// removes the first element by poll or remove method
		q.poll();
		q.remove();
		
		}

}
