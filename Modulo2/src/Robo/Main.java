package Robo;

import Robo.Comportamentos.ComportamentoAgressivo;
import Robo.Comportamentos.ComportamentoNormal;
import Robo.Comportamentos.ComportamentoPassivo;

public class Main {

    public static void main(String[] args) {

        ComportamentoAgressivo ca = new ComportamentoAgressivo();
        ComportamentoNormal cn = new ComportamentoNormal();
        ComportamentoPassivo cp = new ComportamentoPassivo();
        Robo robo = new Robo();

        robo.setComportamento(ca);
        robo.modo();
        robo.setComportamento(cn);
        robo.modo();
        robo.setComportamento(cp);
        robo.modo();


    }
}
