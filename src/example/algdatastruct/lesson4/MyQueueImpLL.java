package example.algdatastruct.lesson4;

import java.util.LinkedList;

public class MyQueueImpLL<T> implements MyQueueInterface<T> {
	LinkedList<T> linkedList = new LinkedList<>();
	
	public MyQueueImpLL() {
	
	}
	
	@Override
	public void add(T item) {
		linkedList.add(item);
	}
	
	@Override
	public T remove() {
		return linkedList.remove();
	}
	
	@Override
	public boolean isEmpty() {
		return linkedList.isEmpty();
	}
}
