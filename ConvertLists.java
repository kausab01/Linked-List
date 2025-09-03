import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertLists {

	public static void main(String[] args) {
		
		LinkedList<String> L=new LinkedList<String>();

		L.add("Red");
		L.add("Green");
		L.add("Black");
		L.add("White");
		L.add("Pink");
		
		
		System.out.println("Orignal linked list: "+L);
		
		ArrayList<String> al=new ArrayList<String>(L);
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	}

}
