/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_ligada_encadeada_generica;

/**
 *
 * @author adaatii
 */
public class Clientes {

    private String cpf;
    private String nome;

    public Clientes(String novoCPF, String novoNome) {
        this.cpf = novoCPF;
        this.nome = novoNome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString(){
        return this.cpf +" "+ this.nome;
    }

}
