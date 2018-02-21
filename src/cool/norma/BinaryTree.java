package cool.norma;

public class BinaryTree {
    private Node root;


    public static void main(String args[]){
        BinaryTree tree = new BinaryTree();
        int looper;
        for(looper=0; looper<args.length; looper++){
            tree.insert(tree.getRoot(),Integer.parseInt(args[looper]));
        }
    }
    public void insert(Node start, int value){

        if(start==null)
            start = new Node(value);
        else{
            if(start.getValue()>value){
                insert(start.getLeft(), value);
            }else{
                insert(start.getRight(),value);
            }
        }
    }
    public Node getRoot(){
        return(root);
    }
    //getHeight();
    //balance();
    //insert();
    //inorderTraversal();
    //leftOrderTraversal();
    //rightOrderTraversal();

    private class Node{
        int value;
        Node left;
        Node right;

        Node(int x) {
            value = x;
            left = null;
            right = null;
        }
        int getValue(){
            return(value);
        }
        Node getLeft(){
            return(left);
        }
        Node getRight(){
            return(right);
        }
    }
}
