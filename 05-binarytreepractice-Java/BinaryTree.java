import java.util.LinkedList;
import java.util.Queue;

class Node {
	public int value;
	public Node left, right;
	public Node(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
}

public class BinaryTree {
	public Node root;
	
	public BinaryTree(int value) {
		// Your code goes here
		this.root = new Node(value);
	}

	public boolean search(int value) {
		// Your code goes here
		boolean flag = false;
		Node temp = root;
		Queue <Node> qu = new LinkedList<Node>();
		qu.add(temp);
		while(qu.isEmpty() == false){
			Node rem = qu.remove();
			if(rem.value == value){
				flag = true;
				break;
			}
			if(rem.right != null){
				qu.add(rem.right);
			}
			if(rem.left != null){
				qu.add(rem.left);
			}
		}
		return flag;
	}

	private boolean search_Node(Node node, int value) {
		// Your code goes here
		return false;

	}
}