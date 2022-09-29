/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacao_cetor_e_lista_ligada_encadeada;

/**
 *
 * @author adaatii
 */
public class Programa {

    public static void main(String[] args) {
        
        ListaLigadaGenerica <String> lista = new ListaLigadaGenerica <String>();
        lista.adicionar("AC");
        lista.adicionar("BA");
        lista.adicionar("CE");
        lista.adicionar("DF");
        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.get(i).getValor());
        }
        
        //remover estado
        
        lista.remover("DF");
        System.out.println("Removeu DF");
        lista.adicionar("SP");
        System.out.println("Adicionando SP");
        lista.remover("BA");
        lista.remover("CE");
        lista.remover("AC");
        lista.remover("SP");
        lista.adicionar("MT");
        
        System.out.println("Tamanho: " + lista.getTamanho());
        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.get(i).getValor());
        }
        
    }
}
