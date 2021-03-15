package example.algdatastruct.lesson4;

import java.util.ArrayList;

public class MyQueue<T> implements Queue<T> {
	private ArrayList<T> al = new ArrayList<>();
	
	public MyQueue(ArrayList inputList) {
		al = inputList;
	}
	
	@Override
	public void add(T item) {
		al.add(item);
	}
	
	@Override
	public T remove() {
		return al.remove(0);
	}
	
	@Override
	public boolean isEmpty() {
		return al.isEmpty();
	}
	
	// Дополнительные методы.
	public void show()  {
		for(T t : al)   {
			System.out.print("item = ");
			System.out.println(t.toString());
		}
	}
}
