package Projeto_Biblioteca.modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    private int idade;
    private List<Livro> livrosAlugados;

    public Cliente(String nome, String email, int idade) {
        super(nome, email);
        this.idade = idade;
        this.livrosAlugados = new ArrayList<>();
    }

    public void alugarLivro(Livro liv) {
        if(liv.isDisponivel()){
            liv.verificacaoDisponibilidade();
            livrosAlugados.add(liv);
        }else {
            System.out.printf("Não foi possivel alugar o livro %s",liv.getTitulo());
        }
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Livro> getLivrosAlugados() {
        return livrosAlugados;
    }

    public void removerLivro(Livro liv) {
        if(livrosAlugados.remove(liv)){
            liv.devolucao();
            System.out.println("Livro devolvido com sucesso!");
        }else{
            System.out.println("Esse livro não está na sua lista!");
        }
    }

    public void listagem(){
        System.out.println("Lista de livros de: "+ getNome());
        for (Livro livro : livrosAlugados) {
            System.out.println("- " +livro.getTitulo());
        }
    }
}
