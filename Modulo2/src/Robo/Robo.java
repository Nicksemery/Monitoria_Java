package Robo;

public class Robo {

    public Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void modo(){
        comportamento.modo();
    }
}
