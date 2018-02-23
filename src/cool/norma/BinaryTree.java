package cool.norma;

public class BinaryTree {
    private Node root;

    public static void main(String args[]){
        try {

            BinaryTree tree = new BinaryTree();
            tree.builder();

            System.out.println("PRE: ");
            tree.preOrderTraversal();
            System.out.println("*******************");
            System.out.println("IN: ");
            tree.inOrderTraversal();
            System.out.println("*******************");
            System.out.println("POST: ");
            tree.postOrderTraversal();
            System.out.println("*******************");
            System.out.println("nodes: " + tree.countNodes(tree.getRoot()));
        }catch(Exception e){
            e.printStackTrace(System.out);
        }

    }

    public void builder(){
        root = new Node("A");
        root.setRight(new Node("C"));
        root.setLeft(new Node("B"));
        root.getLeft().setLeft(new Node("D"));
        root.getLeft().setRight(new Node("E"));
        root.getRight().setLeft(new Node("F"));
        root.getRight().setRight(new Node("G"));
    }
    /*public void insert(Node node, int value){

        if(value<node.getValue()){
            if(node.getLeft()==null){
                node.setLeft(new Node(value));

            }else {
                insert(node.getLeft(), value);
            }
        }else{
            if(node.getRight()==null){
                node.setRight(new Node(value));
            }else {
                insert(node.getRight(), value);
            }
        }

    }*/
    public Node getRoot(){
        return(root);
    }

    public void setRoot(String x){
        root = new Node(x);
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
            postOrderTraversal(node.getLeft());
            postOrderTraversal(node.getRight());
            System.out.println("|" + node.getValue() + "|");
        }
    }

    public void inOrderTraversal(){
        inOrderTraversal(root);
    }
    private void inOrderTraversal(Node node){
        if(node!=null){
            inOrderTraversal(node.getLeft());
            System.out.println("|" + node.getValue() + "|");
            inOrderTraversal(node.getRight());
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
    private int getDepth(){
        Node r = getRoot();
        
    }

    private class Node{
        String value;
        Node left;
        Node right;

        Node(String x) {
            value = x;
            left = null;
            right = null;
        }
        String getValue(){
            return(value);
        }
        Node getLeft(){
            return(left);
        }
        Node getRight(){
            return(right);
        }
        void setLeft(Node n) {left = n;}
        void setRight(Node n){right =n;}

    }
}
