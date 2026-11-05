package assignment;
import java.util.ArrayList;
import java.util.Iterator;
public class Array {
public static void main(String[] args) {
	//creating the list
	ArrayList <Integer> listofnumbers= new ArrayList();
	//adding number on the list
	listofnumbers.add(0);
	listofnumbers.add(10);
	listofnumbers.add(33);
	listofnumbers.add(-10);
	listofnumbers.add(50);
	listofnumbers.add(1000);
	//using iterator
	System.out.println("The numbers less than 50 are the following ");
	Iterator<Integer> ite=listofnumbers.iterator();
	while(ite.hasNext()){
		int nb=ite.next();
		if(nb<50) {
			System.out.print(" "+nb+" ");
		}
	}
}
}
