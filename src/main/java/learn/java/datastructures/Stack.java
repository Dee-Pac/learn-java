package learn.java.datastructures;

public class Stack {

    private SLLNode top;
    private Integer count=0;

    public boolean isEmpty(){
        return top == null;
    }

    public Integer peek(){
        return this.isEmpty() ? null : top.getVal();
    }

    public Integer getCount(){
        return this.count;
    }

    public Integer pop(){
        count--;
        if (this.isEmpty()){
            return null;
        }
        else {
            SLLNode tmp = this.top;
            this.top = tmp.getPrev();
            return tmp.getVal();
        }
    }

    public void print(){
        System.out.printf("Total Count : %d", this.count);
        SLLNode tmp = this.top;
        while (tmp != null){
            System.out.println(tmp.toString());
            tmp = tmp.getPrev();
        }
    }

    public Stack push(int val){
        SLLNode newNode = new SLLNode(val);
        SLLNode tmp = this.top;
        if (this.top != null) {
            newNode.setPrev(this.top);
        }
        this.top = newNode;
        count++;
        return this;
    }

}