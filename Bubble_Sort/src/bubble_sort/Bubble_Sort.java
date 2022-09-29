/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubble_sort;

/**
 *
 * @author adaatii
 */
public class Bubble_Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] vetor = new int[100000];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random()* vetor.length);
            //System.out.println(vetor[i]);
        }
        long inicio = System.currentTimeMillis();
        //Bubble sort O(N²)
        int aux;
        for (int i = 0; i < vetor.length; i++) { //O(N)
            for (int j = i+1; j < vetor.length; j++) {//O(N)
                if (vetor[i] > vetor[j]) {
                  aux = vetor[j];
                  vetor[j] = vetor[i];
                  vetor[i] = aux;
                }
            }
        }
        long fim = System.currentTimeMillis();
        System.out.println("Vetor Ordenado");
        System.out.println("Tempo: " + (fim-inicio));
        
    }
    
}
