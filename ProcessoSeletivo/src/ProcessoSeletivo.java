import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

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
    public static void main(String [] args){
        caso1(1000);
        caso1(2000);
        caso1(3000);
        caso2();
        caso3();


    }

}

