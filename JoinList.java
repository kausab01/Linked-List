import java.util.LinkedList;

public class JoinList {

	public static void main(String[] args) {
		LinkedList<String> L=new LinkedList<String>();
		
		L.add("Red");
		L.add("Green");
		L.add("Black");
		L.add("White");
		L.add("Pink");
		
		
		System.out.println("Orignal linked list:"+L);

      LinkedList<String> L1=new LinkedList<String>();
		
		L1.add("Red");
		L1.add("Green");
		L1.add("Black");
		L1.add("Pink");
		
		
		System.out.println("List of second linked list: "+L1);
		
		L.addAll(L1);
		
		System.out.println("New linked list: "+L);
	}

}
