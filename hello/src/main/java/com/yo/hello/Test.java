package com.yo.hello;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
	
		List<Item> list1 = new ArrayList<>();
		list1.add(new Item("name1", "value1"));
		list1.add(new Item("name2", "value2"));
		list1.add(new Item("name3", "value3"));
		list1.add(new Item("name4", "value4"));
		list1.add(new Item("name5", "value5"));

		List<Item> list2 = new ArrayList<>();
//		list2.add(new Item("name2", "value2", 2));
		list2.add(new Item("name3", "value3", 3));
		list2.add(new Item("name4", "value4", 4));
		list2.add(new Item("name5", "value5", 5));

		System.out.println("index of list2 in list1:" + MyUtil.getIndexInList(list1, list2));
	}

}
