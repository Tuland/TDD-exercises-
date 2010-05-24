package probing;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class AttemptTest {

	@Test
	public void testAdd() {
		Attempt at = new Attempt();
		assertEquals(5, at.add(2, 3));
	}
	
	@Test
	public void pasteLinesFromArrays() throws Exception {
		List<String> a = Arrays.asList("aa","bb");
		List<String> b = Arrays.asList("xx", "zz");
		List<String> result = new ArrayList<String>();

		Attempt at = new Attempt();
		at.concatenate(result, a, b);
		System.out.println(result.toString());
		assertEquals(Arrays.asList("aaxx", "bbzz"), result);
	}

	@Test
	public void listsCanBeOfDifferentLength() throws Exception {
		List<String> a = Arrays.asList("a","b");
		List<String> b = Arrays.asList("c");
		List<String> result = new ArrayList<String>();

		Attempt at = new Attempt();
		at.concatenate(result, a, b);
		assertEquals(Arrays.asList("ac", "b"), result);
	}

}
