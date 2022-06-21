package learn.java.datastructures;

public class SLLNode {

    private int val;
    private SLLNode prev;

    public int getVal(){
        return this.val;
    }

    public SLLNode(int val, SLLNode prev) {
        this.val = val;
        this.prev = prev;
    }

    public SLLNode(int val) {
        this(val, null);
    }

    public void setPrev(SLLNode node){
        this.prev = node;
    }

    public SLLNode getPrev(){
        return this.prev;
    }

    public String toString(){
        String result;
        result = String.format("\nValue : %s", this.val);
        String prevVal = "***";
        if (this.prev != null) {
            prevVal = Integer.toString(prev.val);
        }
        result += String.format("\nPrevious : %s", prevVal);
        return result;
    }

}
