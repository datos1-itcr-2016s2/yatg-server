package Structures;

/**
 * @author gsegura96
 *
 */
public class ItemsPriorityQueue extends GenericLinkedList<Item> {
	@Override
	public void add(Item newItem) {
		GenericNode<Item> newNode = new GenericNode<>(newItem);
		add(newNode);
	}

	/* (non-Javadoc)
	 * @see Structures.GenericLinkedList#add(Structures.GenericNode)
	 */
	@Override

	public void add(GenericNode<Item> newNode) {

		if (isEmpty()) {
			setHead(newNode);
		} else {

			GenericNode<Item> current = getHead();
			while (current.getNext() != null) {
				System.out.println(current.getNext().getData().compareTo(newNode.getData()));
				if (current.getNext().getData().compareTo(newNode.getData()) >= 1) {
					break;
				} else {
					current = current.getNext();
				}
			}
			newNode.setNext(current.getNext());
			current.setNext(newNode);

		}

	}

	/**
	 * Returns the first item of the queue.
	 * @return The first item of the queue.
	 */
	public Item peek() {
		return getAtPosition(0);
	}
	/**
	 * Deletes and returns the first item of the queue.
	 * @return The first item of the queue.
	 */
	public Item poll() {
		Item headItem = getAtPosition(0);
		deleteAtPosition(0);
		return headItem;
		
	}
	
}
