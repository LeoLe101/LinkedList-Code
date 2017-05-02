package cs143;

import java.util.Iterator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Phuc Hong Le
 */
public class MyLinkedListTest {
    
    private MyLinkedList<Integer> list;
    
    public MyLinkedListTest() {
    }
    
    @Before
    public void setUp() {
        list = new MyLinkedList<>();
    }

    /**
     * Test of getFirst method, of class MyLinkedList.
     */
    @Test
    public void testGetFirst() {
        
    }

    /**
     * Test of getLast method, of class MyLinkedList.
     */
    @Test
    public void testGetLast() {
    }

    /**
     * Test of addFirst method, of class MyLinkedList.
     */
    @Test
    public void testAddFirst() {
    }

    /**
     * Test of addLast method, of class MyLinkedList.
     */
    @Test
    public void testAddLast() {
    }

    /**
     * Test of add method, of class MyLinkedList.
     */
    @Test
    public void testAdd() {
    }

    /**
     * Test of removeFirst method, of class MyLinkedList.
     */
    @Test
    public void testRemoveFirst() {
    }

    /**
     * Test of removeLast method, of class MyLinkedList.
     */
    @Test
    public void testRemoveLast() {
    }

    /**
     * Test of remove method, of class MyLinkedList.
     */
    @Test
    public void testRemove() {
    }

    /**
     * Test of toString method, of class MyLinkedList.
     */
    @Test
    public void testToString() {
    }

    /**
     * Test of clear method, of class MyLinkedList.
     */
    @Test
    public void testClear() {
    }

    /**
     * Test of contains method, of class MyLinkedList.
     */
    @Test
    public void testContains() {
    }

    /**
     * Test of get method, of class MyLinkedList.
     */
    @Test
    public void testGet() {
    }

    /**
     * Test of indexOf method, of class MyLinkedList.
     */
    @Test
    public void testIndexOf() {
    }

    /**
     * Test of lastIndexOf method, of class MyLinkedList.
     */
    @Test
    public void testLastIndexOf() {
    }

    /**
     * Test of set method, of class MyLinkedList.
     */
    @Test
    public void testSet() {
    }

    /**
     * Test of iterator method, of class MyLinkedList.
     */
    @Test
    public void testIteratorRemove() {
        list.add(12);
        Iterator<Integer> itr = list.iterator();
        if (itr.hasNext() && itr.next().equals(12)) {
            itr.remove();
        }
        assertFalse(itr.hasNext());
        list.add(12);
        list.add(15);
        list.add(3);
        itr = list.iterator();
        itr.next();
        itr.next();
        itr.next();
        itr.remove();
        assertSame(list.size(), 2);
        assertSame(list.getLast(), 15);
        assertSame(list.getFirst(), 12);
    }
    
}
