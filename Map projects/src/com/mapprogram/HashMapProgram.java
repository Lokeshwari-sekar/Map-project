package com.mapprogram;

import java.util.HashMap;
import java.util.Map;


public class HashMapProgram {

	public static void main(String[] args) {
		HashMap<Integer, String> hob=new HashMap<Integer, String>();
		hob.put(1, "apple");
		hob.put(2, "mango");
		hob.put(4, "watermelon");
		hob.put(3, "banana");
		System.out.println(hob);
		for(Map.Entry<Integer, String> m:hob.entrySet() )
		{
			System.out.println(m.getKey()+""+m.getValue());
		}
		

	}

}
