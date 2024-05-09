/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Formula_1A_1 {
    
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ler os dados
        String[] nomes = new String[20];
        float[] tempos = new float[20];
        lerDadosCorrida(scanner, nomes, tempos);

        // Exibir o vencedor da corrida
        String vencedor = encontrarVencedor(nomes, tempos);
        System.out.println("O Grande vencedor da corrida Fantasia é: " + vencedor);

        //Exibir o último colocado da corrida
        String ultimoColocado = encontrarUltimoColocado(nomes, tempos);
        System.out.println("E tambem pra Mencionar o pior, o mais um o Inganhavel da corrida fansia é..." + ultimoColocado);

        // Calcular o tempo médio da corrida
        float tempoMedio = calcularTempoMedio(tempos);
        System.out.println(" O "+  vencedor + "correu por: " + tempoMedio + " segundos");
        
        scanner.close();
    }

    public static void lerDadosCorrida(Scanner scanner, String[] nomes, float[] tempos) {
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o nome do piloto " + (i+1) + ": ");
            nomes[i] = scanner.nextLine();
            System.out.print("Digite o tempo de prova do piloto " + (i+1) + ": ");
            tempos[i] = Float.parseFloat(scanner.nextLine());
        }
    }

    
    // O metodo pra calcular o vencedor
    public static String encontrarVencedor(String[] nomes, float[] tempos) {
        float menorTempo = tempos[0];
        int indiceVencedor = 0;
        for (int i = 1; i < tempos.length; i++) {
            if (tempos[i] < menorTempo) {
                menorTempo = tempos[i];
                indiceVencedor = i;
            }
        }
        return nomes[indiceVencedor];
    }
// O metodo pra encontrar o ultimo
    public static String encontrarUltimoColocado(String[] nomes, float[] tempos) {
        float maiorTempo = tempos[0];
        int indiceUltimoColocado = 0;
        for (int i = 1; i < tempos.length; i++) {
            if (tempos[i] > maiorTempo) {
                maiorTempo = tempos[i];
                indiceUltimoColocado = i;
            }
        }
        return nomes[indiceUltimoColocado];
    }
    
    
    // Pra calcular o tempo medio da corrida 
    
    
    public static float calcularTempoMedio(float[] tempos) {
        float somaTempos = 0;
        for (float tempo : tempos) {
            somaTempos += tempo;
        }
        return somaTempos / tempos.length;
    }
}