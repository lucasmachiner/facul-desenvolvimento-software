import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Informe a altura do retângulo");
        double altura = sc.nextDouble();

        System.out.println("Informe a largura do retângulo");
        double largura = sc.nextDouble();

        Double area = altura * largura;

        System.out.println("Área do seu retangulo: " + area);
    }
}

