package example.algdatastruct.lesson4;

import java.util.ArrayList;

public class MyDequeImp<T> implements MyDequeInterface<T> {
	private ArrayList<T> al = new ArrayList<>();
	
	public MyDequeImp(ArrayList inputList) {
		al = inputList;
	}
	
	@Override
	public boolean isEmpty() {
		return al.isEmpty();
	}
	
	@Override
	public T peekFirst() {
		return al.get(0);
	}
	
	@Override
	public T peekLast() {
		return al.get(al.size() - 1);
	}
	
	@Override
	public T popFirst() {
		return al.remove(0);
	}
	
	@Override
	public T popLast() {
		return al.remove(al.size() - 1);
	}
	
	public void pushFirst(T t)    {
		al.add(0, t);
	}
	
	public void pushLast(T t)  {
		al.add((al.size() - 1), t);
	}
}
