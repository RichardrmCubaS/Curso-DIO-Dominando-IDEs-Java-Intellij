package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
       /* Gato gato = new Gato();
        System.out.println(gato);*/

        Livro livro = new Livro( "O problema dos 3 corpos", 300);
        System.out.println(livro);

       /* int a = 5;
        int b = 3;
        System.out.println("hello World " + (a+b));*/
    }
}

class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }
}
