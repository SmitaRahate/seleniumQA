package com.demo.collection.hashmaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hashmaps{
	public static void main(String[] args) {

		HashMap<String,String> hmap= new HashMap<String,String>();

		hmap.put("1","one");
		hmap.put("2","Two");
		hmap.put("3","Three");

		Set<String> st=hmap.keySet();
		System.out.println("Set created from HashMap keys contains:");
		Iterator<String>itr=st.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

		st.remove("2");
		//check for boolean
		boolean blnExits=hmap.containsKey("2");
		System.out.println("does HashMap contain 2?"+blnExits);

	}
}
