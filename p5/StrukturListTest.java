package p5;

public class StrukturListTest {
	public static void main(String[] args) {
        StrukturList list = new StrukturList();

        list.addHead(2);
        list.addHead(9);
        list.addHead(7);

        System.out.println("Element list awal : ");
        list.displayElement();

        list.removeHead();

        System.out.println("List setelah remove head : ");
        list.displayElement();

        System.out.println("\nHapus element list di awal 3x : ");
        
        list.removeHead();
        System.out.println("Setelah remove head 1 : ");
        list.displayElement();

        list.removeHead();
        System.out.println("Setelah remove head 2 : ");
        list.displayElement();

        list.removeHead();
        System.out.println("Setelah remove head 2 : ");
        list.displayElement();

    }

}
