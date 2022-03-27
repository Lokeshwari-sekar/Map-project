package com.mapprogram;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapProg {

	public static void main(String[] args) {
		TreeMap<Integer, String> tob=new TreeMap<Integer, String>();
		tob.put(1, "pencil");
		tob.put(2, "paper");
		tob.put(3, "note");
		tob.put(4, "book");
		tob.put(5, "sketch");
		tob.put(3, "note");
		System.out.println(tob);
		
		for(Map.Entry<Integer,String> mob:tob.entrySet())
		{
			System.out.println(mob.getKey()+" "+mob.getValue());
		}
	}

}
