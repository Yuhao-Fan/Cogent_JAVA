package customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// collecion add lots of object

		ArrayList<Customer> cutomers = new ArrayList<Customer>();
		Customer p1= new Customer(111, "a", 14354.11f);
		Customer p2= new Customer(112, "b", 41355.22f);
		Customer p3= new Customer(113, "c", 13613.22f);
		Customer p4= new Customer(114, "d", 24585.33f);
		Customer p5= new Customer(114, "d", 24585.33f);
		cutomers.add(p1);
		cutomers.add(p2);
		cutomers.add(p3);
		cutomers.add(p4);
		cutomers.add(p5);
		
		Stream<Customer> stream = cutomers.stream();
		Stream<Customer> stream2 = cutomers.stream();
		Stream<Customer> stream3 = cutomers.stream();
		Stream<Customer> stream4 = cutomers.stream();
		Stream<Customer> stream5 = cutomers.stream();
		Stream<Customer> stream6 = cutomers.stream();
		Stream<Customer> stream7 = cutomers.stream();
		Stream<Customer> stream8 = cutomers.stream();
		Stream<Customer> stream9 = cutomers.stream();
		Stream<Customer> stream10 = cutomers.stream();
		Stream<Customer> stream11 = cutomers.stream();
		Stream<Customer> stream12 = cutomers.stream();
		Stream<Customer> stream13 = cutomers.stream();
		Stream<Customer> stream14 = cutomers.stream();
		Stream<Customer> stream15 = cutomers.stream();
		stream
		.filter(c ->c.balance> 15000.00f)
        .forEach(p->System.out.println(p));
		long res=stream2
		.filter(c ->c.balance> 15000.00f) 
        .count();  // iterating price 
		stream3.map(m->m.balance+315);
		System.out.println(stream3);
		System.out.println(res);
		stream4.sorted((o1,o2)-> o1.name.compareTo(o2.name))
		.forEach(System.out::println);
		//5
		stream5.distinct().forEach(System.out::println);
		System.out.println(stream6.max((o1,o2)-> o1.name.compareTo(o2.name)));
		for(Object a :stream7.toArray()) {
			System.out.println(a);
		}
		System.out.println(stream8.min((o1,o2)-> o1.name.compareTo(o2.name)));
		System.out.println(stream9.reduce(0, (partialAgeResult, user) -> partialAgeResult + user.id, Integer::sum));
		//10
		System.out.println(stream10.findFirst().get());
		System.out.println(stream11.findAny().get());
		System.out.println(stream13.anyMatch(n->n.id==115));
		System.out.println(stream14.allMatch(n->n.id==114));
		System.out.println(stream15.collect(Collectors.toSet()));
		List < Customer > productSortedList2 = cutomers.stream()
		            .sorted(Comparator.comparing(Customer::getName)).collect(Collectors.toList()); //ascending order
		System.out.println(productSortedList2);
		
	}

}

