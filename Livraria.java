package br.ufc.deti.poo;

import java.util.ArrayList;

public class Livraria {
	
	ArrayList <Livro> livraria;
	
		Livraria() {
			livraria = new ArrayList<Livro>();			
		}
	
	public void menorValorLivro() {
		double menorValor = 99999;
		String livroMenorValor = "";
		for (Livro i : livraria) {
			if (i.getValor() < menorValor) {
				menorValor = i.getValor();
				livroMenorValor = i.getNome();	
			}
		}	
		System.out.println("O livro de menor valor custa R$" + menorValor);
		int indice = livraria.indexOf(menorValor);
		System.out.println("O nome do livro de menor valor é: " + livroMenorValor);	
	}
	
	
	
	public void listarLivros() {
		for (Livro i : livraria) {
			String lista = i.getNome().toString();
			System.out.println(lista);
		}		
	}
	
	public void removerLivro(Livro livro) {
		livraria.remove(livro);			
	}
	
	public void removerLivroCaro() {
		final double limiteValor = 150;
		for (Livro i : livraria) {
			if (i.getValor() > limiteValor) {	
				int indiceCaro = livraria.indexOf(i);
				livraria.remove(indiceCaro);
			}
		}	
	}
}
