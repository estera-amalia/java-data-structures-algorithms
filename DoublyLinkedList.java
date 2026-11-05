package assignment;

public class DoublyLinkedList {
	private DNode head, tail;
	// i. insert_front(value)- inserts a new node with given value at the front of the list
	public void insert_front (int value) {
		DNode n= new DNode(value);
		//the new node is pointing to old head
		n.next=head;
		//checking if list is empty
		if (head!=null) {
			head.prev=n;
		} else {
			//if list is empty, tail=n
			tail=n;
		}
		head=n;
	}
	// ii. insert_end(value)- inserts new node with given value at the end of the list
	public void insert_end(int value) {
		DNode n=new DNode(value);
		//new node is old tail
		n.prev=tail;
		//if list is empty, head=n
		if (tail != null) {
			tail.next=n;
		} else {
			head=n;
		}
		tail=n;
	}
	// iii. delete(value)- deletes the first occurrence of a node with given value from list
	public void delete(int value) {
		DNode curre=head;
		while(curre!= null && curre.value != value) {
			curre=curre.next;
		}
		//not found
		if(curre==null) {
			return;
		}
		if(curre.prev != null) {
			curre.prev.next=curre.next;
		} else {
			head=curre.next;
		}
		if (curre.next != null) {
			curre.next.prev=curre.prev;
		} else {
			tail=curre.prev;
		}
	}
	// iv. display()- show list
	public void display() {
		DNode cu= head;
		while(cu != null) {
			System.out.print(cu.value+(cu.next==null ? " -> end " :" <-> "));
			cu=cu.next;
		}
		if(head==null) {
			System.out.println("Empty.");
		}
	}
}
