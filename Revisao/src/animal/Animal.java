package animal;

public abstract class Animal {

    protected String nome, raca;

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }
    public String getRaca() {
        return raca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }

    public abstract void emitirSom();

    void comer(){
        System.out.println(nome + " está comendo");
    }

    public abstract void apresentar();
}
