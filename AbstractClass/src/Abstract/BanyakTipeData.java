package Abstract;

import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.HashSet; 

public class BanyakTipeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("===List===");  
		List itemList = new ArrayList();  
	    itemList.add("1");  
	    itemList.add("1");  
	    itemList.add("2");    ;      
	    for(int i = 0; i < itemList.size(); ++i){  
	      System.out.println(itemList.get(i));  
	    }      
	System.out.println("===Set===");  
		Set itemSet = new HashSet();          
	    itemSet.add("Anjing");  
	    itemSet.add("Anjing");  
	    itemSet.add("2");          
	    Object [] itemFromSet = itemSet.toArray();  
	    for(int i = 0; i < itemFromSet.length; ++i){  
	      System.out.println(itemFromSet[i]);  
	    }  
	System.out.println("===Map===");  
		Map itemMap = new HashMap();      
	    itemMap.put(0, "Anjing");  
	    itemMap.put(1, "Anjing");  
	    itemMap.put(2, "Kucing");      
	    for(int i = 0; i < itemMap.size(); ++i){  
	      System.out.println(itemMap.get(i));  
	    } 
	}

}
