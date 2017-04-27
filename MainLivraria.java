package br.ufc.deti.poo;

public class MainLivraria {

	public static void main(String[] args) {
		
		Livraria livraria = new Livraria();
		
		Livro l1 = new Livro();
		l1.setNome("Babel");
		l1.setValor(200d);
		
		Livro l2 = new Livro();
		l2.setNome("Android");
		l2.setValor(100d);
		
		Livro l3 = new Livro();
		l3.setNome("Windows");
		l3.setValor(120d);
		
		
		livraria.livraria.add(l1);
		livraria.livraria.add(l2);
		livraria.livraria.add(l3);
		
		System.out.println("EXIBE O LIVRO DE MENOR VALOR");
		livraria.menorValorLivro();
		System.out.println("=============================");
		System.out.println("");
		
		System.out.println("LISTA TODOS OS LIVROS");
		livraria.listarLivros();
		System.out.println("=============================");
		System.out.println("");
		
		livraria.removerLivro(l2);
		
		System.out.println("LISTA TODOS OS LIVROS APÓS REMOVER O LIVRO ANDROID");
		livraria.listarLivros();
		System.out.println("=============================");
		System.out.println("");
		
		
		livraria.removerLivroCaro();
		
		System.out.println("LISTA TODOS OS LIVROS APÓS REMOVER O LIVRO MAIS CARO");
		livraria.listarLivros();
		System.out.println("=============================");
		System.out.println("");
		
	}

}
