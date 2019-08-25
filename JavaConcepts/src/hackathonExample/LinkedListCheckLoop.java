/*Two pointers, fast and slow is used while iterating over linked list. Fast pointer moves two nodes in each iteration,
 *  while slow pointer moves to one node. If linked list contains loop or cycle than both fast and slow pointer will 
 *  meet at some point during iteration. If they don't meet and fast or slow will point to null, then linked list 
 *  is not cyclic and it doesn't contain any loop. Here is the exact algorithm
*/

package hackathonExample;

public class LinkedListCheckLoop {
	
	Node head;
	private static class Node{
		private int value;
		private Node next;
		Node (int value){
			this.value = value;
		}
	}
	
	/*Add new Node at the End */
	public void addIntoTail(Node node){
		if(head == null){
			head = node;
		}else{
			Node temp = head;
			while(temp.next !=null){
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	
	/*Print the LinkedList */
	
	public void printList(Node head){
		Node temp = head;
		while(temp.next !=null){
			System.out.print(temp.value +" ");
			temp = temp.next;
		}
		System.out.print(temp.value);
	}
	
	public boolean isCyclic(){
		Node slow = head;
		Node fast = head;
		
		while(fast !=null && fast.next !=null){
			fast = fast.next.next;
			slow = fast.next;
			if(fast == slow){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		LinkedListCheckLoop obj = new LinkedListCheckLoop();
		Node head = new Node(5);
		obj.addIntoTail(head);
		obj.addIntoTail(new Node(12));
		obj.addIntoTail(new Node(32));
		obj.addIntoTail(new Node(6));
		obj.addIntoTail(new Node(56));
		
		obj.printList(head);
		
		boolean chkCyclic = obj.isCyclic();
		if(chkCyclic == true)
			System.out.println("\nLinkedList is cyclic");
		else
			System.out.println("\nLinkedList is Not Cyclic");
		
		/*LinkedListCheckLoop linkedList = new LinkedListCheckLoop(); 
		Node cyclicHead = new Node(101);
		linkedList.addIntoTail(cyclicHead); 
		LinkedListCheckLoop.Node cycle = new LinkedListCheckLoop.Node(201); 
		linkedList.addIntoTail(cycle); 
		linkedList.addIntoTail(new Node(301)); 
		linkedList.addIntoTail(new Node(401)); 
		linkedList.addIntoTail(cycle);
		
		System.out.println("Linked List : " + linkedList);

		//linkedList.printList(cyclicHead);
		
		boolean chkCyclicNw = linkedList.isCyclic();
		if(chkCyclicNw == true)
			System.out.println("\nLinkedList is cyclic");
		else
			System.out.println("\nLinkedList is Not Cyclic");*/
		
	}
}
