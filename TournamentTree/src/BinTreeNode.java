public class BinTreeNode {

    public BinTreeNode left;
    public BinTreeNode right;
    public String name, score;

    public BinTreeNode(String playerName, String theScore) {
        left = right = null;
        name = playerName;
        score = theScore;
    } // end of specific constructor

    public boolean isLeaf() {
         if(left == null && right == null){
             return true;
         }else{
             return false;
         }
    } // end of isLeaf()
    
    public void addLeftSubTree(BinTreeNode node){
        left = node;
    }

    public void addRightSubTree(BinTreeNode node){
        right = node;
    }
    
} // end of class BinTreeNode


