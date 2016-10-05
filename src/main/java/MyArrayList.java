package main.java;

import java.util.Arrays;

/**
 * Created by 3299779 on 07/09/2016.
 */
public class MyArrayList<E> {

    private static final int INIT_SIZE = 10;
    private Object elementData[]={};
    private int mySize = 0;
    private Long id;

    public MyArrayList() {
        elementData = new Object[INIT_SIZE];
        mySize = 0;

    }


    public void myAdd(E e) {
        if (mySize == elementData.length) {
            expandList();
        }
        elementData[mySize++] = e;
    }

    @SuppressWarnings("unchecked")
    public E myGet(int index) {
        if (index < 0 || index >= mySize) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return (E) elementData[index];
    }

    public Object myRemove(int index) {
        if (index < 0 || index >= mySize) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        Object removedElement = elementData[index];

        for (int i = index; i < mySize; i++) {
            elementData[i] = elementData[i+1];
        }
        mySize--;

        return removedElement;
    }

    private void expandList() {
        int newSize = elementData.length * 2;
        elementData = Arrays.copyOf(elementData, newSize);
    }

    public int getSize() {
        return mySize;
    }



    MyArrayList(Long id) {
        this.id = id;
    }

    public boolean contains(Object o) {
        boolean returnVal = false;

        if (o instanceof MyArrayList) {
            MyArrayList ptr = (MyArrayList) o;
            returnVal = ptr.id.longValue() == this.id;

        }
        return returnVal;
    }

    public String myToString() {
        String stringList = "";
        for (int i = 0; i < mySize; i++) {
            stringList = elementData[i] + " ";
            System.out.println(stringList);
        }
        return stringList;
    }


}
