import java.util.Scanner;

public class Aritimeticos {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        System.out.println(a + b); // 15
        System.out.println(a - b); // 5
        System.out.println(a * b); // 50
        System.out.println(a / b); // 2
        System.out.println(a % b); // 0 resto da divisão
        System.out.println(a > b); // true
        System.out.println(a < b && b > 0); // false

        var sc = new Scanner(System.in);
        System.out.println("informe o primeiro numero");
        int num1 = sc.nextInt();
        System.out.println("informe o segundo numero");
        int num2 = sc.nextInt();
        System.out.printf("%d + %d = %d%n", num1, num2, num1 + num2);
        //System.out.println(num1 + "+" + num2 + " = " + (num1 + num2));

        //incrementos
        System.out.println(++a); //valor de pré incremento
        System.out.println(a);

        System.out.println(a++); // valor pós incremento
        System.out.println(a);

        int x = 5;
        int resultado = x++; // resultado recebe 5, e x passa a ser 6
        System.out.println("Resultado: " + resultado); // Saída: Resultado: 5
        System.out.println("x: " + x); // Saída: x: 6


    }
}
