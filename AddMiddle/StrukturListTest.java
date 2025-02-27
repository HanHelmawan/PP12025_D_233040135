package AddMiddle;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
		list.addTail(3);
		list.addTail(4);
		list.AddMid(7,2);
        list.AddMid(8, 2);
        list.addHead(5);		
		System.out.println("Elemen: ");
		list.displayElement();
    }
}


