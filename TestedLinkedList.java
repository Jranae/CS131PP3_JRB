package linkedlist;

import linkedlist.Node;
import linkedlist.GenericLinkedList;
import linkedlist.LinkedList;
import linkedlist.GenericNode;

public class TestedLinkedList {
public static void main(String[] args) {
		
		LinkedList myList=new LinkedList();
		GenericLinkedList<?> genList = new GenericLinkedList();
		
		Node aNode=new Node();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);
		
		GenericNode bNode = new GenericNode();
		bNode.setData(34);
		genList.addNode(bNode);
		bNode = new GenericNode();
		
		bNode.setData(8.9);
		genList.addNode(bNode);
		bNode = new GenericNode();
		
		bNode.setData("Jalele");
		genList.addNode(bNode);
		
		GenericNode tempnode2 = genList.getList();
		do 
		{
			System.out.println(tempnode2.getData());
			tempnode2=tempnode2.getNextNode();
		} while (tempnode2!=null);
		
	

	}//end main

}//end class


