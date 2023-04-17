import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) throws Exception {
        // Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.
       int base = 0, altura = 0, area = 0;
       try (Scanner teclado = new Scanner(System.in)) {
        System.out.println("Iremos Calcular a área do retângulo.");
           
           System.out.print("Informe a altura do retângulo: ");
            altura = teclado.nextInt();
           System.out.print("Informe a base do retângulo: ");
            base = teclado.nextInt();
    }
       area = base * altura;
        System.out.println("A área do retângulo é: " + area);

    }
}
