import java.util.Scanner;

public class infoUsuarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ola, seja bem-vindo!\n");

        System.out.println("Informe seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("Informe seu CPF: ");
        String documento = scanner.nextLine();

        System.out.println("Informe sua Idade: ");
        int idade = scanner.nextInt();

        System.out.println("Informe seu Peso: ");
        float peso = scanner.nextFloat();

        System.out.println("Informe sua Altura: ");
        float altura = scanner.nextFloat();
        scanner.nextLine(); //somente para limpar o buffer que o nextFloat deixa em aberto.

        System.out.println("Informe seu Estado Civil: ");
        String civil = scanner.nextLine();

        System.out.println("Certo, entao temos os seguintes dados: \n");
        System.out.println("Nome: " + nome);
        System.out.println("Documento: " + documento);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("Estado Civil: " + civil);

        System.out.println("Encerramos por aqui, obrigado.");
        scanner.close();
    }
}
