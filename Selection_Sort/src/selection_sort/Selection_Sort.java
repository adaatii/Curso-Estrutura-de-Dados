/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selection_sort;

/**
 *
 * @author adaatii
 */
public class Selection_Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vetor = new int[10];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random()*vetor.length);
        }
        System.out.println("Desordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        
        //selection sort
        int posicao_menor, aux;
        for (int i = 0; i < vetor.length; i++) {//O(N)
            posicao_menor=i;
            for (int j = i+1; j < vetor.length; j++) {//O(N)
                if (vetor[j] < vetor[posicao_menor]) {
                    posicao_menor = j;                    
                }
            }
            aux = vetor[posicao_menor];
            vetor[posicao_menor] = vetor[i];
            vetor[i]=aux;
        }
        
        System.out.println("Ordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
    
}
