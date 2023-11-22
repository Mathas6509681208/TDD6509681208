package core;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	

	public void testCreateNewEmptyStack() {
		
		Stack s1 = new Stack();
		int size = s1.getSize();
		assertEquals(0,size);
		assertTrue(s1.isEmpty());
	}
	public void testPushElmToTop(){
		Stack s1 = new Stack();
		s1.push(1);
		 assertEquals(0,s1.isTop());
		
	}
	public void testPushAndPop() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.pop().intValue());
        assertEquals(2, stack.pop().intValue());
        assertEquals(1, stack.pop().intValue());
        assertTrue(stack.isEmpty());
    }

	
	
		
	}
	
	


