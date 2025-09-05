import java.util.LinkedList;

public class insertFirstElement {

	public static void main(String[] args) {
		LinkedList<String> L=new LinkedList<String>();
		
		L.add("Red");
		L.add("Green");
		L.add("Black");
		
		System.out.println("Original linked list:"+L);

		System.out.println();
		L.addFirst("Pink");
		
		
		System.out.println("Final linked list:"+L);

	}

}
