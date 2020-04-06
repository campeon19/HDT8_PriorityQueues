
import java.util.*;

public class jcfQueue<E extends Comparable<E>> implements PriorityQueueInterface<E> {

	private PriorityQueue<E> queue = new PriorityQueue<E>();
	
	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return queue.peek();
	}

	@Override
	public E remove() {
		// TODO Auto-generated method stub
		return queue.poll();
	}

	@Override
	public void add(E value) {
		// TODO Auto-generated method stub
		queue.add(value);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return queue.isEmpty();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return queue.size();
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		queue.clear();
	}

}
