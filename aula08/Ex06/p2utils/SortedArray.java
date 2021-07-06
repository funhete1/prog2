package p2utils;

public class SortedArray <E extends Comparable<E>> {   
    private int size = 0;
    private E[] array;
     
    public SortedArray(int length){
        array = (E[]) new Comparable[length];
    }

    /**
     * @return frist element
     */
    public E first(){
        
        return array[0];
    }

    /**
     * @return remove the frist elemnt of the array
     */
    public void removeFirst(){
        for(int i = 0; i < array.length; i++){
            if(i == array.length-1){
                array[i] = null;
                break;
            }
            array[0] = array[i+1];
        }
        size--;
    }
    /**
     * @return the size of the array
     */
    public int size(){return size;}
    
    /**
     * @return if the array is full or not 
     */
    public boolean isFull(){return size == array.length - 1;}

    public void insert(E a){
        insert(a, 0);
        size++;

    }
    private void insert(E elem, int index){
        if(array[index] == null){
            array[index] = elem;
        }
        //mantem essa merda organizada
        if(elem.compareTo(array[index]) < 0){
            E temp = array[index];
            array[index] = elem;
            elem = temp;
        }
        insert(elem, index+1);
    }
    
    /**
     * @return if the array is empty 
     */
    public boolean isEmpty(){return size == 0;}

    /**
     * @return if the array is sorted in Ascending order 
     */
    public boolean isSorted(){
        if(size < 2){return true;}
        return isSorted(0);
    }
    private boolean isSorted(int index){
        if(array[index+1] == null){return true;}
        if(array[index].compareTo(array[index+1]) < 0){return false;}
        return isSorted(index++);
    }

    /**
     * @return true if an element is on the array
     */
    public boolean contains(E elem){
        assert !isEmpty();
        for (int i = 0; i < size; i++) {
            if(elem.compareTo(array[i]) == 0){return true;}
        }
        return false;
    }

    public String toString(){
        String str = "[" + array[0];
        for (int i = 1; i < size; i++) {
            str += "," + array[i];
        }
        return str + "]";
    }

    public SortedArray<E> merge(SortedArray<E> arr){
        SortedArray<E> newarr = new SortedArray<E>(size+arr.size());
        merge(newarr, this, 0);
        merge(newarr, arr, 0);
        return newarr;
    }   
    private void merge(SortedArray<E> newarr, SortedArray<E> oldarr, int index){
        if(oldarr.size() == index)return;
        newarr.insert(oldarr.get(index));
        merge(newarr, oldarr, index+1);

    }

    public E get(int index){
        return array[index];
    }
}
