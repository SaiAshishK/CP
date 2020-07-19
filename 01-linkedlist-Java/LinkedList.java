
class Element{
	int value;
	Element next;
	public Element(int value){
		this.value = value;
		this.next = null;
	}
}

public class LinkedList{
	Element head;
	public LinkedList(Element head){
		this.head = head;
	}

	public void append(Element new_element){
		// Your code goes here
		Element temp = head;
		while(temp.next!= null){
			temp = temp.next;
		}
		temp.next = new_element;

	}

	public Element get_position(int position){
		// Get an element from a particular position.
        // Assume the first position is "1".
        // Return nul1 if position is not in the list
		// Your code goes here
		Element c = head;
		
			for(int i = 0 ; i < position-1 ; i++){
				// System.out.println(c.value+"  ");
				
				c = c.next;
				
			}
			return c;
	}

	public void insert(Element new_element, int position){
	   // """Insert a new node at the given position.
       // Assume the first position is "1".
       // Inserting at position 3 means between
       // the 2nd and 3rd elements."""
		// Your code goes here
		Element temp = head;
		for(int i = 1 ; i < position-1 ; i++){
			temp = temp.next;
		}
		Element temp1= temp.next;
		temp.next = new_element;
		new_element.next = temp1;

	}

	public void delete(int value){
		// Delete the first node with a given value.
		// Your code goes here
		Element temp = head;
		if(temp.value == value){
			head = head.next;
			temp = null;
		}
		else{
		try{
		while(temp.next.value != value){
			temp = temp.next;
		}
		Element temp1 = temp.next;
		temp1 = temp1.next;
		temp.next = temp1;
		}	
		catch(Exception e){
			// System.out.println("n");
		}
	}
		
	}

	public static void main(String[] args) {
		Element e1 = new Element(1);
		LinkedList l1 = new LinkedList(e1);
		l1.append(new Element(2));
		l1.append(new Element(3));
		Element e4 = new Element(4);
		l1.insert(e4,3);
		l1.delete(1);
		System.out.println(l1.get_position(1).value);
		System.out.println(l1.get_position(2).value);
		System.out.println(l1.get_position(3).value);
		System.out.println(l1.get_position(3).value);
	}
}
