package Projeto_Biblioteca.modelo;

public class Funcionario extends Pessoa {

    public Funcionario(String nome, String email) {
        super(nome,email);
    }

    public Livro cadastrarLivro(String titulo, String autor) {
        System.out.println("O funcionário: "+getNome()+ " Cadastrou o livro: "+ titulo);
        return new Livro(titulo, autor);
    }
}
