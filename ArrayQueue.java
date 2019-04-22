import java.util.Arrays;
import java.util.NoSuchElementException;

/**
*@author Connor Belko
**/

public class ArrayQueue<T> implements Queue<T> {
	
	private Object [] queue;
	private int size;
	private int front;
	private int back;
	private static final int DEFAULT_CAPACITY = 25;
	private static final int MAX_CAPACITY = 10000;
	private boolean initialized;
	
	public ArrayQueue(){
		this(DEFAULT_CAPACITY);
	}
	public ArrayQueue(int capacity){
		size = front = back = 0;
		queue = new Object[capacity + 1];
		initialized = true;
	}
	
	/**
	*Attempts to add new item to queue.
	*@return true if add was successful.
	**/
	public boolean add(T obj){
		checkInitialized();
		if(isArrayFull()){
			resizeArray(2 * size);
		}
		queue[back] = obj;
		size++;
		back = (back + 1) % queue.length;
		return true;
	}
	
	/**
	*Attempts to remove item from front of queue.
	*@return value of item removed.
	**/
	public T remove(){
		T val = element();
		size--;
		front = (front + 1) % queue.length;
		return val;
	}
	
	/**
	*Attempts to get first value of queue.
	*@return value in front of queue.
	**/
	public T element(){
		if(isEmpty())
			throw new NoSuchElementException();
		return (T)queue[front];
	}
	
	/**
	*Attempts to see if value is in queue.
	*@return true if value is in queue if not @return false
	**/
	public boolean contains(T obj){
		int index = front;
		for(int i = 0; i < size; i++){
			if(obj == queue[index])
				return true;
			if(obj != null && obj.equals(queue[index]))
				return true;
			index = (index + 1) % queue.length;
		}
		return false;
	}

	/**
	*@return size of queue.
	**/
	public int size(){
		checkInitialized();
		return size;
	}
	
	/**
	*Removes all items from queue.
	**/
	public void clear(){
		checkInitialized();
		while(!isEmpty()){
			remove();
		}
	}
	
	/**
	*Checks if queue is empty
	*@return size = 0.
	**/
	public boolean isEmpty(){
		return size == 0;
	}
	
	/**
	*Makes an array of the queue.
	@return new array.
	**/
	public Object [] toArray(){
		Object[] arr = new Object[size];
		int index = front;
		for(int i = 0; i < size; i++){
			arr[i] = queue[index];
			index = (index + 1) % queue.length;
		}
		return arr;
	 }
	 
	 //Helper methods
	 private boolean isArrayFull() {
		 return back == (front - 1) % queue.length;
	 }
	 
	 public void checkInitialized() {
		  if (!initialized) {
			  throw new SecurityException("Uninitalized Error. You should never see this message.");
		  }
	  }
	  
	  private boolean resizeArray(int newSize) {
		if (newSize > MAX_CAPACITY) {
			 return false;
		}
		Object[] temp = new Object[2 * size];
		Object [] copy = toArray();
		for(int i = 0; i < size; i++){
			temp[i] = copy[i];
		}
		queue = temp;
		front = 0;
		back = size;
		return true;
	  }
}