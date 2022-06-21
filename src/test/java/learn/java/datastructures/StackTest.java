package learn.java.datastructures;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class StackTest {

    private Stack s;

    @Before
    public void init() {
        s = new Stack();
    }

    @Test
    public void testEmptyness() {
        assertTrue("Stack is Empty", s.isEmpty());
        assertTrue("Empty stack : Peek must be null", s.peek() == null);
        assertTrue("Empty stack : Pop must return null", s.pop() == null);
    }

    @Test
    public void testCount() {
        assertEquals("Empty stack count must be initialized to 0", (int) s.getCount(), 0);
        s.push(1).push(2);
        assertEquals("stack count must be incremented to 2", (int) s.getCount(), 2);
    }

    @Test
    public void testPush() {
        s.push(1);
        assertEquals("top of stack must be 1 after first push", (int) s.peek(), 1);

        s.push(2).push(3);
        assertEquals("Stack count must be 3", (int) s.getCount(), 3);
    }

    @Test
    public void testPop() {
        for (int i=0; i<=3; i++) {
            s.push(i);
        }
        assertEquals("Test Peek", (int) s.peek(), 3);
        assertEquals("Test Pop", (int) s.pop(), 3);
        assertEquals("Test Pop", (int) s.pop(), 2);
        assertEquals("Test Pop", (int) s.pop(), 1);

    }

}
