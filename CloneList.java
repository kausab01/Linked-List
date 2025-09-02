import java.util.LinkedList;

public class CloneList {

	public static void main(String[] args) {
		LinkedList<String> L=new LinkedList<String>();
		
		L.add("Red");
		L.add("Green");
		L.add("Black");
		L.add("White");
		L.add("Pink");
		
		
		System.out.println("Orignal linked list: "+L);
		LinkedList<String> L1=new LinkedList<String>();
		
		L1=(LinkedList<String>) L.clone();
		
		
		
		System.out.println();
		System.out.println("Cloned linked list: "+L1);

	}

}
//Sample Output:Original linked list: [Red, Green, Black, White, Pink] 
//Cloned linked list: [Red, Green, Black, White, Pink]