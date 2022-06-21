package learn.java.datastructures;

public class Queue {

    private SLLNode front = null;
    private SLLNode back = null;
    private Integer count = 0;

    public boolean isEmpty(){
        return this.front==null;
    }

    public Integer getCount(){
        return this.count;
    }

    public Queue enq(Integer data){
        SLLNode node = new SLLNode(data);
        if (this.isEmpty()){
            this.front = node;
        } else {
            this.back.setPrev(node);
        }
        this.back = node;
        count++;
        return this;
    }

    public Integer dq(){
        Integer ret;
        if (this.isEmpty()) {
            ret = null;
        } else {
            ret = this.front.getVal();
            this.front = this.front.getPrev();
        }
        count--;
        return ret;
    }

    public Integer peek(){
        if (!this.isEmpty()){
            return this.front.getVal();
        } else {
            return null;
        }
    }

    public void print(){
        SLLNode node = this.front;
        while (node != null){
            System.out.printf("Node -> %d\n", node.getVal());
            node = node.getPrev();
        }
    }

}
