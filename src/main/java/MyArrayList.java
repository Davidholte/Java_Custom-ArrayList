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

    //  Best/Worst Case: O(1) fordi den bare tilføjer elementet tilsidst uden at manipulere listen
    public void myAdd(E e) {
        if (mySize == elementData.length) {
            expandList();
        }
        elementData[mySize++] = e;
    }

    //  Best Case: O(1) hvis elementet er det forreste i listen
    //  Worst Case: O(n) hvis elementet er det sidste i listen
    @SuppressWarnings("unchecked")
    public E myGet(int index) {
        if (index < 0 || index >= mySize) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return (E) elementData[index];
    }

    //  Best Case: O(1) hvis elementet der slettes er det forresste
    //  Worst Case: O(n) hvis elementet der slettes er det bagerste
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

    //  Best/Worst Case: O(n) fordi metoden opretter et nyt array med dobbel længde og tilføjer alle elementerne
    private void expandList() {
        int newSize = elementData.length * 2;
        elementData = Arrays.copyOf(elementData, newSize);
    }

    //  Best/Worst Case: O(1) fordi metoden kun returnerer en integer værdi der repræsenterer længden
    public int getSize() {
        return mySize;
    }



    //  Best Case: O(1) hvis elementet der sammenlignes er det forreste i listen
    //  Worst Case: O(n^2) hvis elementet der sammenlignes er det bagerste i listen
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

    // Best/Worst Case: O(n) Effektiviteten afhænger af listens størrelse
    public String myToString() {
        String stringList = "";
        for (int i = 0; i < mySize; i++) {
            stringList = elementData[i] + " ";
            System.out.println(stringList);
        }
        return stringList;
    }


}
