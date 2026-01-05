package LinkedList;

public class LinkedList<T> {
	private int size = 0;

	public static class Node<T> {
		T value;
		Node<T> nextNode;
		public Node (T value) {
			this.value = value;
			nextNode = null;
		} 
	}
	
	Node<T> headNode;

	public boolean isEmpty () {
		return size == 0;
	}

	public String allValuesToString () {
		Node<T> currentNode = headNode;
		String result = "";
		while (currentNode.nextNode != null) {
			result += currentNode.value.toString() + " ";
			currentNode = currentNode.nextNode;
		}
		result += currentNode.value.toString();
		return result;
	}

	public LinkedList () {
		headNode = null;	
	}
	
	public void insertAtHead (T value) {
		Node<T> newNode = new Node<T>(value);
		newNode.nextNode = headNode;
		headNode = newNode;
		size++;
	}
	
	public void insertAtTail (T value) {
		Node<T> newNode = new Node<T>(value);
		if (isEmpty()) {
			// i could have used insertAtHead() here but since it also 
			// increments size each time it is called, it would have result 
			// in double increment if this method is called once on an empty 
			// linked list. you might ask "why you did not put size increment 
			// of this method in else block then?", 
			// well it is because i like to keep size increment at the end, 
			// it is like cherry on top for me. 
			// just because i used this exact way of adding at tail if the linked list is empty, 
			// it does not mean that i consider it a superior way :)
			headNode = newNode;
		} else {
			Node<T> currentNode = headNode;
			while (currentNode.nextNode != null) {
				currentNode = currentNode.nextNode;
			}
			currentNode.nextNode = newNode;
		}
		size++;	
	}
	
	public void insertAtIndex(T value, int index) throws LinkedListException {
		// these two conditions are error conditions therefore they must not increment the size value
		if (index + 1 > size() || index < 0) throw new LinkedListException("index is out of boundaries");
		else {
			int counter = 0;
			Node<T> currentNode = headNode;
			while (counter != index - 1) {
				currentNode = currentNode.nextNode;
				counter++;
			}
			Node<T> temp = currentNode.nextNode;
			Node<T> newNode = new Node<T>(value);
			newNode.nextNode = temp;
			currentNode.nextNode = newNode;
			temp = null;
			size++;
		}
		
	}
	
	public T deleteAtHead () throws LinkedListException {
		if (isEmpty()) { 
 			throw new LinkedListException("cannot delete from empty linked list");
		}
		else {
			Node<T> deletedNode = headNode;
			headNode = headNode.nextNode;
			deletedNode.nextNode = null;
			size--;	
			return deletedNode.value;
		}	
	}	
	
	public T deleteAtTail () throws LinkedListException {
		if (isEmpty()) throw new LinkedListException("cannot delete from empty linked list");
		else if (size() == 1) {
			Node<T> deletedNode = headNode;
			headNode = null;
			size--;
			return deletedNode.value;
		}
		else {
			Node<T> currentNode = headNode;
			while (currentNode.nextNode.nextNode != null) {
				currentNode = currentNode.nextNode;
			}
			Node<T> deletedNode = currentNode.nextNode;
			currentNode.nextNode = null;

			// since it is a tail node, it already points to null, hence won't have any pointer to our 
			// linked list, therefore we don't have to explicitly make the tail node equal null

			size--;
			return deletedNode.value;
		}
	}
	
	public T deleteAtIndex (int index) throws LinkedListException {
		if (isEmpty()) throw new LinkedListException("cannot delete from empty linked list");
		else if (index < 0 || index >= size()) throw new LinkedListException("given index is out boundaries");
		else {
			if (index == 0) {
				return deleteAtHead();
			} else {
				int counter = 0;
				Node<T> currentNode = headNode;
				while (counter != index - 1) {
					currentNode = currentNode.nextNode;
					counter++;
				}
				Node<T> deletedNode = currentNode.nextNode; 
				currentNode.nextNode = currentNode.nextNode.nextNode;
				deletedNode.nextNode = null;
				size--;
				return deletedNode.value;
			}
		}
	}

	public int size () {
		return size;
	}
	
	public T get(int index) throws LinkedListException {
		if (isEmpty()) throw new LinkedListException("cannot get from empty linked list");	
		else if (index < 0 || index >= size) throw new LinkedListException("given index is out of boundaries");
		else {
			Node<T> currentNode = headNode;
			int counter = 0;
			while (index != counter) {
				currentNode = currentNode.nextNode;
				counter++;
			}
			return currentNode.value;
		}

	}
	
	public boolean search (T value) {
		
		if (isEmpty()) throw new LinkedListException("cannot search in empty linked list");	
		else {
			Node<T> currentNode = headNode;
			while (currentNode != null) {
				if (currentNode.value == value) return true;
				currentNode = currentNode.nextNode;
			}
		}
		return false;
	}
	
	


}

class LinkedListException extends RuntimeException {
	public LinkedListException (String errorMessage) {
		super(errorMessage);
	}
}
