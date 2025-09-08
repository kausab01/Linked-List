import java.util.LinkedList;

public class ReverseElement {

	public static void main(String[] args) {
		
	LinkedList<String> L=new LinkedList<String>();
		
		L.add("Red");
		L.add("Green");
		L.add("Black");
		L.add("Pink");
		L.add("Orange");
		
		
		System.out.println("Orignal linked list:"+L);
		
	    System.out.println("Elements in Reverse Order: ");  
		for(int i=L.size()-1;i>=0;i--)
		{
			System.out.println(L.get(i));
		}
 
	}

}

//Sample Output:Original linked list:[Red, Green, Black, Pink, orange] 
//		 Elements in Reverse Order: 
//		 orange 
//		 Pink
//		 Black
//		 Green 
//		 Red