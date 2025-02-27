package Tugas3;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        StrukturList list2 = new StrukturList();

        list.addTail(4.5);
        list.AddMid(3.4,1);
        list.addHead(2.1);
        System.out.println("Elemen:  ");
        list.displayElement();


		list2.addTail(5.5);
		list2.AddMid(4.5,1);
		list2.AddMid(1.1,1);
        list2.AddMid(2.1, 1);
        list2.addHead(3.4);		
		System.out.println("Elemen: ");
		list2.displayElement();
    }
}
