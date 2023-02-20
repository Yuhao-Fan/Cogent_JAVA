package getter;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class SortLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Float> linkedList = new LinkedList<Float>();
		linkedList.add(123.123f);
		linkedList.add(1123.54f);
		linkedList.add(1123.54f);
		linkedList.add(123.54f);
		linkedList.add(4623.54f);
		Collections.sort(linkedList,new Comparator<Float>() {
			public int compare(Float o1, Float o2) {
				if(o1<=o2) {
					return 1;
				}else {
					return -1;
				}
				
			};
			
		});
		
		for (Iterator iterator = linkedList.iterator(); iterator.hasNext();) {
			Float float1 = (Float) iterator.next();
			System.out.println(float1);
		}
		for (Float float1 : linkedList) {
			System.out.println(float1);
		}
	}

}
