
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
        Node temp = root;
        Node prev = null;
        while(true){
            if(temp == null){
                if(value > prev.value){
                    prev.right = new Node(value);
                    break;
                }
                else if( value < prev.value){
                    prev.left = new Node(value);
                    break;
                }
            }
            else{
                if(value > temp.value){
                    prev = temp;
                    temp = temp.right;
                }
                else if(value < temp.value){
                    // System.out.println("--------------------");
                    prev = temp;
                    temp = temp.left;
                }
            }
        }
    }
    private Node insert(Node node, int value) {
        // Your code goes here
        return new Node(0);
    }
    

    public boolean search(int value) {
        // Your code goes here
        if(root.value == value){
            return true;
        }
        else{
            return search(root,value);
        }
    }

    private boolean search(Node current, int value) {
        // Your code goes here
        if(current == null){
            return false;
        }
        if(current.value == value){
            return true;
        }
        if(current.value > value){
            return search(current.left,value);
        }
    	return search(current.right, value);
    }

}