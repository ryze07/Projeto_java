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
public class MaquinaDeVenda {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibir os bilhetes
        System.out.println("Bem-vindo à Máquina de Venda de Bilhetes!");
        System.out.println("Por favor, selecione uma opção de bilhete:\n");
        System.out.println("1. Bilhete único (R$ 4,00)");
        System.out.println("2. Bilhete mensal (R$ 40,00)");
        System.out.println("3. Bilhete diário (R$ 10,00)\n");

        // Ler as opções do usuário
        System.out.print("Digite o número da opção desejada: ");
        int opc = scanner.nextInt();

        // Verificar a opção e solicitar o valor exato em dinheiro
        float precoBilhete = 0;
        if (opc == 1){
            precoBilhete = 4.00f;
            System.out.print("Você selecionou o  Bilhete único de R$ 4,00:\n ");
        }else if(opc == 2){
            precoBilhete = 40.00f;
            System.out.print("Você selecionou o  Bilhete único de R$ 40,00:\n ");
        }else if(opc == 3){      
            precoBilhete = 10.00f;
            System.out.print("Bilhete diário (R$ 10,00)\n");
        }else{
            System.out.println("Opção inválida.");
        }
            

        System.out.print("Insira o valor exato em dinheiro: ");
        float valorInserido = scanner.nextFloat();

        // Verificar se o valor inserido é suficiente para comprar o bilhete
        if (valorInserido >= precoBilhete) {
            System.out.println("Bilhete fornecido com sucesso! Obrigado pela compra!");
        } else {
            System.out.println("Valor inserido é insuficiente. Insira mais dinheiro.");
        }

        scanner.close();
    }
}

