package Tugas3;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
		list.addTail(5.5);
		list.AddMid(4.5,1);
		list.AddMid(1.1,1);
        list.AddMid(2.1, 1);
        list.addHead(3.4);		
		System.out.println("Elemen: ");
		list.displayElement();
    }
}
