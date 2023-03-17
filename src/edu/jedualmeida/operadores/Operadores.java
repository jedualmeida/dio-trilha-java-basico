package edu.jedualmeida.operadores;

import java.util.FormatterClosedException;

public class Operadores {
    public static void main (String [] args) {

        //Operador de ATRIBUIÇÃO:

        int idade = 32;
        double peso = 97.8;
        String nome = "Eduardo";
        char sexo = 'M';
        boolean doadorOrgao = true;

        System.out.println("-----------------------------------------------------------------------------------");

        //Operadores ARITIMÉTICOS:

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

        System.out.println("-----------------------------------------------------------------------------------");

        //Operadores UNÁRIOS:

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

        System.out.println("-----------------------------------------------------------------------------------");

        //Operadores TERNÁRIOS:

        /* Exemplo de condicional utilizando estrutura If/Else:
        int a, b;
        String resposta = "";

        a = 5;
        b = 6;

        if (a == b)
            resposta = "Verdadeiro";
        else
            resposta = "Falso";
        
        System.out.println(resposta);
        */

        // Agora um exemplo de condicional utilizando operadores TERNÁRIOS:

        int x, y;
        x = 8;
        y = 8;

        String resposta1 = x == y ? "Verdadeiro" : "Falso";
        System.out.println(resposta1);

        int resposta2 = x == y ? 1 : 0;
        System.out.println(resposta2);

        System.out.println("-----------------------------------------------------------------------------------");

        //Operadores RELACIONAIS:

        int num1 = 1;
        int num2 = 2;

        boolean simNao = num1 == num2;  //Relação de IGUALDADE

        System.out.println("numero Um é igual ao numero Dois? " + simNao);

        simNao = num1 != num2;  //Relação de DIFERENÇA

        System.out.println("numero Um é diferente do numero Dois? " + simNao);

        simNao = num1 > num2;  //Relação de MAIOR QUE

        System.out.println("numero Um é maior que o numero Dois? " + simNao);

        if (num1 < num2){  //Relação de MENOR QUE
            System.out.println("Nossa condição É Verdadeira");
        }
        else
            System.out.println("Nossa condição NÃO É Verdadeira");

        String nomeUm = "Eduardo";
        String nomeDois = new String("Eduardo");

        System.out.println(nomeUm.equals(nomeDois));  //.equals compara o conteúdo entre dois objetos, e é a forma mais recomendada para isso

        System.out.println("-----------------------------------------------------------------------------------");

        //Operadores LÓGICOS:

        // && - E   || - OU

        /*Tabela Verdade:
        Verdadeiro E Verdadeiro = Verdadeiro
        Verdadeiro E Falso = Falso
        Falso E Verdadeiro = Falso
        Falso E Falso = Falso

        Verdadeiro OU Verdadeiro = Verdadeiro
        Verdadeiro OU Falso = Verdadeiro
        Falso OU Verdadeiro = Verdadeiro
        Falso OU Falso = Falso
        */

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2){
            System.out.println("As duas condições são Verdadeiras");
        }

        if (condicao1 || condicao2){
            System.out.println("Uma das condiçoes é Verdadeira");
        }

        if (condicao1 && (7 > 4)){
            System.out.println("As duas condições são Verdadeiras");
        }

    }

}
