package controller;

public class ThreadVetor extends Thread {
	private int analisa_num;
	private int vetor[];

	public ThreadVetor(int vetor[], int num) {
		this.analisa_num = num;
		this.vetor = vetor;
	}

	@Override
	public void run() {
		if ((analisa_num % 2) == 0) { // verifica se o valor num�rico recebido for par
			double tempo;
			double t_init = System.nanoTime();
			for (int i = 0; i < vetor.length; i++);
			tempo = (System.nanoTime() - t_init) / Math.pow(10, 6); // transforma em seg
			System.out.printf("O valor num�rico � par, e o tempo para percorrer o vetor foi de: %.3f milisegundos.\n",
					tempo);// sysout diferente, pq nesse consigo configurar qnts casas ap�s a virgula eu
							// quero no resultado pelo "%.3f"
		} else {
			double tempo;
			double t_init = System.nanoTime();
			for (int i : vetor); // estrutura for each
			tempo = (System.nanoTime() - t_init) / Math.pow(10, 6);
			System.out.printf("O valor num�rico � �mpar, e o tempo para percorrer o vetor foi de: %.3f milisegundos.\n",
					tempo);
		}
	}
}
