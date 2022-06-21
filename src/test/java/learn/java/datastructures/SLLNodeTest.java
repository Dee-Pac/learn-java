package learn.java.datastructures;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SLLNodeTest {

    private SLLNode node1;
    private SLLNode node2;

    @Before
    public void init(){
        node1 = new SLLNode(10);
        node2 = new SLLNode(20);
    }

    @Test
    public void testNodeFunctions(){
        assertEquals("Node value must be 10", (int) node1.getVal(), 10);
        assertEquals("Node value must be 20", (int) node2.getVal(), 20);
        assertTrue("Node next must be empty", node1.getPrev() == null );
        node1.setPrev(node2);
        assertTrue("Node next must be 20", node1.getPrev().getVal() == 20 );
        String expected = "\nValue : 10" + "\nPrevious : 20";
        assertEquals("Print Test", (String) node1.toString(), expected);
        expected = "\nValue : 20" + "\nPrevious : ***";
        assertEquals("Print Test", (String) node2.toString(), expected);
    }
}
