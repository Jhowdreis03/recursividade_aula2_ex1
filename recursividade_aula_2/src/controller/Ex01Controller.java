package controller;

public class Ex01Controller {
	public int somatorio(int n) {
		// Condição de parada caso n for menor que 0
		if (n < 0) {
			return 0;
		}
		else {
			// Chamada da recursividade
			return 1 + somatorio(n-1);
		}
	}

}
