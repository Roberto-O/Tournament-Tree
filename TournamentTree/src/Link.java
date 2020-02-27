public class Link {

    public Object data;
    public Link   next;

    public Link(Object obj) {
        data = obj;
        next = null;
    } // end of specific constructor

    public Link() {
        data = null;
        next = null;
    } // end of generic constructor

}  // end class Link
