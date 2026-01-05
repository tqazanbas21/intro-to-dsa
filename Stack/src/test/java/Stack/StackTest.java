package Stack;

import static org.junit.Assert.*;

import org.junit.*;

public class StackTest { 
    Stack st;
    @Test
    public void testPushAndPop () {
	st = new Stack(3);
	st.push(20);
	st.push(21);
	st.push(22);
	assertEquals(22, st.pop());
	assertEquals(21, st.pop());
	assertEquals(20, st.pop());
    }
    @Test
    public void testIsEmpty () {
	st = new Stack(2);
	assertTrue(st.isEmpty());
	st.push(1);
	assertFalse(st.isEmpty());
	st.push(2);
	assertFalse(st.isEmpty());
    }

    @Test
    public void testSize () {
	st = new Stack(2);
	assertEquals(0, st.size());
	st.push(1);
	assertEquals(1, st.size());
	st.push(2);
	assertEquals(2, st.size());
	st.pop();
	assertEquals(1, st.size());
    }
    
    @Test(expected=StackException.class)
    public void testOnPopEmptyStack () {
	st = new Stack(2);
	st.pop();	
    }

  
    @Test(expected=StackException.class)
    public void testOnTopEmptyStack () {
	st = new Stack(2);
	st.top();	
    }
	  
    @Test(expected=StackException.class)
    public void testOnFullStack () {
	st = new Stack(2);
	st.push(1);
	st.push(2);
	st.push(3);
    }

}
