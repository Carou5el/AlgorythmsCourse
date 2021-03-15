package example.algdatastruct.lesson4;

import java.util.ArrayList;

public class MyStackImp<T> implements MyStackInterface<T> {
	
	private ArrayList<T> al = new ArrayList<>();
	
	// Constructor.
	// Заполнение стэка элементами входящего массива.
	public MyStackImp(ArrayList<T> inputList) {
		al = inputList;
	}
	
	@Override
	public boolean empty() {
		return this.al.isEmpty();
	}
	
	public T peek() {
		return al.get(al.size() - 1);
	}
	
	public T pop() {
		T result = al.get(al.size() - 1);
		al.remove(al.size() - 1);
		return result;
	}
	
	@Override
	public void push(T var) {
		al.add(var);
	}
}
