package ar.edu.unq.po2.tp3;
import java.util.ArrayList;

public class Counter {
	private ArrayList<Integer> listaNumeros = new ArrayList <>();
	
	public void addNumber(int x) {
		listaNumeros.add(x);
	}
	
	public int numerosPares() {
		int cantPar = 0;
		for (int numero : listaNumeros) {
			cantPar += this.unoSi(numero %2 == 0);
		}
		return cantPar;
	};
	
	public int numerosImpares() {
		int cantImpar = 0;
		for (int numero : listaNumeros) {
			cantImpar += this.unoSi(numero %2 == 1);
		}
		return cantImpar;
	};
	
	public int numerosMultiplosDe(int numARevisar) {
		int cantMultiplos = 0;
		for (int numero : listaNumeros) {
			cantMultiplos += this.unoSi(numARevisar %numero == 0);
		}
		return cantMultiplos;
	};
	
	private int unoSi(boolean condicion) {
		if (condicion) {
			return 1;
		} else {
			return 0;
		}
	}
	
}
