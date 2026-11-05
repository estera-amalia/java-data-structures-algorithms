package assignment;

public class SinglyLinkedList {
	//first block in chain
	Node head;
	//1. insert_front- inserting new node with given value at the front of list
	public void insert_front(int value) {
		//creating new block
		Node newNode= new Node(value);
		//pointing new block to old head
		newNode.next=head;
		//new block becomes the head
		head= newNode;
	}
	// 2. insert_end- inserting new node with given value at the end of the list
	public void insert_end(int value) {
		Node newNode= new Node(value);
		//if list is empty
		if(head==null) {
			//new block is the first block
			head=newNode;
			return;
		}
		//starting at first block
		Node current= head;
		//going until the last one
		while (current.next !=null) {
			current=current.next;
		}
		//attaching new block at end
		current.next=newNode;
	}
	//3.delete- deletes the first occurrence of a node with the given value from list
	public void delete(int value) {
		if(head==null) {
			return; //check if empty
		}
		//checking if the first block has the value
		if(head.value==value) {
			head=head.next;
			return;
		}
		Node current=head;
		//finding the value
		while(current.next!=null && current.next.value != value) {
			current=current.next;
		}
		//if we found value
		if(current.next != null) {
			//skip over it/ substitute
			current.next=current.next.next;
		}
	}
	//4. display- print all the elements of the list
	public void display() {
		Node current = head;
		while(current!= null) {
			System.out.print(current.value + " - > ");
			current=current.next;
		}
		System.out.print("end");
	}
}
