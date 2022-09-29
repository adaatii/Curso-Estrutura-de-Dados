/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package busca_linear;

import java.util.Scanner;

/**
 *
 * @author adaatii
 */
public class Busca_Linear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vetor = new int[8];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int)(Math.random() * 100000);
            System.out.println(vetor[i]);
        }
        
        System.out.println("Qual valor deseja buscar?");
        Scanner scan = new Scanner(System.in);
        int buscado = scan.nextInt();
        
        boolean achou = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == buscado) {
                achou = true;
                break;
            }
            
        }
        
        if (achou) {
            System.out.println("Achou");
        }else{
            System.out.println("Não Achou");
        }
        
    }
    
}
