package psp0;

import static org.junit.jupiter.api.Assertions.*;

import java.text.DecimalFormat;
import java.util.Vector;

import org.junit.jupiter.api.Test;

public class TestMain {

	Main aux = new Main();

	@Test
	void testDecidirClassificados1() {
		Vector<Integer> arr = new Vector<Integer>();
		assertEquals(0, aux.decidirClassificados(arr, 2).size());
	}
	
	@Test
	void testDecidirClassificados2() {
		Vector<Integer> arr = new Vector<Integer>();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		
		assertEquals(2, aux.decidirClassificados(arr, 2).size());
	}
	
	@Test
	void testDecidirClassificados3() {
		Vector<Integer> arr = new Vector<Integer>();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(5);
		arr.add(4);
		arr.add(3);
		arr.add(2);
		arr.add(1);
		
		assertEquals(4, aux.decidirClassificados(arr, 3).size());
	}
	
	@Test
	void testDecidirClassificados4() {
		Vector<Integer> arr = new Vector<Integer>();
		
		arr.add(500);
		arr.add(500);
		arr.add(500);
		arr.add(500);
		arr.add(500);
		
		assertEquals(5, aux.decidirClassificados(arr, 2).size());
	}
	
	@Test
	void testMediaAritTotal() {
		Vector<Integer> arr = new Vector<Integer>();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(5);
		arr.add(4);
		arr.add(3);
		arr.add(2);
		arr.add(1);
		
		assertEquals(3, aux.mediaAritTotal(arr));
	}
	
	@Test
	void testDesvioPadrao() {
		Vector<Integer> arr = new Vector<Integer>();
		
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(5);
		arr.add(4);
		arr.add(3);
		arr.add(2);
		arr.add(1);
		
		assertEquals(0, Float.compare((float) 1.41, aux.desvioPadrao(arr)));
	}
}
