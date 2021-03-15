package example.algdatastruct.lesson4;

public interface MyStackInterface<T> {
	boolean empty();
	T peek();
	T pop();
	void push(T t);
}
