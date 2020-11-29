package psp0;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	public Vector<Integer> decidirClassificados(Vector<Integer> arr, Integer n) {
		Collections.sort(arr);
		
		Integer aux = 0;
		
		Vector<Integer> result = new Vector<Integer>(0);
		
		for(int i=(arr.size()-1);i>=0;i--,aux++) {
			if(aux < n) {
				result.add(arr.get(i));
				if((aux+1 == n) && ((i-1)>=0) && (arr.get(i).intValue()==arr.get(i-1).intValue())) {
					aux--;
				}	
			}
		}
		
		return result;
	}
	
	public float mediaAritTotal(Vector<Integer> arr) {
		float result;
		float soma = 0;
		
		for(int i=0; i<arr.size();i++) {
			soma += arr.get(i);
		}
		
		result = soma / arr.size();
		
		return result;
	}
	
	public float desvioPadrao(Vector<Integer> arr) {
		float result = 0;
		Main aux = new Main();
	
		float media = aux.mediaAritTotal(arr);
		
		for(int i=0;i<arr.size();i++) {
			result += Math.pow((arr.get(i) - media), 2)/arr.size();
		}
		result = (float) Math.sqrt(result);
		
//		formatação para 2 decimais
		result = (float) (Math.floor(result * 100) / 100);
		return result;
	}
	
	static public void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Main aux = new Main();
		
		Integer numComp = scan.nextInt();
		
		Vector<Integer> notas = new Vector<Integer>();
		
		Integer numClassificados = scan.nextInt();
		
		for(int i=0;i<numComp;i++) {
			notas.add(scan.nextInt()); 
		}
		
		scan.close();
		
		Vector<Integer> classificados = aux.decidirClassificados(notas, numClassificados);
		System.out.println(classificados.size());
		System.out.println(aux.desvioPadrao(classificados));
		System.out.println(aux.mediaAritTotal(classificados));
		System.out.println(aux.desvioPadrao(notas));
		System.out.println(aux.mediaAritTotal(notas));
	}
}
