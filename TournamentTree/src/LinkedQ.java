public class LinkedQ extends LinkedList{
    
    public LinkedQ(){
        super();
        
    }
    
    public void enqueue(Object obj){
        insertLast(obj);
    }
    
     public BinTreeNode dequeue(){
        return deleteFirst();
    }
    
    public boolean isEmpty(){
        if(getSize() == 0){
            return true;
        }
        
        return false;
    }
}

