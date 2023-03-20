package edu.jedualmeida.terminaleargumentos;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        /*
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args [2]);
        double altura = Double.valueOf(args [3]);

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " metros");
        */

        //Fazendo a mesma coisa mas com a função SCANNER

        //Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual é o seu nome? ");
        String nome = scanner.next();

        System.out.println("Qual é o sobrenome? ");
        String sobrenome = scanner.next();

        System.out.println("Quantos anos você tem? ");
        int idade = scanner.nextInt();

        System.out.println("Qual é a sua altura? [metros] ");
        double altura = scanner.nextDouble();

        System.out.println("---------------------------------------------------------------------------------------");

        //Imprimindo os dados digitados pelo usuário
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " metros");
        
    }
}
