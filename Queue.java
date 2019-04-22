/**
 * This is a simplified interface for Queue, based on the Java API.
 * See <a href="https://docs.oracle.com/javase/10/docs/api/java/util/Queue.html">this documentation</a>
 * for more details.
 * For now, we're going to omit poll and peek methods.
 * 
 * ***********************************************
 * *** TODO: FILL IN THE MISSING DOCUMENTATION ***
 * ***********************************************
 * 
 * @author Stephen J. Sarma-Weierman
 * @author YOUR NAME HERE
 * @version 1.0
 */
public interface Queue<T> {
	
	/**
	 * See the documentation linked above for more details. Instead of throwing an exception
	 * if the maximum capacity is exceeded, we'll return false.
	 * @param obj - object to be added.
	 * @return true if successful.
	 */
	public boolean add(T obj);
	
	/**
	 * 
	 */
	public T remove();
	
	/**
	 * 
	 */
	public T element();
	
	/**
	 * 
	 */
	public boolean contains(T obj);
	
	/**
	 * 
	 */
	public int size();
	
	/**
	 * 
	 */
	public void clear();
	
	/**
	 * 
	 */
	public boolean isEmpty();
	
	/**
	 * 
	 */
	 public Object [] toArray();
}