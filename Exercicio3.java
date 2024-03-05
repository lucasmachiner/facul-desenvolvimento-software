import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro valor");
        int valor1 = sc.nextInt();
        System.out.println("Informe o segundo valor");
        int valor2 = sc.nextInt();

        if(valor1 > valor2) {
            System.out.println("O primeiro valor: "+ valor1 + " é maior que o segundo valor: " + valor2);
        } else {
            System.out.println("O segundo valor: "+ valor2 + " é maior que o primeiro valor: " + valor1);
        }
    }
}
