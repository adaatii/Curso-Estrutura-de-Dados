/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package busca_binaria;

import java.util.Scanner;

/**
 *
 * @author adaatii
 */
public class Busca_binaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vetor = new int[1000000];

        // Busca binária possui o conceito de que o vetor precisa estar ordenado;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 2;
            //System.out.println(vetor[i]);
        }

        System.out.println("Qual é o numero buscado ?\n");
        Scanner scan = new Scanner(System.in);
        int buscado = scan.nextInt();
        
        
        int contador = 0;
        boolean achou = false;
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;

        while (inicio <= fim) {
            meio = (int) ((inicio + fim) / 2);
            contador++;
            if (vetor[meio] == buscado) {
                achou = true;
                break;
            } else if (vetor[meio] < buscado) {
                inicio = meio + 1;
            } else { //só pode ser maior
                fim = meio - 1;
            }
        }
        
        System.out.println("Quantidade de teste: " + contador);
        
        if (achou) {
            System.out.println("Achou");
        }else{
            System.out.println("Não Achou");
        }
    }

}
