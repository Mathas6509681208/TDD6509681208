package core;


import java.util.EmptyStackException;
import java.util.LinkedList;

public class Stack<T> implements IStack<T> {
    private LinkedList<T> elements;
    

    public Stack() {
        this.elements = new LinkedList<>();
    }

    @Override
    public void push(T element) {
        elements.addLast(element);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.removeLast();
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.getLast();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public void clear() {
        elements.clear();
    }

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int isTop() {
		// TODO Auto-generated method stub
		return 0;
	}
}

