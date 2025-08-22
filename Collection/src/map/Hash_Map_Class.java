package map;

import java.security.KeyPair;
import java.util.HashMap;
import java.util.Map;

public class Hash_Map_Class {
public static void main(String[] args) {
	Map<Integer,String> map=new HashMap<>();
	map.put(1, "Anu");
	map.put(2, "Sheela");
	map.put(3, "Susheela");
	map.put(4, "Ram");
	System.out.println(map);
	System.out.println(map.get(2));
	System.out.println(map.keySet());
	for(int keys:map.keySet()) {
		System.out.println(keys);
	}
	for(String values:map.values()) {
		System.out.println(values);
	}
	for(Map.Entry<Integer,String> keyPair:map.entrySet()) {
		System.out.println(keyPair.getKey()+"."+keyPair.getValue());
	}
}
}
