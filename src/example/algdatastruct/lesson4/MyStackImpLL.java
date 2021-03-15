package example.algdatastruct.lesson4;

import java.util.LinkedList;

public class MyStackImpLL<T> implements MyStackInterface<T> {
	private LinkedList<T> linkedList = new LinkedList<>();
	
	public MyStackImpLL() {
	
	}
	
	@Override
	public boolean empty() {
		return linkedList.isEmpty();
	}
	
	@Override
	public T peek() {
		return linkedList.peek();
	}
	
	@Override
	public T pop() {
		return linkedList.pop();
	}
	
	@Override
	public void push(T t) {
		linkedList.add(t);
	}
}
