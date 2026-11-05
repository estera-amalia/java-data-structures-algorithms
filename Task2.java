package assignment;
import java.util.Stack;
import java.util.Scanner;
public class Task2 {
public static void main(String[] args) {
	//creating a stack of numbers
	Stack<Integer> numbers=new Stack<>();
	Scanner nm= new Scanner(System.in);
	//asking the user for 3 numbers to put in a stack
	System.out.println("Please insert 3 numbers to add in a stack: ");
	for(int i=0; i<3; i++) {
		int nmbr= nm.nextInt();
	numbers.push(nmbr);
	}
	//printing the stack
	System.out.println("The stack you entered is "+numbers);
	//i. push(item) - adding an item on top of the stack
	//asking the user to pick what they want to add
	Scanner ber=new Scanner(System.in);
	System.out.println("Please write another number you want to add on top of the stack: ");
	int newnum= ber.nextInt();
	numbers.push(newnum);
	//printing new stack
	System.out.println("Stack with the new number on top "+numbers);
	//ii. pop()- removes item at the top of the stack
	numbers.pop();
	//printing stack
	System.out.println("Stack with the new number removed "+numbers);
	//iii. peek()- returning the item on top without removing it
	System.out.println("The number on top of the stack is "+numbers.peek());
	//iv. isEmpty()- returning true if stack is empty, false otherwise
	System.out.println("Is the stack empty? "+numbers.isEmpty());
	//v.getMin()- returning the minimum item of the stack without removing it
	//printing the stack and the getMin method applied to it
	System.out.println("The minimum number of the stack "+numbers+ " is "+getMin(numbers));
}
	//creating getMin method to find the minimum
public static int getMin( Stack <Integer> stack ) {
	    int min = stack.peek(); 
	    for (int num : stack) {
	        if (num < min) {
	            min = num;
	        }
	    }
	    return min;   
	}

}


