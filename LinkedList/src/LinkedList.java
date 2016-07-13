
public class LinkedList {
	
	//Head of list
	Node head;
	
	//Inner class Node.  Static so that main can uise it.
	//-------------------Inner class starts---------------------//
	static public class Node{
		//fields
		int data;
		Node next;
		
		//constructor
		Node(int d){
			data = d;
			next = null;
		}
	}
	//------------------Inner class ends-----------------------//
	
	
	
	//---------------main method------------------------------//
	public static void main(String[] args) {
		//built in data structure
		LinkedList llist = new LinkedList();
		
		//initialising nodes. Only data will be filled.
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		//Connecting them
		llist.head.next = second;
		second.next = third;
		
		//print the data
		llist.printList();
	}
	//--------------------main ends--------------------------//
	
	
	
	//---------------function to traverse/print the linked list----//
	public void printList() {
		Node n = head;
		
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
	//---------------printlist() ends----------------------//
	
}
