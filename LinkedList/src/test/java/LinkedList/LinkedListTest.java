package LinkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

 
   LinkedList<Integer> ll = new LinkedList<Integer>();
    
    @Test
    public void testSize () {
    	assertEquals(0, ll.size());
	ll.insertAtTail(1);
	assertEquals(1, ll.size());
	ll.insertAtTail(2);
	assertEquals(2, ll.size());
	ll.deleteAtTail();
	assertEquals(1, ll.size());
	ll.deleteAtTail();
	assertEquals(0, ll.size());
    }
    
    @Test
    public void testIsEmpty () {
	assertTrue(ll.isEmpty());
	ll.insertAtHead(2);
	assertFalse(ll.isEmpty());
    }

    @Test
    public void testInsertAtHead() {
	ll.insertAtHead(1);
	assertEquals("1", ll.allValuesToString());
	ll.insertAtHead(2);
	assertEquals("2 1", ll.allValuesToString());
	ll.insertAtHead(3);
	assertEquals("3 2 1", ll.allValuesToString());
    }
    @Test
    public void testInsertAtTail() {
    	ll.insertAtTail(1);
	assertEquals("1", ll.allValuesToString());
    	ll.insertAtTail(2);
	assertEquals("1 2", ll.allValuesToString());
	ll.insertAtTail(3);
	assertEquals("1 2 3", ll.allValuesToString());
    }
    @Test 
    public void testInsertAtIndex () {
	ll.insertAtTail(1);	
	ll.insertAtTail(2);
	ll.insertAtTail(3);
	ll.insertAtTail(4);
	ll.insertAtTail(5);
	ll.insertAtIndex(10, 2);
	assertEquals("1 2 10 3 4 5", ll.allValuesToString());
	ll.insertAtIndex(20, 4);
	assertEquals("1 2 10 3 20 4 5", ll.allValuesToString());
    	ll.insertAtIndex(30, 6);
	assertEquals("1 2 10 3 20 4 30 5", ll.allValuesToString());
    }

    @Test
    public void testDeleteAtHead() {
	ll.insertAtHead(1);
	// when i tried to use primitive int, it caused an error
	assertEquals(new Integer(1), ll.deleteAtHead());
	assertTrue(ll.isEmpty());
	ll.insertAtHead(2);
	ll.insertAtHead(3);
	assertEquals(new Integer(3), ll.deleteAtHead());
	assertEquals("2", ll.allValuesToString());
	assertEquals(new Integer(2), ll.deleteAtHead());
    	assertTrue(ll.isEmpty());
    }

    @Test 
    public void testDeleteAtTail() {
	ll.insertAtTail(1);
	assertEquals(new Integer(1), ll.deleteAtTail());
	assertTrue(ll.isEmpty());
	ll.insertAtTail(2);
	ll.insertAtTail(3);
	assertEquals(new Integer(3), ll.deleteAtTail());
	assertEquals("2", ll.allValuesToString());
	assertEquals(new Integer(2), ll.deleteAtTail());
    	assertTrue(ll.isEmpty());
    }

    @Test
    public void testDeleteAtIndex() {
	ll.insertAtTail(1);
	ll.insertAtTail(2);
	ll.insertAtTail(3);
	ll.insertAtTail(4);
	ll.insertAtTail(5);
	assertEquals(new Integer(1), ll.deleteAtIndex(0));
	assertEquals("2 3 4 5", ll.allValuesToString());
	assertEquals(new Integer(5), ll.deleteAtIndex(3));
	assertEquals("2 3 4", ll.allValuesToString());
	assertEquals(new Integer(3), ll.deleteAtIndex(1));
	assertEquals("2 4", ll.allValuesToString());
    }

    @Test
    public void testGet () {
	ll.insertAtTail(1);
	ll.insertAtTail(2);
	ll.insertAtTail(3);
	ll.insertAtTail(4);
	assertEquals(new Integer(1), ll.get(0));
	assertEquals(new Integer(3), ll.get(2));
	assertEquals(new Integer(4), ll.get(3));
    }

    @Test 
    public void testSearch () {
	ll.insertAtTail(1);
	ll.insertAtTail(2);
	ll.insertAtTail(3);
	ll.insertAtTail(4);
	ll.insertAtTail(5);
	assertTrue(ll.search(2));
	assertTrue(ll.search(3));
	assertFalse(ll.search(9));
    }

    // testing error conditions
    @Test(expected=LinkedListException.class)
    public void testErrorDeleteAtHead () {
    	ll.deleteAtHead();
    }
    @Test(expected=LinkedListException.class)
    public void testErrorDeleteAtTail() {
    	ll.deleteAtTail();
    }
    
    @Test(expected=LinkedListException.class)
    public void testErrorDeleteAtIndexOfEmptyLL () {
	ll.deleteAtIndex(3);
    }
    @Test(expected=LinkedListException.class)
    public void testDeleteAtIndexOutOfBoundaries () {
    	ll.insertAtTail(1);
	ll.insertAtTail(2);
	ll.insertAtTail(4);
	ll.deleteAtIndex(6);
    }
    @Test(expected=LinkedListException.class)
    public void testGetFromEmptyLL () {
	ll.get(6);
    }
    @Test(expected=LinkedListException.class)
    public void testGetIndexOutOfBoundaries () {
    	ll.insertAtTail(2);
	ll.insertAtTail(3);
	ll.insertAtTail(4);
	ll.get(9);
    }
    @Test(expected=LinkedListException.class)
    public void testSearchInEmptyLL () {
    	ll.search(2);
    }
    @Test(expected=LinkedListException.class)
    public void insertAtIndexOutOfBoundaries () {
    	ll.insertAtIndex(2, 3);
    }
}
