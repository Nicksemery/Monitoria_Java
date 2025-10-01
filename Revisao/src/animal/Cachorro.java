package animal;

public class Cachorro extends Animal {

    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au au au au au au au");
    }

    @Override
    public void apresentar() {
        System.out.printf("seu nome: %s\nseu raca: %s\n",nome,raca);
    }
}
