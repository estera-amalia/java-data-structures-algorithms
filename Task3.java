package assignment;
import java.util.LinkedList;
public class Task3 {
public static void main(String[] args) {
	//-> for Singly Linked List
	//create new empty list
	SinglyLinkedList list= new SinglyLinkedList();
	//add front numbers
	list.insert_front(3);
	list.insert_front(5);
	list.insert_front(7);
	//add end numbers
	list.insert_end(2);
	list.insert_end(4);
	list.insert_end(6);
	//printing list
	System.out.print("Singly linked list with numbers: ");
	list.display();
	System.out.println();
	//deleting a number
	list.delete(4);
	//printing list again
	System.out.println("List after deleting a value: ");
	list.display();
	System.out.println();
	//-> for Doubly Linked List
	//creating list
	DoublyLinkedList dl= new DoublyLinkedList();
	//add front numbers
	dl.insert_front(11);
	dl.insert_front(111);
	dl.insert_front(1111);
	//add end numbers
	dl.insert_end(22);
	dl.insert_end(222);
	dl.insert_end(2222);
	//printing list
	System.out.print("Doubly linked list: ");
	dl.display();
	System.out.println();
	//deleting a number
	dl.delete(1111);
	System.out.print("Doubly list after deleting a value: ");
	dl.display();
	System.out.println();
	//creating binary search tree
	BST tree= new BST();
	tree.insert(100);
	tree.insert(200);
	tree.insert(300);
	tree.insert(400);
	tree.insert(500);
	System.out.println("Tree made.");
	System.out.println();
	//printing tree/ applying in_order_traversal
	System.out.print("This is the tree: ");
	tree.inOrder();
	System.out.println();
	//searching for a give value
	System.out.println("Is it true that we have the number 300 in the tree? " + tree.search(300));
	System.out.println("Is it true that we have the number 600 in the tree? " + tree.search(999));
	//deleting a value
	System.out.print("Tree in order before deleting a value: ");
	System.out.println();
	tree.delete(300);
	System.out.print("And after deleting a value: ");
	//applying in_order_traversal
	tree.inOrder();

}
}
