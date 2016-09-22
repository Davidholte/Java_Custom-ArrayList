import java.util.Arrays;

/**
 * Created by 3299779 on 07/09/2016.
 */
public class myArrayList<E> {

    private static final int INIT_SIZE = 10;
    private Object elementData[]={};
    private int size = 0;
    private Long id;

    public myArrayList() {
        elementData = new Object[INIT_SIZE];
    }

    public void add(E e) {
        if (size == elementData.length) {
            expandList();
        }
        elementData[size++] = e;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return (E) elementData[index];
    }

    public Object remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        Object removedElement = elementData[index];

        for (int i = index; i < size; i++) {
            elementData[i] = elementData[i+1];
        }
        size--;

        return removedElement;
    }

    private void expandList() {
        int newSize = elementData.length * 2;
        elementData = Arrays.copyOf(elementData, newSize);
    }

    public int getSize() {
        return size;
    }

    myArrayList(Long id) {
        this.id = id;
    }

    public boolean contains(Object o) {
        boolean returnVal = false;

        if (o instanceof myArrayList) {
            myArrayList ptr = (myArrayList) o;
            returnVal = ptr.id.longValue() == this.id;

        }
        return returnVal;
    }

    public String toString() {
        String stringList = "";
        for (int i = 0; i < size; i++) {
            stringList = elementData[i] + " ";
            System.out.println(stringList);
        }
        return stringList;
    }


}
