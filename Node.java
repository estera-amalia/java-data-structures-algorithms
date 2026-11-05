package assignment;

public class Node {
	//data stored in the node
	int value;
	//pointer to next node
	Node next;
	//the constructor
	public Node(int value) {
		this.value=value;
		//node points to nothing
		this.next=null;
	}
}
