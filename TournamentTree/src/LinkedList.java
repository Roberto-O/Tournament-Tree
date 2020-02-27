public class LinkedList {

    protected Link first;
    protected int size;
    protected Link last;

    public LinkedList() {
        size = 0;
        first = null;
        last = null;
    } // end of constructor

    public Link getFirst() {
        return first;
    } // end of getFirst()

    public int getSize() {
        return size;
    } // end of getSize()

    public BinTreeNode deleteFirst() {
        BinTreeNode answer = (BinTreeNode) first.data;
        
        if(first == last){ 
            last = null;
            first = null;
            size--;
        }else{
            first = first.next;
            size--;
        }
        
        return answer;
    } // end of deleteFirst()   
    
    public void insertLast(Object newObj){
        Link newestLink = new Link(newObj);
        
        if(size == 0){
            newestLink.next = first; //null
            first = newestLink;
            size++;
        }else if(size == 1){
            newestLink.next = last; //null
            last = newestLink;
            first.next = last;
            size++;
        }else{
            newestLink.next = last.next;
            last.next = newestLink;
            last = newestLink;
            size++;
        }
    }
    
}  // end class LinkedList
