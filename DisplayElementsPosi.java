import java.util.LinkedList;

public class DisplayElementsPosi {

	public static void main(String[] args) {
		
		LinkedList<String> L=new LinkedList<String>();


		L.add("Red");
		L.add("Green");
		L.add("Black");
		L.add("Pink");
		L.add("orange");
		
		System.out.println("Original linked list:"+L);
		System.out.println();
		for(int i=0;i<L.size();i++)
		{
			System.out.println("Element at index "+i+" "+L.get(i));
		}
		
	}

}
//Sample output:Original linked list:[Red, Green, Black, Pink, orange] 
//Element at index 0: Red
//Element at index 1: Green 
//Element at index 2: Black 
//Element at index 3: Pink 
//Element at index 4: orange