package org.yourcompany.yourproject;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        //TODO:Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para nosso usuário
        System.out.println("Por favor, digite o número da Agência !");
        //Obter pela scanner os valores digitados no terminal
        int numero=scanner.nextInt();

        //Exibir as mensagens para nosso usuário
        System.out.println("Por favor, digite a Agência !");
        //Obter pela scanner os valores digitados no terminal
        String agencia=scanner.next();

        //Evita que a próxima entrada com nextLine() seja "pulada"
        scanner.nextLine();

        //Exibir as mensagens para nosso usuário
        System.out.println("Por favor, digite seu nome: ");
        //Obter pela scanner os valores digitados no terminal
        String nomeCliente=scanner.nextLine();

        //Exibir as mensagens para nosso usuário
        System.out.println("Por favor, digite seu saldo: ");
        //Obter pela scanner os valores digitados no terminal
        double saldo=scanner.nextDouble();

        //Exibir a mensagem da conta criada com sucesso
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "
        +agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");

    }
}
