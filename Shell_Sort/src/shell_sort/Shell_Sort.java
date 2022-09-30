/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shell_sort;

/**
 *
 * @author adaatii
 */
public class Shell_Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vetor = new int[10];
        
        System.out.println("Desordenado");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.println(vetor[i]);
        }

        int h = 1;
        
        int n = vetor.length;
        while(h<n){
            h = h * 3 + 1;
        }
        h =(int) (Math.floor(h/3));
        
        int elemento, j;
        
       while(h >0){
           for (int i = h; i < n; i++) {
              elemento = vetor[i];
               j = i;
               while(j >= h && vetor[j - h] > elemento){
                   vetor [j] = vetor [j - h];
                   j = j-h;
               }
               vetor[j] = elemento;
           }
           h = h / 2;
       }
        System.out.println("Vetor Ordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
       
    }

}
