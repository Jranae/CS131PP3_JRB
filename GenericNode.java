package linkedlist;




/**
 * This class models a Node object which contains any object. Each
 * node has its internal data (E) and pointers to the next 
 * node in the list.
 * 
 * @author rkelley/njohnson/jbeason
 * Programming Project 3 Start Project
 * CS131ON
 */
public class GenericNode <E>{
	
	private E data;  //data that the object stores
	private GenericNode nextNode; //pointer to the nextNode that will be in LinkedList
	
	E obj;//An object of type N is declared
	//GenericNode constructor returns object
	GenericNode(E obj) { 
		
		this.obj = obj;
		}//end GenericNode constructor
	
	//Type N getObject constructor
	public E getObject() {
		return this.obj;
	}//end getObject 
	
	/**
	 * Constructor build GenericNode object. Initializes nextNode and data
	 * to null.
	 */
	public GenericNode()
	{
		setNextNode(null);
		data=null;
	}//end empty-argument constructor
	
	/**
	 * This method sets the data of the object.
	 * @param data
	 */
	public void setData(E data) {
		this.data=data;
	}//end setData
	
	/**
	 * This method returns the data of the object.
	 * @return (data)
	 */
	public E getData() {
		return this.data;
	}//end getData
	
	/**
	 * This method returns itself to the caller.
	 * @return
	 */
	public GenericNode<E> getNode() {
		return this;
	}//end getNode
	
	/**
	 * This method updates the pointer for the next node.
	 * @param nextNode
	 */
	public void setNextNode(GenericNode nextNode)
	{
		this.nextNode=nextNode;
	}//end setNextNode
	
	/**
	 * This method returns the Generic node stored in the next node pointer.
	 * @return Node object
	 */
	public GenericNode getNextNode() {
		return nextNode;
	}//end getNextNode
	
}//end class

