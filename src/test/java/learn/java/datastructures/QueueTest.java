package learn.java.datastructures;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class QueueTest {

    private Queue q;

    private void fill(Queue q) {
        for (int i=1; i<=3; i++) {
            q.enq(i);
        }
    }

    @Before
    public void init() {
        q = new Queue();
    }

    @Test
    public void testEmptyNess() {
        assertTrue("Queue must be empty", q.isEmpty());
    }

    @Test
    public void testEnq() {
        this.fill(q);
        assertEquals("Queue length must be 3", (int) q.getCount(), 3);
        assertEquals("Queue peek must return 1", (int) q.peek(), 1);
    }

    @Test
    public void testDeq() {
        this.fill(q);
        assertEquals("Queue peek must return 1", (int) q.peek(), 1);
        assertEquals("Deq must return 1", (int) q.dq(), 1);
        assertEquals("Deq must return 1", (int) q.dq(), 2);
        assertEquals("Deq must return 1", (int) q.dq(), 3);
        assertTrue("Queue must be empty", q.isEmpty());
        assertEquals("Queue Count is 0", (int) q.getCount(), 0);
    }
}
