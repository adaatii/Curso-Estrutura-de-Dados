package lista_ligada_encadeada;

public class ProgramaPilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.adicionar("Lucas");
        pilha.adicionar("Mabi");
        pilha.adicionar("Savio");
        pilha.adicionar("Diego");

        System.out.println("Primeiro da Pilha " + pilha.get());
        pilha.remover();
        System.out.println("Novo Primeiro da Pilha " + pilha.get());
    }
}
