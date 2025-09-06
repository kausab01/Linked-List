import java.util.LinkedList;

public class RemoveAll {

	public static void main(String[] args) {
     LinkedList<String> L=new LinkedList<String>();
		

		L.add("Red");
		L.add("Green");
		L.add("Black");
		L.add("Pink");
		L.add("orange");
		
		System.out.println("Original linked list:"+L);
		
		L.removeAll(L);
		
		System.out.println();
		System.out.println("The New linked list: "+L);
	}

}
