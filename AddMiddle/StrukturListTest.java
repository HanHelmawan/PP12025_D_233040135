package AddMiddle;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList listmid = new StrukturList();
		listmid.addTail(3);
		listmid.addTail(4);
		listmid.AddMid(7,2);
		listmid.AddMid(8,2);
        listmid.addHead(5);		
		System.out.println("Elemen: ");
		listmid.displayElement();
    }
}
