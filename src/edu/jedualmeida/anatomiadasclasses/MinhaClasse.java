package edu.jedualmeida.anatomiadasclasses;

public class MinhaClasse {
 public static void main (String [] args) {

    // Declarando uma Variável

    String primeiroNome = "José Eduardo";
    String segundoNome = "Almeida";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);

 }

// Declarando um Método

public static String nomeCompleto (String primeiroNome, String segundoNome) {

    return primeiroNome.concat(" ").concat(segundoNome);

}

}
