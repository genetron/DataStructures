
public class LinkedList {
	
	static //Head of list
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
	
	
	
	//------------add node to head-----------------//
	public void headInsert(int data){
		//create new node and add data
		Node new_node = new Node(data);
		
		//make it point to head
		new_node.next = head;
		
		//make new node head
		head = new_node;
	}
	
	
	
	//---------------function to traverse/print the linked list----//
	public void printList() {
		Node n = head;
		
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
	
	
	//-------------Insert Node at middle, given any middle node------//
	public void middleInsert(Node prev_node, int data){
		//check if the node is null
		if(prev_node == null){
			System.out.println("The given node should not be null");
			return;
		}
		
		//create new node with data
		Node new_node = new Node(data);
		
		//grab the next node from previous node and redirect prev node to new
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}
	
	
	//----------------Insert node at end--------------------//
	public void append(int data){
		//create node and put data
		Node new_node = new Node(data);
		
		//if list is empty make this head node
		if(head == null){
			head = new_node;
			return;
		}
		
		//new node is pointing to null since it will be last
		new_node.next = null;
		
		//traverse till the last node
		Node last = head;
		while(last.next != null){
			last = last.next;
		}
		
		last.next = new_node;
	}
	
		
	
	//---------------main method------------------------------//
		public static void main(String[] args) {
			//built in data structure
			LinkedList llist = new LinkedList();
			
			//insert first node
			System.out.println("Appending 0");
			llist.append(0);
			llist.printList();
			
			//add head node
			System.out.println("Adding -1 as head");
			llist.headInsert(-1);
			llist.printList();
			
			//add node to middle
			System.out.println("Adding node after -1");
			llist.middleInsert(head, 10);
			llist.printList();
			
			//adding node after 10
			System.out.println("Adding node after 10");
			llist.middleInsert(head.next,20);
			llist.printList();
			
			//add after 20
			System.out.println("adding after 20");
			llist.middleInsert(head.next.next,30);
			llist.printList();
		}
	
}
