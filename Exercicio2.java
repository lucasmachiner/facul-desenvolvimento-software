import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor a ser convertido");
        double valor = sc.nextDouble();

        System.out.println("Informe qual o tipo da conversão:");
        System.out.println("1 - Dólar");
        System.out.println("2 - Euro");
        System.out.println("3 - Peso Argentino");
        int typeConvert = sc.nextInt();

        switch (typeConvert) {
            case 1:
                Double convertDolar = valor * 5.17;
                System.out.println("Seu valor convertido em Dólar: " + convertDolar);
                break;
            case 2:
                System.out.println("Seu valor convertido em Euro: " + (valor * 6.14));
                break;
            case 3:
                System.out.println("Seu valor convertido em Peso Argentino: " + (valor * 0.05));
                break;
            default:
                System.out.println("Informe o tipo da conversão entre conforme o numero informado");
                break;
        }
    }
}
