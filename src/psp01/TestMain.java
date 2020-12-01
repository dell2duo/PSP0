package psp01;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.Test;

class TestMain {
	Main aux = new Main();

	@Test
	void testCase1() {
		Vector<Integer> arr = new Vector<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		
		Vector<Integer> temposPorAndar = aux.getTempos(arr);
		Vector<Integer> resposta = new Vector<Integer>();
		resposta.add(2);
		resposta.add(3);

		assertTrue(aux.getAndares(temposPorAndar, aux.getMenorTempo(temposPorAndar)).equals(resposta));
		assertEquals(80, aux.getMenorTempo(temposPorAndar));
	}
	
	@Test
	void testCase2() {
		Vector<Integer> arr = new Vector<Integer>();
		arr.add(10);
		arr.add(30);
		arr.add(20);
		
		Vector<Integer> temposPorAndar = aux.getTempos(arr);
		Vector<Integer> resposta = new Vector<Integer>();
		resposta.add(2);

		assertTrue(aux.getAndares(temposPorAndar, aux.getMenorTempo(temposPorAndar)).equals(resposta));
		assertEquals(60, aux.getMenorTempo(temposPorAndar));
	}
	
	@Test
	void testCase3() {
		Vector<Integer> arr = new Vector<Integer>();
		arr.add(30);
		arr.add(10);
		arr.add(20);
		
		Vector<Integer> temposPorAndar = aux.getTempos(arr);
		Vector<Integer> resposta = new Vector<Integer>();
		resposta.add(1);
		resposta.add(2);

		assertTrue(aux.getAndares(temposPorAndar, aux.getMenorTempo(temposPorAndar)).equals(resposta));
		assertEquals(100, aux.getMenorTempo(temposPorAndar));
	}
	
	@Test
	void testCase4() {
		Vector<Integer> arr = new Vector<Integer>();
		arr.add(80);
		arr.add(50);
		arr.add(10);
		arr.add(5);
		arr.add(15);
		
		Vector<Integer> temposPorAndar = aux.getTempos(arr);
		Vector<Integer> resposta = new Vector<Integer>();
		resposta.add(1);
		resposta.add(2);

		assertTrue(aux.getAndares(temposPorAndar, aux.getMenorTempo(temposPorAndar)).equals(resposta));
		assertEquals(290, aux.getMenorTempo(temposPorAndar));
	}
}
