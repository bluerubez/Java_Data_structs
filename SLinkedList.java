

public class SLinkedList<E> {
		
		//first construct the node
		private static class Node<E>{
			private E data;
			private Node<E> next=null;
			
			public Node(E data,Node<E> next){
				this.data=data;
				this.next=next;
			}
			public Node(E data){
				this(data,null);
			}
			public E getData() {
				return data;
			}
			public void setData(E data) {
				this.data = data;
			}
			public Node<E> getNext() {
				return next;
			}
			public void setNext(Node<E> next) {
				this.next = next;
			}
		}
		
		//Reference to the head of the list
		private Node<E> head= null;
		private int size =0;
		
		//Add first method
		public void addFirst(E item){
			head=new Node<E>(item,head);
			size++;
		}
		
		// remove first method
		public E removeFirst(){
			Node<E> temp=head;
			if (head!=null){
				head=head.next;
			}
			if (temp!=null){
				size--;
				return temp.data;
			}else{
				return null;
			}
		}
		
		//add an item to the back of the list
		public void addLast(E data) {
			Node<E> node = head;
			//node to back of list
			while (node.next != null) {
				node = node.next;
			}
			node.next = new Node<E>(data);
		}
		
		// remove item from  back of list
		public void removeLast() {
			Node<E> node=head;
				while (node.next.next != null) {
					node = node.next;
				}
				node.next = null;
			}
		public String toString(){
			StringBuilder stringB=new StringBuilder("[");
			Node b=head;
			if (b!=null){
				stringB.append(b.data.toString());
				stringB.append("-->");
				b=b.next;
			}
		stringB.append("]");
		return stringB.toString();
		}
		public void printAll() {
			System.out.println(toString());
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
