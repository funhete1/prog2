package aula07.p2utils;

import java.util.Arrays;

/** This class implements a "dynamic" array of elements of generic type.
 * The capacity of a dynamic array grows automatically, as needed.
 * It implements a random access abstract data type, with two main methods:
 * set and get.
 */
public class DynamicArray<E> {

  private E[] array;
  private int maxidx = -1;  // maximum index ever set

  private static final int BLOCK = 256;

  // Define the constructor to initialize the fields
  public DynamicArray(){
    array = (E[]) new Object[0];
    maxidx = array.length;
  }

  /** Returns the length of the array.
   * The "length" is defined as 1 plus the maximum index that was set.
   * @return Number of elements in the array
   */
  public int length() {return 1+maxidx;}

  /** Set the element in position idx to given value.
   */
  public void set(int idx, E value) {
    assert idx >= 0;
    while(idx >= array.length){
      array = Arrays.copyOf(array, array.length+BLOCK);
      if(idx <  array.length){
        array[idx]=value;
        break;
      }
    }
  }


  /** Return the element in a given position in the list. 
   * @param idx  the index of the element (0 is the first).
   * @return value at position idx of the array, or null, if not set yet.
   */
  public E get(int idx) {
    assert idx >= 0;
    if(idx>=maxidx) return null;
    return array[idx];
  }

  // Define the second get method
  public E get(int idx, E d) {
    assert idx >= 0;
    if(idx>=maxidx) return d;
    if(array[idx]==null) return d;
    return array[idx];
  }

}
