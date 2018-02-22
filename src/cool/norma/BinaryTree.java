package cool.norma;

public class BinaryTree {
    private Node root;

    public static void main(String args[]){
        try {
            int values[] = {1, 2, 3, 4, 6};

            BinaryTree tree = new BinaryTree();
            int looper;
            for (looper = 0; looper < values.length; looper++) {
                tree.insert(tree.getRoot(), values[looper]);
            }

            tree.preOrderTraversal();
            System.out.println("*******************");
            tree.inOrderTraversal();
            System.out.println("*******************");
            tree.postOrderTraversal();
            System.out.println("*******************");
        }catch(Exception e){
            e.printStackTrace(System.out);
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

    public void preOrderTraversal(){
        preOrderTraversal(root);
    }
    private void preOrderTraversal(Node node){
        if(node!=null){
            System.out.println("|" + node.getValue() + "|");
            preOrderTraversal(node.getLeft());
            preOrderTraversal(node.getRight());
        }
    }

    public void postOrderTraversal(){
        postOrderTraversal(root);
    }
    private void postOrderTraversal(Node node){
        if(node!=null){
            preOrderTraversal(node.getLeft());
            preOrderTraversal(node.getRight());
            System.out.println("|" + node.getValue() + "|");
        }
    }

    public void inOrderTraversal(){
        inOrderTraversal(root);
    }
    private void inOrderTraversal(Node node){
        if(node!=null){
            preOrderTraversal(node.getLeft());
            System.out.println("|" + node.getValue() + "|");
            preOrderTraversal(node.getRight());
        }
    }
    public int size(){

        return(countNodes(root));
    }
    private int countNodes(Node n){
        if(n!=null) {
            return (1 + countNodes(n.getLeft()) + countNodes(n.getRight()));
        }
        else{
            return(0);
        }
    }

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
