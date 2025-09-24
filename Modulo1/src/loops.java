import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        //switch case
        System.out.println("informe um número de 1 à 7");
        var opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção invalida");
    }

        //do while
        /*
        var nome = "";
        do {
            System.out.println("Digite seu nome: ");
            nome = sc.nextLine();
            System.out.println(nome);
            if (nome.equalsIgnoreCase("sair")) break;
        }while (true);
         */

        //for
        /*
        for (var i = 1; i<=100;i++) {//primeira seção é a variavel de controle de fluxo, a segunda é quando o for termina e a terceira é o incremetento
            if (i % 2==0) continue; //ele vai analisar se o numero dividido por 2 tem resto 0, se tiver ele vai ignorar esse numero e continuar no proximo.

            System.out.println(i);
         */
}
}
