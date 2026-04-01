import java.util.Scanner;

public class Contas_bancos {
    public static void main(String[] args) {
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite sua agencia bancaria: ");
        String banco =  scanner.nextLine();

        System.out.println("Digite seu primeiro nome: ");
        String nome_usuario = scanner.nextLine();

         System.out.println("digite seu sobrenome: ");
         String sobrenome = scanner.next();

        System.out.println("digite seu saldo: ");
        double saldo = scanner.nextDouble();



        System.out.println("Olá " + nome_usuario +" "+ sobrenome + " obrigado por entrar no nosso branco!!");

        System.out.println("Sua agencia bancaria é a: " + banco + " onde seu saldo é de R$" +  saldo);
    }
}