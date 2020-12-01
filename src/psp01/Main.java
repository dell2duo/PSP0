package psp01;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	public Integer getMenorTempo(Vector<Integer> arr) {
		return Collections.min(arr);
	}
	
	public Vector<Integer> getTempos(Vector<Integer> arr){
		Vector<Integer> temposPorAndar = new Vector<Integer>();
		for(int floor=0;floor<arr.size();floor++) {
			Integer minutoNesteAndar = 0;
			for(int index=0;index<arr.size();index++) {
				if(floor != index) {
					minutoNesteAndar += (arr.get(index)*2) * (Math.abs(index-floor));
				}
			}
			temposPorAndar.add(minutoNesteAndar);
		}
		
		return temposPorAndar;
	}
	
	public Vector<Integer> getAndares(Vector<Integer> arr, Integer menorTempo){
		Vector<Integer> result = new Vector<Integer>();
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i).intValue() == menorTempo.intValue()) {
				result.add(i+1);
			}
		}
		
		return result;
	}
	
	public void otimizarCafeteira(Vector<Integer> arr) {
		Main aux = new Main();
		
		Vector<Integer> temposPorAndar = aux.getTempos(arr);
				
		/*Print do menor total de tempo gasto pelos 
		 * funcionários para se deslocar */
		Integer menorTempo = aux.getMenorTempo(temposPorAndar);
		System.out.println(menorTempo);
		
		Vector<Integer> andares = aux.getAndares(temposPorAndar, menorTempo);
		for(int i=0;i<andares.size();i++) {
			System.out.print(andares.get(i) + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Main aux = new Main();
		
		Integer numAndares = scan.nextInt();
		Vector<Integer> numFuncPorAndar = new Vector<Integer>();
		
		for(int i=0;i<numAndares;i++) {
			numFuncPorAndar.add(scan.nextInt());
		}
		
		scan.close();
		
		aux.otimizarCafeteira(numFuncPorAndar);
	}
}
