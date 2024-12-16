package thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Basic {
 
 public static void main(String [] args) {
	 
//	 Array arr: [abc, bca, daa, add,ada]
//			 
//			 
//			 abc, bca
//			 daa,ada
//			 add
	 
	 String arr[] = {"bca", "abc", "daa", "add", "ada"};
	 
	 Map<String, List<String>>  container = new HashMap<>();
	 
	 for(String str : arr) {
		 char [] charArray = str.toCharArray();
		 Arrays.sort(charArray);
		 StringBuilder sb = new StringBuilder();
		 for(char ch : charArray) sb.append(ch);
		 
		 String key = sb.toString();
		 
		 if(!container.containsKey(key)) container.put(key, new ArrayList<>());
		 
		 container.get(key).add(str);
	 }
	 System.out.println(container.size());
	 
	 for(Map.Entry<String, List<String>> entryset : container.entrySet()) {
		 System.out.println(entryset.getValue());
	 }
	 
	 Arrays.stream(arr).forEach((str)->{
		 char [] charArray = str.toCharArray();
		 Arrays.sort(charArray);
		 StringBuilder sb = new StringBuilder();
		 for(char ch : charArray) sb.append(ch);
		 
		 String key = sb.toString();
		 
		 if(!container.containsKey(key)) container.put(key, new ArrayList<>());
		 
		 container.get(key).add(str);
	 });
	 
	  
 }
 
 
}
