package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	
	public int sumaDeArrays(ArrayList<Integer> lista){
		int suma = 0; 
		for(int num : lista){
			suma = suma + num;
		}	
		return suma;
	}
	
	public int restaDeArrays(ArrayList<Integer> lista){
		int resta = lista.get(0)*2; //RE CROTO XD
		for(int num : lista){
			resta = resta - num;
		}	
		return resta;
	}
	
	public int mulDeArrays(ArrayList<Integer> lista){
		int producto = 1; 
		for(int num : lista){
			producto = producto * num;
		}	
		return producto;
	}
}
