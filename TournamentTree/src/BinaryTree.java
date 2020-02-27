
public class BinaryTree {

    protected BinTreeNode root;
    protected int         size;

    public BinaryTree() {
        root = null;
        size = 0;
    } // end of constructor

    public BinTreeNode getRoot() {
        return root; 
    }
    
    public int getSize() {
        return size; 
    }

    public void setRoot( BinTreeNode n ) { 
        root = n; 
    }

    public boolean isEmpty() {
        return size==0;
    } // end of isEmpty()

    public int height() {
         return recursiveHeight(root);
    } // end of height()

    private int recursiveHeight(BinTreeNode currNode) {
        if(currNode == null){
            return 0;
        }else{
            return 1 + Math.max( recursiveHeight(currNode.left), recursiveHeight(currNode.right) );
        }
    } // end of recursiveHeight()
    
    public String tournamentHistory(String participant){
        return recurHistory(root, participant, height() - 1);
    }
    
    public String recurHistory(BinTreeNode currNode, String participant, int height){
        String result = "";
        if(currNode.left != null){
            result += recurHistory(currNode.left, participant, height-1);
        }
        if(currNode.right != null){
            result += recurHistory(currNode.right, participant, height-1);
        }
        if(currNode.name.equals(participant) && !currNode.isLeaf()){
            if(currNode.name.equals(currNode.left.name)){
                result += participant + " defeated " + currNode.right.name + " in round " + height + " by a score of " + currNode.score + "\n";
            }
            if(currNode.name.equals(currNode.right.name)){
                result += participant + " defeated " + currNode.left.name + " in round " + height + " by a score of " + currNode.score + "\n";
            }
        }
        return result;
    }
    
} // end of class BinaryTree
