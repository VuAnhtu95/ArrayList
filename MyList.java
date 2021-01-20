import java.util.Arrays;

public class MyList<E>{
    private int size = 0;
    static final int DEFAULT_CAPACITY = 5;
    private Object[] elements;
    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    public void ensureCapa(){
        int newSize = elements.length * 2;
        if ((size+1)==elements.length){
            elements = Arrays.copyOf(elements,newSize);
        }
    }
    public void add(int index,E element){
            ensureCapa();
            for (int i = size; i>=index ;i--){
                elements[i+1] = elements[i];
                elements[index] = element;
                size++;
            }
    }
    public E get(int index) {
        if (index >= size || index <0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
        }
        return (E) elements[index];
    }
    public E remove(int index){
        E e = (E) elements[index];
        for (int j = index; j < size - 1; j++)
            elements[j] = elements[j + 1];

        elements[size - 1] = null;
        size--;
        return e;
    }
    public int getSize(){
        return size;
    }
    public E cloneList(){
        return (E) Arrays.copyOf(elements,size);
    }
    public boolean contains(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(elements[i]))
                return true;
        return false;
    }
    public int indexOf(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(elements[i])) return i;
        return -1;
    }
    public boolean add(E e){
        add(size,e);
        return true;
    }
    public void clear(){
        for (int i= 0;i<size;i++){
            elements[i] = null;
        }
    }
}
