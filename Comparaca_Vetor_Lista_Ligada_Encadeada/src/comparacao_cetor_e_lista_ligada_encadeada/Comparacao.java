/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comparacao_cetor_e_lista_ligada_encadeada;

import java.util.ArrayList;

/**
 *
 * @author adaatii
 */
public class Comparacao {

    public static void main(String[] args) {
        ListaLigadaGenerica<Integer> lista = new ListaLigadaGenerica<Integer>();

        ArrayList<Integer> vetor = new ArrayList<Integer>();

        //Adicionar elementos
        int limite = 10000;
        long tempoInicial = System.currentTimeMillis();
        long tempoFinal;
        for (int i = 0; i < limite; i++) {
            vetor.add(i);

        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Adicionou " + limite + " elementos no vetor");
        System.out.println(tempoFinal - tempoInicial);

        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < limite; i++) {
            lista.adicionar(i);

        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Adicionou " + limite + " elementos na lista");
        System.out.println(tempoFinal - tempoInicial);

        //Ler valores
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < vetor.size(); i++) {
            vetor.get(i);
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Adicionou " + limite + " tempo de leitura do vetor");
        System.out.println(tempoFinal - tempoInicial);

        tempoInicial = System.currentTimeMillis();
        IteratorListaLigada<Integer> iterator = lista.getIterator();

        while (iterator.temProximo()) {
            iterator.getProximo();
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Adicionou " + limite + " tempo de leitura da lista");
        System.out.println(tempoFinal - tempoInicial);

    }

}
