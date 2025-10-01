package Projeto_Biblioteca.modelo;

public abstract class Pessoa {
    protected String nome, email;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }

}
