package example.algdatastruct.lesson4;

public interface Queue<T> {
	void add(T item);
	T remove();
	boolean isEmpty();
}
