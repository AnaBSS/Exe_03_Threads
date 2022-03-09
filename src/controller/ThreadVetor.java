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
		if ((analisa_num % 2) == 0) { 
			double tempo;
			double t_i = System.nanoTime();
			for (int i = 0; i < vetor.length; i++);
			tempo = (System.nanoTime() - t_i) / Math.pow(10, 6);
			System.out.printf("O valor numérico é par e o tempo para percorrer o vetor foi de: %.3f milisegundos.\n",
					tempo);
		} else {
			double tempo;
			double t_in = System.nanoTime();
			for (int i : vetor); 
			tempo = (System.nanoTime() - t_in) / Math.pow(10, 6);
			System.out.printf("O valor numérico é ímpar e o tempo para percorrer o vetor foi de: %.3f milisegundos.\n",
					tempo);
		}
	}
}