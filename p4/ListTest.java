package p4;

public class ListTest {
	public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addTail(13.5);
        list.addTail(7.3);
        list.addMid(6.1, 0);
        list.addMid(11.1, 1);
        list.addHead(97.4);
        
      
        list.displayElement();
        
        
    }
}
