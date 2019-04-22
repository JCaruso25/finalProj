/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author carus
 */
import java.util.Iterator;
import java.util.Arrays;


public class ArrayList<T> implements List<T> {
    private Object [] array;
    private int size = 0;
    private final static int DEFAULT_CAPACITY=15;
    private final static int MAX_CAPACITY=10000;
    
    public ArrayList(){
        this(DEFAULT_CAPACITY);
    }
    
    public ArrayList(int capacity) {
        array = new Object[capacity];
        size = 0;
    }
    

    public boolean add(T o) {
		
        if (size < array.length || resizeArray(2 * size)) {
            array[size] = o;
            size++;
            return true;
        }
        return false;
    }


    public boolean add(int index, T o) {
         if (size < array.length || resizeArray(2 * size)) {
			for (int i = size; i > index; i--) {
				array[i] = array[i - 1];
			}
			array[index] = o;
            size++;
            return true;
		 }
		 else if (index > size) {
			 return false;
		 }
		 else if (index < size){
			 for (int i = size; i > index; i--) {
				 array[i] = array[i - 1];
			 }
			 array[index] = o;
			 size++;
			 return true;
		 }
		 return false;
    }


    public void clear() {
        for (int i = 0; i < size; i++)
			array[i] = null;
		
		size = 0;
    }

  
    public boolean contains(T o) {
   for (int i = 0;i < size; i++){ 
        if (array[i].equals(o))
            return true;
        else
            i++;
    }
    return false;
    }


    public T get(int index) {
        if (index >= 0 && index < size)
            return (T)array[index];
        else
            return null;
    }


    public T set(int index, T o) {			//returns value it overwrites
        if (index >= 0 && index < size){
			T test = (T)array[index];
            array[index] = o;
			return test;
		}
        else
            return null;
    }

 
    public boolean remove(T o) {
        if(contains(o)){
			int index = indexOf(o);
			array[index] = array[index + 1];
			for (int i = index; i < size-1; i++){
				array[i] = array[i+1];
			}
			size--;
			return true;
		}
		else {
			return false;
		}
    }


    public T remove(int index) {
        if (index >= 0 && index < size) {
            T obj = (T)array[index];
            for (int i = index; i < size-1; i++)
                array[i] = array[i+1];
            size--;
            return obj;
        } else
            return null;
		
		
    }


    public int indexOf(T o) {
          if(!contains(o))
            return -1;
        for (int i = 0; i < size ; i++) {
			if (get(i).equals(o)) {
				return i;
			}
		}
		return -1;
    }


    public int lastIndexOf(T o) {
      if(!contains(o))
          return -1; 
             
       for (int i = size-1; i >= 0; i--) {
			if (get(i).equals(o)) {
				return i;
			}
        
		}   
      return -1;               
    }


    public boolean isEmpty() {
        return size==0;
    }


    public int size() {
        return size;
    }


  public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int cursor = 0;
            
           
            public boolean hasNext() {
                return cursor < size;
            }

           
            public T next() {
                T obj = (T)array[cursor];
                cursor++;
                return obj;
            }
        };
    }




    public Object[] toArray() {
        return Arrays.copyOf(array, size);
    }
    
    private boolean resizeArray(int newCapacity) {
        if (newCapacity > MAX_CAPACITY)
                return false;
        array = Arrays.copyOf(array, newCapacity);
        return true;
    }
    
}






