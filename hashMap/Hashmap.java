import java.util.HashMap;
import java.util.Set;
public class Hashmap {

	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>();
		map.put("abc",1);
		map.put("def", 2);
		
		if(map.containsKey("abc"))
			System.out.println("has abc and has value " + map.get("abc"));
		
		int s=map.remove("abc");
		System.out.println(s);
		map.put("abc",1);
		map.put("abc1",2);
		map.put("def", 3);
		System.out.println(  map.get("def"));
		Set<String> keys=map.keySet();
		for(String str:keys) {
			System.out.println(str);
		}
		
		
	}

}
