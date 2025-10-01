package Projeto_Biblioteca.modelo;

public class Livro {
    private String titulo, autor;
    private boolean disponivel;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void verificacaoDisponibilidade() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro alugado com sucesso!");
        }else {
            System.out.println("Livro não disponível");
        }
    }

    public void devolucao() {
        disponivel = true;
        System.out.println("Livro devolvido com sucesso!");
    }
}
