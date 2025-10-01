import java.util.Scanner;

public class Condicionais {

    public static final Scanner sc = new Scanner(System.in);

    public static String interruptor(boolean luzLigada){

        if(luzLigada == true){
            return "A luz está ligada";
        }else{
            return "A luz está desligada";
        }
    }

    public static void main(String[] args) {

        System.out.println("Bem vindo ao programa");
        System.out.println("Está muito escuro");
        System.out.println("Deseja ligar a luz?(s/n)");
        String opcao = sc.nextLine();
        opcao = opcao.equalsIgnoreCase("s") ? interruptor(true) : interruptor(false);
        System.out.println(opcao);


        //Condicional if com OU
        /*

        System.out.println("Qual o seu nome?");
        var nome = sc.nextLine();
        System.out.println("Quantos anos você tem ?");
        var num = sc.nextInt();
        System.out.println("Você é emancipado? (s/n)");
        var isEmancipado = sc.next().equalsIgnoreCase("s");
        if ((num >=18) || (num >= 16 && isEmancipado)) System.out.printf("%s, você tem %s e está apto a dirigir",nome,num);
        else System.out.printf("%s você não está apto a dirigir",nome);

         */
    }
}
