package Tugas3;

public class Node {
    private double data;
	Node next;
		
		//inisialisasi node
		public Node(double data) {
			this.data = data;
		}
		
		
		// getter & setter
		public double getData() {
			return data;
		}

		public void setData(double data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
}
 

