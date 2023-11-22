package core;

public interface IStack<T> {
	boolean isEmpty();
	int getSize();
	boolean isFull();
	int isTop();
	void push(T element);
	T pop();
	T peek();
	void clear();
	
	

	
	

}
