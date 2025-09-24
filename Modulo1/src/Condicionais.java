import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        var nome = sc.nextLine();
        System.out.println("Quantos anos você tem ?");
        var num = sc.nextInt();
        System.out.println("Você é emancipado? (s/n)");
        var isEmancipado = sc.next().equalsIgnoreCase("s");
        if ((num >=18) || (num >= 16 && isEmancipado)) System.out.printf("%s, você tem %s e está apto a dirigir",nome,num);
        else System.out.printf("%s você não está apto a dirigir",nome);
    }
}
