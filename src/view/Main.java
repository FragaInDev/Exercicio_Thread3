package view;

import controller.ThreadVetor;

public class Main {

	public static void main(String[] args) {
		
		int vetor[] = new int [1000]; //define o tamanho do vetor
		for(int i = 0; i < vetor.length; i++) { //gera valores aleatórios de 1 a 100
			vetor[i] = (int)(Math.random() * 100) + 1;
		}
		
		new ThreadVetor(vetor, 1).start();
		new ThreadVetor(vetor, 2).start();
	}

}
