package com.demo.list;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylists {
	public static void main(String[] args) {

		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("Red");
		list_Strings.add("green");
		list_Strings.add("orange");
		list_Strings.add("black");
		System.out.println(list_Strings);


		/*-----------Itreator list-------------*/
		List<String> list_StringsItr = new ArrayList<String>();
		list_StringsItr.add("Red");
		list_StringsItr.add("green");
		list_StringsItr.add("orange");
		list_StringsItr.add("black");
		//print the list
		for(String element : list_StringsItr)
		{
			System.out.println(element);
		}


		/*insert aan element infirst and position-------------*/

		List<String> list_StringsPosition = new ArrayList<String>();
		list_StringsPosition.add("Red");
		list_StringsPosition.add("green");
		list_StringsPosition.add("orange");
		list_StringsPosition.add("black");
		//print the list
		System.out.println(list_StringsPosition);
		//now insert a clour at the first and last positon of the list

		list_StringsPosition.add(0,"pink");
		list_StringsPosition.add(5,"yellow");
		//print the list
		System.out.println(list_StringsPosition);

		/*----to retrive the element-------------*/
		List<String> list_StringsRetrive = new ArrayList<String>();
		list_StringsRetrive.add("Red");
		list_StringsRetrive.add("green");
		list_StringsRetrive.add("orange");
		list_StringsRetrive.add("black");
		//print the list

		System.out.println(list_StringsRetrive);

		String element=list_StringsRetrive.get(0);
		System.out.println("first element: "+element);
		System.out.println("Third element: "+element);

		List<String> list_StringsUpdate = new ArrayList<String>();
		list_StringsUpdate.add("Red");
		list_StringsUpdate.add("green");
		list_StringsUpdate.add("orange");
		list_StringsUpdate.add("black");
		//print the list

		System.out.println(list_StringsUpdate);

		list_StringsUpdate.set(2, "yellow");

		System.out.println(list_StringsUpdate);

		//to remove the element
		List<String> list_StringsRemove = new ArrayList<String>();
		list_StringsRemove.add("Red");
		list_StringsRemove.add("green");
		list_StringsRemove.add("orange");
		list_StringsRemove.add("black");
		//print the list
		System.out.println(list_StringsRemove);
		list_StringsRemove.remove(2);
		System.out.println("After removing third element from the list:\n"+list_StringsRemove);

		//search element
		List<String> list_StringsSearch = new ArrayList<String>();
		list_StringsSearch.add("Red");
		list_StringsSearch.add("green");
		list_StringsSearch.add("orange");
		list_StringsSearch.add("black");
		//search the value
		if(list_StringsSearch.contains("Red"))
		{
			System.out.println("found the value");
		}else{
			list_StringsRemove.remove(2);
			System.out.println("There is no such element");
		}

		/*sort the list*/

		List<String> list_StringsSort = new ArrayList<String>();
		list_StringsSort .add("Red");
		list_StringsSort .add("green");
		list_StringsSort .add("orange");
		list_StringsSort .add("black");

		System.out.println("list before sort:"+list_StringsSort);
		Collections.sort(list_StringsSort);
		System.out.println("list After sort:"+list_StringsSort);
		/*-----copy list1 to list2----*/
		List<String> List1 = new ArrayList<String>();
		List1.add("1");
		List1.add("2");
		List1.add("3");
		List1.add("4");
		System.out.println("List1:"+List1);
		List<String> List2 = new ArrayList<String>();
		List2.add("A");
		List2.add("B");
		List2.add("C");
		List2.add("D");
		System.out.println("List2:"+List2);
		//copy list1 to list2//

		Collections.copy(List1, List2);
		System.out.println("copy list to list2,\nAfter copy:");

		System.out.println("List1:"+List1);
		System.out.println("List2:"+List2);


		/*sub portion of the list*/
		List<String> list_StringsSubPortion = new ArrayList<String>();
		list_StringsSubPortion.add("red");
		list_StringsSubPortion.add("green");
		list_StringsSubPortion.add("orange");
		list_StringsSubPortion.add("white");
		System.out.println("Original list:" +list_StringsSubPortion);
		List<String> sub_List=list_StringsSubPortion.subList(0, 3);
		System.out.println("list of first three element:" +sub_List);

		/*compare 2 aaraylist*/
		ArrayList<String> c1 = new ArrayList<String>();
		c1.add("Red");
		c1.add("green");
		c1.add("black");
		c1.add("white");
		c1.add("pink");

		ArrayList<String> c2 = new ArrayList<String>();
		c2.add("Red");
		c2.add("green");
		c2.add("black");
		c2.add("pink");

		/*storting the coparison output in Arraylist*/
		ArrayList<String> c3 = new ArrayList<String>();
		for(String e:c1)
			c3.add(c2.contains(e)?"Yes": "No");


		/* -----------swap elements in the arrayList--------------------------- */
		ArrayList<String>s1=new ArrayList<String>();
		s1.add("Red");
		s1.add("Green");
		s1.add("Black");
		s1.add("White");
		s1.add("Pink");

		System.out.println("Array list before Swap:");
		for(String a:s1)
		{
			System.out.println(a);
		}
		//Swapping 1st(index 0) element with the 3rd(index 2)element
		Collections.swap(s1, 0, 2);
		System.out.println("Array list after swap");
		for(String b:s1)
		{
			System.out.println(b);
		}


		/*----------------------join two arraylist-------------------------------------------- */ 

		ArrayList<String>k1=new ArrayList<String>();
		k1.add("Red");
		k1.add("Green");
		k1.add("Black");
		k1.add("White");
		k1.add("Pink");
		System.out.println("List of first array:"+k1);

		ArrayList<String>k2=new ArrayList<String>();
		k2.add("Red");
		k2.add("Green");
		k2.add("Black");
		k2.add("Pink");
		System.out.println("List of Second array: "+k2);

		//Let join above two list
		ArrayList<String>a=new ArrayList<String>();
		a.addAll(k1);
		a.addAll(k2);
		System.out.println("New array:" +a);

		/*-----------------------------clone the arrayList------------------------------------------ */

		ArrayList<String>z1=new ArrayList<String>();
		z1.add("Red");
		z1.add("Green");
		z1.add("Black");
		z1.add("White");
		z1.add("Pink");
		System.out.println("Original array list: "+z1);
		ArrayList<String>newc1=(ArrayList<String>)z1.clone();
		System.out.println("Cloned Array List:"+ newc1);

		/*------------------------------Empty ArrayList----------------------------------------------*/ 
		ArrayList<String>e1=new ArrayList<String>();
		e1.add("Red");
		e1.add("Green");
		e1.add("Black");
		e1.add("White");
		e1.add("Pink");
		System.out.println("Original array list:" +e1);
		e1.removeAll(e1);
		System.out.println("Array list after remove all elements"+e1);
		if(e1.isEmpty())
			System.out.println("ArrayList is empty");
		else

			System.out.println("ArrayList is not empty");



	}



}




