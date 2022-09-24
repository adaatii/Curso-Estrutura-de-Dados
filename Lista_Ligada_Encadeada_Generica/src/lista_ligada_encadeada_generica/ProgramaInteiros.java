/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_ligada_encadeada_generica;

/**
 *
 * @author adaatii
 */
public class ProgramaInteiros {
    public static void main(String[] args) {
        ListaLigadaGenerica<Integer> numeros = new ListaLigadaGenerica<Integer>();
        numeros.adicionar(3);
        numeros.adicionar(7);
        numeros.adicionar(9);
        
        System.out.println("Tamanho: " + numeros.getTamanho());
        for (int i = 0; i < numeros.getTamanho(); i++) {
            System.out.println(numeros.get(i).getValor());
        }
    }
    
}
