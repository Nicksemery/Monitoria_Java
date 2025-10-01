package Robo.Comportamentos;

import Robo.Comportamento;

public class ComportamentoPassivo implements Comportamento {

    @Override
    public void modo() {
        System.out.println("====O robô está calmo e amável====");
        System.out.println(":D");
    }
}
