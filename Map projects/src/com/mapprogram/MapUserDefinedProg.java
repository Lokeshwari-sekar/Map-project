package com.mapprogram;

import java.util.HashMap;
import java.util.Map;

class Student
{
	int stu_id;
	String stu_name,Dpt_name,clg_name;
	float stu_fees;
	public Student(int stu_id, String stu_name, String dpt_name, String clg_name, float stu_fees) {
		super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		Dpt_name = dpt_name;
		this.clg_name = clg_name;
		this.stu_fees = stu_fees;
	}
	
}
public class MapUserDefinedProg {

	public static void main(String[] args)
	{
         HashMap<Integer, Student> mob=new HashMap<Integer, Student>();
         Student sob=new Student(1, "mani", "ece", "apec", 50876.8f);
         Student sob1=new Student(2, "kani", "eee", "apec", 45876.8f);
         mob.put(1, sob);
         mob.put(2, sob1);
         
         for(Map.Entry<Integer, Student> ob:mob.entrySet())
         {
        	 int key=ob.getKey();
        	 Student value=ob.getValue();
        	 System.out.println(key+"details: ");
        	 System.out.println(value.stu_id+" "+value.stu_name+" "+value.Dpt_name+" "+value.clg_name+" "+value.stu_fees);
         }
	}

}
