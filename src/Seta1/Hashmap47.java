package Seta1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Hashmap47 {

	public static void main(String[] args) {
		HashMap<Integer,String> hashmap=new HashMap<Integer,String>();
		
		hashmap.put(1,"One");
		hashmap.put(2,"Two");
		hashmap.put(3,"Three");
		hashmap.put(4,"Four");
		hashmap.put(5,"Five");
		hashmap.put(6,"Six");
		hashmap.put(7,"Seven");
		hashmap.put(8,"Eight");
		hashmap.put(9,"Nine");
		
        Set<Entry<Integer,String>> set=hashmap.entrySet();
        
        Iterator<Entry<Integer,String>> i=set.iterator();
        while(i.hasNext()){
        	Map.Entry<Integer, String> m= (Map.Entry<Integer, String>)i.next();
        	int Key=Integer.parseInt(m.getKey().toString());
        	if(Key%4!=0)
        		System.out.println(m.getValue());
        }
        
	}

}
