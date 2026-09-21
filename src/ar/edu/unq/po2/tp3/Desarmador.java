package ar.edu.unq.po2.tp3;


import java.util.ArrayList;

public class Desarmador {

	public int mayorCantNumerosPares(ArrayList <Integer> listaDeNumeros){
		int mayorNum = 0;
		for (int numero : listaDeNumeros) {
		   mayorNum = mayorEntre(mayorNum , numero);
		}
		return mayorNum;
	}

	private int cantidadNumerosPares(int numACalcular){
		int digitoACalcular;
		int numActual = numACalcular;
		int cantPares = 0;
		while (numActual % 10 != 0) {
		    digitoACalcular = numActual % 10;
		    cantPares = cantPares + this.unoSi(digitoACalcular % 2 == 0);
		    numActual = numActual / 10;
		}
		  return cantPares;
	}
	
	private int mayorEntre(int num1, int num2) {
		if (this.cantidadNumerosPares(num1) > this.cantidadNumerosPares(num2)) {
			return num1;
		} else {
			return num2;
		}
	}
	
	private int unoSi(boolean condicion) {
		if (condicion) {
			return 1;
		} else {
			return 0;
		}
	}
}
