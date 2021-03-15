package example.algdatastruct.lesson4;

public interface MyQueueInterface<T> {
	void add(T item);
	T remove();
	boolean isEmpty();
}
