import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import javax.sound.midi.Soundbank;

public class ProcessoSeletivo {
    static void caso1( double salarioPretendido){

        double salarioBase= 2000;

        if(salarioBase>salarioPretendido){
            System.out.println("Ligar para o candidato");
        }
        else if(salarioBase>=salarioPretendido){
            System.out.println("Ligar para o candidato, com contra proposta");
        }
        else{
            System.out.println("Aguardando resultado dos demais candidatos");
        }

        System.out.println("Cenário 1: Finalizado.");
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void caso2() {
        double salarioBase = 2000;
        int quantidadeSelecionada = 0;
        int candidatoAtual=0;

        String[] candidatos = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO",
                "MIRELA", "DANIELA", "JORGE"};


        while (quantidadeSelecionada < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double valorPretendido = valorPretendido();
            if (salarioBase >= valorPretendido) {
                quantidadeSelecionada++;
                System.out.println("Candidato solicitou R$"+ valorPretendido);
            } else {
                System.out.println("Candidato solicitou R$"+ valorPretendido);
            }
            candidatoAtual++;

        }
        System.out.println("Quantidade selecionada:"+ quantidadeSelecionada+"\nCenário 2: Finalizado.");
    }

    static  void caso3(){
        String[] candidatos = {"FELIPE", "JULIA", "AUGUSTO",  "FABRÍCIO", "DANIELA"};
        System.out.println("Os candidatos selecionados foram:");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println(candidatos[i]);
        }
        System.out.println("Cenário 3: Finalizado.");
    }


    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void caso4(String candidato){
        int tentativas=1;
        boolean tentarNovamente=true;
        boolean candidatoAtendeu= false;

        do{
           candidatoAtendeu= atender(); 
           tentarNovamente=!candidatoAtendeu;
           if(tentarNovamente){
            tentativas++;
           }
           else{
            System.out.println("O CANDIDATO FOI CONTATADO COM SUCESSO");
           }
        }while(tentarNovamente && tentativas<3);
        
        if(candidatoAtendeu){
        System.out.println("CANDIDATO CONTATADO NA TENTAIVA "+ tentativas);
        }
        else{
        System.out.println("O NÚMERO MÁXIMO DE TENTATIVAS FOI ATINGIDO E NÃO FOI POSSÍVEL CONTATAR O CANDIDATO");
        }
}

        
    public static void main(String [] args){
        caso1(1000);
        caso1(2000);
        caso1(3000);
        caso2();
        caso3();
        String[] candidatos = {"FELIPE", "JULIA", "AUGUSTO",  "FABRÍCIO", "DANIELA"};
        for (int i = 0; i < candidatos.length; i++) {
            caso4(candidatos[i]);
        }
    }

}

