package Projeto_Biblioteca;

import Projeto_Biblioteca.modelo.Cliente;
import Projeto_Biblioteca.modelo.Funcionario;
import Projeto_Biblioteca.modelo.Livro;

public class TEste {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Carlos", "carlos@biblioteca.com");

        // Funcionário cadastra livros
        Livro l1 = f1.cadastrarLivro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro l2 = f1.cadastrarLivro("Dom Quixote", "Miguel de Cervantes");

        // Criamos um usuário
        Cliente u1 = new Cliente("Maria", "maria@email.com", 34);

        // Usuário pega um livro emprestado
        u1.alugarLivro(l1);
        u1.alugarLivro(l2);
        u1.listagem();

        // Usuário devolve o livro
        u1.removerLivro(l1);

        // Listar os livros que o usuário tem com ele
        u1.listagem();
    }
}
