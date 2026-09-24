package ar.edu.unq.po2.tp3;

public class Multiplo {
		
	public int multiploComunMasGrande(int x , int y) { 
		int contador = 1000;
		while (contador != 0) {
			if (contador % x == 0 & contador % y == 0) {
				return contador;
			}
			contador = contador - 1;
		}
		return -1;
	}

}