package com.mapprogram;

import java.util.Map;
import java.util.TreeMap;

public class MobileNoTreeMap {

	public static void main(String[] args) {
		TreeMap<Long, String> edata=new TreeMap<Long, String>();
	 
	edata.put(8765786756l, "mani");
	edata.put(3456789896l, "ravi");
	edata.put(9087657864l, "kani");
	edata.put(2367586790l, "thisha");
	edata.put(9087654567l, "renu");
	edata.put(2390875678l, "deepika");
	edata.put(9087437877l, "srimugi");
	edata.put(9974365786l, "srividhya");
	edata.put(7897543568l, "tisha");
	edata.put(5390875678l, "risha");
	System.out.println(edata);
	
	for(Map.Entry<Long, String> mob:edata.entrySet())
	{
		System.out.println(mob.getKey()+" "+mob.getValue());
	}
	

	}

}
