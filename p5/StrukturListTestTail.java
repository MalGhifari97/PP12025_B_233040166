package p5;

public class StrukturListTestTail {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        list.addTail(2);
        list.addTail(6);
        list.addTail(3);
        list.addTail(5);
        list.addTail(1);

        System.out.println("Element list awal : ");
        list.displayElement();

        list.removeTail();

        System.out.println("List setelah remove tail : ");
        list.displayElement();

        
        list.removeHead();
        System.out.println("Setelah remove head : ");
        list.displayElement();

       
        list.removeTail();
        System.out.println("Setelah remove tail lagi");
        list.displayElement();

    }

}
