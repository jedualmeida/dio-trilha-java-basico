package edu.jedualmeida.metodos;

public class Usuario {

    public static void main (String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Nível do Volume: " + smartTv.volume);
        System.out.println("Canal atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        System.out.println("Novo status -> Nível do Volume: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Novo status -> Nível do Volume: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Novo status -> Nível do Volume: " + smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println("Novo status -> Nível do Volume: " + smartTv.volume);

        smartTv.mudarCanal(8);
        System.out.println("Novo status -> Canal atual: " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Novo status -> Canal atual: " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Novo status -> Canal atual: " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Novo status -> Canal atual: " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Novo status -> Canal atual: " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Novo status -> Canal atual: " + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Novo status -> Canal atual: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Novo status -> Canal atual: " + smartTv.canal);

        smartTv.desligar();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);

    }
    
}
