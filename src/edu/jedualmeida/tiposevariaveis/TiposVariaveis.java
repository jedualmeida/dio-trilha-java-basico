package edu.jedualmeida.tiposevariaveis;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        //Estudar os demais tipos primitivos de variaveis em Java. Alguns exemplos:

        double salarioMinimo = 1302;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;  //Técnica chamada de casting (forçar uma variável a mudar de tipo)

        System.out.println(numeroCurto2);

        final double VALOR_DE_PI = 3.14;  //Ao declarar constantes usar "final" e nome da variavel em caixa alta

        System.out.println(VALOR_DE_PI);

        String meuNome = "JOSÉ EDUARDO";

        System.out.println(meuNome);
        
    }
     
}
