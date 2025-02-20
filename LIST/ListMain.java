package LIST;

public class ListMain {
	public static void main(String[] args) {
		StrukturList list = new StrukturList();
		list.addTail(3);
		list.addTail(4);
		list.addTail(5);
		
		StrukturList list2 = new StrukturList();
		list2.addTail(3);
		list2.addTail(2);
		list2.addTail(1);
		
		StrukturList list3 = new StrukturList();
		list3.addTail(1);
		list3.addTail(4);
		list3.addTail(5);
		list3.addTail(7);
		
		StrukturList listhead = new StrukturList();
		listhead.addHead(5);
		listhead.addHead(4);
		listhead.addHead(3);
		
		StrukturList listhead2 = new StrukturList();
		listhead2.addHead(1);
		listhead2.addHead(2);
		listhead2.addHead(3);
		
		StrukturList listhead3 = new StrukturList();
		listhead3.addHead(7);
		listhead3.addHead(5);
		listhead3.addHead(4);
		listhead3.addHead(1);
		
		System.out.println("Elemen: ");
		list.displayElement();
		System.out.println("Elemen: ");
		list2.displayElement();
		System.out.println("Elemen: ");
		list3.displayElement();
		System.out.println("Elemen: ");
		listhead.displayElement();
		System.out.println("Elemen: ");
		listhead2.displayElement();
		System.out.println("Elemen: ");
		listhead3.displayElement();
	}
}
