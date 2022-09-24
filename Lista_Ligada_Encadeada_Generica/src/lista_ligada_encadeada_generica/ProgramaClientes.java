/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_ligada_encadeada_generica;

/**
 *
 * @author adaatii
 */
public class ProgramaClientes {
    
    public static void main(String[] args) {
         ListaLigadaGenerica<Clientes> clientes = new ListaLigadaGenerica<Clientes>();
           clientes.adicionar(new Clientes("7889998571", "Joao"));
           clientes.adicionar(new Clientes("5743897589", "Maria"));
           clientes.adicionar(new Clientes("5764357893", "Pedro"));
           
           System.out.println("Tamanho: " + clientes.getTamanho());
            for (int i = 0; i < clientes.getTamanho(); i++) {
            System.out.println(clientes.get(i).getValor());
        }
    }

   
    
}
