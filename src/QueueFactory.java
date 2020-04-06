
public class QueueFactory<E extends Comparable<E>> {

	public PriorityQueueInterface<E> Queue(int opcion){
		switch(opcion) {
		
		case 1:
			return new VectorHeap<E>();
			
		case 2:
			return new jcfQueue<E>();
			
		default:
			return new VectorHeap<E>();
		}
		
	}
}
