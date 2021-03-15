package example.algdatastruct.lesson4;

public interface MyDequeInterface<T> {
	boolean isEmpty();
	T peekFirst();
	T peekLast();
	T popFirst();
	T popLast();
	
}
