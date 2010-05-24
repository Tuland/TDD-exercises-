package probing;

import java.util.Iterator;
import java.util.List;

public class Attempt {
	public int add(int a, int b) { return a+b; }
	
	public List<String> concatenate(List<String> l, List<String> a, List<String> b) {
		int ind = 0; 
		Iterator<String> it_a = a.iterator();
		Iterator<String> it_b = b.iterator();
		while (it_a.hasNext() && it_b.hasNext()) {
			l.add(it_a.next().concat(it_b.next()));
		}
		//ind++;
		while (it_a.hasNext()){
			l.add(it_a.next());
		}
		while (it_b.hasNext()){
			l.add(it_b.next());
		}
		return l;		
	}

	
}

