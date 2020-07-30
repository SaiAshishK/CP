
class Node {
    public int value;
    public Node left, right;
    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BST {
    public Node root;
    
    public BST(int value) {
        this.root = new Node(value);
    }

    public void insert(int value) {
        // Your code goes here
        root = insert(root,value);
    }
    private Node insert(Node node, int value) {
        // Your code goes here
        if(node == null){
            System.out.println("2"+node);
            node = new Node(value);
            System.out.println(root.left.value);
            return null;
        }
        if(value < node.value){
            System.out.println("1"+node.left);
            node.left = insert(node.left,value);
        }
        else{    // System.out.println("1");
            node.right = insert(node.right,value);
        }
        return null;
    }
    

    public boolean search(int value) {
        // Your code goes here
        if(root.value == value){
            return true;
        }
        else{
            // System.out.println("1");
            return search(root,value);
        }
    }

    private boolean search(Node current, int value) {
        // Your code goes here
        if(current == null){
            // System.out.println("4");
            return false;
        }
        if(current.value == value){
            // System.out.println("3");
            return true;
        }
        if(current.value > value){
            return search(current.left,value);
        }
        // System.out.println("2");
    	return search(current.right, value);
    }
    public void as(){
        System.out.println(root.value);
        System.out.println(root.left.value);
        // System.out.println(root.left.left.value);
        // System.out.println(root.left.right.value);
        // System.out.println(root.right.value);


    }
    public static void main(String[] args) {
        BST b = new BST(4);
        b.insert(2);
        b.as();
    }

}