package com.mapprogram;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapProg {

	public static void main(String[] args) 
	{
		LinkedHashMap<Integer, String> lob=new LinkedHashMap<Integer, String>();
		lob.put(1, "surya");
		lob.put(2, "vijay");
        lob.put(4, "siva");
		lob.put(5, "simbu");
		lob.put(3, "ajith");
		System.out.println(lob);
		
		for(Map.Entry<Integer, String> mob:lob.entrySet())
		{
			System.out.println(mob.getKey()+" "+mob.getValue());
		}
		

	}

}
