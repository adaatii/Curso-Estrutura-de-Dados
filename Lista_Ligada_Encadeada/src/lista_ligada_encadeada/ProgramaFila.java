package lista_ligada_encadeada;

public class ProgramaFila {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.adicionar("Lucas");
        fila.adicionar("Mabi");
        fila.adicionar("Savio");
        fila.adicionar("Diego");
        System.out.println("Primeiro da Fila " + fila.get());
        fila.remover();
        System.out.println("Novo Primeiro da Fila " + fila.get());
    }
}
