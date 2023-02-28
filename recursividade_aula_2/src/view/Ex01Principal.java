package view;

import controller.Ex01Controller;

public class Ex01Principal {

	public static void main(String[] args) {
		//Instanciar a classe controller e criando um objeto
		Ex01Controller ct = new Ex01Controller();
		
		int n = 5;
		
		int resultado = ct.somatorio(n);
		System.out.println("Resultado = " +resultado);
	}

}
