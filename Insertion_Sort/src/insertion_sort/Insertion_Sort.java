/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertion_sort;

/**
 *
 * @author adaatii
 */
public class Insertion_Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        System.out.println("Vetor Desordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        int aux, j;
        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;
            while (j >= 0 && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = aux;
        }

        System.out.println("Vetor Ordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

}
