package edu.jedualmeida.operadores;

public class Operadores {
    public static void main (String [] args) {

        //Exemplos de Operador de ATRIBUIÇÃO:

        int idade = 32;
        double peso = 97.8;
        String nome = "Eduardo";
        char sexo = 'M';
        boolean doadorOrgao = true;



        //Exemplos de Operadores ARITIMÉTICOS:

        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        double divisao = 10 / 3;
        int modulo = 19 % 3;  //Retorna o resto da divisão
        double resultado = (10 * 7) + (20 / 4);  //Expressões aritiméticas mais complexas
        String nomeCompleto = "José Eduardo" + " Almeida";  //Operador de soma também usado para concatenar strings

        System.out.println(nomeCompleto);

        /*String concatenacao = "?";

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);*/



        //Exemplos de Operadores UNÁRIOS:

        int temperatura1 = +30;  //Para valores positivos
        int temperatura2 = -5;  //Para valores negativos e para negar um número ou expressão
        int numero = 5;
        boolean casado = false;  

        System.out.println(++ numero);  //Para incremento de valor em 1 unidade
        numero = 10;
        System.out.println(numero --);  //Para decremento de valor em 1 unidade
        System.out.println(numero);

        System.out.println(!casado);  //Nega o valor de uma expressão booleana. Nesse exemplo, resultado é true
        casado = !casado;
        System.out.println(casado);

    }

}
