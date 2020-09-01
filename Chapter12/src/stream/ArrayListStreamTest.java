package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		
		
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s-> System.out.println(s));
		
		sList.stream().sorted().forEach(s-> System.out.println(s));
		sList.stream().map(s->s.length()).forEach(n->System.out.println(n));
	}

}
