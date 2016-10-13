package test.java;

import main.java.MyArrayList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyArrayListTest {

    MyArrayList<Integer> list = new MyArrayList<Integer>();


    @Before
    public void setUp() throws Exception {
        list.myAdd(1);
        list.myAdd(2);
        list.myAdd(3);
        list.myAdd(4);
    }

    @Test
    public void myAdd() throws Exception {
        list.myAdd(10);
        assertEquals(new Integer (10), list.myGet(4));
    }

    @Test
    public void myGet() throws Exception {
        assertEquals(new Integer (3), list.myGet(2));
    }

    @Test
    public void myRemove() throws Exception {
        list.myRemove(0);
        assertEquals(3, list.getSize());
    }

    @Test
    public void getSize() throws Exception {
        assertEquals(4, list.getSize());
    }

    @Test
    public void contains() throws Exception {
        assertEquals(false, list.contains(new Integer (123)));
    }

    @Test
    public void myToString() throws Exception {

    }
}